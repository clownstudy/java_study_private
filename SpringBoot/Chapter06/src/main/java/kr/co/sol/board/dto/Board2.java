package kr.co.sol.board.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
public class Board2 {
	@Id 
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "bd2_seq")
	@SequenceGenerator(name = "bd2_seq", sequenceName = "BD2_SEQ", initialValue = 1, allocationSize = 1)
	private int seq;
	@Column(updatable=false)
	private String writer;
	private String title;
	private String content;
//	@Column(insertable=false,updatable=false,columnDefinition="date default sysdate")
	@Temporal(value=TemporalType.TIMESTAMP)
	private Date create_date;
//	@Column(insertable=false, updatable=false,columnDefinition="number default 0")
	private int cnt;
	
	@ManyToOne
	@JoinColumn(name="MEMBER_ID")
	private Member2 member;
} 