class OrdenaArray{
	int[] b;
	void atribuiArray(int []b){
		for(int i=1;i<b.length;i++){
			int aux = b[i];
			int j = i;
			while((j>0)&&(aux<b[j-1])){
				b[j] = b[j-1];
				j--;
			}
			b[j] = aux;
		}
	}
}