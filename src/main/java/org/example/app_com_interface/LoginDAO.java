package org.example.app_com_interface;

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
    }
}
