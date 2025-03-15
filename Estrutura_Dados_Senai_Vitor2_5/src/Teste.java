
public class Teste {
	
	public static void imprimeVetor (double v[]) {
		for (double e : v) System.out.println(e + "");
		System.out.println();
	}
	
	public static void imprimeVetor (int[] arrayInt) {
		for (int e : arrayInt) System.out.println(e + "");
		System.out.println();
	}
		public static void imprimeVetor (char[] arrayChar) {
			for (char e : arrayChar) System.out.println(e + "");
			System.out.println();
	}
	public static void main(String[] args) {
		
		double [] arrayDouble = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6};
		System.out.println("Vetor de double: ");
		imprimeVetor(arrayDouble);
		
		int [] arrayInt = {1, 2, 3, 4, 5, 6};
		System.out.println("Vetor de inteiros: ");
		imprimeVetor(arrayInt);
		
		char[] arrayChar = {'V', 'I', 'T', 'O', 'R', 'S'};
		System.out.println("Vetor de char: ");
		imprimeVetor(arrayChar);
	}
}
