package mainpack;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class mysql {


	Connection conn = null;
	Statement stmt = null;
	ResultSet rs;
	
	public mysql(String URL, int port,String username, String password, String type, String nomBDD) {

			
			try {
				Class.forName("com.mysql.jdbc.Driver");
				
				conn = DriverManager.getConnection("jdbc:"+type+"://"+URL+":"+port+"/"+nomBDD,username,password);
				stmt = conn.createStatement();			
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("failed!!!");
				e.printStackTrace();
			}
}
	

	
	public int excute(String metric, String type, int time, int seuil) throws SQLException  {
		if (type.equals("Average")) {
			type="AVG";
		}
		
		
		String sqlquery="SELECT "+type+"(valeur) FROM "+metric+" WHERE valeur >"+seuil +" AND date BETWEEN NOW()-INTERVAL "+time +" HOUR AND NOW()";
		int res = 0;
		try {
			rs=stmt.executeQuery(sqlquery);
			//get day and actual time
			while(rs.next())  {
				
				System.out.println(rs.getInt(1));
				res= rs.getInt(1);
			
		} 
		
		
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return res;
		

	}
	
	
	public void save( String type, int valeur) {
		if (type == "Average") {
			type="AVG";
		}
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = new Date();		
		String sqlquery="INSERT INTO results (type, valeur, Date) VALUES (\""+type+"\","+valeur+",\""+dateFormat.format(date)+"\")";
		try {			
			stmt.execute(sqlquery);
	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
	}

}

