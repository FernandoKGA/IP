class TabelaDeAliquotas{
	double aliq;
	double aliquota(double total){
		if(total<13968){
			aliq = 0;
			return aliq;
		}
		else{
			if((13968<=total) && (total<=27912)){
				aliq = 0.15;
				return aliq;
			}
			else{
				aliq = 0.275;
				return aliq;
			}
		}
	}
	double valdedu;
	double valorADeduzir(double total){
		valdedu = total * aliquota(total);
		return valdedu;
	}
}