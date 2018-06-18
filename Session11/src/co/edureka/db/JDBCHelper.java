package co.edureka.db;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import co.edureka.model.User;

//DAO | Ata Access Object -> Design Pattern
public class JDBCHelper {

	Connection con;
	Statement stmt;
	PreparedStatement pStmt;
	CallableStatement cStmt;
	
	//1. Load the Driver
	public JDBCHelper(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("==Driver Loaded==");
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
	}
	
	//2. Create the Connection
	public void createConnection(){
		try {
			
			String url = "jdbc:mysql://localhost/edureka";
			String user = "root";
			String password = "";
			
			con = DriverManager.getConnection(url, user, password);
			System.out.println("==Connection Created==");
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
	}
	
	//3. Create SQL Query
	//4. Execute SQL Query
	public int registerUser(User uRef){
		int i = 0;
		
		try {
	
			String sql = "insert into User values (null,?,?,?)"; // ? is a wild card character
			pStmt = con.prepareStatement(sql);
			pStmt.setString(1, uRef.name);
			pStmt.setString(2, uRef.email);
			pStmt.setString(3, uRef.password);
			
			i = pStmt.executeUpdate();
			
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
		return i;
	}
	
	public boolean loginUser(User uRef){
		
		boolean flag = false;
		
		try {
	
			String sql = "select * from User where email = ? and password = ?"; // ? is a wild card character
			pStmt = con.prepareStatement(sql);
			pStmt.setString(1, uRef.email);
			pStmt.setString(2, uRef.password);
			
			ResultSet rs = pStmt.executeQuery();
			
			flag = rs.next();
			
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
		
		return flag;
	}
	
	
	//5. Close the Connection
	public void closeConnection(){
		try {
			if(stmt!=null){
				stmt.close();
			}
			if(con != null){
				con.close();
			}
			System.out.println("==Connection Closed==");
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
	}
	
}
