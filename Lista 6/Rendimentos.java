class Rendimentos{
	double rPF=0;
	double rPJ=0;
	double rAF=0;
	double rNT=0;
	Rendimentos(double PF, double PJ, double AF, double NT){
		this.rPF = PF;
		this.rPJ = PJ;
		this.rAF = AF;
		this.rNT = NT;
	}
	double totalDeRendimentosTributaveis(){				//Chama as os rendimentos
		TabelaDeAliquotas a = new TabelaDeAliquotas();
		double total = rPF + rPJ + rAF;
		return a.valorADeduzir(total);
	}
}