class Lista5fernando{
	public static void main(String[] args){
		int[][] nums = {{3,15,2},{4,9,21},{1,5,0}};
		ex1a(nums); //Calcula o maior número da matriz.
		ex1b(nums); //Mostra qual a posicao do maior número da matriz.
		int[][] m = {{2,5,10,4},{-3,8,1,5},{4,0,7,11},{3,-4,1,2}}; //Matriz quadrada.
		ex2(m,4); //Deve ser especificado a matriz e seu n(num de linhas e colunas).
		int[][] zu = {{1,0,0},{0,0,1},{0,1,0}}; //Matriz quadrada composta de 0 e 1.
		ex3(zu,3); //Especificar a matriz e a quantidade de colunas e linhas.
		double[][] mex4={{5,10,3},{4,20,6},{10,5,12}};
		ex4(mex4);
		double[][] mex5_1={{3,-4,2},{-1,5,3}};
		double[][] mex5_2={{0,-1,0.5},{-3,-4,-1}};
		ex5(mex5_1,mex5_2);
		double[][] mex6_1={{2,3,1},{-1,0,2}};
		double[][] mex6_2={{1,-2},{0,5},{4,1}};
		ex6(mex6_1,mex6_2);
		double[][] mex7={{1,3,5},{2,4,6},{-4,1,-1}};
		ex7(mex7);
		double[][] mex8={{2,5,4,10},{-3,8,5,1},{4,0,11,7}};
		ex8(mex8);
        double[][] mex9={{1,2,3},{4,5,6}};
		ex9(mex9);
        double[][] mex10={{1,2,3},{2,4,5},{3,5,6}};
		ex10(mex10);
        double[][] mex11={{8,0,7},{4,5,6},{3,10,2}};
		ex11(mex11);
        double[][] mex12={{20000.00,35000.00,2000.20,20832.00,10500.00,12000.00},{15453.00,5300.00,42000.00,135832.00,18580.36,85200.00},
        {14320.00,55800.00,12356.00,2563.00,100000.00,62325.00},{12345.00,44823.00,15863.25,56483.55,93000.00,4852.33}};
		ex12(mex12);
		
	}
	
	static void maior(int[][] nums, int met){
		int x = 0; //inicia x para entrar valor provindo de nums
		int max = 0; //inicia maximo
		int[] lc = new int[2]; //cria metodo para posicao de linha e coluna
		for(int n=0;n<nums.length;n++){ //roda as linhas da matriz
			for(int m=0;m<nums[n].length;m++){ //roda as colunas da matriz
				x = nums[n][m]; //aplica o valor da matriz em x
				if(x > max){ //se x maior que maximo entra no if
					max = nums[n][m]; //substitui o maximo pelo numero que era maior.
					lc[0] = n+1; //aplica a linha no arranjo
					lc[1] = m+1; //aplica a coluna no arranjo
				}
			}
		}
		if (met==1){ //se o metodo for 1, retorna o maior
			System.out.println("O maior numero eh: "+max);
		}
		else{ //caso nao, retorna o array da posicao
			System.out.println("A posicao da linha eh: "+lc[0]+",e da coluna: "+lc[1]);
		}
	}
	static void ex1a(int[][] nums){
		System.out.println();
		System.out.println("\t Ex 1a");
		maior(nums,1); //entra com o array e o metodo de calcular o maior
		System.out.println();
	}
	
	static void ex1b(int[][] nums){
		System.out.println("\t Ex 1b");
		maior(nums,2); //entra com o array e o metodo de achar a posicao do maior
		System.out.println();
	}
	
	static void ex2(int[][] m,int n){
		System.out.println("\t Ex 2");
		int soma = 0; //inicia soma
		for(int i=0;i<m.length;i++){ //roda as linhas da matriz
			--n; //subtrai o n antes para poder ser considerado no array e pegar sempre o n-1;
			soma+=m[i][n]; //soma o valor determinado na matriz pela linha e pela coluna na diagonal secundaria
		}
		System.out.println("A soma da diagonal secundaria eh igual a: "+soma); 
		System.out.println();
	}
	
	static void ex3(int[][] zu, int n){
		System.out.println("\t Ex 3");
		int num=0;     //Variável verificadora.
		for(int i=0;i<zu.length;i++){
			for(int j=0;j<zu.length;j++){
				if (zu[i][j] == 1){     //Caso exista o número 1, adiciona à variável.
					num++;
				}
			}
		}
		if (num==n){   //Caso o número de 1's seja igual ao da variável.
			System.out.println("Eh uma matriz permutacao.");
		}
		else{  //Se não:
			System.out.println("Nao eh matriz permutacao");
		}
		System.out.println();
	}
	
	static void ex4(double mex4[][]){
		System.out.println("\t Ex 4");
		int tam1 = mex4.length;   //Quantidade de linhas.
		int tam2 = mex4[0].length;  //Quantidade de colunas.
		double x = 0;  //Variável para guardar maior valor.
		double maux[][]= new double [tam1][tam2];
		for(int j=0;j<tam2;j++){                 //Roda por coluna e depois por linha.
			for(int i=0;i<tam1;i++){          //Acha qual o maior número da coluna.
				if(x<mex4[i][j]){
					x = mex4[i][j];               //O i se modifica e o j fica estável.
				}
			}
			for(int i=0;i<tam1;i++){          //Divide os valores originais pelo maior original e substitui.
				maux[i][j] = mex4[i][j] / x;     
			}
			x=0;
		}
		for(int i=0;i<tam1;i++){            //Imprime os valores da matriz.
			for(int j=0;j<tam2;j++){
				System.out.print(maux[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	static void ex5(double mex5_1[][], double mex5_2[][]){
		System.out.println("\t Ex 5");
		int tam1 = mex5_1.length;
		int tam2 = mex5_1[0].length;
		double maux[][]= new double [tam1][tam2];
		for(int i=0;i<tam1;i++){
			for(int j=0;j<tam2;j++){
				maux[i][j] = mex5_1[i][j] + mex5_2[i][j];  //Soma os valores das matrizes e guarda na final.
			}
		}
		for(double[] linha:maux){
			for(double num:linha){
				System.out.print(num+" ");   //Imprime as variáveis.
			}
			System.out.println();
		}
		System.out.println();
	}
	static double multiplica(double mex6_1[][], double mex6_2[][], int i, int j){
		double soma = 0;  //Variável para soma.
		int z = 0;             //Variável para rodar as colunas da primeira matriz.
		for(int k=0;k<mex6_2.length;k++){        //Alterada variável para não interferir na rodagem de elementos da primeira matriz.
			soma += mex6_1[i][z]  * mex6_2[k][j];     //A linha de mex6_1 deve se manter estável(i), enquanto roda com z, e de mex6_2, a coluna(j) deve se manter enquanto k roda.
			z++;
		}
		return soma;
	}
	static void ex6(double mex6_1[][], double mex6_2[][]){
		System.out.println("\t Ex 6");
		int tam1 = mex6_1[0].length;  //Tamanho "n".
		int tam2 = mex6_1.length;      //Tamanho "m".
		int tam3 = mex6_2[0].length;  //Tamanho "p".
		int tam4 = mex6_2.length;      //Tamanho "n".
		double [][] maux= new double[tam2][tam3];
		for(int i=0;i<tam2;i++){
			for(int j=0;j<tam3;j++){
				maux[i][j] = multiplica(mex6_1,mex6_2, i, j);  // i e j correspondem a posição na matriz final. E as linha e colunas que eles devem multiplicar.
			}
		}
		for(double linha[]:maux){
			for(double val:linha){
				System.out.print(val+" ");     //Imprime os valores.
			}
			System.out.println();
		}
		System.out.println();
	}
	
	static void ex7(double mex7[][]){
		System.out.println("\t Ex 7");
		double det = ((mex7[0][0]*mex7[1][1]*mex7[2][2])+(mex7[0][1]*mex7[1][2]*mex7[2][0])+(mex7[0][2]*mex7[1][0]*mex7[2][1]))-((mex7[0][2]*mex7[1][1]*mex7[2][0])+(mex7[0][0]*mex7[1][2]*mex7[2][1])+(mex7[0][1]*mex7[1][0]*mex7[2][2]));
		System.out.println(det);
		System.out.println();
	}
	
	static void ex8(double mex8[][]){
		System.out.println("\t Ex 8");
        int tam1 = mex8.length;
        int tam2 = mex8[0].length;
        double posicao[] = new double[tam2];
        double soma = 0;
        int pos=0;
        double x = 0;
		for(int j=0;j<tam2;j++){
            for(int i=0;i<tam1;i++){
                soma += mex8[i][j];
            }
            posicao[j] = soma;
            soma = 0;
        }
        for(int i=0;i<tam1;i++){
            if(x<posicao[i]){
                x = posicao[i];
                pos = i;
            }
        }
        System.out.println(pos);
		System.out.println();
	}
	
	static void ex9(double mex9[][]){
        System.out.println("\t Ex 9");
        int tam1 = mex9.length;
        int tam2 = mex9[0].length;
        double transp[][] = new double[tam2][tam1];
        for(int j=0;j<tam2;j++){
            for(int i=0;i<tam1;i++){
                transp[j][i] = mex9[i][j];
            }
        }
        for(double[] lin:transp){
            for(double val:lin){
                System.out.print(val+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
	
	static void ex10(double mex10[][]){
        System.out.println("\t Ex 10");
        int tam1 = mex10.length;
        int tam2 = mex10[0].length;
        int simetria = tam1 + tam2;
        int x = 0;
        for(int i=0;i<tam1;i++){
            for(int j=0;j<tam2;j++){
                if(i != j){
                    if(mex10[i][j] == mex10[j][i]) x++;
                }
            }
        }
        if(simetria == x) System.out.println("Simetrico");
        else System.out.println("Nao Simetrico");
        System.out.println();
    }
	
	static void ex11(double mex11[][]){
        System.out.println("\t Ex 11");
        int tam1 = mex11.length;
        int tam2 = mex11[0].length;
        int tam = tam1 + tam2 + 2;  //Total de somas que devem existir mais 2(DP e DS).
        double somalin = 0;
        double somacol = 0;
        double dp = 0;
        double ds = 0;
        int k = 0;
        int x = 0;
        boolean qm = false;   //Se quadrado magico for falso, continua,senao, altera.
        double posicao[] = new double[tam];
        for(int i=0;i<tam1;i++){
            for(int j=0;j<tam2;j++){
                somalin+=mex11[i][j];   //Soma de linha
                somacol+=mex11[j][i];   //Soma de coluna
            }
            posicao[k]=somalin;   //Posicoes para soma de linha.
            posicao[k+3]=somacol; //Posicoes para soma de coluna.
            somalin=0;            //Zera as somas.
            somacol=0;
            k++;    //Adiciona uma posicao.
        }
        for(int i=0;i<tam1;i++){           //Calcula soma das diagonais
            for(int j=0;j<tam2;j++){
                if(i == j){
                    dp+=mex11[i][j];      //Soma da diagonal principal
                    ds+=mex11[tam1-1-i][tam2-1-j];   //Soma da diagonal secundaria
                }
            }
        }
        posicao[tam-1]=ds;  //Guarda na ultima posicao a ds.
        posicao[tam-2]=dp;  //Guarda na penultima posicao a dp.
        for(double val:posicao){
            if(posicao[0] == val) ++x;
        }
        if(x == tam) qm = true;   //Se o numero de soma iguais bater, eh quadrado magico.
        System.out.println(qm);
        System.out.println();
    }
	static int fmvs(double mex12[][]){
        double soma=0;
        double x=0;
        int pos=0;
        for(int i=0;i<mex12.length;i++){
            for(int j=0;j<mex12[0].length;j++){
                soma+=mex12[i][j];
                if(x<soma){
                    x = soma;
                    pos = i;
                }
            }
            soma=0;
        }
        return pos;
    }
    static int mmv(double mex12[][]){
        double somames=0;
        double x=0;
        int mes=0;
        for(int j=0;j<mex12[0].length;j++){
            for(int i=0;i<mex12.length;i++){
                somames += mex12[i][j];
                if(x<somames){
                    x = somames;
                    mes = j;
                }
            }
            somames=0;
        }
        return mes;
    } 
    static void campeavendas(double mex12[][]){
        double valor = 0;
        double x = 0;
        int cv[] = new int[2];
        for(int i=0;i<mex12.length;i++){
            for(int j=0;j<mex12[0].length;j++){
                valor = mex12[i][j];
                if(x<valor){
                    x = valor;     //Salva o maior valor de rendimento.
                    cv[0] = j+1;   //Mes que teve o maior rendimento.
                    cv[1] = i+1;   //Filial com esse rendimento.
                }
            }
        }
        System.out.println("A campea de vendas foi a "+cv[1]+"º filial no "+cv[0]+"º mes.");
    }
    static double media(double mex12[][]){
        double den = (mex12[0].length);
        double soma = 0;
        double media = 0;
        for(int i=0;i<mex12.length;i++){
            for(int j=0;j<mex12[0].length;j++){
                soma += mex12[i][j];
            }
        }
        media = soma / den;
        return media;
    }
    static double tvmm(double mex12[][]){
        double valor = 0;
        for(int i=0;i<mex12.length;i++){
            for(int j=2;j<=4;j++){
                valor += mex12[i][j];
            }
        }
        return valor;
    }
    static void mmtf(double mex12[][]){
        double den = mex12.length;
        double soma = 0;
        double mediatf[] = new double[mex12[0].length];
        for(int j=0;j<mex12[0].length;j++){
            for(int i=0;i<mex12.length;i++){
                soma+=mex12[i][j];
            }
            mediatf[j] = soma / den;
            soma=0;
        }
        for(double val:mediatf){
            System.out.print(val+" ");
        }
        System.out.println();
    }
    static void macf(double mex12[][]){
        double soma = 0;
        double den = mex12[0].length;
        double mediacf[] = new double[mex12.length];
        for(int i=0;i<mex12.length;i++){
            for(int j=0;j<mex12[0].length;j++){
                soma += mex12[i][j];
            }
            mediacf[i] = soma / den;
            soma = 0;
        }
        for(double val:mediacf){
            System.out.print(val+" ");
        }
    }
	static void ex12(double mex12[][]){
        System.out.println("\t Ex 12");
        int pos = fmvs(mex12) + 1;
        System.out.println("A filial que mais vendeu foi a "+pos+"º.");
        int mes = mmv(mex12) + 1;
        System.out.println("O mes que mais vendeu foi o "+mes+"º mes.");
        campeavendas(mex12);
        double media = media(mex12);
        System.out.println("A media de vendas no semestre foi de: "+media);
        double valor = tvmm(mex12);
        System.out.println("O total de vendas entre Março e Maio foi de: "+valor);
        System.out.println("Sub-tabela?????? Significado?");
        mmtf(mex12);
        macf(mex12);
        System.out.println();
    }
	
}