package kr.co.sol.jdbc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import kr.co.sol.jdbc.util.JDBCConnectionManager;

@Configuration
public class BoardAutoConfiguration {
	@Bean
	public JDBCConnectionManager getJDBCConnectionManager() {
		JDBCConnectionManager manager = new JDBCConnectionManager();
		manager.setDriverClass("oracle.jdbc.driver.OracleDriver");
		manager.setUrl("jdbc:oracle:thin:@172.16.1.145:1521:xe");
		manager.setUsername("user2");
		manager.setPassword("soldesk");
		return manager;
	}
	
}
