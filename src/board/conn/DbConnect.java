package board.conn;

import java.sql.Connection;

public class DbConnect {

	private Connection conn;
	private static DbConnect db = new DbConnect();
	private String url = "thin:oracle:thin:@localhost:1521:xe";
	
	private DbConnect() {
		
	}
	public static DbConnect getInstance() {
		return db;
	}
	
	public Connection conn() {
		Connection conn = null;
		try {
			
			
			
			
		}
		
	}
	
	
	
}
