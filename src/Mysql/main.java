package Mysql;
import java.sql.*;
// TODO Doplnit novy stlpec (pole) napr. rokVydania do tabulky kniha a nasledne upravit tento kod, cas do 20.55
public class main {
    private static Connection conn;

    public static void odstran() throws SQLException {
        // the mysql insert statement
        String query = "DELETE FROM kniha WHERE id = ?";
        PreparedStatement preparedStmt = conn.prepareStatement(query);
        preparedStmt.setInt(1, 1);
        // execute the preparedstatement
        preparedStmt.execute();
        preparedStmt.close();
    }

    public static void vloz() throws SQLException {
// the mysql insert statement
        String query = "INSERT INTO kniha (nazov, autor, rokVydania) VALUES (?, ?, ?)";
        // create the mysql insert preparedstatement
        PreparedStatement preparedStmt = conn.prepareStatement(query);
        preparedStmt.setString (1, "Microsoft Office 2016");
        preparedStmt.setString (2, "Ján Žitniak");
        preparedStmt.setInt(3, 2017);
        // execute the preparedstatement
        preparedStmt.execute();
        preparedStmt.close();
    }

    // Metoda vyber() reprezentuje (R)ead v CRUD operaciach
    public static void vyber() throws SQLException {
        // our SQL SELECT query.
        // if you only need a few columns, specify them by name instead of using "*"
        String query = "SELECT * FROM kniha";
        // create the java statement
        PreparedStatement preparedStmt = conn.prepareStatement(query);
        // execute the query, and get a java resultset
        ResultSet rs = preparedStmt.executeQuery(query);
        // iterate through the java resultset
        while (rs.next())
        {
            int id = rs.getInt("id");
            String nazov = rs.getString("nazov");
            String autor = rs.getString("autor");
            int rokVydania = rs.getInt("rokVydania");
            // print the results
            System.out.println(id + " " + nazov + " " + autor + " " + rokVydania);
        }
        preparedStmt.close();
    }

    public static void aktualizuj() throws SQLException {
        // create the java mysql update preparedstatement
        String query = "UPDATE kniha SET nazov = ?, autor = ?, rokVydania = ? WHERE id = ?";
        PreparedStatement preparedStmt = conn.prepareStatement(query);
        preparedStmt.setString(1, "Já, NE robot");
        preparedStmt.setString(2, "Ján Žitniak");
        preparedStmt.setInt(3, 2000);
        preparedStmt.setInt(4, 1);
        // execute the java preparedstatement
        preparedStmt.executeUpdate();
        preparedStmt.close();
    }

    private static void close() throws SQLException{
        conn.close();
    }

    public static void main(String[] args) throws SQLException {
        getConnection();
        vyber();
        aktualizuj();
        vloz();
        odstran();
        close();
    }

    private static Connection getConnection() {
        Connection conn;
        String url = "jdbc:mysql://localhost:3306/test_db";
        String username = "root";
        String password = "David2001";
        System.out.println("Connecting database...");
        try {
            conn = DriverManager.getConnection(url, username, password);
            System.out.println("Database connected!");
        } catch (SQLException e) {
            throw new IllegalStateException("Cannot connect the database!", e);
        }
        return conn;
    }
}


