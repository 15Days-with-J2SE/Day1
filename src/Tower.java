
public class Tower {
	public static void main(String[] args){		
		//输出由变量控制的塔形：
		int line = 4;											//line：要输出的行数；						
		for (int temp_line1=1; temp_line1<=line; temp_line1++){	//temp_line：当前打印行；
			for (int temp1=0; temp1<line-temp_line1; temp1++){ 	//temp1：当前打印行要输出的空格个数（总行数-当前行数）；
				System.out.print(' ');
			}
			for (int temp2=0; temp2<(2*temp_line1-1); temp2++){	//temp2：当前打印行要输出的星号个数（2*当前行数-1）；
				System.out.print('*');
			}
			System.out.println();
		}
		//采用方法调用的形式打印塔形：
		PrintTower(6);
	}
	public static void PrintTower(int line){					//此参数与上方程序体内的line变量相互独立；
		for (int temp_line1=1; temp_line1<=line; temp_line1++){	
			for (int temp1=0; temp1<line-temp_line1; temp1++){
				System.out.print(' ');
			}
			for (int temp2=0; temp2<(2*temp_line1-1); temp2++){
				System.out.print('*');
			}
			System.out.println();
		}	
	}
}
