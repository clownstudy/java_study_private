package kr.co.marketerz.memtb;

public class MemberDTO {
	private int rr;
	private String memid;
	private String memname;
	private String memtel;
	private String membirth;
	private String mememail;
	private String memgender;
	private String regdate;
	private String mempass;
	public String getMempass() {
		return mempass;
	}
	public void setMempass(String mempass) {
		this.mempass = mempass;
	}
	private int memseq;
	
	public int getMemseq() {
		return memseq;
	}
	public void setMemseq(int memseq) {
		this.memseq = memseq;
	}
	public String getMemid() {
		return memid;
	}
	public void setMemid(String memid) {
		this.memid = memid;
	}
	public String getMemname() {
		return memname;
	}
	public void setMemname(String memname) {
		this.memname = memname;
	}
	public String getMemtel() {
		return memtel;
	}
	public void setMemtel(String memtel) {
		this.memtel = memtel;
	}
	public String getMembirth() {
		return membirth;
	}
	public void setMembirth(String membirth) {
		this.membirth = membirth;
	}
	public String getMememail() {
		return mememail;
	}
	public void setMememail(String mememail) {
		this.mememail = mememail;
	}
	public String getMemgender() {
		return memgender;
	}
	public void setMemgender(String memgender) {
		this.memgender = memgender;
	}
	public String getRegdate() {
		return regdate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	public int getRr() {
		return rr;
	}
	public void setRr(int rr) {
		this.rr = rr;
	}
}