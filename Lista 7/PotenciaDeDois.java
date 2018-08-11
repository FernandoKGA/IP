import java.util.Scanner;
class PotenciaDeDois{
	static void verifica(int k){
		boolean ver = false;
		for(int i=1;i<=k/2;i++){
			if(Math.pow(2,i) == k){
				System.out.println("Eh potencia "+i);
				ver = true;
			}
		}
		if(ver == false){
			System.out.println("Nao eh potencia");
		}
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		boolean mc = true;
		String sim = "Y";
		String sim2 = "y";
		String nao = "N";
		String nao2 = "n";
		while(mc){
			System.out.print("Digite um numero para verificar potencia: ");
			int k = sc.nextInt();
			verifica(k);
			System.out.print("Quer verificar mais um? (Y ou N): ");
			String s = sc1.nextLine();
			if(s.equals(nao) || s.equals(nao2)){
				System.exit(0);
			}
		}
	}
}