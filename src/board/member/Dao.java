package board.member;
//db 작업만 함
public interface Dao {
	
	void insert(Member m); //회원가입 기능에 필요 service에서 id, pwd, name, email을 Member 객체에 담아서 insert()호출->db 저장을 위해

	//service의 login, 내 정보 확인
	Member select(String id);
	
	//service의 내 정보 수정
	void update(String id, String new_pwd);
	
	//sevice의 탈퇴
	void delete(String id);
	
}
