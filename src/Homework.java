import java.util.Scanner;
/**
 * 1.��дһ��Java������if-else����ж�ĳ����Ƿ�Ϊ���꣨�����ܹ���4�����Ҳ��ܱ�100�����������ܹ���400��������
 * 2.���е���Ʒ�����Żݴ��ۣ�������Ʒ�Ľ��Խ���ۿ�Խ�󣬹�����Ʒ���ܼ�С��200Ԫ�����ۣ��ﵽ200Ԫ��9�ۣ��ﵽ500Ԫʱ��8.5�ۣ��ﵽ1000Ԫ��8�ۡ���������Ʒ���ܽ�Ȼ�����ʵ��Ӧ����
 * 3.����г�10���µĿ��Ա�3��5��������Ȼ���������ҳ�3��5��6��9����Щ���ֵĺϵ���23�����̼���1000���ڵ������ܹ���3����5���������ֵĺ͡�
 */
public class Homework {
	public static void main(String[] args){			

		//��ϰ��ʶ�����꣺
		System.out.println("input year:");
		Scanner input = new Scanner(System.in);
		System.out.println("Leap year? "+LeapYear(input.nextInt()));
		
		//��ϰ������1000�����ܱ�3��5������������Ȼ��֮�ͣ��޸�Ϊ�û�����ģʽ������ԣ���
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
		//����1��
		/*for (int num_3=num/3; num_3>0; num_3--){
			result += num_3 * 3; 
		}
		for (int num_5=num/5; num_5>0; num_5--){
			result += num_5 * 5; 
		}*/
		//����1�Ż���
		int num_3=num/3;
		int num_5=num/5;
		num_3 = num_3*(num_3+1)/2;
		num_5 = num_5*(num_5+1)/2;
		result = num_3*3 + num_5*5;
		return result;
	}
}
