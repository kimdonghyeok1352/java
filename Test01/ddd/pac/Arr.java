package pac;

import java.util.Scanner;

public class Arr {
	PhoneNum ary[];
	int n;

	Arr(int n) {// �����ھȿ�
		ary = new PhoneNum[n];// �迭 �����ڵ�
		n = 0;
	}

	void add(PhoneNum p) {
		ary[n++] = p; // ģ�� �߰�
	}

	void friend(char ch) {
		Scanner s = new Scanner(System.in);
		System.out.print("�̸�");
		String name = s.next();
		System.out.println("��ȣ");
		String num = s.next();
		switch (ch) {
		case 'A':
			System.out.print("����");
			String major = s.next();
			add(new School(name, num, major));
			// �б� ģ���߰�
			break;
		case 'B':
			System.out.print("����");
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
