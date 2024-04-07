import java.sql.*;

public class ConnectDB {
 public static void main(String[] args){
     try {
         Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/try", "root", "");
         if(conn != null){
             System.out.println("Connection Successfully!");
             Statement statement = conn.createStatement();
//             String addUsers = "INSERT INTO users (names, email, password) VALUES ('Emmy', 'emmy@gmail.com', '1234')";
//             int num = statement.executeUpdate(addUsers);
             String query = "SELECT * FROM users";
             ResultSet res = statement.executeQuery(query);
             while(res.next()){
                 String names = res.getString("names");
                 String email = res.getString("email");
                 System.out.println(">" + names + " - " + email);
             }
         }
         else {
             System.out.println("Oops, Connection Failed!");
         }
     } catch (SQLException ex) {
         throw new RuntimeException(ex);
     }
 }
}