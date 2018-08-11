import java.util.Scanner;
class FreqRelatVogais{
	static void calculafreq(int va, int ve, int vi, int vo, int vu){
		double total = va + ve + vi + vo + vu;
		double fva = (va / total)*100;
		double fve = (ve / total)*100;
		double fvi = (vi / total)*100;
		double fvo = (vo / total)*100;
		double fvu = (vu / total)*100;
		System.out.println("A frequencia relativa da vogal 'A' eh: "+fva+"%");
		System.out.println("A frequencia relativa da vogal 'E' eh: "+fve+"%");
		System.out.println("A frequencia relativa da vogal 'I' eh: "+fvi+"%");
		System.out.println("A frequencia relativa da vogal 'O' eh: "+fvo+"%");
		System.out.println("A frequencia relativa da vogal 'U' eh: "+fvu+"%");
	}
	public static void main(String[] args){
		Scanner demon = new Scanner(System.in);
		System.out.println("Digite uma frase para verificar as vogais: ");
		String s = demon.nextLine();
		char []v = s.toCharArray();
		int va = 0;
		int ve = 0;
		int vi = 0;
		int vo = 0;
		int vu = 0;
		for(int i=0;i<v.length;i++){
			if(v[i] == 'a' || v[i] == 'A')	va++;
			else{
				if(v[i] == 'e' || v[i] == 'E') ve++;
				else{
					if(v[i] == 'i' || v[i] == 'I') vi++;
					else{
						if(v[i] == 'o' || v[i] == 'O') vo++;
						else{
							if(v[i] == 'u' || v[i] == 'U') vu++;
						}
					}
				}
			}
		}
		calculafreq(va,ve,vi,vo,vu);
	}
}