class TestaConversorMonetario{
	public static void main(String[] args){
		ConversorMonetario a = new ConversorMonetario();
		a.defineTaxaCompra(3.2431);
		a.defineTaxaVenda(3.2437);
		a.imprimeTaxas();
		a.vendeDolar(300);
		a.compraDolar(700);
	}
}