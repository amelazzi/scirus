package mainpack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;




public class mysql {

	Connection conn = null;
	Statement stmt = null;
	ResultSet rs;
	
	public mysql(String URL, int port,String username, String password, String type) {
		
		
		
			
			
			try {
				Class.forName("com.mysql.jdbc.Driver");
				
				conn = DriverManager.getConnection("jdbc:"+type+"://"+URL+":"+port+"/iwatch",username,password);
				stmt = conn.createStatement();
				//System.out.println("success!!!");
				
				
				
				
				//conn.close(); 
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("failed!!!");
				e.printStackTrace();
			}
}
	
	//}
	
	public void excute(String metric, String type, int time, int seuil) {
		if (type.equals("Average")) {
			type="AVG";
		}
		String sqlquery="SELECT "+type+"("+metric+") FROM temp where "+metric+" >"+seuil;
		
		try {
			rs=stmt.executeQuery(sqlquery);
			while(rs.next())  {
				
				System.out.println("BDD-"+type+" est: "+rs.getInt(1));
		} 
		
		
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

}
