import java.util.Scanner;
class Equals{
	static void equal(){
		Scanner entry = new Scanner(System.in);
		System.out.print("Digite uma frase: ");
		String s1 = entry.nextLine();
		entry.nextLine();
		System.out.print("Digite uma frase: ");
		String s2 = entry.nextLine();
		System.out.println(s1.equals(s2));
	}
	public static void main(String[] args){
		equal();
	}
}