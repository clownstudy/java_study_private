package kr.co.sol.board.dto;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter 
@Setter
@ToString
@Entity
public class Member {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "bd2_seq")
	@SequenceGenerator(name = "bd2_seq", sequenceName = "BD2_SEQ", initialValue = 1, allocationSize = 1)
	private int seq;
	private int cnt;
	private String writer;
	private String title;
	private String content;
	@Temporal(TemporalType.DATE)
	private Date createDate;
} 