package co.edureka.db;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.ArrayList;

import java.sql.ResultSet;
import java.sql.SQLException;

import co.edureka.model.Student;

// DAO | Ata Access Object -> Design Pattern
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
	public int insertStudent(Student sRef){
		int i = 0;
		
		try {
			//3.
			//String sql = "insert into Student values (null,'"+sRef.name+"',"+sRef.age+",'"+sRef.email+"','"+sRef.address+"')";	
			//4.
			//stmt = con.createStatement();
			//i = stmt.executeUpdate(sql); // executeUpdate method performs -> insert/update/delete
			
			String sql = "insert into Student values (null,?,?,?,?)"; // ? is a wild card character
			pStmt = con.prepareStatement(sql);
			pStmt.setString(1, sRef.name);
			pStmt.setInt(2, sRef.age);
			pStmt.setString(3, sRef.email);
			pStmt.setString(4, sRef.address);
			
			i = pStmt.executeUpdate();
			
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
		return i;
	}
	
	public int updateStudent(Student sRef){
		int i = 0;
		
		try {
			
			String sql = "update Student set name = ?, age = ?, email = ?, address = ? where roll = ?";
			pStmt = con.prepareStatement(sql);
			pStmt.setString(1, sRef.name);
			pStmt.setInt(2, sRef.age);
			pStmt.setString(3, sRef.email);
			pStmt.setString(4, sRef.address);
			pStmt.setInt(5, sRef.roll);
			
			i = pStmt.executeUpdate();
			
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
		return i;
	}
	
	public int deleteStudent(int roll){
		int i = 0;
		
		try {
		
			String sql = "delete from Student where roll = ?";
			pStmt = con.prepareStatement(sql);
			pStmt.setInt(1, roll);
			
			i = pStmt.executeUpdate();
			
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
		return i;
	}
	
	public ArrayList<Student> listStudents(){
		ArrayList<Student> list = new ArrayList<Student>();
		
		try {
		
			String sql = "select * from Student";
			pStmt = con.prepareStatement(sql);
			
			ResultSet rs = pStmt.executeQuery();
			
			while(rs.next()){
				
				Student sRef = new Student();
				sRef.roll = rs.getInt(1);
				sRef.name = rs.getString(2);
				sRef.age = rs.getInt(3);
				sRef.email = rs.getString(4);
				sRef.address = rs.getString(5);
				
				list.add(sRef);
			}
		
			
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
		
		return list;
	}
	
	public void executeProcedure(Student sRef){
		try {
			
			String sql = "{ call addStudent(?,?,?,?) }";
			cStmt = con.prepareCall(sql);
			
			cStmt.setString(1, sRef.name);
			cStmt.setInt(2, sRef.age);
			cStmt.setString(3, sRef.email);
			cStmt.setString(4, sRef.address);
			
			cStmt.execute();
			
			System.out.println("==Procedure Execuetd==");
			
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
	}
	
	public void executeBatch(){
		try {
			
			String sql1 = "update Student set name = 'Daisy JJ', age = 39 where roll = 6";
			String sql2 = "delete from Student where rollnumber = 3";
			
			con.setAutoCommit(false);
			
			stmt = con.createStatement();
			stmt.addBatch(sql1);
			stmt.addBatch(sql2);
			
			int[] arr = stmt.executeBatch(); // Batch Processing
			
			con.commit(); // We are executing the batch as a transaction
			
			System.out.println("==Transaction Done==");
			
		} catch (Exception e) {
			try {
				con.rollback(); // Roll Back the changes if anything goes here an thr
				System.out.println("==Transaction Roll Backed==");
			} catch (SQLException e1) {
				e1.printStackTrace();
			} 
			System.out.println("Some Exception: "+e);
		}
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
