class TestaInteiro{
	public static void main(String[] args){
		Inteiro a = new Inteiro();
		a.carregaValor(8);
		a.devolveValor();
		a.imprime();
		a.soma(5);
		a.imprime();
		a.subtrai(5);
		a.imprime();
		a.multiplicaPor(2);
		a.imprime();
		a.dividePor(2);
		a.imprime();
		a.dividePor(0);
		a.imprime();
	}
}