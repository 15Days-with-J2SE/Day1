
public class BasicType {
	public static void main(String[] args){
		
		// 值溢出测试：
		int i = Integer.MAX_VALUE;
		System.out.println("i's value is " + i);
		System.out.println("(i+1)'s value is " + i + 1);
		System.out.println("Now (i+1)'s value is " + (long)i + 1);
		System.out.println("(i+1)'s value is " + (i + 1));
		System.out.println("Now (i+1)'s value is " + ((long)i + 1));
				
		// 包装类，对基本数据类型的一个包装，提供了多个实用的方法；
		Integer i2 = 12;			// 包装类Inter；
		
		long l = 12345678912345L;	// 常量默认为int型，后方标注“L”或“l”；
		Long l2 = l;
		
		byte b = 0;
		Byte b2 = 0;
		
		short s = 1;
		Short s2 = 0;
		
		char c = 'A';
		Character c2 = 'B';
		
		float f = 1.0f;				// 常量默认为double型，后方标注“F”或“f”；
		Float f2 = f;
		
		double d = 1.0;
		Double d2 = d;
		
		int[][] ia = new int[4][5];
		System.out.println(ia.length);
	}
}
