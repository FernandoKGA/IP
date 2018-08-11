import java.util.Scanner;
class PrimeiraLetra{
	static void primLet(String s1){
		char[] s2 = s1.toCharArray();
		char c = ' ';
		int n=0;
		for(int i=0;i<s2.length;i++){
			if(s2[i] == c){
				n++;
			}
		}
		char[] s3 = new char[n];
		n=0;
		for(int i=0;i<s2.length;i++){
			if(s2[i] == c){
				s3[n] = s2[i+1];
				n++;
			}
		}
		System.out.println();
		for(char ele:s3){
			System.out.print(ele);
		}
	}
	public static void main(String[] args){
		Scanner entry = new Scanner(System.in);
		System.out.print("Digite uma frase com espacos: ");
		String s1 = entry.nextLine();
		primLet(s1);
	}
}