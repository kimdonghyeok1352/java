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
			System.out.println("�̸� id�Է�:" + s + a);
		}

		for (int i = 0; i < 3; i++) {
			System.out.println("�̸�����");
			String d = n.next();
			switch (d) {
			case "ȫ�浿":
				System.out.println("�� 111");
				break;
			case "�ֱ浿":
				System.out.println("�̸�����");
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
			System.out.println("�������̽�");
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
		h.put("�Ƹ޸�ī��", 4500);
		h.put("���⽺����", 8000);
		h.put("ī��� �����ƶ�", 5300);
		Set<String> key = h.keySet();
		Scanner n = new Scanner(System.in);
		while(true) {
			System.out.println("���ἱ��");
			String s = n.next();
			int sum=0;
			switch(key) {
			case "�Ƹ޸�ī��":
				sum+=h.get(0);
				break;
			case "���⽺����":
				sum+=h.get(1);
				break;
			case "ī��Ḷ���ƶ�":
				sum+=h.get(2);
			
			}
			System.out.println(sum);
		}
		
	}
}
*/	
public class a0723 {
	public static void main(String[] args) {
		Map<Integer, Double> m = new HashMap<Integer,Double>();
		m.put(2, 3.5);
		m.put(3, 5.5);
		m.put(4, 6.5);
		Set<Map.Entry<Integer, Double>> s = m.entrySet();
		for(Map.Entry<Integer, Double> m1: s) {//for-each����
			System.out.println(m1.getValue());
			System.out.println(m1.getKey());
		}
	}
}
	