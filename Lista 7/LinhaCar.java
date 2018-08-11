import java.util.Scanner;
class LinhaCar{
	static void linhacar(int n){
		if(n>0){
			preenche(n);
		}
		if(n==0){
			System.out.println("Voce abriu este programa para o que se nao vai verificar nada?");
		}
		if(n<0){
			System.out.println("Valor menor que 0. FAZ ISSO DIREITO!");
		}
	}
	static void preenche(int n){
		int ch = 3;
		char[][] matriz = new char [n][ch];
		for(int i=0;i<n;i++){                            //For para preenchimento da matriz.
			Scanner entry = new Scanner(System.in);   //Abre novo scanner.
			System.out.print("Digite tres caracteres separados por espaco: ");
			String str = entry.nextLine();          //Armazena caracteres no scanner.
			Scanner entry2 = new Scanner(str);   //Scanea.
			String str1 = entry2.next();               //Primeiro caracter.
			char[] a = str1.toCharArray();
			matriz[i][0] = a[0];
			String str2 = entry2.next();               //Segundo caracter.
			char[] b = str2.toCharArray();
			matriz[i][1] = b[0];
			String str3 = entry2.next();               //Terceiro caracter.
			char[] c = str3.toCharArray();
			matriz[i][2] = c[0];
		}
		verifica(matriz, n);
	}
	static void verifica(char[][] matriz , int n){
		int m=0;
		for(int i=0;i<n;i++){
			if((matriz[i][0] == matriz[i][1]) && (matriz[i][0] == matriz[i][2])){
				m=0;
			}
			else{
				if((matriz[i][0] < matriz[i][1]) && (matriz[i][1] < matriz[i][2])){
					m=1;
				}
				else{
					if((matriz[i][0] > matriz[i][1]) && (matriz[i][1] > matriz[i][2])){
						m=2;
					}
					else{
						m=3;
					}
				}
			}
			switch(m){
				case 0: System.out.println("Caracteres iguais.");
				break;
				case 1: System.out.println("Crescente.");
				break;
				case 2: System.out.println("Decrescente.");
				break;
				case 3: System.out.println("Desordenado.");
			}
		}
	}
	public static void main(String[] args){
		Scanner entry = new Scanner(System.in);
		System.out.print("Digite um numero de linhas: ");
		int n = entry.nextInt();
		linhacar(n);
	}
}