package exemplo;
import java.util.List;
import negocio.Produto;
import negocio.ProdutoDAO;
import persistencia.ProdutoDAOaccess;

public class ExemploConsole {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Listando autores por nome...");
		ProdutoDAO daoProduto = new ProdutoDAOaccess();
		List<Produto> produtos = daoProduto.buscarTodos();
        for (Produto produto : produtos) {
            System.out.println(produto);
        }
	}

}
