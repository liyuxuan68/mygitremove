package shujuku;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class shujuku1 {

	public static void main(String[] args ) throws Exception{
		// TODO 自动生成的方法存根
		Connection connection =null;
		Statement statement = null;
		ResultSet rs = null;
		try {
			//1.导入jar包加载
			//2.加载驱动类 
			Class.forName("com.mysql.cj.jdbc.Driver");
			//3.connection数据库连接对象,3360是mysql的端口号
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/gongsi?serverTimezone=GMT", "root", "Aa123456");
			System.err.println("连接mysql数据库："+!connection.isClosed());
			//4.Statemnt数据传输对象
			statement=(Statement) connection.createStatement();
			//5.resultset结果集对象
			rs = (statement).executeQuery("select * from emp1");//写入sql语句
			//ResultSet rs = (statement).executeUpdate("select * from emp1");//对数据库的修改
			while(rs.next()) {
				int id=rs.getInt("id");
				String ename=rs.getString("ename");
				String sex=rs.getString("sex");
				int sal=rs.getInt("sal");
				int dno=rs.getInt("dno");
				System.out.println(id+" "+ename+" "+sex+" "+sal+" "+dno);
			}
		
		} catch (ClassNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}finally {
			//关闭资源
			rs.close();
			statement.close();
			connection.close();
		}
		
		
	}

}
//mysql驱动用mysql Driver
interface JDBC{
	public void Connection();//数据连接对象
	public void ResultSet();
	public void Statement();//数据传输对象
}