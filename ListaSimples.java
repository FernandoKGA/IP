//Código Norton Trevisan Roman
public class ListaSimples {
	No cabeca;
	public ListaSimples(){
		this.cabeca = null;
	}
	public void insere(Number el, int pos){
		No novel = new No(el);
		if(pos == 0){
			novel.prox = this.cabeca;
			this.cabeca = novel;
		}
		else{
			No aux = this.cabeca;
			for(int i=0; i<pos-1;i++) aux = aux.prox;
			novel.prox = aux.prox;
			aux.prox = novel;
        }
	}
	public boolean exclui(int pos){
		No aux = this.cabeca;
		if (pos < 0 || pos >= this.elementos() || this.cabeca == null) return(false);
		if(pos == 0) aux.prox = this.cabeca.prox;	
		else{
			for(int i=0;i<pos-1;i++){
				aux = aux.prox;
			}
			aux.prox = aux.prox.prox;
		}
		return(true);
	}
	public void apagaLista(){
		No aux = this.cabeca;
		while (aux != null) {
			aux = aux.prox;
		}
		if(aux.prox == null){
			this.cabeca = aux.prox;
		}
	}
	public void imprimeLista(){
		No n = this.cabeca;
		while(n != null){
			System.out.print(n.num.numero+" ");
			n = n.prox;
		}
	}
	public int elementos() {
		int cont = 0;
		No aux = this.cabeca;
		while (aux != null) {
			aux = aux.prox;
			cont++;
		}
		return(cont);
	}
}