package board.member;
//vo
public class Member {
	public String id;
	public String pwd;
	public String name;
	public String email;
	
	
	public Member() {
		
	}
	
	public Member(String id,String pwd,String name,String email) {
		this.id = id;
		this.pwd =pwd;
 		this.email = email;
		this.name = name;
		
		
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", pwd=" + pwd + ", name=" + name + ", email=" + email + "]";
	}
	

}


