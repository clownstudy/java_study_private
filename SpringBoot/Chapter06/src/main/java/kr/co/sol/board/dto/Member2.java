package kr.co.sol.board.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
public class Member2 {
	@Id
//	@Column(name="MEMBER_ID")
	private String id;
	private String password;
	private String name;
	private String role;
	
//	@OneToMany(mappedBy="member",fetch=FetchType.)
	
}
