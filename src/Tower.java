
public class Tower {
	public static void main(String[] args){		
		//����ɱ������Ƶ����Σ�
		int line = 4;											//line��Ҫ�����������						
		for (int temp_line1=1; temp_line1<=line; temp_line1++){	//temp_line����ǰ��ӡ�У�
			for (int temp1=0; temp1<line-temp_line1; temp1++){ 	//temp1����ǰ��ӡ��Ҫ����Ŀո������������-��ǰ��������
				System.out.print(' ');
			}
			for (int temp2=0; temp2<(2*temp_line1-1); temp2++){	//temp2����ǰ��ӡ��Ҫ������ǺŸ�����2*��ǰ����-1����
				System.out.print('*');
			}
			System.out.println();
		}
		//���÷������õ���ʽ��ӡ���Σ�
		PrintTower(6);
	}
	public static void PrintTower(int line){					//�˲������Ϸ��������ڵ�line�����໥������
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
