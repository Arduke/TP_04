import java.sql.*;

public class Conexao
{
	public Conexao()
	{
		try{
			//String url = "jdbc:sqlserver://nome da máquina\\SQLEXPRESS;databaseName=aulajava;integratedSecurity=true";
			String url = "jdbc:sqlserver://DESKTOP-9KTFFCM\\MSSQLSERVER;databaseName=aulajava;integratedSecurity=true";
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			Connection con;
			con = DriverManager.getConnection(url);
			System.out.println("Conexão Ok!");
			//Dados da Conexão
			DatabaseMetaData db = con.getMetaData();
			System.out.println("Conectado a " + db.getURL());
			System.out.println("Conexão 	" + db.getConnection());
			System.out.println("Driver 		" + db.getDriverName());
			System.out.println("Usuário 	" + db.getUserName());
			System.out.println("---------------------------------");
			
			con.close();
			
		}catch(Exception e){
			System.out.println("Erro: " + e.getMessage());
		}
	}
}