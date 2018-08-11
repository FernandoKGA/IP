class RepeticaoInteiro{
	int[] c;
	void atribuiArray(int []c){
		this.c = c;
	}
	int nRepeticoes(int x){
		int n=0;
		for(int i=0;i<c.length;i++){
			if(x == c[i]){
				n++;
			}
		}
		return n;
	}
}