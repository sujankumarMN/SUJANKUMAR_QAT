import java.sql.*;

public class JDBC_Update {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		String url="jdbc:oracle:thin:@localhost:1521/XEPDB1";
		String username="SYSTEM";
		String password="admin";
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection(url,username,password);
		System.out.println("Connected!");
		Statement stmt=con.createStatement();
		
		ResultSet rs=stmt.executeQuery("select * from student");
		System.out.println("Query executed");
		System.out.println("Before updating");
		while(rs.next())
		{
			System.out.println(rs.getString("ID")+":"+rs.getString("student_name")+":"+rs.getString("city")+":"+rs.getString("salary"));
		}
		
 
		System.out.println("_____________________________");
	
		String  updateQuery="UPDATE STUDENT SET CITY= 'HYDERABAD' WHERE ID=3";
		stmt.executeUpdate(updateQuery);
		
		ResultSet rs1=stmt.executeQuery("select * from student");
		System.out.println("After Updating");
		
		while(rs1.next())
		{
			System.out.println(rs1.getString("ID")+":"+rs1.getString("student_name")+":"+rs1.getString("city")+":"+rs1.getString("salary"));
		}
		

	}

}
