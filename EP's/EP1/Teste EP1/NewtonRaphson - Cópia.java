/*********************************************************************/
/**   <Fernando Karchiloff Gouveia de Amorim>     <10387644>        **/
/**                                                                 **/
/**   <28/05/2017>                                                  **/
/*********************************************************************/
class NewtonRaphson {
	//Arranjos que serão utilizados para colocar seus respectivos valores.
	static double[] depositos = new double[11]; //Cria um arranjo para serem colocados os valores dos depositos e saldo final.
	
	static int[] datas = new int[11]; //Cria um arranjo para a alocação das datas(meses) de deposito e o mês de consulta.
	
	//Métodos variados que serão utilizados.
	
	static double funcao(double jk, double depositos[], int datas[]) {
		double tf = datas[10]; //Data de consulta do saldo.
		double funcao = 0; //Inicializa a função.
		for(int i=0;i<(datas.length - 1);i++) {                        //Roda um for que fará a somatória de função conforme ele roda.
			funcao += depositos[i]*(Math.pow((1+jk),(tf - datas[i]))); //Calcula o deposito inicial vezes 1 mais o juros elevado a data final menos o do mes.
		}
		funcao -= depositos[10]; //Subtrai da função o valor do saldo.
		return funcao;  //Retorna o valor de função.
	}
	static double derivada(double jk, double depositos[], int datas[]) {
		double tf = datas[10]; //Data de consulta do saldo.
		double derivada = 0; //Inicializa a derivada.
		for(int i=0;i<(datas.length - 1);i++) {     //Roda um for que fará a somátoria de derivada conforme ele roda.
			derivada += (tf - datas[i]) * depositos[i]*(Math.pow((1+jk),(tf - datas[i] - 1))); /*Faz o seguinte calculo para derivada: "Desce" o expoente, */
		}																					   /*e subtrai 1 do mesmo no expoente, fazendo isso para a     */
		return derivada;																	   /*somatória e seguindo o mesmo cálculo de função.           */
	}
	static double juros(double jk) {  //Calcula juros seguinte conforme a fórmula apresentada.
		double jknext = jk - (funcao(jk,depositos,datas) / derivada(jk,depositos,datas)); //Chama as funções para fazer o cálculo.
		return jknext;  //Retorna o valor de jk+1.
	}
	
	//Método para cálculo dos juros de aplicação, segundo Newton-Raphson.
	static double newton(double epsilon) {
		double jk=0.5; //Juros que utilizaremos como aproximação.
		double jknext= 0; //Inicializa variável que irá receber o valor do cálculo do juros.
		double difjuros = 0; //Inicializa diferença dos juros.
		if((epsilon <=0)||(epsilon>=1)){
			return -1; //Se epsilon é maior ou igual a: 1 ou 0, ele retorna -1.
		}
		for(int cont=1;cont<=datas.length;cont++) {
			jknext = juros(jk);              			//Guarda o próximo juros calculado em uma variável.
			difjuros = Math.abs(jknext - jk);           //Faz a diferença dos juros.
			if(difjuros<epsilon){
				jk=jknext;
				return jk;
			}
			jk = jknext;                     			//Armazena o novo juros(jk+1) na variável antiga de juros(jk) para se tornar a próxima para uso.
		}
		return jk;  //Retorna o valor do juros.
	}
	
	/*
		Use isso apenas para seus testes. Ele pode até ser removido para entrega. Use-o para abastecer valores nos arranjos e então testar o método newton.
		
		O MAIN SERA COMPLETAMENTE IGNORADO.
	*/
	public static void main(String args) {
		// será ignorado
	}
}
