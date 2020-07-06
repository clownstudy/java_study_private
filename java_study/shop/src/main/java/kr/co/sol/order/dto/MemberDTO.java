package kr.co.sol.order.dto;

import lombok.Getter;
import lombok.ToString;
import lombok.Setter;

@Getter
@Setter
@ToString
public class MemberDTO {
	private String Id;
	private String Passwd;
	private String name;
	private String Mem_num1;
	private String Mem_num2;
	private String E_mail;
	private String Phone;
	private String Zipcode;
	private String Address;
	private String Job;
}
