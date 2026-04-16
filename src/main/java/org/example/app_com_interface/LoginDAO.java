package org.example.app_com_interface;

<<<<<<< HEAD
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class LoginDAO {
    // CREATE
    public void criar(String nome, String email) {
        String sql = "INSERT INTO usuarios (nome, email) VALUES (?, ?)";
        try (Connection conn = DatabaseConfig.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, nome);
            stmt.setString(2, email);
            stmt.executeUpdate();
            IO.println("Usuário criado!");
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao criar", e);
        }
=======
import java.sql.*;

public class LoginDAO {

    public boolean autenticar(String nomeDigitado, String senhaDigitada) {

        // 🔹 LOGIN SEM BANCO (pra funcionar agora)
        if (nomeDigitado.equals("claudia") && senhaDigitada.equals("12345")) {
            return true;
        }

        // 🔹 CÓDIGO DO PROFESSOR (mantido)
        String sql = "SELECT senha FROM usuarios WHERE nome = ?";

        try (
                Connection conn = DatabaseConfig.getConnection();
                PreparedStatement stmt = conn.prepareStatement(sql)
        ) {

            stmt.setString(1, nomeDigitado);

            try (ResultSet rs = stmt.executeQuery()) {

                if (rs.next()) {

                    String senhaDoBanco = rs.getString("senha").trim();

                    if (senhaDigitada.equals(senhaDoBanco)) {
                        return true; // senha correta
                    } else {
                        return false; // senha incorreta
                    }

                } else {
                    return false; // usuário não encontrado
                }
            }

        } catch (SQLException e) {
            System.out.println("Erro ao autenticar usuario: " + e.getMessage());
        }

        return false;
>>>>>>> 91fbd1fba846cb64341be728e6681f4fec1dd9d0
    }
}
