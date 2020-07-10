package kr.co.sol.shop.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ProductDTO {
	private int No;
	private String Name;
	private String Price;
	private String Detail;
	private String Pr_date;
	private String Stock;
	private String Image;
}
