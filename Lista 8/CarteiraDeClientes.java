class CarteiraDeClientes{
	Cliente[] clientes;
	static Cliente[] ordenaCodigoSelecaoDireta(Cliente[] clientes){
		int pM=0;
		Cliente[] clientesord = new Cliente[clientes.length];
		for(int i=0;i<clientes.length;i++){
			clientesord[i] = clientes[i];
		}
		for(int i=0;i<clientesord.length-1;i++){
			pM = i;
			for(int p=i+1;p<clientesord.length;p++){
				if(clientesord[p].codigo < clientesord[pM].codigo){ 
					pM = p;
				}
			}
			if(clientesord[pM].codigo < clientesord[i].codigo){
				Cliente aux = clientesord[i];
				clientesord[i] = clientesord[pM];
				clientesord[pM] = aux;
			}
		}
		return clientesord;
	}
	static Cliente[] ordenaCodigoInsercaoDireta(Cliente[] clientes){
		Cliente[] clientesord2 = new Cliente[clientes.length];
		for(int i=0;i<clientes.length;i++){
			clientesord2[i] = clientes[i];
		}
		for(int i=1;i<clientesord2.length;i++){
			Cliente aux = clientesord2[i];
			int j = i;
			
			while((j>0)&&(aux.codigo < clientesord2[j-1].codigo)){
				clientesord2[j] = clientesord2[j-1];
				j--;
			}
			clientesord2[j] = aux;
		}
		return clientesord2;
	}
	public static void main(String[] args){
		Cliente a = new Cliente(12, "Joao", 2300);
		Cliente b = new Cliente(1, "Carlos", 4000);
		Cliente c = new Cliente(5, "Vivian", 1705);
		Cliente d = new Cliente(17, "Felipe", 3320);
		Cliente e = new Cliente(8, "Fernando", 1235);
		Cliente f = new Cliente(3, "Pablo", 5000);
		Cliente[] clientes = {a,b,c,d,e,f};
		System.out.println("Selecao Direta");
		Cliente[] clientesord = ordenaCodigoSelecaoDireta(clientes);
		for(int i=0;i<clientesord.length;i++){
			System.out.println("cod "+clientesord[i].codigo+" nome "+clientesord[i].nome+" salario "+clientesord[i].salario);
		}
		System.out.println("Insercao Direta");
		Cliente[] clientesord2 = ordenaCodigoInsercaoDireta(clientes);
		for(int i=0;i<clientesord2.length;i++){
			System.out.println("cod "+clientesord2[i].codigo+" nome "+clientesord2[i].nome+" salario "+clientesord2[i].salario);
		}
	}
}