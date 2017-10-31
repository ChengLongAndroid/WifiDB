package com.hunangy.absDao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.hunangy.DbRes.UserRes;
import com.ljc.util.DBUtil;

public class UserDaoAbs {
	public static boolean saveUser(UserRes user,Connection conn) {   //保存用户
		boolean x=false ;
		try {
			
			if (conn != null) {
				try {
					
					String sql_query2="insert into usertable(userAccount, username, passworld) values(?,?,?)";				
					PreparedStatement ps = conn.prepareStatement(sql_query2);					
					ps.setString(1, user.getUserAccount());
					ps.setString(2, user.getUsername());
					ps.setString(3, user.getPassword());
					
				//	System.out.println(user.getUserAccount()+"   "+user.getUsername()+"   "+user.getPassword());
					boolean rs = ps.execute();
					
					if (!rs) {						
						System.out.println("yes-------");
						x=true;
					} else {
						x = false;
						System.out.println("no----");
					}
				} catch (Exception e) {
					e.printStackTrace();
					System.out.println("报错了");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return x;
		
		
	}
	public static UserRes queryUserByAccount(String Account,Connection conn) { //按帐号查询用户
		
		UserRes u=null;
		try {
			
			if (conn != null) {
				try {
					
					String sql_query2 = "select * from usertable where userAccount=?";				
					PreparedStatement ps = conn.prepareStatement(sql_query2);					
					ps.setString(1, Account);					
					ResultSet rs = ps.executeQuery();
					
					if (rs.next()) {
						//System.out.println(rs.getString(1)+rs.getString(2)+rs.getString(3));
						u=new UserRes(rs.getString(1),rs.getString(2),rs.getString(3));
						
						System.out.println("成功");
					
					} else {
						
						System.out.println("失败");
					}
				} catch (Exception e) {
					e.printStackTrace();
					System.out.println("报错了");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return u;
		
		
		
	}
	public static List<UserRes> queryUserByName(String username,Connection conn) {  //按用户名查询用户
		
		List<UserRes> list=new ArrayList<>();
		int i=0;
		try {
			
			if (conn != null) {
				try {
					
					String sql_query2 = "select * from usertable where username='"+username+"'";				
					PreparedStatement ps = conn.prepareStatement(sql_query2);					
				//	ps.setString(1, username);					
					ResultSet rs = ps.executeQuery();
					
					while (rs.next()) {
					System.out.println(rs.getString(1)+"--------- "+rs.getString(2)+"--------- "+rs.getString(3));
					UserRes us=new UserRes(rs.getString(1),rs.getString(2),rs.getString(3));
					list.add(us);

						System.out.println("成功");
					
					} 
					
				} catch (Exception e) {
					e.printStackTrace();
					System.out.println("报错了");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		int con=list.size();
		
	
		return list;
		
	}
}
