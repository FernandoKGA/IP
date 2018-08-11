/*******************************************************************/
/** ACH2001 - Introducao a Programacao                            **/
/** EACH-USP - Primeiro Semestre de 2015                          **/
/**                                                               **/
/** Segundo Exercicio-Programa                                    **/
/**                                                               **/
/** <Fernando Karchiloff Gouveia de Amorim>  <10387644>           **/
/**                                                               **/
/*******************************************************************/

class Integral {
	/**
		Retorna a área sob a curva definida pela função f, entre os pontos
		a e b, pela regra dos trapézios, aproximando a curva por n trapézios.
		
		O método retorna -1 caso n não seja maior ou igual a 1.
	*/
	static double resolve(Funcao f, double a, double b, int n) {
		double somat=0;              //Variável para somatória de função.
		double area=0;			   	  //Variável para guardar a área.
		double h = (b - a)/n;         //Altura do trapézio.
		double xi = a + h;            //Intervalo.
		if(n<=0)return -1;           //Retorna -1 caso n não seja válido.
		else
			for(int ct = 1; ct<n;ct++,xi+=h) somat += f.valor(xi);    //Cálculo da somatória para o intervalo.
		
			area = (h/2)*(f.valor(a) + f.valor(b) + 2*somat);            //Calcula a área.
			
			return area;                       //Retorna área.
		// coloque seu código aqui
	}
}
