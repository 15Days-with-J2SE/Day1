
public class BasicType {
	public static void main(String[] args){
		
		// ֵ������ԣ�
		int i = Integer.MAX_VALUE;
		System.out.println("i's value is " + i);
		System.out.println("(i+1)'s value is " + i + 1);
		System.out.println("Now (i+1)'s value is " + (long)i + 1);
		System.out.println("(i+1)'s value is " + (i + 1));
		System.out.println("Now (i+1)'s value is " + ((long)i + 1));
				
		// ��װ�࣬�Ի����������͵�һ����װ���ṩ�˶��ʵ�õķ�����
		Integer i2 = 12;			// ��װ��Inter��
		
		long l = 12345678912345L;	// ����Ĭ��Ϊint�ͣ��󷽱�ע��L����l����
		Long l2 = l;
		
		byte b = 0;
		Byte b2 = 0;
		
		short s = 1;
		Short s2 = 0;
		
		char c = 'A';
		Character c2 = 'B';
		
		float f = 1.0f;				// ����Ĭ��Ϊdouble�ͣ��󷽱�ע��F����f����
		Float f2 = f;
		
		double d = 1.0;
		Double d2 = d;
		
		int[][] ia = new int[4][5];
		System.out.println(ia.length);
	}
}
