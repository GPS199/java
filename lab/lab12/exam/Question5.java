package exam;

public class Question5 {
	public static void main(String[] args) {
		
	}
	public static int divide(int divident,int divisor) {
		if (divident<divisor) {
			return 0;
		}
		return 1+divide(divident-divisor,divisor);
	}

}
