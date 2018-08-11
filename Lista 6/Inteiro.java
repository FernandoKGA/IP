class Inteiro{
	int valor;
	void carregaValor(int v){
		this.valor = v;
	}
	int devolveValor(){
		return valor;
	}
	int devolveValorAbsoluto(){
		valor = Math.abs(valor);
		return valor;
	}
	void imprime(){
		System.out.println(valor);
	}
	int soma(int v){
		this.valor = valor + v;
		return valor;
	}
	int subtrai(int v){
		this.valor = valor - v;
		return valor;
	}
	int multiplicaPor(int v){
		this.valor = valor * v;
		return valor;
	}
	int dividePor(int divisor){
		if(divisor == 0){
			System.out.println("Erro.");
			return valor;
		}
		else{
			this.valor = valor / divisor;
			return valor;
		}
	}
}