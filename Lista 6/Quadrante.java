class Quadrante{
	void quadrante(double x, double y){
		int q;
		if(x>0)
			if(y>0) q = 1;
			else q = 4;
		else
			if(y>0) q = 2;
			else q = 3;
		switch(q){
			case 1:	System.out.println("Quadrante 1");
			break;
			case 2:	System.out.println("Quadrante 2");
			break;
			case 3: System.out.println("Quadrante 3");
			break;
			case 4: System.out.println("Quadrante 4");
			break;
		}
	}
}