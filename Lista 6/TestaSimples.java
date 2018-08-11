class TestaSimples{
	public static void main(String[] args){
		Simples t = new Simples();
		System.out.println (t.inicializaArray(a, 4));
		t.imprimeArray(a);
		System.out.println (t.estaNoArray(a, 4));
	}
	static int []a = new int[5];
}