package paf.assignments.HospitalityManagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AppoinmentActions {
	public String CreateAppoinment() {
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitalmanagement", "root", "");
			
			Statement stmt = connection.createStatement();
			
			stmt.executeUpdate("INSERT INTO appoinment (p_id, d_id, h_id, treatment_id) VALUES (1,1,1,1)");
		} catch(Exception E) {
			System.out.println("");
		}
		return "";
	}
}
