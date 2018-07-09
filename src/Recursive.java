
public class Recursive {
	public static void main(String[] args){			
		//µİ¹é·½·¨Ê¾Àı£º
		System.out.println(Factorial(8));
	}
	public static int Factorial(int num){
/*		int result=1;							//Ìí¼Ó×¢ÊÍ¿é`Ctrl+Shift+/`
		if (num > 1){
			return result * Factorial(--num);
		}
		else if (num == 1){
			return result;
		}
		else{
//			return "Wrong incoming parameters!";
			return 0;
		}*/
		if (num > 1){
			return num * Factorial(--num);
		}
		else{
			return num;
		}
	}
}
