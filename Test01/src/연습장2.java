import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Label;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

class Worker3 {
	private int id;
	private String name;
	private String dept;
	private String addr;
	private String birth;

	public Worker3(int id, String name, String dept, String addr, String birth) {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}
}

public class 연습장2 {
	public static void main(String[] args) {


		Worker3 w = new Worker3(123, "ㅁㅁ", "ㅠㅠ", "22", "1/22");
		Scanner s = new Scanner(System.in);

		while (true) {
			System.out.println("<사원 정보 관리 프로그램>");
			System.out.println("1");
			System.out.println("2");
			System.out.println("3");
			int r = s.nextInt();
			switch (r) {
			case 1:
				System.out.print("사번:");
				int id = s.nextInt();
				w.setId(id);
				System.out.println("이름");
				String name = s.next();
				w.setName(name);
				System.out.println("부서");
				String dept = s.next();
				w.setDept(dept);
				System.out.println("주소");
				String addr = s.next();
				w.setAddr(addr);
				System.out.println("생일");
				String birth = s.next();
				w.setBirth(birth);
				break;
			case 2:
				System.out.println("검색하고자 하는 사원번호는?");
				int st = s.nextInt();// 123
				if (st == w.getId()) {
					System.out.println(w.getId());
					System.out.println(w.getName());
					System.out.println(w.getDept());
					System.out.println(w.getAddr());
					System.out.println(w.getBirth());

				}
				break;
			case 3:
				System.out.println("프로그램 종료");

			}
		}

	}

}