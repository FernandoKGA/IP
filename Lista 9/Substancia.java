class Substancia{
    private String nome;
    private int tipo;   //1=simples   2=nobre
    private double preco;
    public static final double cotacao = 2.50;
	public static int guardaObj = 0;
	public static int quant = 0;
    
	Substancia(){
		guardaObj++;
	}
    public void defineNome(String pnome) {nome = pnome;}
    public String obtemNome() {return nome;}
    public void defineTipo(int ptipo) {tipo = ptipo;}
    public int obtemTipo() {return tipo;}
    public void definePreco(int ppreco) {preco = ppreco;}
    public double obtemPreco() {return preco;}
	public void defineQuant(int pquant) {quant = pquant;}
	public int obtemQuant() {return quant;}
    public void mostraAtributos(){
        obtemNome();
        obtemTipo();
        obtemPreco();
		obtemQuant();
        System.out.println(cotacao);
		
    }
}