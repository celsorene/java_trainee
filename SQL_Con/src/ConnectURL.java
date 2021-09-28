import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class ConnectURL {
    public static void main(String[] args) {

        // Create a variable for the connection string.
        String connectionUrl = "jdbc:sqlserver://127.0.0.1\\SQLEXPRESS:49673;databaseName=dadosp12;user=sa;password=celsinho1983"; //49673

        // String dbURL = "jdbc:sqlserver://localhost\\sqlexpress";
        // String user = "sa";
        // String pass = "celsinho1983";
        // try (Connection con = DriverManager.getConnection(dbURL,user,pass); Statement
        // stmt = con.createStatement();) {

        try (Connection con = DriverManager.getConnection(connectionUrl); Statement stmt = con.createStatement();) {

             //JOptionPane.showMessageDialog(null, "Sucesso conexao com banco dados!", "Conectado banco", 1);

            String SQL = "SELECT TOP 10 * FROM SB1990 WHERE D_E_L_E_T_ = ''";
            ResultSet consqry = stmt.executeQuery(SQL);

            // Iterate through the data in the result set and display it.
            while (consqry.next()) {
                System.out.println("Produto: " + consqry.getString("B1_COD") + " " + " Descricao: " + consqry.getString("B1_DESC"));
            }
        }
        // Handle any errors that may have occurred.
        catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Falha conexao com o banco de dados!", "Falha conexão", 0);
        }
    }
}