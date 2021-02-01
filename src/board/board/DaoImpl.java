package board.board;

import java.sql.ResultSet;
import java.util.ArrayList;

public class DaoImpl implements Dao {

	@Override
	public void insert(Board b) {
		// TODO Auto-generated method stub

	}

	@Override
	public ArrayList<Board> selectAll() {
		// TODO Auto-generated method stub
		ArrayList<Board> list = new ArrayList<Board>();
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()) {
			Board b = new Board(rs.getInt(1), rs.getString(2), rs.getDate(3), rs.getString(4), rs.getString(5));
			list.add(b);
		}
		return list;
	}

	@Override
	public Board selectByNum(int num) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Board> selectByWriter() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Board> selectByTitle() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Board b) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(int num) {
		// TODO Auto-generated method stub

	}

}
