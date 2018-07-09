import java.util.Scanner;
/**
 * 1.编写一个Java程序，用if-else语句判断某年份是否为闰年（闰年能够被4整除且不能被100整除，或者能够被400整除）。
 * 2.超市的商品进行优惠打折，购买物品的金额越多折扣越大，购买商品的总价小于200元不打折，达到200元打9折，达到500元时打8.5折，达到1000元打8折。请输入商品的总金额，然后输出实际应付金额。
 * 3.如果列出10以下的可以被3或5整除的自然数，可以找出3，5，6，9，这些数字的合等于23，请编程计算1000以内的所有能够被3或者5整除的数字的和。
 */
public class Homework {
	public static void main(String[] args){			

		//练习：识别闰年：
		System.out.println("input year:");
		Scanner input = new Scanner(System.in);
		System.out.println("Leap year? "+LeapYear(input.nextInt()));
		
		//练习：计算1000以内能被3和5整除的所有自然数之和（修改为用户输入模式方便测试）：
		System.out.println("input number:");
		Scanner input2 = new Scanner(System.in);
		System.out.println(NumCount(input2.nextInt()));	
	}
	
	public static boolean LeapYear(int year){
		year %= 400;
		if (year != 0){
			year %= 100;
			if (year != 0){
				year %= 4;
				if (year != 0){
					return false;
				}
				return true;
			}
			return false;
		}
		return true;
	}
	//pass 2.
	//3.
	public static int NumCount(int num){
		int result = 0;
		//方案1：
		/*for (int num_3=num/3; num_3>0; num_3--){
			result += num_3 * 3; 
		}
		for (int num_5=num/5; num_5>0; num_5--){
			result += num_5 * 5; 
		}*/
		//方案1优化：
		int num_3=num/3;
		int num_5=num/5;
		num_3 = num_3*(num_3+1)/2;
		num_5 = num_5*(num_5+1)/2;
		result = num_3*3 + num_5*5;
		return result;
	}
}
