package teste;

public class UltimoQuestionario {
	
	public static int f1(int n) {
		if(n < 2)
			return n;
		return f1(n-1) + f1(n-2);
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(f1(3));
		
	}

}
