package com;
import java.sql.Connection; 
import java.sql.DriverManager; 
import java.sql.PreparedStatement; 
import java.sql.ResultSet; 
import java.sql.SQLException; 
import com.SearchFlightBean; 
import java.sql.DriverManager; 
import java.sql.ResultSet; 
import java.sql.SQLException; 
import java.sql.Statement; 
import java.util.ArrayList; 
import java.util.HashMap; 
import java.util.List; 
public class SearchFlightDao { 
 public Connection con = null; 
 public Statement st = null; 
 public SearchFlightDao() throws ClassNotFoundException, SQLException 
{ 
 Class.forName("com.mysql.jdbc.Driver"); 
 con = 
DriverManager.getConnection("jdbc:mysql://localhost:3306/flyme", "root", 
"root"); 
 System.out.println("connection established with database"); 
 st = con.createStatement(); 
 } 
 public List<String[]> getAvailableFlights(String f, String t, String 
d) { 
 List<String[]> flights = new ArrayList<>(); 
 String query = "SELECT * FROM flyme.flight_details where source_city='" + f + "' and destination_city='" + t + "' and date_travel='" + d + "'"; 
 System.out.println(query); 
 try { 
 ResultSet rs = st.executeQuery(query); 
 if (rs.next()) { 
 String[] flight = new String[5]; 
 flight[0] = rs.getString("flight_no"); 
 flight[1] = rs.getString("airline_name"); 
 flight[2] = rs.getString("price"); 
 flight[3] = rs.getString("date_travel"); 
 flight[4] = rs.getString("seat_available"); 
 
 flights.add(flight); 
 return flights; 
 } 
 } catch (SQLException e) { 
 e.printStackTrace(); 
 } 
 return null; 
 } 
} 