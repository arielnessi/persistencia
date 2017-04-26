package persistencia;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;

public class InicializadorBancoDadosDataSource {
	
    public static String DB_NAME = "cadastro";
    private static Connection conn;
    
   
    public static Connection conectarBd() throws Exception {
    	 if (conn == null) {
    		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
         	String database = 
         			"jdbc:odbc:Driver=Microsoft.ACE.OLEDB.15.0;Data Source=C:\\Users\\12104788\\Desktop\\tecnicas.accdb;Persist Security Info=False";
         	database = String.format(database, DB_NAME);
             Connection tconn = DriverManager.getConnection(database);
             conn = tconn;
         }
         return conn;
    }

}
