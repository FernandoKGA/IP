class MediaAlunoDisciplina{
	String nomdis;
	String nomalu;
	static double pesotrab = 0.2;
	static double pesoprov = 0.8;
	double trab;
	double prov;
	double mediapond;
	MediaAlunoDisciplina(String nome, String disciplina, double trab, double prov){
		this.nomalu = nome;
		this.nomdis = disciplina;
		this.trab = trab;
		this.prov = prov;
	}
	double calculaMediaPonderada(){
		mediapond = (trab * pesotrab) + (prov * pesoprov);
		return mediapond;
	}
	void imprimeDados(){
		System.out.println("Nome do aluno: "+nomalu);
		System.out.println("Nome da disciplina: "+nomdis);
		System.out.println("Media ponderada: "+mediapond);
	}
}