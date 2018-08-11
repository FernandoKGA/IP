class OrdenaString{
	static void ordenastring(String []s){
		for(int ult = s.length-1;ult>0;ult--){
			for(int i=0;i<ult;i++){
				if(s[i].length() > s[i+1].length()){
					String aux = s[i];
					s[i] = s[i+1];
					s[i+1] = aux;
				}
			}
		}
		for(int i=0;i<s.length;i++){
			System.out.println(s[i]);
		}
	}
	public static void main(String[] args){
		String a = "Vai para puta que pariu.";
		String b = "Rage.";
		String c = "Fodeu a caquita.";
		String d = "D E S P A C I T O";
		String []s = {a, b, c, d};
		ordenastring(s);
	}
}