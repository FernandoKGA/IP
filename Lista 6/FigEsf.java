class FigEsf{
	double raio;
	FigEsf(double raio){
		this.raio = raio;
	}
	double area;
	double volume;
	double area(){
		area = 4 * Math.PI * Math.pow(raio,2);
		System.out.println(area);
		return area;
	}
	double volume(){
		volume = (4.0/3.0) * Math.PI * Math.pow(raio,3);
		System.out.println(volume);
		return volume;
	}
}