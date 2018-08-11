import java.util.Scanner;
class MediaArray{
	static double media(double ar[]){
		double m=0;
		int i=0;
		for(double val:ar){
			m += val;              //Soma os numeros na variavel "m".
			i++;                    //Total de números para serem divididos.
		}
		m = m/(i);
		return m;
	}
	static double [] arranjo(String s){         //Transforma o método em um método que retorna o ENDEREÇO DO ARRANJO.
		char[] s3 = s.toCharArray();         //Transforma a String com numeros para Array.
		char esp = ' ';                  //Identificador de espacos.
		int cont=0;                    //Contador para a media.
		double m=0;                   //Variavel para guardar a media.
		for(int i=0;i<s3.length;i++){
			if(s3[i] == esp){				//Verifica quantos numeros existem.
				cont++;
			}
		}
		double[] ar = new double[cont];      //Cria um array para os numeros.
		if(cont == 1){
			Scanner unico = new Scanner(s);
			ar[0] = Double.parseDouble(s);
		}
		else{
			Scanner sc2 = new Scanner(s);       //Inicia o scanner.
			for(int i=0;i<cont;i++){
				ar[i] = sc2.nextDouble();         //Coloca os numeros no array.
			}
		}
		return ar;  //Retorna o endereço.
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
					double[] ar = arranjo(s);       //Recebe o endereço do arranjo.
					m = media(ar);               //Método que recebe o arranjo.
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