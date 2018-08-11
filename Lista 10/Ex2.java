public class Ex2{
	ListaSimples ls = new ListaSimples();
	public No inverteOrdem(int[] arr){
		int k=0;
		for(int ult=arr.length-1;ult>=0;ult--){
			Number el = new Number(arr[ult]);
			ls.insere(el, k);
			k++;
		}
		return ls.cabeca;
	}
	void exclui(int v){
		No n = ls.cabeca;
		int pos = 0;
		while(n != null){
			if(n.num.numero == v){
				if(n == ls.cabeca){
					ls.cabeca = ls.cabeca.prox;
				}
				else{
					No q = ls.cabeca;
					No p = ls.cabeca.prox;
					for(int i=0;i<pos-1;i++){
						q = p;
						p = p.prox;
					}
					if(n.prox == null){
						q.prox = null;
						p = null;
					}
					else{q.prox = p.prox;}
				}
			}
			else{
				pos++;
			}
			n = n.prox;
		}
	}
	void imprime(){
		No n = ls.cabeca;
                if(n == null){
                    System.out.println(n);
                }
		while(n != null){
			System.out.print(n.num.numero+" ");
			n = n.prox;
		}
	}
	public static void main(String[] args){
		Ex2 ex2 = new Ex2();
		int[] num = { 1, 2, 3, 4, 5, 6, 7, 8, 9};
		ex2.imprime();
		No n = ex2.inverteOrdem(num);
		System.out.println(n);
		ex2.imprime();
		ex2.exclui(4);
		System.out.println();
		ex2.imprime();
	}
}