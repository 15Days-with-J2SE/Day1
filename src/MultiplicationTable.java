
public class MultiplicationTable {
	public static void main(String[] args){
			
		int num1=0,num2=0;
		// 纵向输出（示例）：
		for (num1=1; num1<=9; num1++){			//当前行；
			for (num2=1; num2<=num1; num2++){	//当前列；
				System.out.print(num2 + "*" + num1 + "=" + num1*num2 + "\t");
			}
			System.out.println();				//本行输出完毕，换行；
		}
		System.out.println();
		// 横向输出（练习要求）：
		for (num1=1; num1<=9; num1++){			//当前行；
			for (num2=num1; num2<=9; num2++){	//当前列；
				System.out.print(num1 + "*" + num2 + "=" + num1*num2 + "\t");
			}
			System.out.println();				//本行输出完毕，换行；
		}
	}
}