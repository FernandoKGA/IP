import java.util.Scanner;
import java.lang.Math;
class ValAbsReal{
	static double absoluto(double x){
		double y;
		y = Math.abs(x);
		return y;
	}
	static void saida(){
		System.exit(0);
	}
	static void repeticao(){
		boolean rpt = true;
		double x;
		double y;
		String sim = "Y";
		String nao = "N";
		do{
			Scanner str = new Scanner(System.in);
			System.out.print("Deseja verificar um valor? (Y ou N): ");
			String s = str.nextLine();
			if(s.equals(sim)){
				Scanner str2 = new Scanner(System.in);
				System.out.print("Digite um valor para verificar: ");
				String s2 = str2.nextLine();
				x = Double.parseDouble(s2);
				y = absoluto(x);
				System.out.println(y);
				repeticao();
			}
			else{
				if(s.equals(nao)){
					rpt = false;
					saida();
				}
				else{
					System.out.println("Digite uma resposta valida!");
					repeticao();
				}
			}
		}while(rpt);
	}
	public static void main(String[] args){
		repeticao();
	}
}