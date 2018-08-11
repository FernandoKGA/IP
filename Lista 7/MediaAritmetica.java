import java.util.Scanner;
class MediaAritmetica{
	static double media(String s){
		char[] s3 = s.toCharArray();         //Transforma a String com numeros para Array.
		char esp = ' ';                  //Identificador de espacos.
		int cont=0;                    //Contador para a media.
		double m=0;                   //Variavel para guardar a media.
		for(int i=0;i<s3.length;i++){
			if(s3[i] == esp){				//Verifica quantos numeros existem.
				cont++;
			}
		}
		if(cont == 1){
			Scanner unico = new Scanner(s);
			m = Double.parseDouble(s);
			return m;
		}
		else{
			double[] s4 = new double[cont];      //Cria um array para os numeros.
			Scanner sc2 = new Scanner(s);       //Inicia o scanner.
			for(int i=0;i<cont;i++){
				s4[i] = sc2.nextDouble();         //Coloca os numeros no array.
			}
			for(int i=0;i<cont;i++){
				m += s4[i];              //Soma os numeros na variavel "m".
			}
			m = m/(cont);
			return m;
		}
	}
	public static void main(String[] args){
		double m=0;            //Variavel para armazenar a media.
		Scanner sc1 = new Scanner(System.in);
		System.out.print("Digite um numero para calcular a media: ");
		String s = sc1.next();
		s = s + ' ';           //Adiciona um espaco para o Scanner poder ler.
		boolean repete = true;   //Condicional para loop do while.
		String y = "Y";             //Respostas para o usuario colocar.
		String n = "N";
		while(repete){
			System.out.print("Deseja adicionar mais um numero? (Y ou N): ");
			String s2 = sc1.next();
			if(s2.equals(y)){
				System.out.print("Digite um numero: ");
				s = s + sc1.next();        //Adiciona o numero ao string (CUIDADO! Escrever "s = sc1.next()" ira SUBSTITUIR).
				s = s + ' ';
			}
			else{
				if(s2.equals(n)){
					m = media(s);
					System.out.println("A media eh: "+m);
					System.exit(0);
				}
				else{
					System.out.println("Resposta invalida!");
				}
			}
		}
	}
}