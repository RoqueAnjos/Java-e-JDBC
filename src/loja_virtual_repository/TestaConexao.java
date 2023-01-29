package loja_virtual_repository;

import java.sql.Connection;
import java.sql.SQLException;

public class TestaConexao {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		ConnectionFactory criaConexao = new ConnectionFactory();
		Connection connection = criaConexao.recoverConnection();
	
		System.out.print("Fechando Conexão.");
		connection.close();
	}

}
