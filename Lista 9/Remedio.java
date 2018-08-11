class Remedio{
	String nomeRem; 
    public void defineNomeRem(String nomeR) {nomeRem = nomeR;}
    public String obtemNomeRem() {return nomeRem;}
	public static void main(String[] args){
		Substancia x = new Substancia();
		Substancia y = new Substancia();
		Remedio u = new Remedio();
		
		
		
		x.defineNome("Cloro");
		x.defineTipo(1);
		x.definePreco(25);
		x.defineQuant(2);
		
		y.defineNome("Alcool");
		y.defineTipo(2);
		y.definePreco(10);
		y.defineQuant(8);
		
		x.mostraAtributos();
		
		u.defineNomeRem("Veneno geral");
		u.obtemNomeRem();
		double pfinal = (x.obtemTipo()*x.obtemPreco()*x.obtemQuant()) + (y.obtemTipo()*y.obtemPreco()*y.obtemQuant());
		System.out.println (" O remedio " +u.obtemNomeRem()+ " custa " +pfinal*Substancia.cotacao);
	}
}