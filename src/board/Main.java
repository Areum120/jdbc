package board;

import board.member.Dao;
import board.member.DaoImpl;
import board.member.Member;

public class Main {
	
	
	public static void main(String[] args) {
		
		Dao dao = new DaoImpl();//업캐스팅임 쓰는 이유는 객체 생성 구현하여 dlsxjvpdltm sodyd rycpgkrl tnlqrp gkrl dnlgo
		dao.insert(new Member("aaa", "111", "namea"));
		
		
	}
	

}
