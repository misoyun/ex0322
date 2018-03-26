package com.bit.mypage.vo;

import java.sql.Timestamp;

public class FriendShip_VO {

	private int 		no;
	private String  	id;
	private String  	friend;
	private Timestamp	dateEst;

	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFriend() {
		return friend;
	}
	public void setFriend(String friend) {
		this.friend = friend;
	}
	public Timestamp getDateEst() {
		return dateEst;
	}
	public void setDateEst(Timestamp dateEst) {
		this.dateEst = dateEst;
	}

}
