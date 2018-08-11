import java.util.Scanner;
class VinteCar{
	static void lefrase(){
		Scanner str = new Scanner(System.in);
		System.out.print("Digite uma frase com 20 caracteres: ");
		String s = str.nextLine();
		char[] s2 = s.toCharArray();
		if(s2.length == 20){
			char espaco = ' ';
			char letra = 'a';
			int esp = 0;
			int lt = 0;
			for(int i=0;i<s.length();i++){
				if(s2[i] == espaco){
					esp++;
				}
				if(s2[i] == letra){
					lt++;
				}
			}
			System.out.println("A frase tem: "+esp+" espacos e "+lt+" letras "+letra);
		}
		else{
			System.out.println("Quantidade invalida!");
		}
	}
	public static void main(String[] args){
		lefrase();
	}
}