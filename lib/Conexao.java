import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import database.DAO;
import database.Usuario;

public class Conexao {
    public static void main(String[] args) {
        try{
            Connection conexao = DAO.createConnection();
            // Usuario usuario = new Usuario("joao.neves", "João das Neves", "123");

            /* INSERT Usuário */
            /*PreparedStatement stmt = conexao.prepareStatement(
                "INSERT INTO usuario (user_name, name, password) VALUES (?, ?, ?);"
            );
            stmt.setString(1, usuario.getUserName());
            stmt.setString(2, usuario.getName());
            stmt.setString(3, usuario.getPassword());
            stmt.execute();*/

            imprimirUsuarios(conexao);

            PreparedStatement stmt = conexao.prepareStatement(
                "DELETE FROM usuario WHERE id = ?;"
            );
            stmt.setInt(1, 2);
            stmt.execute();
            imprimirUsuarios(conexao);

            stmt = conexao.prepareStatement(
                "UPDATE usuario SET user_name = ?, name = ?, password = ? WHERE id = ?;"
            );
            stmt.setString(1, "maria.dores");
            stmt.setString(2, "Maria das Dores");
            stmt.setString(3, "123457");
            stmt.setInt(4, 1);
            stmt.execute();
            imprimirUsuarios(conexao);
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }

    public static void imprimirUsuarios(Connection conexao) throws Exception {
        ResultSet rs = conexao.createStatement().executeQuery(
            "SELECT * FROM usuario;"
        );
        while(rs.next()){
            Usuario usuario2 = new Usuario(
                rs.getInt("id"), 
                rs.getString("user_name"),
                rs.getString("name"),
                rs.getString("password")
            );
            System.out.println(usuario2);
            System.out.println("===================================");
        }
    }
}
