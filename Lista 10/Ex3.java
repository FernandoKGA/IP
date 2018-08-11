import java.util.Scanner;
public class Ex3 {
    ListaSimples ls = new  ListaSimples();
    public void insercaomanual(){
        Scanner scan = new Scanner(System.in);
		boolean sentenca = true;
		int k=0;
		while(sentenca == true){
            System.out.print("Insira um numero para ser adicionado a lista: ");
            String s = scan.next();
			int numeroParaAdd = Integer.parseInt(s);
			Number el = new Number(numeroParaAdd);
            ls.insere(el, k);     //Função que insere o elemento na lista ligada. 
            k++;                     //Aumenta um para a próxima posição.
            System.out.print("Quer adicionar mais um numero? ");
            sentenca = scan.nextBoolean();      //Inserção de booleano verificador inserido pelo usuário. 
		}
    }
	void excluir(int numeroParaExcluir){
		No n = ls.cabeca;
		int pos = 0;
		while(n != null){
			if(n.num.numero == numeroParaExcluir){ //Caso ache o número.
				if(n == ls.cabeca){                                //Se for a cabeça.
					ls.cabeca = ls.cabeca.prox;               //Coloca na cabeça o valor próximo da mesma. (Que deverá ser NULL). 
				}
				else{
					No q = ls.cabeca;                   //Cria um nó para colocar como cabeça.
					No p = ls.cabeca.prox;           //Cria um nó para colocar o número a frente da cabeça.
					for(int i=0;i<pos-1;i++){       //Vai até o anterior do número que vai se excluir.
						q = p;                                 //Recebe o próximo elemento que vai ser excluído. 
						p = p.prox;                         //O elemento que seria excluído recebe o endereço do elemento à frente.
					}
					if(n.prox == null){       //Caso o próximo nó do número achado seja nulo:
						q.prox = null;			//Anula o próximo do elemento q.
						p = null;					//Anula o elemento p também.
					}
					else{q.prox = p.prox;}  //Se não for nulo, coloca o "prox" de q para receber o "prox" de p.
				}
			}
			else{
				pos++;            //Se não for o numero, aumenta em 1 a posição.
			}
			n = n.prox;         //Após todo processo, passa para o próximo nó.
		}
	}
    public static void main(String[] args){
		System.out.println("Exercicio 3 - Insercao por teclado");
        Ex3 o = new Ex3();
        o.insercaomanual();
        o.ls.imprimeLista();
		System.out.println();
		o.excluir(3);
		System.out.println();
		o.ls.imprimeLista();
	}
}