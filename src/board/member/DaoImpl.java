package board.member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import board.conn.DbConnect;

public class DaoImpl implements Dao {
	
	private DbConnect db;
	
	public DaoImpl() {
		db = DbConnect.getInstance();
	}
	

	@Override
	public void insert(Member m) {
		// TODO Auto-generated method stub
		Connection conn = db.conn();
		String sql = "insert into member values(?,?,?,?)";//변수에 들어갈 위치 찍어놓기

		int cnt = 0;
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setStirng(1, m.getId());//첫번째 물음표
			pstmt.setStirng(2, m.getPwd());
			pstmt.setStirng(3, m.getName());
			pstmt.setStirng(4, m.getEmail());
			
			//sql실행
			cnt = pstmt.executeUpdate();
			
			System.out.println(cnt + "줄 insert 됨");
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
	}

	@Override
	public Member select(String id) {
		// TODO Auto-generated method stub
		Connection conn = db.conn();
		String sql = "select pwd, id from member where id=?";
		ResultSet rs = null;
		Member m = null;
		try {
			PrepareStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs= = pstmt.executeQuery();
			
			if(rs.next()) {
				// m = new Member(id2, pwd, name, email)
				m= new Member(rs.getString(1), rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4));
			}
			
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				conn.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
		
		return m;
	}

	@Override
	public void update(String id, String new_pwd) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	

}
