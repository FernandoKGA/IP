class ConversorMonetario{
	double tc;
	double tv;
	double reais;
	double defineTaxaCompra(double tc){
		this.tc = tc;
		return tc;
	}
	double defineTaxaVenda(double tv){
		this.tv = tv;
		return tv;
	}
	void imprimeTaxas(){
		System.out.println("Taxa de compra: "+tc+"R$, Taxa de venda: "+tv+"R$");
	}
	void vendeDolar(double dolar){
		reais = dolar * tv;
		System.out.println("Valor em reais da venda de "+dolar+" U$ dolares: "+reais+"R$");
	}
	void compraDolar(double dolar){
		reais = dolar * tc;
		System.out.println("Valor em reais da compra de "+dolar+" U$ dolares: "+reais+"R$");
	}
}