package month7;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/*
public class a20200720 {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(3);
		a.add(0);
		a.add(8);
		Iterator<Integer> i = a.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}

	}

}

class Box<T>{
	Box<T> next;
	T t;
	void in(T t) {
		this.t=t;
		
	}
	T out() {
		return t;
	}
}
public class a20200720 {

	public static void main(String[] args) {
		Box<Integer> b = new Box<Integer>();
		b.in(30);
		
		b.next=new Box<Integer>();
		
		b.next.in(40);//객체에 한번더 접근
		
		b.next.next = new Box<Integer>();
		b.next.next.in(50);
		
		Box<Integer> tmp;
		tmp = b.next;
		
		System.out.println(tmp.out());
	}

}


public class a20200720 {

	public static void main(String[] args) {
		List<String> ary =new  ArrayList<String>();
		LinkedList<String> li = new LinkedList<String>();
		
		long start;
		long end;
		start = System.nanoTime();
		for(int i=0;i<1000;i++) {
			ary.add(0,String.valueOf(i));
		}
		end=System.nanoTime();
		System.out.println(end-start);
		
		
	}

}
class Profile{
	String id;
	int age;
	Profile(String i, int a){
		id=i;
		age=a;
	}
	
}
public class a20200720 {

	public static void main(String[] args) {
		ArrayList<Profile> al = new ArrayList<Profile>();
		al.add(new Profile("aa",12));
		al.add(new Profile("bb",34));
		al.add(new Profile("cc",56));
		
		
		for(int i=0; i<al.size(); i++) {
			Profile p = al.get(i);
			System.out.println(p.age+ " "+ p.id);
		}
		
		
		
	}

}
class Rectangle{
	private int width;
	private int height;
	void aa(int width , int height) {
		this.height=height;
		this.width=width;
	}
	void show() {
		System.out.println(height*width);
	}
	
}
public class a20200720 {

	public static void main(String[] args) {
		Scanner n =new Scanner(System.in);
		Rectangle rec = new Rectangle();
		while(true) {
		try {
			System.out.println("높이와 너비 입력하세요");
			int w = n.nextInt();
			int h = n.nextInt();
			rec.aa(w, h);
		}catch(Exception e) {
			System.out.println("유효한 값입력");
			n.next();//남아있는 데이터 처리
			continue;
		}
		rec.show();
		}
	}

}

class Profile {

	String name, id;

	Profile(String name, String id) {

		this.name = name;
		this.id = id;

	}

	String getname() {
		return name;
	}

	String getid() {
		return id;
	}
	public String toString() {
		return name+" "+id;
	}

}

public class a20200720 {

	public static void main(String[] args) {
		ArrayList<Profile> p = new  ArrayList<Profile>();
		Scanner n = new Scanner(System.in);
		p.add(new Profile("흥민","123"));
		p.add(new Profile("현진","456"));
		
		for(int i = 0; i<p.size(); i++) {
			System.out.println(p);
		}
	}

}

public class a20200720 extends JFrame {
	a20200720() {
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(new JLabel("아이디"));
		JTextField jt1 = new JTextField(20);
		c.add(jt1);
		jt1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("아이디" + jt1.getText());

			}
		});
		c.add(new Label("비밀번호"));
		JPasswordField jp = new JPasswordField(10);
		jp.setEchoChar('*');
		c.add(jp);
		jp.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("비번" + jp.getText());

			}
		});
		setSize(500, 500);
		setVisible(true);
	}

	public static void main(String[] args) {
		new a20200720();
	}
}

public class a20200720 extends JFrame {
	 a20200720(){
		 Color c[]={Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.BLUE};

		 JButton j[]=new JButton[5];
		 for(int i=0; i<c.length;i++) {
		 j[i]=new JButton();
		 j[i].setBackground(c[i]);
		 this.add(j[i]);

		 }




		 setLayout(new GridLayout(1,5));
		 setSize(500,500);
		 setVisible(true);
	 }

	public static void main(String[] args) {
		new a20200720();
	}
}
public class a20200720  {
	

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int i =1; i<10; i++) {
		int n = (int)(Math.random()*100)+1;
		al.add(n);
		}
		Iterator<Integer> it = al.iterator();
		while(it.hasNext()) {
			int aaa = it.next();
			System.out.println(aaa);
		}
		
	}
}

class Th extends Thread {

	JLabel j;

	Th(JLabel j) {
		this.j = j;
	}

	public void run() {

		JFrame f = new JFrame();
		while (true) {
			try {
				sleep(1000);
				int i = 0;
				while (true) {

					String a = (Integer.toString(i));
					j.setText(a);
					i++;

				}

			} catch (Exception e) {
				System.out.println(e.getMessage());
				return;
			}
		}
	}
}

public class a20200720 extends JFrame {

	a20200720() {

		Container c = getContentPane();

		c.setLayout(new FlowLayout());

		JLabel j = new JLabel();

		c.add(j);

		Th t = new Th(j); // 쓰레드 객체 생성
		setSize(500, 500);
		setVisible(true);

		t.start();
	}

	public static void main(String[] args) {
		new a20200720();
	}
}
class Num{
	int a;
	Num(int a){
		this.a=a;
	}
	public String toString() {
		return a+""; //왜 ""쓰는거지
	}
}
public class a20200720 extends JFrame {


	public static void main(String[] args) {
		HashSet<Num> h = new HashSet<Num>();
		h.add(new Num(30));
		h.add(new Num(40));
		h.add(new Num(50));
		Iterator<Num> i =h.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
	}
}
class Stu1{
	String a;
	int b;
	Stu1(String a,int b){
		this.a=a;
		this.b=b;
		
	}
	public int hashCode() {
		return a.hashCode()+b;
	}
	public boolean equals(Object obj) {
		Stu1 s = (Stu1)obj;
		return s.a.equals(a)&&s.b==b;
	}
}
public class a20200720 {
	public static void main(String[] args) {
		Set<Stu1> s = new HashSet<Stu1>();
		s.add(new Stu1("유성",24));
		s.add(new Stu1("유강",22));
		s.add(new Stu1("유강",22));
		
		System.out.println(s.size());
	}
}

class  Pro implements Comparable<Pro>{

	String name;
	int id;
	Pro(String name, int id){
		this.name=name;
		this.id=id;
	}
	void show() {
		System.out.println(name+" "+id);
	}
	public int compareTo(Pro p) {
		if(id>p.id)
			return 1;
		else if(id<p.id)
			return -1;
		else  
			return 0;
	}
	public String toString() {
		return name+ " "+ id;
	}
}
public class a20200720 {
	public static void main(String[] args) {
		TreeSet<Pro> p = new TreeSet<Pro>();
		p.add(new Pro("손흥민",723));
		p.add(new Pro("박지성",456));
		Iterator<Pro> it = p.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
	}
}

public class a20200720 {
	public static void main(String[] args) {
		TreeSet<Integer> grade = new TreeSet<Integer>();
		grade.add(30);
		grade.add(100);
		grade.add(50);
		Integer i;
		i=grade.first();//최솟값뽑아내는 함수
		System.out.println(i);
		i=grade.last();//최고점 뽑아내는 함수
		System.out.println(i);
		i=grade.lower(new Integer(80));//80점보다 낮은점수
		System.out.println(i);
		i=grade.higher(80);//80점보다 높은 점수
		System.out.println(i);
		
		
	}
}
class Food {
	void show() {
		System.out.println("음식");
	}
}
class Pizza extends Food{
	void show() {
		super.show();
		System.out.println("피자");
	}
	
}
class Fo<T>{
	T t;
	void in(T t) {
		this.t=t;
	}
	T out() {
		return t;
	}
}
public class a20200720 {
	//<? extends Food> :Food와 그 상속받은 함수만 와라(클래스제한)
	static void pr(Fo<? extends Food>f) {
		Food fo=f.out();
		fo.show();
	}
	public static void main(String[] args) {
		Fo<Food> f = new Fo<Food>();
		Pizza p = new Pizza();
		f.in(p);
		pr(f);

	}
}

class My{
	String n;
	int y;
	My(String n,int y){
		this.n=n;
		this.y=y;
	}

public String toString() {
		return y+" " + n;
	}
}
public class a20200720 extends JFrame {
		a20200720(){
			Container c = getContentPane();
			c.setLayout(new FlowLayout());
			Vector<My> v = new Vector<My>();
			v.add(new My("손흥민",21));
			v.add(new My("지성팍",23));
			v.add(new My("김연아",29));
			JComboBox jc =new JComboBox(v);
			
			c.add(jc);
			setSize(500,500);
			setVisible(true);
		}
	public static void main(String[] args) {
		new a20200720();
	}
}
class Me{
	
	String str;
	Me(String str){
		this.str=str;
	}
	
	int a = str.length();
	
}

public class a20200720 extends JFrame {
		
	public static void main(String[] args) {
		TreeSet<Me> t = new TreeSet<Me>();
		t.add(new Me("슬기"));
		t.add(new Me("자바공부"));
		t.add(new Me("최윤혁"));	
		Iterator<Me> it = t.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}

public class a20200720 extends JFrame {
	a20200720() {
		Container c = getContentPane();
		JPanel j1 = new JPanel();
		JPanel j2 = new JPanel();
		JPanel j3 = new JPanel();

		j1.setBackground(Color.gray);
		j2.setLayout(new GridLayout(4, 4));
		j3.setBackground(Color.green);

		c.add(j1, BorderLayout.NORTH);
		c.add(j2);
		c.add(j3, BorderLayout.SOUTH);
		
		JLabel jl = new JLabel("입력");
		JTextField jf = new JTextField(10);
		j1.add(jl);
		j1.add(jf);
		
		JLabel jl2 = new JLabel("계산결과");
		JTextField jf2 = new JTextField(10);
		j3.add(jl2);
		j3.add(jf2);
		JButton b=new JButton();
		for(int i=0; i<16; i++) {
			
			String s[] = {"+","-","%","x","계산","CE"};
			j2.add(b);
			if(i<10) {
				b.setText(Integer.toString(i));
			}
			else {
				b.setText(s[i-10]);
				//정수 프레임에 부착
				//프레임에 부착
			}
		}
		for(int i=0; i<10; i++) {
			b.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					
					
				}
			});
		}
		setSize(500, 500);
		setVisible(true);
	}

	public static void main(String[] args) {
		new a20200720();
	}
}
*/
class Num {
	int n;

	Num(int n) {
		this.n = n;
	}

	int get() {
		return n;
	}
	
}


public class a20200720 {
	public static void main(String[] args) {
		Num num[] = new Num[]{new Num(3),new Num(5),new Num(7)};
		int sum=0;
		for(Num i:num) {
			sum+=i.get();
		}
		System.out.println(sum);
		
	}
}