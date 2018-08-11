import java.util.Calendar;
class Pessoa{
	Calendar c = Calendar.getInstance();
	String nome;
	int sexo;
	String doc;
	Pessoa(String nome, int sexo, String doc, int data, int mes, int ano){
		this.nome = nome;
		this.sexo = sexo;
		this.doc = doc;
		this.data = data;
		this.mes = mes;
		this.ano = ano;
	}
	int data;
	int mes;
	int ano;
	int ano2 = c.get(Calendar.YEAR);   //Pega o ano atual.
	int mes2 = c.get(Calendar.MONTH);  //Pega o mês atual.
	int data2 = c.get(Calendar.DAY_OF_MONTH);  //Pega o dia atual.
	int difano;
	int idade(){
		difano = ano2 - ano;  //Faz a diferença de anos.
		if(mes2 < mes) difano -= 1;      //Mês atual menor que mês de nascimento
		else
			if(data2 < data) difano -= 1;
		if(difano < 0) return -1;
		else return difano;
	}
	void PessoaDados(){
		System.out.println("Nome da pessoa: "+nome);
		switch(sexo){
			case 0: System.out.println("Sexo da pessoa: Feminino");
			break;
			case 1: System.out.println("Sexo da pessoa: Masculino");
			break;
		}
		System.out.println("Documento da pessoa: "+doc);
		System.out.println("Idade da pessoa: "+difano);
	}
}