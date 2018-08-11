class OrdenaProd{
	int prod;
	int fab;
	OrdenaProd(int prod, int fab){
		this.prod = prod;
		this.fab = fab;
	}
	static void ordena(OrdenaProd []v){
		for(int ult=v.length-1;ult>0;ult--){
			for(int i=0;i<ult;i++){
				if(v[i].fab>v[i+1].fab){
					OrdenaProd aux = v[i];
					v[i] = v[i+1];
					v[i+1] = aux;
				}
				if(v[i].fab == v[i+1].fab){
					if(v[i].prod > v[i+1].prod){
						OrdenaProd aux = v[i];
						v[i] = v[i+1];
						v[i+1] = aux;
					}
				}
			}
		}
		for(OrdenaProd ob:v){
			System.out.print("prod "+ob.prod);
			System.out.print("\t fab "+ob.fab);
			System.out.println();
		}
	}
	public static void main(String[] args){
		OrdenaProd a = new OrdenaProd(40, 2);
		OrdenaProd b = new OrdenaProd(10, 5);
		OrdenaProd c = new OrdenaProd(20, 2);
		OrdenaProd d = new OrdenaProd(40, 3);
		OrdenaProd e = new OrdenaProd(30, 4);
		OrdenaProd []v = {a,b,c,d,e};
		ordena(v);
	}
}