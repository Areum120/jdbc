package board;

import java.util.Scanner;

import board.member.MemService;
import board.member.MemServiceImpl;

public class Menu {
	private MemService memService;

	public Menu() {
		memService = new MemServiceImpl();
	}
	
	public void run(Scanner sc) {
		boolean flag = true;
		int menu = 0;
		while(flag) {
			System.out.println("1.회원관리 2.게시판 3.종료");
			menu = sc.nextInt();
			switch(menu) {
			case 1:
				mem_run(sc);
				break;
			case 2:
				break;
			case 3:
				flag = false;
				break;
			}
		}
	}
	public void mem_run(Scanner sc) {
		boolean flag = true;
		int menu = 0;
		while(flag) {
			System.out.println("1.회원가입 2.로그인 3.내정보확인 4.내정보수정 5.로그아웃 6.탈퇴 7.종료");
			menu = sc.nextInt();
			switch(menu) {
			case 1:
				memService.addMember(sc);
				break;
			case 2:
				memService.login(sc);
				break;
			case 3:
				memService.myInfo();
				break;
			case 4:
				memService.editInfo(sc);
				break;
			case 5:
				memService.logout(sc);
				break;
			case 6:
				memService.out();
				break;
			case 7:
				flag = false;
				break;
			}
		}
	}
}
