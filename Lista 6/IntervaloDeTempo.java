class IntervaloDeTempo{
	int tempo;
	static int horas;
	static int min;
	static int sec;
	IntervaloDeTempo(int tempo){
		this.tempo = tempo;
	}
	void calculoDeTempo(){
		horas = tempo / 3600; //Verifica quantas horas tem.
		tempo = tempo % 3600; //Guarda o resto em novo tempo.
		min = tempo / 60;
		tempo = tempo % 60;
		sec = tempo;
		System.out.println(horas+" horas, "+min+" minutos e "+sec+" segundos.");
	}
}