class CalculadoraDeImposto{
	public static void main(String[] args){
		double valdedu;
		Rendimentos a = new Rendimentos(10000,0,10000,0);
		valdedu = a.totalDeRendimentosTributaveis();
		System.out.println("Imposto a ser pago:"+valdedu);
	}
}