class Complexos{
	double real;
	double img;
	double real2;
	double img2;
	double real3;
	double img3;
	double q;
	int s;
	void verificaSinal(double real3, double img3, int s){
		if(img3<0){
			img3 = Math.abs(img3);
			switch(s){
				case 1:	System.out.println("A soma destes complexos eh: "+real3+" - "+img3+"i");
				break;
				case 2:	System.out.println("A subtracao destes complexos eh: "+real3+" - "+img3+"i");
				break;
				case 3:	System.out.println("A multiplicacao destes complexos eh: "+real3+" - "+img3+"i");
				break;
				case 4:	System.out.println("A divisao destes complexos eh: "+real3+" - "+img3+"i");
				break;
				case 5:	System.out.println("O conjugado deste complexo eh: "+real3+" - "+img3+"i");
				break;
			}
		}
		else{
			switch(s){
				case 1:	System.out.println("A soma destes complexos eh: "+real3+" + "+img3+"i");
				break;
				case 2:	System.out.println("A subtracao destes complexos eh: "+real3+" + "+img3+"i");
				break;
				case 3:	System.out.println("A multiplicacao destes complexos eh: "+real3+" + "+img3+"i");
				break;
				case 4:	System.out.println("A divisao destes complexos eh: "+real3+" + "+img3+"i");
				break;
				case 5:	System.out.println("O conjugado deste complexo eh: "+real3+" + "+img3+"i");
				break;
			}
		}
	}
	void soma(double real, double real2, double img, double img2){
		real3 = real + real2;
		img3 = img + img2;
		s = 1;
		verificaSinal(real3, img3,s);
	}
	void subtracao(double real, double real2, double img, double img2){
		real3 = real - real2;
		img3 = img - img2;
		s = 2;
		verificaSinal(real3, img3,s);
	}
	void multiplicacao(double real, double real2, double img, double img2){
		real3 = ((real * real2) - (img * img2));
		img3 = ((real * img2) - (img * real2));
		s = 3;
		verificaSinal(real3, img3,s);
	}
	void divisao(double real, double real2, double img, double img2){
		real3 = ((real * real2) - (img * img2))/(Math.pow(img,2)) + (Math.pow(img2,2));
		img3 = ((real * img2) - (img * real2))/(Math.pow(img,2)) + (Math.pow(img2,2));
		s = 4;
		verificaSinal(real3, img3,s);
	}
	void conjugado(double real, double img){
		real3 = real;
		img3 = img;
		s = 5;
		verificaSinal(real3,img3,s);
	}
	void modulo(double real, double img){
		q = (Math.pow(real,2)+ Math.pow(img,2));
		q = Math.sqrt(q);
		System.out.println("O modulo do complexo eh: "+q);
	}
}