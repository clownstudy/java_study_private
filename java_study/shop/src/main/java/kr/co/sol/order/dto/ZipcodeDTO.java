package kr.co.sol.order.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ZipcodeDTO {
	private char Zipcode;
	private String Area1;
	private String Area2;
	private String Area3;
	private String Area4;
}
