package kr.co.sol;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Service;

import kr.co.sol.jdbc.util.JDBCConnectionManager;

@Service
public class JDBCConnectionManagerRunner implements ApplicationRunner {
	@Autowired
	private JDBCConnectionManager connectionManager;
	@Override
	public void run(ApplicationArguments args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("커넥션 매니저:"+connectionManager.toString());

	}

}
