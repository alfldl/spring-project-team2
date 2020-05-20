package oracle.java.s20200502.board.model;

import java.util.Date;

public class Board {
	private int b_num;
	private int m_num;
	private String b_title;
	private String b_content;
	private Date b_regDate;
	private int b_hit;
	private int b_likeCnt;
	private int b_replyCnt;
	private int b_type;
	
	public int getB_num() {
		return b_num;
	}
	public void setB_num(int b_num) {
		this.b_num = b_num;
	}
	public int getM_num() {
		return m_num;
	}
	public void setM_num(int m_num) {
		this.m_num = m_num;
	}
	public String getB_title() {
		return b_title;
	}
	public void setB_title(String b_title) {
		this.b_title = b_title;
	}
	public String getB_content() {
		return b_content;
	}
	public void setB_content(String b_content) {
		this.b_content = b_content;
	}
	public Date getB_regDate() {
		return b_regDate;
	}
	public void setB_regDate(Date b_regDate) {
		this.b_regDate = b_regDate;
	}
	public int getB_hit() {
		return b_hit;
	}
	public void setB_hit(int b_hit) {
		this.b_hit = b_hit;
	}
	public int getB_likeCnt() {
		return b_likeCnt;
	}
	public void setB_likeCnt(int b_likeCnt) {
		this.b_likeCnt = b_likeCnt;
	}
	public int getB_replyCnt() {
		return b_replyCnt;
	}
	public void setB_replyCnt(int b_replyCnt) {
		this.b_replyCnt = b_replyCnt;
	}
	public int getB_type() {
		return b_type;
	}
	public void setB_type(int b_type) {
		this.b_type = b_type;
	}

}
