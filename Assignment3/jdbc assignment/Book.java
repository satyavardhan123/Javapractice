package dbm;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class Book {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		final String url="jdbc:mysql:///dxc";
		final String user="root";
		final String password="Satya@123";
		Connection com=DriverManager.getConnection(url,user,password);
		Statement st = com.createStatement();
		String query="create table bookmanagement(bookid int,bookname varchar(20),authorname varchar(20),edition varchar(20))";
		st.executeUpdate(query);
		System.out.println("table created");
		com.close();
		
		

	}

}
