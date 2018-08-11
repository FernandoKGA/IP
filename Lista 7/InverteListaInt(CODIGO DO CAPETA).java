import java.util.Scanner;
class InverteListaInt{
	static void ordenacao(String lista , int x){
		int arylista[] = new int[x];        //Cria array com o limite dado.
		int qtdInt = 0;
		int fim = -1;
		int aux = 0;
		int y = 0;
		int z = 0;
		Scanner scan = new Scanner(lista);
		while(scan.hasNext()){              //Verifica quantos inteiros tem.
			if(scan.hasNextInt() == true){
				y = scan.nextInt();
				if(y != -1){
					qtdInt++;
					System.out.println("qtdInt "+qtdInt);
				}
				else break;
			}
		}
		if(qtdInt > x) System.out.println("Excedeu o limite. Adicionais serao ignorados. ");  //Caso exceda o limite.
		else{
		for(int i=0;i<x;i++){
			z = scan.nextInt();
			if(z == fim) break;      //Sai do for.
			else{
				arylista[i] = scan.nextInt();
				System.out.println("nao invert "+arylista[i]);
			}
		}
		for(int i=0;i<x;i++){
			aux = arylista[x-1-i];
			arylista[x-1-i] = arylista[i];
			arylista[i] = aux;
			System.out.println("invert "+arylista[i]);
		}
		for(int val:arylista) System.out.print(" "+val);
		}
	}
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);           //Scanner da lista.
       	System.out.print("Defina um numero maximo para sua lista: ");
		int x = s.nextInt();
		System.out.println("Digite uma lista de inteiros positivos e que termina com -1 para inverter: ");
		String lista = s.next();
		ordenacao(lista , x);
	}
}