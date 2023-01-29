package loja_virtual_repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class TestaInsercaoComParametro {
	public static void main(String[] args) throws SQLException {
		
		System.out.print("Nome: ");
		String nome = new Scanner(System.in).nextLine();
		System.out.print("Descricao: ");
		String descricao = new Scanner(System.in).nextLine();
		
		ConnectionFactory factory = new ConnectionFactory();
		Connection connection = factory.recoverConnection();
		
		PreparedStatement stm = connection.prepareStatement("INSERT INTO PRODUTO (nome, descricao) VALUES (?, ?)", 
				Statement.RETURN_GENERATED_KEYS);
		
		stm.setString(1, nome);
		stm.setString(2, descricao);
		
		stm.execute();
		
		ResultSet rst = stm.getGeneratedKeys();
		
		while(rst.next()) {
			Integer id = rst.getInt(1);
			System.out.println("O id criado foi: "+id);
		}
	}
}
