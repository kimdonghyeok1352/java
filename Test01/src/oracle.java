import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class oracle {

	public static void main(String[] args) throws SQLException {
		Connection conn = null; //DB�� �����ϴ� �������̽�
		PreparedStatement pstm = null; //sql�� ��ü
		ResultSet r = null;//sql�� ���� ��ȯ
		
		try {
			String que = "select * from emp";
			conn=db.get();
			pstm=conn.prepareStatement(que);
			r=pstm.executeQuery();
			while(r.next()) {
				String empno = r.getString(1);
				String ename = r.getString(2);
				String job=r.getString(3);
				int mgr = r.getInt(4);
				java.sql.Date hiredate=r.getDate(5);
				int sal =r.getInt(6);
				int comm = r.getInt(7);
				int deptno =r.getInt(8);
				System.out.println(empno+" "+job+" "+ename+" "+mgr);
			}
		}catch(SQLException e) {
			System.out.println("���ܹ߻�");
			e.printStackTrace();
		}
		r.close();
		pstm.close();
		conn.close();

	}

}
