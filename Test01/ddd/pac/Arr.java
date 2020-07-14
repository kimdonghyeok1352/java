package pac;

import java.util.Scanner;

public class Arr {
	PhoneNum ary[];
	int n;

	Arr(int n) {// 생성자안에
		ary = new PhoneNum[n];// 배열 생성코드
		n = 0;
	}

	void add(PhoneNum p) {
		ary[n++] = p; // 친구 추가
	}

	void friend(char ch) {
		Scanner s = new Scanner(System.in);
		System.out.print("이름");
		String name = s.next();
		System.out.println("번호");
		String num = s.next();
		switch (ch) {
		case 'A':
			System.out.print("전공");
			String major = s.next();
			add(new School(name, num, major));
			// 학교 친구추가
			break;
		case 'B':
			System.out.print("직급");
			String grade = s.next();
			add(new Worker(name, num, grade));
			break;
		}
	}

	void all() {
		for (int i = 0; i < n; i++) {
			ary[i].show();
		}
	}
}
