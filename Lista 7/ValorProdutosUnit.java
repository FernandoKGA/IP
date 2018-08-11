import java.util.Scanner;
class ValorProdutosUnit{
	static float[][] addmatriz(String s,float m[][], int i){
		Scanner matx = new Scanner(s);      //Scanea s.
		String w = matx.next();             //Acha os números.
		String g = matx.next();
		m[i][0] = Integer.parseInt(w);
		m[i][1] = Float.parseFloat(g);
		matx.close();
		return m;      //Retorna a matriz atualizada.
	}
	public static void main(String[] args){
		Scanner prod = new Scanner(System.in);
		System.out.print("Quantos tipos de produto deseja inserir?: ");
		int qt = prod.nextInt();     //Recebe quantidade de tipos.
		prod.close();
		int i=0;   //Var para rodar matriz.
		int ct = 1;   //Contador
		float [][]m = new float[qt+1][3];   //Cria uma matriz com a qtd de produtos e coloca linha adicional para calcular total.
		do{
			Scanner demon = new Scanner(System.in);      //Abre outro scanner.
			System.out.print("Coloque a quantidade e separado, o valor: ");
			String s = demon.nextLine();       //"RECEBERIA" os valores.
			addmatriz(s, m, i);     //Leva os valores para serem adicionados.
			ct++;
			i++;
		}while(ct<=qt);
		i=0;
		for(;i<m.length-1;i++){
			for(int j=0;j<2;j++){
				System.out.print(m[i][j]);
			}
		}
		
	}
}