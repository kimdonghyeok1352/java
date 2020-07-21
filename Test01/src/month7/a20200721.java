package month7;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.beans.PropertyChangeListener;
import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.Vector;

import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;

/*
public class a20200721 {

	public static void main(String[] args) throws IOException {
		InputStream i =null;
		OutputStream o = null;
		byte[] b = {3,5,7,9};
		byte[] c= null;
		i = new ByteArrayInputStream(b);	
		o=new FileOutputStream("a.txt");
		int r =-1;
		while((r=i.read())!=-1) {
			o.write(r);
		}
		
	}

}

public class a20200721 {

	public static void main(String[] args) {
		HashMap<Integer, String> h = new HashMap<Integer, String>();
		h.put(1, "자동차");
		h.put(2, "비행기");
		h.put(3, "기차");
		Scanner n = new Scanner(System.in);
		int a = n.nextInt();
		switch (a) {
		case 1:
			System.out.println(h.get(1));
			break;
		case 2:
			System.out.println(h.get(2));
			break;
		case 3:
			System.out.println(h.get(3));
			break;
		default:
			System.out.println("문자없음");

		}
	}

}

public class a20200721 extends JFrame {
		a20200721(){
			Container c= getContentPane();
			c.setLayout(new FlowLayout());
			ImageIcon i1 = new ImageIcon("C:/Users/soldesk/Desktop/aa.jpg");
			JLabel l1 = new JLabel(i1);
			c.add(l1);
			setSize(500,500);
			setVisible(true);
			
		}
	public static void main(String[] args) {
		new a20200721();
	}
}
class Person {
	private String name;
	private int id;

	Person(String n, int i) {
		name = n;
		id = i;
	}

	String getname() {
		return name;
	}

	int getid() {
		return id;
	}

	public boolean equals(Object obj) {
		// Person객체
		Person p = (Person) obj;
		if ((p.getid() == this.id) && (p.getname().equals(this.name))) {
			return true;
		}
		return false;
	}
}

class Game {
	Scanner s = new Scanner(System.in);
	// Person클래스 vector
	Vector<Person> v = new Vector<Person>(5);

	Game() { // 초기화 과정
		v.add(new Person("동혁", 123));
		v.add(new Person("주희", 456));
		v.add(new Person("승철", 789));
		v.add(new Person("원영", 112));
	}

	void in() {
		while (true) {
			System.out.println("이름,id입력");
			// 이름 = stop
			String name = s.next();
			if (name.equals("stop")) {
				break;
			}
			int id = s.nextInt();
			Person pp = new Person(name, id);

			if (v.contains(pp)) {
				System.out.println(pp.getname() + "은 이미 있다");
			} else
				v.add(pp);
		}
	} // 벡터에 값을 저장함

	void out() {
		while (true) {
			Random r = new Random();
			int n = r.nextInt(v.size());
			Person p = v.get(n);
			String str = p.getname();

			System.out.println(str + "id는?");
			int id = p.getid();
			Scanner s = new Scanner(System.in);
			int i = s.nextInt();
			if (i == -1) {
				break;
			}
			if (i == p.getid()) {
				System.out.println("정답");
			} else
				System.out.println("정답아님");
		}
	}

	void end() {
		System.out.println("종료");
		System.exit(0); // 프로그램 종료
	}
}

public class a20200721 {
	public static void main(String[] args) {

		Game g = new Game();
		Scanner s = new Scanner(System.in);
		while (true) {
			System.out.println("1,2,3");
			// 1: 입력 (in함수)
			// 2: out함수
			// 3. end
			int select = s.nextInt();
			switch (select) {
			case 1:
				g.in();
				break;
			case 2:
				g.out();
				break;
			case 3:
				g.end();
				break;
			}
		}

	}
}

public class a20200721 {
	public static void main(String[] args) {
		Set<Integer> s = new HashSet<Integer>() ;
		s.add(3);
		s.add(100);
		s.add(3);
		Iterator<Integer> it = s.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		
		}
	
	}
}
	

public class a20200721 {
	public static void main(String[] args) {
		LinkedList<String> l = new LinkedList<String>();
		l.add("one");
		l.add("two");
		l.add("three");	
		
		Iterator<String> it = l.iterator();
		
		while(it.hasNext()) {
			String str = it.next();
			if(str.compareTo("three")==0) {
				it.remove();
			}
			
		}
		it = l.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}

public class a20200721 {
	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer,String>();
		hm.put(1, "one");
		hm.put(2, "two");
		hm.put(3, "three");
		Set<Integer> keys = hm.keySet();
		Iterator<Integer> it = keys.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		Scanner n = new Scanner(System.in);
		int a = n.nextInt();
		switch (a){
		case 1:
			System.out.println(hm.get(1));
			break;
		case 2:
			System.out.println(hm.get(2));
			break;
		}
	}
}

public class a20200721 extends JFrame {
	a20200721() {
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JMenuBar jm = new JMenuBar();
		JMenu lm = new JMenu("메뉴");

		JMenuItem ji1 = new JMenuItem("load");
		JMenuItem ji2 = new JMenuItem("hide");
		JMenuItem ji3 = new JMenuItem("exit");
		jm.add(lm);
		lm.add(ji1);
		lm.add(ji2);
		lm.add(ji3);
		
		ImageIcon im = null;
		JLabel jl = new JLabel(im);

		ji1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				jl.setIcon(new ImageIcon("C://Users//soldesk//Desktop/aa.jpg"));

			}
		});
		ji2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				jl.setVisible(false);
			}
		});
		ji3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);

			}
		});
		setJMenuBar(jm);
		c.add(jm);
		c.add(jl);
		setSize(500, 500);
		setVisible(true);
	}

	public static void main(String[] args) {
		new a20200721();
	}
}

class Person{
	int num;
	String name;
	Person(int num, String name){
		this.num=num;
		this.name=name;
	}
	public int hashCode() {
		return num;
	}
	public boolean equlas(Object obj) {
		Person p = (Person)obj;
		return num == p.num;
	}
}
public class a20200721 {

	public static void main(String[] args) {
		Set<Person> s=new HashSet<Person>();

		s.add(new Person(12, "홍길동"));

		s.add(new Person(23, "김길동"));

		s.add(new Person(12, "이길동"));

		Iterator<Person> it=s.iterator();

		while(it.hasNext()){

		 Person p=it.next();

		 System.out.println(p.num + "" + p.name);

		}
	}
}

public class a20200721 {
	static int add(int a[], int b) {

		int sum = 0;
		for (int i = 0; i < b; i++) {
			sum += a[i];
		}
		return sum;
	}

	static int add(int a[], int b, int c[]) {

		int sum = 0;
		for (int i = 0; i < b; i++) {
			sum += a[i];
		}
		for (int i = 0; i < b; i++) {
			sum += c[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5 };

		int b[] = { 6, 7, 8, 9, 10 };

		int c = add(a, 5);

		int d = add(a, 5, b);

		System.out.println(c);

		System.out.println(d);
	}
}
class Go extends Thread{
	int a;
	Go(int a){
		this.a=a;
	}
	public void run() {
		try {
		for(int i=0; i<5; i++) {
			System.out.println(a);
			
				sleep(1000);
		}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
}
public class a20200721 {
	public static void main(String[] args) {
		Go g = new Go(5);
		g.start();	
		
	}
}

public class a20200721 extends JFrame {
	a20200721() {
		Container c = getContentPane();
		c.setLayout(new GridLayout(4, 3));

		for (int i = 0; i < 12; i++) {
			 int r=(int)(Math.random()*256);

			 int g=(int)(Math.random()*256);

			 int b=(int)(Math.random()*256);
			JLabel jl = new JLabel("go");
			c.add(jl);
			jl.addMouseListener(new MouseListener() {
				
				@Override
				public void mouseReleased(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mousePressed(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mouseExited(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mouseEntered(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mouseClicked(MouseEvent e) {
					c.setBackground(new Color(r,g,b));
					
				}
			});
			
		}
		
		c.setBackground(Color.white);
		setSize(500, 500);
		setVisible(true);
	}

	public static void main(String[] args) {
		new a20200721();
	}
}

public class a20200721 {

	public static void main(String[] args) {
		// IP주소 얻어냄

		try {
			InetAddress i = InetAddress.getLocalHost();
			System.out.println("IP" + i.getHostAddress());
			InetAddress ary[] = InetAddress.getAllByName("www.daum.net");
			for (InetAddress a : ary) {
				System.out.println(a.getHostAddress());
			}
		} catch (Exception e) {
		}
		;
	}
}
*/
public class a20200721 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(20, 20);
		f.setLayout(null);

		class key implements KeyListener {

			public void keyPressed(KeyEvent e) {

				Point p = f.getLocation();

				if (e.getKeyCode() == 37)
					f.setLocation(p.x - 300, p.y);
				if (e.getKeyCode() == 38)
					f.setLocation(p.x, p.y - 20);
				if (e.getKeyCode() == 39)
					f.setLocation(p.x + 20, p.y);
				if (e.getKeyCode() == 40)
					f.setLocation(p.x, p.y + 20);
			}

			public void keyReleased(KeyEvent e) {
			}

			public void keyTyped(KeyEvent e) {
			}

		}

		f.setVisible(true);
		f.addKeyListener(new key());
		f.setFocusable(true);
	}
}
