# Day1

## Java环境配置
添加JAVA_HOME及修改PATH，可参考此处：[Eclipse软件安装教程](https://mp.weixin.qq.com/s?__biz=MzIwMjE1MjMyMw==&mid=2650196771&idx=1&sn=6eef943d60b84acd2bb4e178774c1f1e&chksm=8ee16bcfb996e2d92e93ca95c7a8f08ff81f862340ad3fb75b4a22b1d4aaa7818ad65d01fb87&scene=21#wechat_redirect)<br>

## 在cmd环境下编写“Hello World”并执行
1. cmd命令：cd,dir,md,rd,java,javac；
1. 进入cmd后，利用cd命令修改至合适路径；
    * 注意修改盘符直接输入要进入的盘符而不必使用cd命令；
1. 创建文件夹，命令`md "Hello World"`；
1. 创建.java文件，命令`type nul>*.*`，如`type nul>HelloWorld.java`；
1. 打开文件，`notepad HelloWorld.java`；
1. 编写程序主体并保存；
1. 命令`javac HelloWorld.java`，编译出.class文件；
1. 命令`java HelloWorld`执行字节码文件；
1. Tab键可进行文件名快速补全；<br>
![cmd界面](https://github.com/15Days-with-J2SE/Day1/blob/master/pic/cmd-HelloWorld.png "HelloWorld命令行")
此处java运行命令与上方表述不同，其原因在于（测试）：<br>
![test](https://github.com/15Days-with-J2SE/Day1/blob/master/pic/classFileName.png "类名定义")


## 数据类型
![数据类型](https://github.com/15Days-with-J2SE/Day1/blob/master/pic/数据类型.png "数据类型")


#### 基本数据类型
1. 值溢出问题（[BasicType][basictype]）；
```JavaScript
    int i = Integer.MAX_VALUE;
    System.out.println("i's value is " + i);
    System.out.println("(i+1)'s value is " + (i + 1));
    System.out.println("Now (i+1)'s value is " + ((long)i + 1));
```
```
    此时控制台输出：
    i's value is 2147483647
    (i+1)'s value is -2147483648
    Now (i+1)'s value is 2147483648
```
1. 字符类型及转义字符（[MultiplicationTable][mt]）；
```JS
    System.out.print(num2 + "*" + num1 + "=" + num1*num2 + "\t");
```
1. 非法赋值问题（[BasicType][basictype]）
```JS
    long l = 12345678912345L;   // 常量默认为int型，后方标注“L”或“l”；
    ...
    float f = 1.0f;             // 常量默认为double型，后方标注“F”或“f”；
```
1. 注意：boolean类型数据只允许取值true或false，不可以0或非0的整数替代true和false。

#### 自动数据类型转换
1. Java会在下列条件成立的时候做自动数据类型转换
    * 转换前的数据类型和转换后的数据类型兼容。
    * 转换后的数据类型的表示范围要比转换前的表示范围大。
1. 任何类型数据都可以转换为String类型。
```JS
    byte b = 1;     //声明一个byte类型变量b，并赋值为1
    int i = b;      //将自动类型转换
    System.out.println(“i的值是：”+i);
    ...
    int i = 10;
    String s = "i的值是";
    s = s+i;
```

#### 强制数据类型转换
把一个表示范围大的数据类型转换为表示范围小的数据类型时就要用到强制类型转换。<br>

## 运算符

* 赋值运算符:  =
* 扩展赋值运算符: +=，―=，*=，/=
* 算术运算符:  +，-，*，/，%，++，--
* 关系运算符:  >，<，>=，<=，==，!=
* 字符串连接运算符: +
* i++与++i


## 流程控制语句
#### 使用嵌套打印九九乘法表（[MultiplicationTable][mt]）
```JavaScript
    int num1=0,num2=0;
    // 纵向输出（示例）：
    for (num1=1; num1<=9; num1++){          //当前行；
        for (num2=1; num2<=num1; num2++){   //当前列；
            System.out.print(num2 + "*" + num1 + "=" + num1*num2 + "\t");
        }
        System.out.println();               //本行输出完毕，换行；
    }
    System.out.println();
    // 横向输出（练习要求）：
    for (num1=1; num1<=9; num1++){          //当前行；
        for (num2=num1; num2<=9; num2++){   //当前列；
            System.out.print(num1 + "*" + num2 + "=" + num1*num2 + "\t");
        }
        System.out.println();               //本行输出完毕，换行；
    }
```

#### 练习2：以某变量为基准打印形状（[Tower][tower]）
```JavaScript
    int line = 5;                                           //line：要输出的行数；                      
    for (int temp_line1=1; temp_line1<=line; temp_line1++){ //temp_line：当前打印行；
        for (int temp1=0; temp1<line-temp_line1; temp1++){  //temp1：当前打印行要输出的空格个数（总行数-当前行数）；
            System.out.print(' ');
        }
        for (int temp2=0; temp2<(2*temp_line1-1); temp2++){ //temp2：当前打印行要输出的星号个数（2*当前行数-1）；
            System.out.print('*');
        }
        System.out.println();
    }
```

## 数组
1. java语言中数组的定义方式有两种，声明数组时不能指定其长度(数组中元素的个数)：
```JavaScript
    type[] arr_name;
    type arr_name[];
    
    int a[5];	//非法
```

1. 静态初始化
```
    int a[]={3,6,9};
    ...
    int[][] b = {{1,2},{10,2},{20,1}};
```

1. 动态初始化（当使用new创建多维数组时，不必指定每一维的大小，但要指定最左边的维的大小）
```
    int[] a = new int[10];
    ...
    int b[][] = new int[3][]; 
```

## 方法的声明及使用
#### 以方法调用的方式编写练习2（[Tower][tower]）
```JavaScript
    public static void main(String[] args){
        PrintTower(6);  
    }
    public static void PrintTower(int line){                    //line：要输出的行数；
        for (int temp_line1=1; temp_line1<=line; temp_line1++){ //temp_line：当前打印行；
            for (int temp1=0; temp1<line-temp_line1; temp1++){  //temp1：当前打印行要输出的空格个数（总行数-当前行数）；
                System.out.print(' ');
            }
            for (int temp2=0; temp2<(2*temp_line1-1); temp2++){ //temp2：当前打印行要输出的星号个数（2*当前行数-1）；
                System.out.print('*');
            }
            System.out.println();
        }   
    }
```

#### 递归方法求阶乘（[Recursive][recursive]）
```JavaScript
    public static void main(String[] args){			
		//递归方法示例：
		System.out.println(Factorial(8));
	}
	public static int Factorial(int num){
		if (num > 1){
			return num * Factorial(--num);
		}
		else{
			return num;
		}
	}
```

## 课后练习（[Homework][homework]）
#### 练习题3
```JavaScript
    import java.util.Scanner;
	public static void main(String[] args){			
        System.out.println("input number:");
        Scanner input2 = new Scanner(System.in);
        System.out.println(NumCount(input2.nextInt()));	
    }
    public static int NumCount(int num){
        int result = 0;
        /*for (int num_3=num/3; num_3>0; num_3--){
            result += num_3 * 3; 
        }
        for (int num_5=num/5; num_5>0; num_5--){
            result += num_5 * 5; 
        }*/
        int num_3=num/3;
        int num_5=num/5;
        num_3 = num_3*(num_3+1)/2;
        num_5 = num_5*(num_5+1)/2;
        result = num_3*3 + num_5*5;
        return result;
    }
```
在习题3中，原采用方案1；经过老师的讲解，对方案1进行了优化，两者所得结果均为267333（包括1000），目前暂未发现问题；<br>

## 其他
程序编写习惯。<br>
扩展的是解决问题的思路。<br>

## 文档相关
    Edit:       Notepad++ 
    Preview:    Moeditor
    Language:   Markdown & HTML
    Encoding:   UTF-8
    Edits:      1

[basictype]:https://github.com/15Days-with-J2SE/Day1/blob/master/src/BasicType.java
[mt]:https://github.com/15Days-with-J2SE/Day1/blob/master/src/MultiplicationTable.java
[recursive]:https://github.com/15Days-with-J2SE/blob/master/Day1/src/Recursive.java
[tower]:https://github.com/15Days-with-J2SE/Day1/blob/master/src/Tower.java
[homework]:https://github.com/15Days-with-J2SE/Day1/blob/master/src/Homework.java