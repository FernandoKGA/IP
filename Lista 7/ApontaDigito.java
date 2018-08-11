import java.util.Scanner;
class ApontaDigito{
	static void achadigito(String s){
		char []k = s.toCharArray();
		char []f = new char[k.length];
		for(int i=0;i<k.length;i++){
			if(k[i] == ('1')||k[i] == ('2')||k[i] == ('3')||k[i] == ('4')||k[i] == ('5')||k[i] == ('6')||k[i] == ('7')||k[i] == ('8')||k[i] == ('9')||k[i] == ('0')){
				f[i] = '^';
			}
			else f[i] = ' ';
		}
		for(char b:f){
			System.out.print(b);
		}
	}
	public static void main(String[] args){
		Scanner q = new Scanner(System.in);
		System.out.print("Digite uma frase com digitos: \n");
		String s = q.nextLine();
		achadigito(s);
	}
}