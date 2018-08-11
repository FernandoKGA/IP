class OrdenaSelIns{
	static int posMenorElem(int []k, int inicio){
		int posMenor = -1;
		if((k!=null)&&(inicio>=0)&&(inicio<k.length)){
			posMenor = inicio;
			for(int i=inicio+1;i<k.length;i++){
				if(k[i] < k[posMenor]) posMenor = i;
			}
		}
		return (posMenor);
	}
	static void ordenaSel(int []k){
		for(int i=0;i<k.length-1;i++){
			int posMenor = posMenorElem(k, i);   //Acha o menor elemento de acordo com a modificacao do array
			if(k[posMenor] < k[i]){
				int aux = k[i];
				k[i] = k[posMenor];
				k[posMenor] = aux;
			}
		}
		for(int b:k) System.out.print(b+" ");
	}
	static void ordenaIns(int []k){
		for(int i=1;i<k.length;i++){   //Começa do segundo elemento
			int aux = k[i];         //Guarda valor do segundo.
			int j = i;                //Valor da posicao.
			while((j>0)&&(aux<k[j-1])){      //Verifica se nao eh posicao 1 ou aux eh maior que o anterior.
				k[j] = k[j-1];  //Caso nao sejam coloca o valor de k[j] no anterior
				j--;
			}
			k[j] = aux;
		}
		for(int b:k) System.out.print(b+" ");
	}
	public static void main(String[] args){
		int []k = new int[7];
		for(int i=0;i<k.length;i++)k[i] = (int)(Math.random()*100);
		ordenaSel(k);
		System.out.println();
		ordenaIns(k);
	}
}