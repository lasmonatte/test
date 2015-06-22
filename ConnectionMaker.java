package User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionMaker {

	String url;
	String id;
	String pwd;
	
	//접속정보 설정, 연결
	public Connection makeNewConnection() throws ClassNotFoundException, SQLException{
		
		url = "jdbc:mysql://localhost/itb_proj";
		// ojdbc6 : url = "jdbc:oracle:thin:@192.168.10.56:1521:xe";
		id = "itb_proj";
		pwd = "1q2w3e";
		
		Class.forName("com.mysql.jdbc.Driver");
		// ojdbc6 : Class.forName("oracle.jdbc.driver.OracleDriver");
	
		Connection c = DriverManager.getConnection(url, id, pwd);
		
		return c;
	}
}
