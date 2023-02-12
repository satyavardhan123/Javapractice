package dbm;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.sql.PreparedStatement;
public class SElect {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		 Class.forName("com.mysql.cj.jdbc.Driver");

	      
	      final String url = "jdbc:mysql:///dxc";
	      final String user = "root";
	      final String password = "Satya@123";
	      Connection con = DriverManager.getConnection(url, user, password);
	      Statement st = con.createStatement();
	      int bid= 0;
		  String bname=null,aname=null,edition=null;
		  String bname1=null;
		  PreparedStatement ps = null;
	      System.out.println("enter number");
	      Scanner sc=new Scanner(System.in);
	      int in=sc.nextInt();
	      switch(in) {
	      case 1:{
	    	  System.out.println("enter bookid, enter bookname, enter authorname, enter edition");
	    	  bid=sc.nextInt();
	    	  bname=sc.next();
	    	  aname=sc.next();
	    	  edition=sc.next();
	    	  String q1="insert into bookmanagement(bookid,bookname,authorname,edition) values ('"+bid+"','"+bname+"','"+aname+"','"+edition+"')";
	    	  st.execute(q1);
	    	  System.out.println("insertion successful");
	    	  break;}
	      case 2:{
	    	  	System.out.println("enter bookname to delete");
	    	  	bname1=sc.next();
	    	  	String sql = "DELETE FROM bookmanagement WHERE bookname = ?";
	    	  	ps = con.prepareStatement(sql);
	    	  	ps.setString(1, bname1);
	    	  	int rowsAffected = ps.executeUpdate();
	    	      

	    	      if (rowsAffected > 0) {
	    	        System.out.println("The book was deleted successfully!");
	    	      } else {
	    	        System.out.println("An error occurred while deleting the book.");
	    	      }
	    	  	break;
	      }
	      case 3:{
	    	  System.out.println("enter book id want to update");
	    	  bid=sc.nextInt();
	    	  bname1=sc.next();
	    	  String sq2="UPDATE bookmanagement SET bookname = ? WHERE bookid = ?";
	    	  ps=con.prepareStatement(sq2);
	    	  ps.setString(1,bname1);
	    	  ps.setInt(2,bid);
	    	  int rowsAffected=ps.executeUpdate();
	    	  if (rowsAffected > 0) {
	    	        System.out.println("updated");
	    	      } else {
	    	        System.out.println("not updated");
	    	      }
	    	  	break;
	      }
	      case 4:{
	    	  String query = "SELECT * FROM bookmanagement";
		      ResultSet rs = st.executeQuery(query);

		      
		      boolean flag = false;
		      while (rs.next()) {
			         flag = true;
			         System.out.println(rs.getInt(1) + " " + rs.getString(2) + 
			                  " " + rs.getString(3)+" "+rs.getString(4));
			      }

			      if (flag == true) {
			         System.out.println("\nRecords retrieved and displayed");
			      } else {
			         System.out.println("Record not found");
			      }
			      break;

	      }
	    	  
	             
	      }
	      st.close();
	      con.close();

	}

}
