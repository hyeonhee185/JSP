package com.spring.dto;

import java.util.Date;

public class MemberVO {
	// VO 내가 지금 회원기능을 만들려고 하는데 필요한 데이터들의 집합 그것을 다담을 수 있는 그릇
	// 상세보기, 리스트 ==> 무작정 다 넣는것은 아니다!!!
	// 각 기능별로VO클래스를 잡는것이 우선이다
	private String id; // 아이디
	private String pwd; // 패스워드
	private String name = "---"; // 이름
	private String phone; // 전화번호
	private String email; // 이메일
	private String picture; // 사진파일 경로 /파일명
	private Date regDate; // 등록일
	private String authority; // 권한
	private int enabled; // 사용여부
	private String register; // 등록자
	private String address; // 주소

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public String getAuthority() {
		return authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}

	public int getEnabled() {
		return enabled;
	}

	public void setEnabled(int enabled) {
		this.enabled = enabled;
	}

	public String getRegister() {
		return register;
	}

	public void setRegister(String register) {
		this.register = register;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
