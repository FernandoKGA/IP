import java.util.Scanner;
class Palindromo{
	static void palindromo(char s2[]){
		boolean palindromo=false; //palindromo definido falso como default
		int n = s2.length; //transfere o tamanho do arranjo para variavel
		char s3[] = new char[n]; //cria novo arranjo
		for (int i=0;i<n;i++){ //adiciona ao novo arranjo os numeros inversamente
			s2[(n - 1)-i] = s3[i];
		}
		for (int i=0;i<n;i++){
			if (s2[(n-1)-i] == s3[i]){
				palindromo = true;
			}
			else{
				palindromo = false;
				break;
			}
		}
		System.out.println(palindromo);
	}
	public static void main(String[] args){
		Scanner entry = new Scanner(System.in);
		System.out.print("Digite uma palavra para verificar se eh palindromo: ");
		String s1 = entry.nextLine();
		char[] s2 = s1.toCharArray();
		palindromo(s2);
	}
}