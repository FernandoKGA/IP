public class Lista4fernando {
    public static void main(String[] args){
		final float arex1[]={2,6,10,4}; //arranjo do exercicio 1
		ex1(arex1); //exercicio 1
        final int arex2[]={49,50,7,16,21}; //arranjo do exercicio 2
        ex2(arex2); //exercicio 2
        final double cpx1[]={20,7}; //arranjo 1 do exercicio 3 - numero complexo1 (real, img)
        final double cpx2[]={14,6}; //arranjo 2 do exercicio 3 - numero complexo2 (real, img)
        ex3a(cpx1,cpx2); //soma de numeros complexos
        ex3b(cpx1,cpx2); //subtracao de numeros complexos
        ex3c(cpx1,cpx2); //multiplicacao de numeros complexos
        ex3d(cpx1,cpx2); //divisao de numeros complexos
        ex3e(cpx1); //conjugado de um numero complexo
        ex3f(cpx1); //modulo de um numero complexo
        final int arex4[]={10,43,9,30,70,15};
        ex4(arex4); //retornar ou imprimir indice do maior e menor numeros
		final double arex5[]={10,8.5,9,7.5,6,9.5}; //arranjo do exercicio 5
        ex5(arex5); //media dos juizes
        final double x6[]={1,2,3,4,5,6,7,8};
        final double p6[]={2,3,4,5,6,7,8,9};
        ex6(x6,p6); //media ponderada de uma somatoria
        final double arex7[]={'3','4','5','4','3'}; //numero em caracteres
        ex7(arex7); //verificador de palindromo
		final int va8[]={1,2,3,4,5};
		final int vb8[]={4,5,6,7,8};
        ex8(va8,vb8); //uniao de conjuntos inteiros
		final int arex9[]={1,3,6,7,8};
		ex9(arex9);
		final double arex10[]={1,2.5,4,7.6,9};
		ex10(arex10);
		final int[] arex11={2,2,6,5,1};
		ex11(arex11);
		final double[] arex12={1,2,3,4,5,6,7};
		ex12(arex12);
		final double[] arex13={1,2,3,4,5,6,7};
		ex13(arex13);
		final double[] arex14_1={2,3,4,5,6};
		final double[] arex14_2={8,9,10,11,12};
		ex14(arex14_1,arex14_2);
		final int[] arex15_1={3,4,5,1,8,0,5};
		final int[] arex15_2={7,3,1,1,8};
		ex15(arex15_1,arex15_2);
		final int[] arex16={7,1,5};
		ex16(arex16);
		final double arex17[]={1,2,3};
		ex17(arex17);
		final int arex18[]={1,2,3,4,3,5,7,7};
		ex18(arex18);
		final int arex19[]={1,2,3,4,3,5,7,7};
		ex19(arex19);
	}
    
    static void ex1(float arex1[]){
        System.out.println("\t Ex1");
        float numax = 0; //numax setado como 0 para o maior numero
        int i = 0; //inicializacao do arranjo
        for(int cont=1; cont<=arex1.length;cont++){
		  if(numax>arex1[i]){ //verifica se eh maior que o ultimo numero do arranjo
              i++; //soma mais um ao indice para continuar verificando o arranjo
		  }
		  else{//caso nao seja
              numax=arex1[i]; //achando um numero maior que o ultimo, substitui
			 i++; //soma mais um ao indice para continuar verificando o arranjo
		  }
	   }
        System.out.println(numax); //printa o numero maximo
        System.out.println();
	   }
        
    static void ex2(int arex2[]){
        System.out.println("\t Ex2");
        for(double val : arex2){ //vai verificar cada valor dentro do arranjo
            if ((val % 7) == 0){ //se o valor for divisivel por 7 sem resto
                System.out.print(+val+" "); //printa o valor com espaco para o proximo
            }
        }
        System.out.println();
        }
		
    static void ex3a(double cpx1[], double cpx2[]){
        System.out.println("\t Ex3a - Soma de complexos");
        double real;
        double img;
        real = (cpx1[0]) + (cpx2[0]);
        img = (cpx1[1]) + (cpx2[1]);
        System.out.println("O resultado da soma eh: "+real+"+"+img+"i");
        System.out.println();
        }
    static void ex3b(double cpx1[],double cpx2[]){
        System.out.println("\t Ex3b - Subtracao de complexos");
        double real;
        double img;
        real = (cpx1[0]) - (cpx2[0]);
        img = (cpx1[1]) - (cpx2[1]);
        System.out.println("O resultado da subtracao eh: "+real+"+"+img+"i");
        System.out.println();
        }
    static void ex3c(double cpx1[],double cpx2[]){
        System.out.println("\t Ex3c - Multiplicacao de complexos");
        double real;
        double img;
        double a = cpx1[0];
        double b = cpx2[0];
        double c = cpx1[1];
        double d = cpx2[1];
        real = ((a*c) - (b*d));
        img = ((a*d) - (b*c));
        System.out.println("O resultado da multiplicacao eh: "+real+"+"+img+"i");
        System.out.println();
        }
    static void ex3d(double cpx1[],double cpx2[]){
        System.out.println("\t Ex3d - Divisao de complexos");
        double real;
        double img;
        double a = cpx1[0];
        double b = cpx2[0];
        double c = cpx1[1];
        double d = cpx2[0];
        real = ((a*c) + (b*d))/(Math.pow(c,2)) + (Math.pow(d,2));
        img = ((b*c) - (a*d))/(Math.pow(c,2)) + (Math.pow(d,2));
        System.out.println("O resultado da divisao eh: "+real+"+"+img+"i");
        System.out.println();
        }
    static void ex3e(double cpx1[]){
        System.out.println("\t Ex3e - Conjugado do numero complexo");
        if (cpx1[1]<0){
        System.out.println("O conjugado desse complexo eh: "+cpx1[0]+"+"+cpx1[1]+"i");
        }
        else{
            System.out.println("O conjugado desse complexo eh: "+cpx1[0]+"-"+cpx1[1]+"i");
        }
        System.out.println();
        }
    static void ex3f(double cpx1[]){
        System.out.println("\t Ex3f - Modulo do numero complexo");
        double mod;
        double raiz;
        raiz = (Math.pow(cpx1[0],2)+ Math.pow(cpx1[0],2));
        mod = Math.sqrt(raiz);
        System.out.println("O modulo do complexo eh: "+mod);
        System.out.println();
        }
		
    static int min(int arex4[]){
	    int min=arex4[0];
	    int y=0;
	    for (int i=0;i<arex4.length;i++){
		if (arex4[i]<=min){
		   min = arex4[i];
		   y = i;		
		  }
	    }
	    return y;
	   }
    static int max(int arex4[]){
	   int max = 0;
	   int x=0;
	   for (int i=0;i<arex4.length;i++){
	       if(arex4[i]>=max){
	           max = arex4[i];
		       x = i;
		      }
       }
	   return x;
	   }
    static void ex4(int arex4[]){
        System.out.println("\t Ex4");
        System.out.println("O indice do maximo eh: "+max(arex4)+", e o indice do minimo eh: "+min(arex4));
	    System.out.println();
        }

    static double min5(double arex5[]){
        double min=arex5[0]; //inicializa as variaveis
	    int y=0;
	    for (int i=0;i<arex5.length;i++){ //acha o menor numero
            double val = arex5[i];
            if (val<=min){
                min = val;
                y = i; //guarda seu indice
            }
        }
	    return y;
	    }
    static double max5(double arex5[]){
	    double max = 0; //inicializa as variaveis
	    int x=0;
	    for (int i=0;i<arex5.length;i++){ //acha o maior numero
		   double val = arex5[i];
		   if(val>=max){
		       max = val;
		       x = i; //guarda seu indice
           }
	    }
	       return x;
	    }
    static void media5(double arex5[]){
        double soma=0; //inicia variaveis
        double media=0;
        for(double val:arex5){ //calcula a soma dos valores
            soma+=val;
            }
        int min5 = (int)min5(arex5); //vai retornar o indice
        int max5 = (int)max5(arex5); //  "
        soma=soma - arex5[min5] - arex5[max5]; //calcula a soma sem os extremos
        media = soma / 4; //calcula a media
        System.out.println("A media eh: "+media);
        }

    static void ex5(double arex5[]){
        System.out.println("\t Ex5");
	    media5(arex5); //chama o metodo media
        System.out.println();
        }
		
    static double somatorianum(double x6[], double p6[]){
        double xval=0; //inicia as variaveis
        double pval=0;
        double somaprod=0;
        for(int i=0;i<x6.length;i++){
            xval = x6[i]; //verifica qual o numero do indice
            pval = p6[i]; // "
            somaprod += (xval * pval); //faz a somatoria do produto
        }
        return somaprod;
        }
    static double somatoriaden(double p6[]){
        double soma=0; //inicia soma
        for(double val: p6){ //roda o for para ser somado
            soma += val; //adiciona valor a soma
        }
        return soma;
        }
    static void ex6(double x6[], double p6[]){
        System.out.println("\t Ex6");
        double media = (somatorianum(x6,p6) / somatoriaden(p6)); //faz a divisao das somatorias
        System.out.println("A media ponderada eh: "+media); //printa a media
        System.out.println();
        }
        
    static void ex7(double arex7[]){
        System.out.println("\t Ex7");
        boolean palindromo=false; //palindromo definido falso como default
        int n = arex7.length; //transfere o tamanho do arranjo para variavel
        double arex7_2[] = new double[n]; //cria novo arranjo
        for (int i=0;i<n;i++){ //adiciona ao novo arranjo os numeros inversamente
            arex7_2[(n - 1)-i] = arex7[i];
        }
        for (int i=0;i<n;i++){
            if (arex7_2[(n-1)-i] == arex7[i]){
                palindromo = true;
            }
            else{
                palindromo = false;
                break;
            }
        }
        System.out.println(palindromo); //printa palindromo
        System.out.println();
        }
        
    static void ex8(int va8[],int vb8[]){
		System.out.println("\t Ex 8");
		int vc8[] = new int[va8.length + vb8.length];         
		int x = 0;
		for(int i=0;i<va8.length;i++){      //Para cada elemento do primeiro roda o arranjo 2 para verificar iguais.
			for(int j=0;j<vb8.length;j++){   
				if(va8[i] == vb8[j]){          //Se achar iguais, os zera no segundo.
					vb8[j] = 0;
				}
			}
		}
		while(x<va8.length){
			vc8[x] = va8[x];        //Preenche o arranjo com os valores de va.
			x++;
		}
		int y = 0;
		while(y<vb8.length){
			vc8[x] = vb8[y];        //Preenche o arranjo com os valores de vb.
			x++;
			y++;
		}
		for(int ele:vc8){            //Printa os elementos diferentes de 0.
			if(ele != 0){  
				System.out.print(ele+" ");
			}
		}
		System.out.println();
	}
	
    static void ex9(int arex9[]){
		System.out.println("\t Ex 9");
		int index=0;
		int k=0;
		int pospar[]=new int[arex9.length]; //Cria um arranjo de acordo com o tamanho do que ele dá (todos podem conter pares).
		for(int i=0;i<arex9.length;i++){ //Roda uma iteração para verificar os pares de acordo com o tamanho do arranjo dado.
			if(arex9[i] % 2 == 0){ //Se par.
				pospar[index]=i+1;   //Armazena o valor do índice no outro arranjo criado.
				index++;           //Aumenta o valor do índice do arranjo criado para colocar outra posição.
			}
		}
		while(k<index){
			System.out.print(pospar[k]+" ");
			k++;
		}
		System.out.println("\n");
	}
	
    static void ex10(double arex10[]){
		System.out.println("\t Ex 10");
		int m=0;
		int n=0;
		double tamArj=arex10.length/2;
		for(int i=0;i<tamArj;i++){
			if(arex10[i]>arex10[i+1]){
				n++;
			}
		}
		if(n>=tamArj){
			System.out.println("Decrescente");
		}
		System.out.println("Crescente");
		System.out.println();
	}
	
    static void ex11(int arex11[]){
		System.out.println("\t Ex 11");
		int[] frqface = new int[6];
		int n = arex11.length;
		for(int i=0;i<frqface.length;i++){
			frqface[i]=0;
		}
		for(int i=0;i<n;i++){
			switch(arex11[i]){
				case 1: frqface [0]+=1;
				break;
				case 2: frqface [1]+=1;
				break;
				case 3: frqface [2]+=1;
				break;
				case 4: frqface [3]+=1;
				break;
				case 5: frqface [4]+=1;
				break;
				case 6: frqface [5]+=1;
				break;
			}
		}
		for(int i=0;i<frqface.length;i++){
			System.out.print(frqface[i]+" ");
		}
		System.out.println("\n");
	}
	
    static void ex12(double arex12[]){
		System.out.println("\t Ex 12");
		int n =  arex12.length;
		int k=0;
		double x=3;
		double px=0;
		for(int i=0;i<n;i++){
			px += arex12[i]*(Math.pow(x,k));
			k++;
		}
		System.out.println(px);
		System.out.println();
	}
	
    static void ex13(double arex13[]){
		System.out.println("\t Ex 13");
		int n = arex13.length;
		int k=0;
		double x=3;
		double dpx=0;
		for(int i=0;i<n;i++){
			dpx +=(n-k)*arex13[i]*(Math.pow(x,n-k-1));
			k++;
		}
		System.out.println(dpx);
		System.out.println();
	}
	
    static void ex14(double arex14_1[],double arex14_2[]){
		System.out.println("\t Ex 14");
		double arex14_3[] = new double[arex14_1.length];
		int x=0;
		for(int i=0;i<arex14_1.length;i++){
			arex14_3[i]=arex14_1[i]+arex14_2[i];
		}
		for(double ele:arex14_3){
			System.out.print(ele+"x"+x+" ");
			x++;
		}
		System.out.println("\n");
	}
	
    static void ex15(int arex15_1[],int arex15_2[]){
		System.out.println("\t Ex 15");
		int tam1=arex15_1.length;     //
		int tam2=arex15_2.length;
		int arex15_3[] = new int[tam1]; //Cria o arranjo do resultado com o tamanho do maior.
		int x=0;  //Variável para as somas.
		int y=0;  //Variável para somas maiores que 10.
		for(int i=0;i<tam1;i++){
			arex15_3[i]=arex15_1[i]; //Coloca no arranjo de resultado os números do maior número(arranjo).
		}
		for(int i=0;i<tam2;i++){    
			x = arex15_3[tam1-1-i] + arex15_2[tam2-1-i];  //Soma o número da primeira sequência com o da segunda, começando pelo final.
			y = x/10;          //Caso seja maior que 10 guarda o valor aqui.
			if(x>=10){  //Se maior:
				arex15_3[tam1-1-i] = x % 10;  //Guarda o resto da divisão por 10 na posição do número.
				arex15_3[tam1-2-i] += y;      //Adiciona no próximo o número correspondente ao quociente da divisão inteira.
			}
			else{
			arex15_3[tam1-1-i] = x + y;       //Senão, coloca x na posição e y estará como 0.
			}
			y=0;  //Zera y se já foi utilizado.
		}
		for(int ele:arex15_3){
			System.out.print(ele+" ");  //Printa na tela os números do arranjo.
		}
		System.out.println("\n");
	}
	
    static void ex16(int arex16[]){
		System.out.println("\t Ex 16");
		int n = arex16.length; //Tamanho do arranjo para utilizar como contador.
		int x = 0;
		int y = 0;
		int posicao[]= new int[2];  //Cria o arranjo para as posições.
		for(int i=0;i<n-1;i++){
			if(arex16[i]>arex16[i+1]){  //Se o valor for maior que o próximo, guarda seu posição.
				x = i+1; //Maior valor.
			}
			else{  //Se não, guarda sua posição(como menor).
				y = i+1; //Menor valor.
			}
		}
		System.out.println(y+" "+x);
		System.out.println("\n");
	}
	
    static void ex17(double arex17[]){
		System.out.println("\t Ex 17");
		int N = arex17.length;
		double x=0;
		double y=0;
		for(int i=0;i<N;i++){
			x = arex17[i];   //Guardam os valores daquelas posições.
			y = arex17[N-i-1];
			arex17[i] =  y;  //Invertem os valores.
			arex17[N-i-1] = x;
		}
		for(double ele:arex17){
			System.out.print(ele+" ");
		}
		System.out.println("\n");
	}
	
    static void ex18(int arex18[]){
		System.out.println("\t Ex 18");
		int n = arex18.length;
		int x = arex18[0];  //Variável para condição.
		int y = 1;  //Guardará a posição.
		for(int i=1;i<n;i++){
			if(x<arex18[i]){
				x = arex18[i];
				y = i+1;
			}
		}
		System.out.println(y);
		System.out.println();
	}
	
    static void ex19(int arex19[]){
		System.out.println("\t Ex 19");
		int n = arex19.length;
		int x = arex19[0];  //Variável para condição.
		int y = 1;  //Guardará a posição.
		for(int i=1;i<n;i++){
			if(x<arex19[i]){
				x = arex19[i];
				y = i+1;
			}
			else{
				if(x == arex19[i]){
					y = i+1;
				}
			}
		}
		System.out.println(y);
		System.out.println();
	}
}
