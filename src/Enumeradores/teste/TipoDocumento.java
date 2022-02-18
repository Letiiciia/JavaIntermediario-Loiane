package Enumeradores.teste;

import Enumeradores.GeraCpfCnpj;

public enum TipoDocumento {
	CPF{
		public String geraNumeroTeste() {
			return GeraCpfCnpj.cpf();
		}
	}, CNPJ {
		public String geraNumeroTeste() {
			return GeraCpfCnpj.cnpj();
		}
	};
	
	public abstract String geraNumeroTeste();
	

}
