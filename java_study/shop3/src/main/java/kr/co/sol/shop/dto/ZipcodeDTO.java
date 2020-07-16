package kr.co.sol.shop.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ZipcodeDTO {
	private char zipcode;
	private String area1;
	private String area2;
	private String area3;
	private String area4;
}
