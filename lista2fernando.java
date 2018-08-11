class lista2fernando{
	public static void main(String[] args){
		ex2(2, 5, 7); //instrução IF c receber 0
		ex3(2); // var menor que 4 ou maior que 10
		ex4(1, 2.5, 100.99);
		ex5(200, 1);
		ex6(2, 9, 5);
		ex7(40,0);
		ex8(22, 1, 1990, 15, 2, 1991);
		ex9(70, 1);
		ex10(157);
		ex11(10, 5);
		ex12(3, 4, 5);
	}
	static double trunca(double valor){
		// método para truncar
		double newval;
		newval = (int)(valor*100);
		valor = (valor/100);
		return valor;
	}
	static void ex2(int a,int b, int c){
		System.out.println("\t Ex2"); //se a está entre 0 e b, é atribuído à c, 0.
		if ((0 < a) && (a < b)){ 
			c = 0;
			}
			
		System.out.println("c é igual a: "+c);
	}
		
	static void ex3(int var){
		System.out.println("\t Ex3"); //se o número está fora da restrição 4<x<10, imprime fora
		if ((var <4)||(var >10))
			System.out.println("fora");
	}
	static double calculo(double na, double va){
		// calcula valor das aulas
		double valor;
		int valori;
		double valora;
		valor = na * va;
		trunca(valor);
		return valor;
	}
		
	static void ex4(double p, double na, double va){
		System.out.println("\t Ex4");
		// pagamento normal = 0  , pagamento antecipado = 1
		double calculoant;
		double v;
		if (p == 0){
			calculo(na, va);}
		else{
			calculoant = (int)((calculo(na, va) - (calculo(na, va)* 0.07)) * 100); //dá o desconto de 7%
			v = (calculoant/100);
			System.out.println("Valor: "+v);}
	}
	
	static void ex5(double preco, int pag){
		System.out.println("\t Ex5");
		//pag 0 = À VISTA ; pag 1 = EM DUAS VEZES(+10%) ; pag 2 = EM TRÊS VEZES(+20%)
		double precoduasv;
		double precotresv;
		double div2;
		double div3;
		if (pag == 0){
			System.out.println("Preço à pagar: R$"+preco);}
		if (pag == 1){
			precoduasv = (preco + (preco*0.1));
			div2 = (precoduasv/2);
			System.out.println("Preço à pagar: R$"+precoduasv+",pode ser parcelado em duas de "+div2);}
		if (pag == 2){
			precotresv = (preco + (preco*0.2));
			div3 = (precotresv/3);
			System.out.println("Preço à pagar: R$"+precotresv+",pode ser parcelado em três de "+div3);}
		
	}
	
	static void ex6(double a, double b, double c){
		System.out.println("\t Ex6");
		// qual o maior numero?
		if ((a > b) && (a > c)){
		System.out.println(""+a);}
		if ((b > a) && (b > c)){
		System.out.println(""+b);}
		else{
		System.out.println(""+c);}				
	}
	
	static void ex7(double temp, int tipo){
		System.out.println("\t Ex7");
		// tipo 0 = Celsius para Fahrenheit ; tipo 1 = Fahrenheit para Celsius
		double tempfah;
		double tempcel;
		if (tipo == 0){
			tempfah = ((160 + (9*temp))/5);
			System.out.println("Temperatura em Fahrenheit: "+tempfah);}
		else{
		tempcel = ((5*(temp - 32))/9);
		System.out.println("Temperatura em Celsius: "+tempcel);}
	}
	
	static void ex8(int dia1, int mes1, int ano1, int dia2, int mes2, int ano2){
		System.out.println("\t Ex8"); //verifica qual data é maior
		if ((ano1 > ano2) || ((ano1 == ano2) && (mes1>mes2)) || ((ano1 == ano2) && (mes1 == mes2) && (dia1 > dia2))){
			System.out.println("Data 1 é maior!");}
		if ((ano2 > ano1) || ((ano2 == ano1) && (mes2>mes1)) || ((ano2 == ano1) && (mes2 == mes1) && (dia2 > dia1))){
			System.out.println("Data 2 é maior!");}
		else{
			System.out.println("Datas são iguais!");}
		
	}
	
	static void ex9(double valor, int transf){
		System.out.println("\t Ex9"); //transforma os dados para a métrica desejada
		double quilometros=0;
		final double polegada = 25.3995;
		final double pe = (12*polegada);
		final double jarda = (3*pe);
		final double milha = (1760*jarda);
		final double div = 1000000;
		
		//transf 0 = polegada ; transf 1 = pe ; transf 2 = jarda; transf 3 = milha;
		if (transf == 0){
			quilometros = ((valor*polegada)/div);}
		else
			if (transf == 1){
				quilometros = ((valor*pe)/div);}
			else
				if (transf == 2){
					quilometros = ((valor*jarda)/div);}
				else
					if (transf == 3){
					quilometros = ((valor*milha)/div);}
		System.out.println("Valor em quilometros: "+quilometros+"Km");
	}
	
	static void ex10(double vel){
		System.out.println("/t Ex10"); //classifica qual a categoria da tempestade
		if ((vel >= 68) && (vel <=118)){
		System.out.println("Tempestade tropical");}
		else
			if ((vel >= 119) && (vel <= 153)){
				System.out.println("Furacão categoria 1");}
			else
				if ((vel >= 154) && (vel <= 177)){
				System.out.println("Furacão categoria 2");}
				else
					if ((vel >= 178) && (vel <= 209)){
					System.out.println("Furacão de categoria 3");}
					else
						if ((vel >= 210) && (vel <= 249)){
						System.out.println("Furacão de categoria 4");}
						else
							if (vel > 249){
							System.out.println("Furacão de categoria 5");}
	}
	
	static void ex11(int num, int den){
		System.out.println("\t Ex11"); //verifica se é difisor
		boolean ehdivisor = false;
		if (num % den == 0){
			ehdivisor = true;}
			
		System.out.println("É divisor: "+ehdivisor);
	}
	
	static void ex12(double cata, double catb, double hip){
		System.out.println("\t Ex12"); //verifica se é um triangulo retangulo
		double soma = (Math.pow(cata,2) + (Math.pow(catb,2)));
		double hipq = Math.pow(hip,2);
		boolean tret = false;
		if (soma == hipq){
			tret = true;}
		System.out.println("É triângulo retângulo? "+tret);
	}
}
	



