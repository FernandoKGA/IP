import java.util.Scanner;
class AchaChar{
	static int AchaChar(String s1,String c){
		char[] s2 = s1.toCharArray();
		char[] ch = c.toCharArray();
		for(int i=0;i<s1.length();i++){
			if(s2[i] == ch[0]){
				return i+1;
			}
		}
		return -1;
	}
	public static void main(String[] args){
		int i;
		Scanner entry = new Scanner(System.in);
		System.out.print("Digite uma frase: ");
		String s1 = entry.nextLine();
		System.out.print("Digite um caracter: ");
		String c = entry.nextLine();
		i = AchaChar(s1, c);
		System.out.println("A posicao do caracter eh: "+i);
	}
}