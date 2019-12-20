package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Test_conn {

	public static void main(String[] args) throws Exception {
		ResultSet rs=null;
		Connection conn = null;
		Statement yuju = null;
		try {
		// 驱动(声明连接数据库的代码)
		Class.forName("com.mysql.jdbc.Driver");
		// 连接(使用用户名、密码连接mysql数据库)
		DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/jdbc", "root", "123456");
		// 通过连接对象获取语句对象
		conn.createStatement();
		
		// 定义sql语句
		String sql = "update tb_user set email='jack@qq.com' where id=2";
		// 执行
		yuju.execute(sql);
		
		//操作ResultSet  结果集
		System.out.println("id | name | sex "+" | email | birthday ");
		while(rs.next()) {
			int id=rs.getInt("id");
			String name=rs.getString("name");
			String sex=rs.getString("sex");
			String email=rs.getString("email");
			String birthday=rs.getString("birthday");
			System.out.println("id | name | sex "+" | email | birthday ");
		}
	}	catch(Exception e) {
		e.printStackTrace();
	}finally {
		//关闭连接
		if (rs!=null) {
			rs.close();
		}
		if (conn!=null) {
			conn.close();
		}
		if (yuju!=null) {
			yuju.close();
		}
		
		
	}
	}

}
