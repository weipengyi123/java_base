package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Select {

	public static void main(String[] args) throws Exception {
			// 驱动(声明连接数据库的代码)
			Class.forName("com.mysql.jdbc.Driver");
			// 连接(使用用户名、密码连接mysql数据库)
			Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/jdbc", "root", "123456");
			// 通过连接对象获取语句对象
			Statement yuju = conn.createStatement();

			// 定义sql语句
			String sql = "select * from tb_user";
			// 执行普通查询
			ResultSet rs = yuju.executeQuery(sql);
			// 操作ResultSet 结果集
			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String sex=rs.getString("sex");
				String email=rs.getString("email");
				String birthday=rs.getString("birthday");
				
				System.out.println(id+"    | "+name+" | "+sex+" | "+email+" | "+birthday);
			}
		} 

}
