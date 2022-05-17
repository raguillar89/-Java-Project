package Usuarios;

public class StatusPagamento {
	
		private Usuarios usuario;
		
		public void Financeiro(Usuarios usuario) {
			this.usuario = usuario;
		}

		public Usuarios getUsuario() {
			return usuario;
		}
		
		public boolean isInadiplente() {
			if(verificarPendenciaFinanceira(usuario.getCpf())) {
				return true;
			}
			return false;
		}
		
		public boolean verificarPendenciaFinanceira(String cpf) {
			// TO DO
			return false;
		}
	}