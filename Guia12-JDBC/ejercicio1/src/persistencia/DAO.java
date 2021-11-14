package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public abstract class DAO {

    protected Connection con = null;
    protected Statement stmt = null;
    protected ResultSet rs = null;

    private final String URL = "jdbc:mysql://localhost:3306/" + this.DATABASE + "?useSSL=false";
    private final String USER = "root";
    private final String PASSWORD = "root";
    private final String DATABASE = "tienda";
    private final String DRIVER = "com.mysql.cj.jdbc.Driver";

    protected void conectarBase() throws SQLException, ClassNotFoundException {
        try {
            Class.forName(DRIVER);
            con = DriverManager.getConnection(this.URL, this.USER, this.PASSWORD);
        } catch (SQLException | ClassNotFoundException ex) {
            // TODO: handle exception
            throw ex;
        }
    }

    protected void desconectarBase() throws Exception {
        try {
            if (rs != null) {
                rs.close();
            }
            if (stmt != null) {
                stmt.close();
            }
            if (con != null) {
                con.close();
            }
        } catch (Exception ex) {
            // TODO: handle exception
            throw ex;
        }
    }

    protected void insertarModificarEliminar(String sql) throws Exception {
        try {
            conectarBase();
            stmt = con.createStatement();
            stmt.executeUpdate(sql);
        } catch (Exception ex) {
            // TODO: handle exception
            throw ex;
        }
    }

    protected ResultSet select(String sql) throws Exception {
        try {
            conectarBase();
            stmt = con.createStatement();
            rs = stmt.executeQuery(sql);
            return rs;
        } catch (Exception ex) {
            // TODO: handle exception
            con.rollback();
            throw ex;
        }
    }

}