import java.util.Scanner;
class MinMaxVet{
	static double min(double[] s2,int s){
		double min = s2[0];
		for(int i=0;i<s;i++){
			if(min>s2[i]){
				min = s2[i];
			}
		}
		return min;
	}
	static double max(double[] s2,int s){
		double max = s2[0];
		for(int i=0;i<s;i++){
			if(max<s2[i]){
				max = s2[i];
			}
		}
		return max;
	}
	public static void main(String[] args){
		Scanner num = new Scanner(System.in);
		System.out.print("Digite o numero de valores que serao inseridos: ");
		int s = num.nextInt();
		double[] s2 = new double[s];   //Cria um arranjo para armazenagem.
		Scanner val = new Scanner(System.in);
		System.out.print("Digite os valores separados por espaco: ");
		String s3 = val.nextLine();  //Recebe valores como string.
		Scanner str = new Scanner(s3);     //Scanea o string.
		for(int i=0;i<s;i++){
			s2[i] = str.nextDouble();     //Coloca dentro do arranjo os valores Double.
		}
		double min;
		double max;
		min = min(s2, s);
		max = max(s2, s);
		System.out.println("O menor numero eh: "+min);
		System.out.println("O maior numero eh: "+max);
	}
}