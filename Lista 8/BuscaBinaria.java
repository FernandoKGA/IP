class BuscaBinaria{
	static boolean verifica(int x, int[] k){
		int fim = k.length - 1;
		int ini = 0;
		while(ini<=fim){
			int meio = (fim+ini)/2;
			if(k[meio]<x) ini = meio + 1;
			else
				if(k[meio]>x) fim = meio - 1;
				else return true;
		}
		return false;
	}
	public static void main(String[] args){
		int[] k = new int[((int)(Math.random()*10))];
		for(int i=0;i<k.length;i++) k[i] = (int)(Math.random()*10);
		int x = (int)(Math.random()*10);
		System.out.println(verifica(x,k));
	}
}