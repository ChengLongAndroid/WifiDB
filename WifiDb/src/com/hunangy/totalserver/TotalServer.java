package com.hunangy.totalserver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import org.json.JSONArray;
import org.json.JSONObject;

import com.hunangy.DbRes.ProbeDataRes;
import com.hunangy.absDao.ProbeDataDao;
import com.ljc.util.DBUtil;

public class TotalServer {

//	public static void main(String[] args) {
//
//			//wifiprobedatadb
//			//wifiprobedb
//			//transportdb
//			
//			
//			String IP="127.0.0.1";
//			int port=3306;
//			String name="wifiprobedatadb";
//
//			
//			final Connection conn=DBUtil.getConnet(IP,port,name);
//			System.out.println("main  "+conn);
//			//6月14号	socket拼接 程龙
//
//			new Thread(){
//				
//				@Override
//				public void run() {
//					try {
//						ServerSocket ss = new ServerSocket(54331);
//						while (true) {
//							System.out.println("等待客户端连接");
//							Socket c = ss.accept();
//							try {
//								// 接收信息
//								BufferedReader br = new BufferedReader(new InputStreamReader(c.getInputStream(), "utf-8"));
//								String str = "";
//								str = br.readLine();
//								System.out.println(str);
//								
//								JSONObject obj = new JSONObject(str.toString());  
//								JSONArray obj2 = obj.getJSONArray("data");
//								List<ProbeDataRes> list=new ArrayList<>();
//								for (int i = 0; i < obj2.length(); i++) {  
//								    JSONObject temp = new JSONObject(obj2.get(i).toString());
//								    ProbeDataRes asDataRes=new ProbeDataRes(temp.getString("mac"),temp.getInt("range")<=10?1:0,temp.getString("tmc"),"探针1号");
//								    if (ProbeDataDao.Save(asDataRes, conn)) {
//										System.out.println("成功");
//									}else System.out.println("失败");
//								    list.add(asDataRes);
//								} 
//								
//								
//							
//								
//								// 向客户端发送信息
//								PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(c.getOutputStream())),true);
//								Scanner sc = new Scanner(System.in);
//								//String s = sc.nextLine();
//								Random random=new Random();
//								pw.println("服务端接受成功："+" "+ " ,服务器的IP是:" + ss.getLocalSocketAddress());
//
//								br.close();
//								pw.close();
//							} catch (Exception e) {
//								e.printStackTrace();
//							}
//						}
//					} catch (Exception e) {
//						e.printStackTrace();
//					}
//				}
//			}.start();
//			
//			
//			
//			
//		
//	}

}
