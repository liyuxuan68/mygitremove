package shujuku;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class shujuku1 {

	public static void main(String[] args ) throws Exception{
		// TODO �Զ����ɵķ������
		Connection connection =null;
		Statement statement = null;
		ResultSet rs = null;
		try {
			//1.����jar������
			//2.���������� 
			Class.forName("com.mysql.cj.jdbc.Driver");
			//3.connection���ݿ����Ӷ���,3360��mysql�Ķ˿ں�
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/gongsi?serverTimezone=GMT", "root", "Aa123456");
			System.err.println("����mysql���ݿ⣺"+!connection.isClosed());
			//4.Statemnt���ݴ������
			statement=(Statement) connection.createStatement();
			//5.resultset���������
			rs = (statement).executeQuery("select * from emp1");//д��sql���
			//ResultSet rs = (statement).executeUpdate("select * from emp1");//�����ݿ���޸�
			while(rs.next()) {
				int id=rs.getInt("id");
				String ename=rs.getString("ename");
				String sex=rs.getString("sex");
				int sal=rs.getInt("sal");
				int dno=rs.getInt("dno");
				System.out.println(id+" "+ename+" "+sex+" "+sal+" "+dno);
			}
		
		} catch (ClassNotFoundException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}finally {
			//�ر���Դ
			rs.close();
			statement.close();
			connection.close();
		}
		
		
	}

}
//mysql������mysql Driver
interface JDBC{
	public void Connection();//�������Ӷ���
	public void ResultSet();
	public void Statement();//���ݴ������
}