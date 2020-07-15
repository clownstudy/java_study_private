package kr.co.sol.shop.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class OrderDTO {
	// product table
	private int rr; // 행번호
	private int no; // 주문번호
	private int product_no; // 상품번호
	private int price; // 상품가격
	private String pname; // 상품명
	
	// order table
	private int quantity = 0; //수량
	private String or_date; //주문일자
	private String state; // 주문상태
	
	//member table
	private String id; // 회원아이디/
	private String mname; // 회원명
}

/*
  		select o.no, o.product_no, p.name pname, o.quantity, o.or_date, o.state, o.id, m.m_name mname, p.price
  		from shop_order o join shop_product p on o.product_no = p.no
  		join member m on o.id = m.mem_id
  		
 */ 
