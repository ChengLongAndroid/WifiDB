package com.hunangy.DbRes;

public class UserRes {
	protected String userAccount;
	protected String username;
	protected String password;

	public UserRes() {

	}

	public UserRes(String userAccount, String username, String passworld) {
		this.userAccount = userAccount;
		this.username = username;
		this.password = passworld;
	}

	public String getUserAccount() {
		return userAccount;
	}

	public void setUserAccount(String userAccount) {
		this.userAccount = userAccount;
	}

	@Override
	public String toString() {
		return "UserRes [userAccount=" + userAccount + ", username=" + username
				+ ", password=" + password + "]";
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
