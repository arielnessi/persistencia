package negocio;

import java.util.List;

public interface ProdutoDAO {
	List<Produto> buscarTodos() throws DAOProdutoException;
    //Produto buscarPorCodigo(int codigo) throws DAOProdutoException;
    //List<Produto> buscarPorNome(String nome) throws DAOProdutoException;
    //void inserir(Produto produto) throws DAOProdutoException;
    //void alterar(Produto produto) throws DAOProdutoException;

}
