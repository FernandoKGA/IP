class Simples{
	public static void main(String[] args){
		
	}
	int inicializaArray(int []a, int v){
		for(int i=0;i<a.length;i++){
			a[i] = v;
		}
		return a.length;
	}
	void imprimeArray(int []a){
		for(int ele:a){
			System.out.print(ele+" ");
		}
		System.out.println();
	}
	boolean estaNoArray(int []a, int v){
		for(int i=0;i<a.length;i++){
			if(a[i] == v){
				return true;
			}
		}
		return false;
	}
}