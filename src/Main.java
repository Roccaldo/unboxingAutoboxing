import java.sql.SQLOutput;

public class Main {
	public static void main(String[] args) {
		//primitive
		sumInt(5, 10);
		stampChar('R');

		//oggetti
		sumInteger(54, 35);
		stampCharacter('L');

		//autoboxing
		autoBoxingInt(5);
		autoBoxingDouble(9.45);
		autoBoxingChar('H');
		unBoxingInt(567);
		unBoxingDouble(89.67);
		unBoxingChar('B');
	}

	public static void sumInt(int numb1, int numb2) {
		int result = numb1 + numb2;
		System.out.println("la somma di due int è: " + result);
	}

	public static void stampChar(char lettera){
		System.out.println("il seguente char è: " + lettera);
	}




	public static void sumInteger(Integer numb1, Integer numb2) {
		Integer result = numb1 + numb2;
		System.out.println("la somma di due Integer è: " + result);
	}

	public static void stampCharacter(Character lettera) {
		System.out.println("il seguente Carattere è: " + lettera);
	}



	public static void autoBoxingInt(int numero) {
		Integer numb = numero;
		System.out.println("l'autoboxing di int a Integer " + numb);
	}
	public static void autoBoxingDouble(double numero) {
		Double numb = numero;
		System.out.println("l'autoboxing di double a Double " + numb);
	}
	public static void autoBoxingChar (char lettera) {
		Character letter = lettera;
		System.out.println("l'autoboxing di char a Character " + letter);
	}



	public static void unBoxingInt(Integer numero) {
		int numb = numero;
		System.out.println("l'unboxing di Integer a int " + numb);
	}
	public static void unBoxingDouble(Double numero) {
		double numb = numero;
		System.out.println("l'unboxing di Double a double " + numb);
	}
	public static void unBoxingChar (Character lettera) {
		char letter = lettera;
		System.out.println("l'unboxing di Character a char " + letter);
	}
}