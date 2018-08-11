import java.util.Scanner;
class LevantaShift{
	static void levanta(String s){
		Scanner scan = new Scanner(s);
		String f = "";
		while(scan.hasNext()){
			String h = scan.next();      //Pega a próxima palavra.
			String c = h.substring(0,1).toUpperCase() + h.substring(1,h.length());  //Da Upper Case na palavra.
			f = f +" "+c;      //Incrementa a string antiga com a palavra nova.
		}
		System.out.println("String convertido: "+f);
	}
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.print("Digite uma string:  ");
		String p = s.nextLine();
		levanta(p);
	}
}