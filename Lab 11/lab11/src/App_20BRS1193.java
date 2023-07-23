import java.sql.*;

class App_20BRS1193 {
    public static void main(String args[]) {
        try {
            final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
            final String DB_URL = "jdbc:mysql://localhost:3306/roadfreight_db";
            final String USER = "testuser1";
            final String PASS = "test1234";
            // Driver Registering (Loading)
            Class.forName(JDBC_DRIVER);
            // Connenction Establishment (Create Connection)
            Connection con = DriverManager.getConnection(DB_URL, USER, PASS);
            // Statement Creation
            Statement stmt = con.createStatement();
            // Execute a Statement
            ResultSet rs = stmt.executeQuery("select * from emp where designation='Manager'");
            while (rs.next())
                System.out.println(rs.getString(1) + "  " + rs.getString(2));
            con.close(); // Close Connection
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
