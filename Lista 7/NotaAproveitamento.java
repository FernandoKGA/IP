	
import java.util.Scanner;
class NotaAproveitamento{
	static float nota(String s){
 		Scanner sc2 = new Scanner(s);
 		float n1 = sc2.nextFloat();
 		float n2 = sc2.nextFloat();
 		float a1 = sc2.nextFloat();
 		float a2 = sc2.nextFloat();
 		float pesop1 = 0.4;
 		float pesop2 = 0.6F;
 		float ep1 = 0.4F;
 		float ep2 = 0.6F;
 		float mp = (n1*pesop1)+(n2*pesop2);
 		float ma = (a1*ep1)+(a2*ep2);
 		float nota = (mp+ma)/2;
 		return nota;
	}
	public static void main(String[] args){
		float nota;
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite suas notas: ");
		String s = sc.nextLine();
		nota = nota(s);
		System.out.println(nota);
	}
}