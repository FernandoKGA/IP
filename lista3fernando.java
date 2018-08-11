class lista3fernando{
	public static void main(String[] args){
	//Lista de exercícios 3 do professor Norton, exercícios listados abaixo (entradas) deles.
	ex1a();
	ex1b();
	ex1c();
	ex2();
	ex3a();
	ex3b();
	ex3c();
	ex3d();
	ex3e();
	ex3f();
	ex3g();
	ex4();
	ex5();
	ex6();
    ex7a();
    ex7b();
	ex7c();
    ex8();    
    ex9();
    ex10();
    ex11();
    ex12();
    ex13();
    ex14();
    ex15();
    ex16();
    ex17();
    ex18();
    ex19(2, 5);
    ex20(16);
    ex21(5);
    ex22(5);
    ex23(50);
    ex24(4);
    ex25(6);
    ex26(6);
    ex27a(3,5);
	ex27b(6,2);
	ex27c(7,3);
    ex28(5);
    ending();
	}
	
	static void ex1a(){
		System.out.println("\t Ex 1a"); //vai somando o soma e o cont e será printado no final do while.
		int soma = 33;
		int cont = 1;
		while (cont < 12){
			soma = soma + cont;
			cont = cont + 2;
		}
		System.out.println("Os números são:"+cont+" e "+soma);
	}
	
	static void ex1b(){
		System.out.println("\t Ex 1b"); //vai printar na tela uma sequencia de números até acabar o while.
		int num = 0;
		while(num <= 5){
			num = num + 1;
			System.out.println(num);
		}
	}
	
	static void ex1c(){
		System.out.println("\t Ex 1c");
		int dest1 = 15;
		int dest2 = 27;
		int local1 = 20;
		int local2 = 20;
		boolean chegou1 = false;
		boolean chegou2 = false;
		
		while ((!chegou1) && (!chegou2)){
			local1 = local1 - 1; //se move uma unidade por instante
			local2 = local2 + 2; //se move 2X mais rápido
			chegou1 = (local1 <= dest1);
			chegou2 = (local2 >= dest2);
			System.out.println("os viajantes estao em"+local1+" e "+local2);
		}
		System.out.println("As posicoes finais dos viajantes sao"+local1+" e "+local2);
		
	}
	
	static void ex2(){
		System.out.println("\t Ex 2");
		System.out.println("R: Quando o corpo de um comando while nao altera suas condicoes,\n podemos dizer que ele vai entrar em loop infinito, nunca vai sair.");
		
	}
	
	static void ex3a(){
		System.out.println("\t Ex 3a"); //vai printar na tela uma sequencia de números até acabar o while.
		int num = 0;
		do {
		num = num + 1;
		System.out.println(num);
		} while (num <= 5);
	}
	
	static void ex3b(){
		System.out.println("\t Ex 3b"); //não vai executar nada, pois não está dentro das condições do while.
		int num = 6;
		do {
		num = num + 1;
		System.out.println(num);
		} while (num <= 5);
	}
	
	static void ex3c(){
		System.out.println("\t Ex 3c"); //for é o comando while simplificado, print com ln.
		for(int cont = 1; cont <=5; cont++) System.out.println("Oi");
	}
	
	static void ex3d(){
		System.out.println("\t Ex 3d"); //for é o comando while simplificado, print sem ln(continua).
		for(int cont = 1; cont <=5; cont++) System.out.print("Oi");
		System.out.println("\n");
	}
	
	static void ex3e(){
		System.out.println("\t Ex 3e"); //for é o comando while simplificado, printa "Oi Arthur".
		for(int cont = 1; cont <= 5; cont++) {
		System.out.print("Oi");
		System.out.print(" Artur");
		}
		System.out.println("\n");
	}
	
	static void ex3f(){
		System.out.println("\t Ex 3f"); //for é o comando while simplificado, printa "OiArthur".
		for(int cont = 1; cont <= 5; cont++) {
		System.out.print("Oi");
		System.out.print("Artur");
		}
		System.out.println("\n");
	}
	static void horiz(){
		for(int comp = 1; comp < 11; comp++) System.out.print("*");
		System.out.println();
	}
	static void lado(){
		System.out.print("*");
		for(int espaco = 1; espaco <= 8; espaco++) System.out.print(" ");
		System.out.println("*");
	}
	static void ex3g(){
		System.out.println("\t Ex 3g"); //for é o comando while simplificado, usa outros métodos para formar um desenho.
		horiz();
		for(int vert = 1; vert < 7; vert++) lado();
		horiz();
	}
	
	static void ex4(){
		System.out.println("\t Ex 4"); //faz multiplicação(faz seu quadrado) do numero conforme o while roda.
		int numero;
		for(numero = 1; numero <=10; numero++);
			System.out.println(numero*numero);
	}
	
	static void ex5(){
		System.out.println("\t Ex 5"); //soma os 10 primeiros números inteiros.
		int cont = 1;  //contador
		int num = 2;  //numeros, ex: 2, 4, 6...
        int soma = 0; //soma da soma anterior e o numero posterior
		while(cont <= 10){
            soma = soma + num;
            num = num + 2;
			cont = cont + 1;
		}
		System.out.println(soma);
	}
	
	static void ex6(){
        System.out.println("\t Ex 6"); //printa o cubo de números inteiros
		for(int num=1;num <=10; num++){
            System.out.print(Math.pow(num, 3));
            System.out.print(" ");
        }
        System.out.println();
	}
    
    static void ex7a(){
        System.out.println("\t Ex 7a"); //printa uma ordem de números com intervalo 5
        for(int num=3; num<=48; num= num+5){
            System.out.print(num);
            System.out.print(" ");
        }
        System.out.println();
        
    }
    
    static void ex7b(){
        System.out.println("\t Ex 7b"); //printa uma ordem de números com intervalo 5
        for(int num=-2; num<=43; num= num+5){
            System.out.print(num);
            System.out.print(" ");
        }
        System.out.println();
    }
    
    static void ex7c(){
        System.out.println("\t Ex 7c");  // printa uma ordem de números com intervalo 5
        for(int num=48; num>=3; num= num-5){
            System.out.print(num);
            System.out.print(" ");
        }
        System.out.println();
    }
    
    static void ex8(){
        System.out.println("Inteiro\t Quadrado Cubo"); //faz uma tabela com o inteiro, seu quadrado e seu cubo
        for(int num=1; num<=15; num++){
            System.out.println(num+"\t "+(Math.pow(num,2))+"\t  "+(Math.pow(num,3)));
        }
    }
    
    static void ex9(){
        System.out.println("\t Ex9");   //printa oba em várias linhas
        for (int cont = 1; cont <= 5; cont++) {
            for (int cont2 = 1; cont2 <= 3; cont2++) System.out.print("oba-");
            System.out.print("oba\n");
            }
    }
    
    static void pts(int pts){
        for(;pts>0;pts--)System.out.print("."); //printa os pontos e diminui 1 a cada entrada
    }
    static void ast(int ast){
        for(;ast<10;++ast)System.out.print("*"); //printa os asteriscos e aumenta 2 a cada entrada,na primeira só imprime um ast
                                                //conforme diminui dois, ele permite imprimir mais dois somando no while
    }
    static void ex10(){
        System.out.println("\t Ex10");
        int ast=9;
        int pts=3;
        for(int lin=1;lin<=4;lin++){
            pts(pts);ast(ast);pts(pts);pts(pts);ast(ast);pts(pts); //formato do desenho
            System.out.println();
            pts--;
            ast=ast-2;  //setam as próximas entradas diminuindo-as de acordo com a inicialização
        }
        
    }
    
    static void ex11(){
        System.out.println("\t Ex11");
        int soma = 0; //faltava a inicialização de "soma".
        for (int k = 4; k <= 9; k++) soma += k; //soma k ao "soma" anterior e k aumenta conforme o cmd for roda.
        System.out.println(soma);
    }
    
    static void ex12(){
        System.out.println("\t Ex12");
        for (int cont1 = 1; cont1 <= 5; cont1++){
            for (int cont2 = cont1; cont2 >= 1; cont2--) System.out.print(cont2);   //printa o número do cont1 confirme o for roda e subtrai 1 dele e junta com o anterior.
            System.out.println();
        }
    }
    
    static void ex13(){
        System.out.println("\t Ex13");
        for(int ln=1;ln<=5;ln++){
            for(int col=1;col<=10;col++)System.out.print("*");
            System.out.println();
        }
    }
    
    static void col(int col){
        for(;col>0;col--)System.out.print("*");
        System.out.println();
    }
    static void ln(int ln, int col){
        for(;ln>=1;ln--){
            col(col);
        }
    }
    static void ex14(){
        System.out.println("\t Ex14");
        ln(6,12);
    }
    
    static void linhafor(int n){
        for(;n>0;n--)System.out.print("*");
        System.out.println();
    }
    static void linhawhile(int n){
        while(n>0){
            System.out.print("*");
            n--;
        }
        System.out.println();
    }
    static void linhadowhile(int n){
        do{
            System.out.print("*");
            n--;
        }while(n>0);
        System.out.println();
    }
    static void ex15(){
        System.out.println("\t Ex15");
        linhafor(7);
        linhawhile(5);
        linhadowhile(7);
    }
    
    static double invest(double a,double n,double r){
        double invest = a*(Math.pow((1+r),n));
        return invest;
    }
    static void ex16(){
        System.out.println("\t Ex16");
        System.out.println("Numero de meses  Investimento Acumulado");
        int n=1; //número inicial de meses
        int nm=7; //contador para parada do laço e qtd de meses
        for(;n<=nm;n++){System.out.print("\t"+n+"\t\t"+invest(10000, n, 0.01)); //juros(r) deve ser definido no metodo, já convertido, o valor (a) também
            System.out.println(); //quebra para próxima linha na tabela
        }
        
    }
    
    static void ex17(){
        System.out.println("\t Ex17");
        double k = 11;
        double i = 1;
        double j = 0;
        double p = k/2;
        while (i <= k){
            if (k % i == 0){
                i = i + 1;
                j = j + 1;}
            if (i >= p){
                i = k;
                i = i + 1;
                j = j + 1;}
            else{
                i = i + 1;}
        }
        if (j==2){
            System.out.println("Eh primo!");}
        else{
            System.out.println("Nao eh primo!");}
        
    }
    
    static void ex18(){
        System.out.println("\t Ex18");
        int num = 322;
        int a = num % 10;
        num /= 10;
        int b = num % 10;
        num /= 10;
        int c = num % 10;
        if (a == c){
            System.out.println("Eh palindromo.");
        }
        else
            System.out.println("Nao eh palindromo");
    }
    
    static void ex19(int n,int m){
		System.out.println("\t Ex19");
        int contn = n + 1; //contador para linha
        int contm = m + 1; //contador para coluna
        int cm = contm - m; //variavel que força a coluna para 1
        int cn = contn - n; //variavel que força a linha para 1
        if ((n == 0)&&(m == 0)){
            System.out.println("N e/ou M nao podem ser 0");
        }
        else{
            for(;cn<contn;cn++){
                System.out.print(cn);
                for(;cm<contm;cm++){
                    System.out.print("\t"+cn+"x"+cm+"="+(cn*cm));}
                cm = 1;
                System.out.println();
            }
        }
		System.out.println();
    }
    
    static void ex20(int n){
		System.out.println("\t Ex20");
        int k = 1; //primeiro impar
		int s = 1; //variavel da soma
		int m = 1; //variavel para verificar o quadrado
        while(s<n){
			k = k + 2; //aumenta o número impar para somar
			s += k; //vai somando os números impares
			m++; 
        }
        if (n == (Math.pow(m,2))){
			System.out.println("Eh quadrado perfeito.");
		}
		else{
			System.out.println("nao eh quadrado perfeito");
		}
        System.out.println();
    }
    
    static void ex21(int n){
        System.out.println("\t Ex21");
		int lin=1; //contador da linha
		int col=1; //contador da coluna
		int ptev=0; //contador ponto e virgula
		if (n>=0){
		while(lin<=n){
			while(col<=n){
				if(ptev == 0){
					System.out.print(":"); //printa o :
					++ptev; //soma para sair da repetição
				}
				else{
					System.out.print("+"); //printa o +
					++ptev; //soma para entrar ou não no if
				}
				col++; //soma para reiniciar o while
			}
			col=1; //reseta variavel coluna
			ptev = (ptev - n) - 1; //subtrai o numero de linhas pelo ptev, zerando na primeira e subtraindo 1 nas subquentes(acumulando)
			System.out.println();
			lin++;
			}
		}
		else{
			System.out.println("N nao eh maior ou igual à zero");
		}
		System.out.println();
    }
    
    static void ex22(int n){
        System.out.println("\t Ex22");
		int f=1;
		int multp=1;
		for(;f<=n;f++){
			multp *= f;
		}
		System.out.println("Fatorial de "+n+" eh "+multp);
		System.out.println();
    }
    
    static void ex23(double graus){
        System.out.println("\t Ex23");    //código tirado de http://www.guj.com.br/t/calculo-de-cosseno/68876/6 - #autor #Thiago_Bottoni
		int num = 10; //numero de termos da somatória
		int exp = 2; //expoente inicial do calculo
		double op = (-1);
		double cos = 1;
		double rad = Math.toRadians(graus);
		for(int cont=0;cont<num;cont++){ //condição para calcular de acordo com os termos
			int fat = 1;
			for(int i=1;i<=exp; i++) {fat *= i;} //calculo do fatorial
			cos += op * Math.pow(rad, exp)/fat; //calculo do cos - cos = cos + OP (+/-) * Math.pow(rad, exp) (x^2n) / fat (2n)!
			op = -op; //inverte para a somatória
			exp += 2;
		}
		System.out.println(cos);
		System.out.println();
    }
    
    static void ex24(double val){
        System.out.println("\t Ex24");
		double raiz = Math.sqrt(val); //tira raiz do valor
		double quad = Math.pow(raiz, 2); //faz o quadrado do valor
		if (quad == val){ //se o valor for igual ao quadrado da raiz, é potência de 2
			System.out.println(val);
		}
		else{
			System.out.println("-1");
		}
		System.out.println();
    }
    
    static void ex25(int n){
        System.out.println("\t Ex25");
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				System.out.print("\t"+(i * j));
			}
			System.out.println();
		}
		System.out.println();
    }
    
    static void ex26(int n){
        System.out.println("\t Ex26");
		int p=0;
		int i2=1;
		for(int i=1;i<=n;i++){
			for(int j=0;j<=p;j++){
				System.out.print(" "+(i2+j)); //soma de i + j com o i somado da ultima coluna
			}
			System.out.println();
			p++; //contador da coluna (inverso)
			i2+=i; //somador para o i inicial da linha
		}
		System.out.println();
    }
    
    static void ex27a(int a, int b){
        System.out.println("\t Ex27a");
		int soma=0;
		for(int cont=1;cont<=a;cont++){
			soma+=b;
		}
		System.out.println(soma);
		System.out.println();
    }
	
	static void ex27b(int a, int b){
        System.out.println("\t Ex27b");
		int c=0;
		while(a>0){
			a-=b;
			c++;
		}
		System.out.println(c);
		System.out.println();
    }
	
	static void ex27c(int a, int b){
        System.out.println("\t Ex27c");
		do{
			a-=b;
		}while(a>1);
		System.out.println(a);
		System.out.println();
    }
    
    static void ex28(int M){
        System.out.println("\t Ex28");
		int val=0;
		int n=1;
		int imp=1;
		int soma=0;
		while(n<=M){
			val=M*(M-1)+imp;
			soma+=val;
			imp+=2;
			n++;
		}
		System.out.println(soma);
		System.out.println();
    }
	static void ending(){
		
	}
}