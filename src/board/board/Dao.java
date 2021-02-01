package board.board;

import java.util.ArrayList;

public interface Dao {
	void insert(Board b);
	ArrayList<Board> selectAll();
	Board selectByNum(int num);
	ArrayList<Board> selectByWriter();
	ArrayList<Board> selectByTitle();
	void update(Board b);//번호로 찾아서 날짜, 제목, 내용 수정
	void delete(int num);
}
