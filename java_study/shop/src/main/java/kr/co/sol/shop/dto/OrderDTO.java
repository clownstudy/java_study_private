package kr.co.sol.shop.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class OrderDTO {
	private int No;
	private String Quantity;
	private String Or_date;
	private String State;
	private String Id;
}
