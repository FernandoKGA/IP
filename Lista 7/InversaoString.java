import java.util.Scanner;
class InversaoString{
	static void Inversao(String s1){
		char[] s2 = s1.toCharArray();
		int n = s2.length;
        int comeco = 0;
        int fim = n - 1;
		char x;
        while(fim>comeco){
            x = s2[comeco];
            s2[comeco] = s2[fim];
            s2[fim] = x;
            comeco++;
            fim--;
        }
		s1 = new String(s2);
		System.out.println(s2);
	}
	public static void main(String[] args){
		Scanner entry = new Scanner(System.in);
		System.out.print("Digite uma frase para inverter: ");
		String s1 = entry.nextLine();
		Inversao(s1);
	}
}