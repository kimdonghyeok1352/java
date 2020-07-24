package month7;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/*
class Person {
	String str;
	int a;

	Person(String str, int a) {
		this.str = str;
		this.a = a;
	}
}

public class a0723 {

	public static void main(String[] args) {
		Person p[] = new Person[3];
		Scanner n = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {
			String s = n.next();
			int a = n.nextInt();
			p[i] = new Person(s, a);
			System.out.println("이름 id입력:" + s + a);
		}

		for (int i = 0; i < 3; i++) {
			System.out.println("이름뭐니");
			String d = n.next();
			switch (d) {
			case "홍길동":
				System.out.println("답 111");
				break;
			case "최길동":
				System.out.println("이름없다");
				break;
			case "stop":
				break;
			}
		}

	}

}

interface In{
	int big(int a, int b) ;
		default void pr() {
			System.out.println("인터페이스");
	}
}
class Ini implements In{

	 public int big(int a, int b) {
		
		
		if(a<b) {
			return b;
		}
		
		return a;
		
	}
}
public class a0723 {

	public static void main(String[] args) {
		In in = new Ini();
		System.out.println(in.big(15, 78));
		in.pr();
		
	}
}
	

public class a0723 {

	public static void main(String[] args) {
		HashMap<String, Integer> h = new HashMap<String,Integer>();
		h.put("아메리카노", 4500);
		h.put("딸기스무디", 8000);
		h.put("카라멜 마끼아또", 5300);
		Set<String> key = h.keySet();
		Scanner n = new Scanner(System.in);
		while(true) {
			System.out.println("음료선택");
			String s = n.next();
			int sum=0;
			switch(key) {
			case "아메리카노":
				sum+=h.get(0);
				break;
			case "딸기스무디":
				sum+=h.get(1);
				break;
			case "카라멜마끼아또":
				sum+=h.get(2);
			
			}
			System.out.println(sum);
		}
		
	}
}
*/
class Stu1 implements Comparable<Stu1> {

	String name;
	int grade;

	Stu1(String name, int grade) {
		this.name = name;
		this.grade = grade;
	}

	void show() {
		System.out.println(name + " " + grade);
	}

	public int compareTo(Stu1 t) {
		if (grade > t.grade)
			return 1;
		else if (grade < t.grade)
			return -1;
		else
			return 0;
	}

	public String toString() {
		return name + " " + grade;
	}
}

public class a0723 {
	public static void main(String[] args) {
		TreeSet<Stu1> t = new TreeSet<Stu1>();
		t.add(new Stu1("미미", 96));
		t.add(new Stu1("두두", 100));
		t.add(new Stu1("히히", 50));
		Iterator<Stu1> it = t.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
