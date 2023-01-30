package loja_virtual_repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	protected Connection recoverConnection() throws SQLException {
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/loja_virtual?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC",
				"root", "MilaPreta123!");
	}
}
