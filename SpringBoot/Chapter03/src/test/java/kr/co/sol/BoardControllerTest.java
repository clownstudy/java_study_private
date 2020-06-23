package kr.co.sol;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import kr.co.sol.board.service.BoardService;
import kr.co.sol.board.vo.BoardVO;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment=WebEnvironment.RANDOM_PORT)
public class BoardControllerTest {
	@Autowired
	private TestRestTemplate restTemplate;
//	@MockBean
//	PRIVATE BOARDSERVICe boardService;
	
	@Test
	public void testHello() throws Exception {
		BoardVO board = restTemplate.getForObject("/getBoard",BoardVO.class);
		assertEquals("테스터",board.getWriter());
	}
	
}
// 아래는 MockMvc 이용
	
//package kr.co.sol;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
//import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.test.web.servlet.MockMvc;
//
//@RunWith(SpringRunner.class)
//@WebMvcTest 
//public class BoardControllerTest {
//	@Autowired
//	private MockMvc mockMvc;
//	
//	@Test
//	public void testHello() throws Exception{
//		mockMvc.perform(get("/hello").param("name","둘리"))
//		.andExpect(status().isOk())
//		.andExpect(content().string("Hello : 둘리"))
//		.andDo(print());
//	}
//}
