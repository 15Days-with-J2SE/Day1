
public class MultiplicationTable {
	public static void main(String[] args){
			
		int num1=0,num2=0;
		// ���������ʾ������
		for (num1=1; num1<=9; num1++){			//��ǰ�У�
			for (num2=1; num2<=num1; num2++){	//��ǰ�У�
				System.out.print(num2 + "*" + num1 + "=" + num1*num2 + "\t");
			}
			System.out.println();				//���������ϣ����У�
		}
		System.out.println();
		// �����������ϰҪ�󣩣�
		for (num1=1; num1<=9; num1++){			//��ǰ�У�
			for (num2=num1; num2<=9; num2++){	//��ǰ�У�
				System.out.print(num1 + "*" + num2 + "=" + num1*num2 + "\t");
			}
			System.out.println();				//���������ϣ����У�
		}
	}
}