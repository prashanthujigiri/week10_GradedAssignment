import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeMain {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Connection conn = null;

		Class.forName("com.mysql.cj.jdbc.Driver");
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/greatlearning", "root", "Jagadishwar@1999");

		
		  PreparedStatement pstmt =
		  conn.prepareStatement("insert into employee values (?,?,?,?)");
		  
		  int id = 1; String name = "Rahul"; 
		  String email = "rahul123@gmail.com";
		  String Phone = "9985247836";
		  
		  pstmt.setInt(1, id); 
		  pstmt.setString(2, name); 
		  pstmt.setString(3, email);
		  pstmt.setString(4, Phone);
		  
		  int rowCount = pstmt.executeUpdate(); System.out.println(rowCount +
		  " Row inserted");
		  
		  PreparedStatement pstmt1 =
		  conn.prepareStatement("insert into employee values (?,?,?,?)");
		  
		  int id1 = 2; 
		  String name1 = "naveen Kumar"; 
		  String email1 ="naveen@gmail.com"; 
		  String Phone1 = "9874561230";
		  
		  pstmt1.setInt(1, id1); 
		  pstmt1.setString(2, name1); 
		  pstmt1.setString(3,email1); 
		  pstmt1.setString(4, Phone1);
		  
		  int rowCount1 = pstmt1.executeUpdate(); System.out.println(rowCount1 +
		  " Row inserted");
		  
		  PreparedStatement pstmt2 =
		  conn.prepareStatement("insert into employee values (?,?,?,?)");
		  
		  int id2 = 3; 
		  String name2 = "preetham"; 
		  String email2 ="preetham45@gmail.com"; 
		  String Phone2 = "9988665544";
		  
		  pstmt2.setInt(1, id2); 
		  pstmt2.setString(2, name2); 
		  pstmt2.setString(3,email2); 
		  pstmt2.setString(4, Phone2);
		  
		  int rowCount2 = pstmt2.executeUpdate(); System.out.println(rowCount2 +
		  " Row inserted");
		  
		  PreparedStatement pstmt3 =
		  conn.prepareStatement("insert into employee values (?,?,?,?)");
		  
		  int id3 = 4; 
		  String name3 = "dinesh"; 
		  String email3 ="dinesh@gmail.com"; 
		  String Phone3 = "8899775521";
		  
		  pstmt3.setInt(1, id3); 
		  pstmt3.setString(2, name3); 
		  pstmt3.setString(3,email3); 
		  pstmt3.setString(4, Phone3);
		  
		  int rowCount3 = pstmt3.executeUpdate(); System.out.println(rowCount3 +
		  " Row inserted");
		  
		  PreparedStatement pstmt4 =
		  conn.prepareStatement("insert into employee values (?,?,?,?)");
		  
		  int id4 = 5; 
		  String name4 = "Naresh"; 
		  String email4 ="naresh44@gmail.com"; 
		  String Phone4 = "7396032645";
		  
		  pstmt4.setInt(1, id4); 
		  pstmt4.setString(2, name4); 
		  pstmt4.setString(3,email4); 
		  pstmt4.setString(4, Phone4);
		  
		  int rowCount4 = pstmt4.executeUpdate(); System.out.println(rowCount4 +
		  " Row inserted");
		 

		PreparedStatement pstmt5 = conn.prepareStatement("alter table employee modify column email_id varchar(30)");

		pstmt5.executeUpdate();

		System.out.println("1 row affected");

		PreparedStatement pstmt6 = conn.prepareStatement("insert into employee values (?,?,?,?)");

		int id6 = 6;
		String name6 = "ganesh";
		String email6 = "ganesh@gmail.com";
		String Phone6 = "7733564888";

		pstmt6.setInt(1, id6);
		pstmt6.setString(2, name6);
		pstmt6.setString(3, email6);
		pstmt6.setString(4, Phone6);

		int rowCount6 = pstmt6.executeUpdate();
		System.out.println(rowCount6 + " Row inserted");

		PreparedStatement pstmt7 = conn.prepareStatement("insert into employee values (?,?,?,?)");

		int id7 = 7;
		String name7 = "nikhil";
		String email7 = "nikhil@gmail.com";
		String Phone7 = "9999999991";

		pstmt7.setInt(1, id7);
		pstmt7.setString(2, name7);
		pstmt7.setString(3, email7);
		pstmt7.setString(4, Phone7);

		int rowCount7 = pstmt7.executeUpdate();
		System.out.println(rowCount7 + " Row inserted");

		Statement stmt = conn.createStatement();
		ResultSet rset = stmt.executeQuery("select * from employee");

		PreparedStatement pstmt8 = conn.prepareStatement("update table set name = ? and phone_number = ? where id = ?");
		String name8 = "Karthik";
		String phone8 = "1234567890";
		int id8 = 3;

		pstmt8.setString(1, name8);
		pstmt8.setString(2, phone8);
		pstmt8.setInt(3, id8);
		int rowCount8 = pstmt8.executeUpdate();

		System.out.println(rowCount8 + " row affected");

		PreparedStatement pstmt9 = conn.prepareStatement("Delete from employee where id = 3 and 4");

		pstmt9.executeUpdate();

		System.out.println("1 row affected");

		PreparedStatement pstmt10 = conn.prepareStatement("truncate table employee");

		pstmt10.executeQuery();
		System.out.println("All rows affected!");
		pstmt5.close();
		conn.close();

	}

}
