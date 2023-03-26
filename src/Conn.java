import java.sql.*;

public class Conn {

    Connection c;
    Statement s;


    public Conn() {

        try {
            Class.forName("com.mysql.jdbc.driver");
            c = DriverManager.getConnection("jdbc:mysql//ebs.", "root", "sumit14@rai");
            s = c.createStatement();


        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
