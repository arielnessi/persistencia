package persistencia;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import negocio.DAOProdutoException;
import negocio.Produto;
import negocio.ProdutoDAO;

public class ProdutoDAOaccess implements ProdutoDAO {
	
	@Override
	public List<Produto> buscarTodos() throws DAOProdutoException {
		// TODO Auto-generated method stub
		List<Produto> produtos = new ArrayList<>();
		String sql = "select codigo, nome, rating, preco, dtLancamento tags  from autores";
		try (Connection conexao = InicializadorBancoDadosDataSource.conectarBd()){
			try(Statement comando = conexao.createStatement()){
				try (ResultSet resultado = comando.executeQuery(sql)) {
					while (resultado.next()) {
                        Produto produto = new Produto(
                                resultado.getString("nome"),
                                resultado.getString("rating"),
                                resultado.getString("tags"),
                                resultado.getDouble("preco"),
                                resultado.getDate("dtLancamento"));
                        produtos.add(produto);
                    }
                    return produtos;
				}
			}
		} catch (Exception e) {
	        throw new DAOProdutoException("Falha na busca", e);
			}
			
		}
		
}
