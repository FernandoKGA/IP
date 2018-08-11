// testes do EP1 (S na penúltima posição e epsilon na última)
		double[][] depositosT = {{2000,2000,2000,2000,2000,2000,2000,2000,2000,2000,20000,0.0001},// juro zero
								{0,0,0,1,0,0,0,0,0,0,0,0.0001},// depósito miserável
								{1500,100,0,0,0,0,0,400,234.34,53.2,3000.32,0.02},// teste comum
								{100,23.3,747,298,382,0,0,487,0,91,2000,0.1},// teste comum, precisão ridícula
								{100,23.3,747,298,382,0,0,487,0,91,2000,0.0000001},// teste comum, precisão alta
								{1000000,1000000,1000000,1000000,1000000,1500000,1000000,1000000,1000000,1000000,2000000,0.0005},// teste comum
								{7893,1534.34,1000,0,1234,534.34,0,2000,1000,100,20000,0.00002},// teste comum
								{1500,100,0,0,0,0,0,400,234.34,53.2,2000.32,0.001},// resultado negativo
								{1500,100,0,10.76,0,0,0,400,234.34,53.2,0.32,0.0001}// resultado negativo
								};
		
		// datas do EP1 (com t_S na última posição)
		int[][] datasT = {{1,2,3,4,5,6,7,8,9,10,12},
						 {3,3,4,5,6,6,6,6,7,11,12},
						 {2,2,2,2,3,4,5,5,5,5,6},
						 {3,3,4,4,4,5,6,7,8,9,10},
						 {1,1,1,2,3,4,5,6,7,8,9},
						 {1,2,3,4,5,6,7,8,9,10,11},
						 {1,2,3,4,5,6,7,8,9,10,10},
						 {3,4,5,6,6,6,7,7,8,9,9},
						 {2,3,4,5,6,7,8,9,10,11,12},};
	
		// inicio dos testes
		double nota = 0.0;
		
		// parâmetros
		NewtonRaphson.depositos = new double[11];
		NewtonRaphson.datas = new int[11];
		for (int i=0;i<11;i++) {
			NewtonRaphson.depositos[i] = depositosT[0][i];
			NewtonRaphson.datas[i] = datasT[0][i];
		}
		if (NewtonRaphson.newton(1.2) == -1) nota += 0.25;
		if (NewtonRaphson.newton(1) == -1) nota += 0.25;
		if (NewtonRaphson.newton(0) == -1) nota += 0.25;
		if (NewtonRaphson.newton(-0.2) == -1) nota += 0.25;


		// bateria de testes (1 ponto por teste)
		for (int i=0; i<depositosT.length; i++) {
			System.out.print("Teste "+(i+1)+" - ");
			try {
				// carrego os arranjos
				for (int j=0; j<11; j++) {
					NewtonRaphson.depositos[j] = depositosT[i][j];
					NewtonRaphson.datas[j] = datasT[i][j];
				}
				// rodo o teste
				//if (Math.abs(NewtonRaphsonG.newton(depositosT[i][11])-NewtonRaphson.newton(depositosT[i][11])) <= depositosT[i][11]) nota += 1.0;
				// aqui, NewtonRaphsonG é o meu gabarito.
			} catch (Exception e){System.out.println("Exceção: "+e.getMessage());}
			
			System.out.println("\tNota acumulada: "+nota);
		}
