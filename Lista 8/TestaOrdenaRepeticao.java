class TestaOrdenaRepeticao{
	public static void main(String[] args){
		int []b = new int[20];
		for(int i=0;i<b.length;i++) b[i] = (int)(Math.random()*100);
		OrdenaArray k = new OrdenaArray();
		k.atribuiArray(b);
		for(int n:b) System.out.println(n);
		
		int []c = new int[4];
		for(int i=0;i<c.length;i++) c[i] = (int)(Math.random()*100);
		RepeticaoInteiro a = new RepeticaoInteiro();
		a.atribuiArray(c);
		int x = (int)(Math.random()*10);
		int n = a.nRepeticoes(x);
		System.out.println(n);
	}
}