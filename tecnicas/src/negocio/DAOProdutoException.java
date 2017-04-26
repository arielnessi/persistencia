package negocio;

public class DAOProdutoException extends Exception {
	public DAOProdutoException(){
		super();
	}
	public DAOProdutoException(String mensagem) {
		super(mensagem);
	}
	public DAOProdutoException(String mensagem, Throwable causa) {
		super(mensagem, causa);
	}
}
