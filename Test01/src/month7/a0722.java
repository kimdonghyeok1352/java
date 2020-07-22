package month7;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import com.sun.source.tree.SynchronizedTree;

/*
public class a0722 {

	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		char c = n.next().charAt(0);
		int a = n.nextInt();
		int b = n.nextInt();
		switch (c){
		case '+':
			System.out.println(a+b);
			break;
		case '-':
			System.out.println(a-b);
			break;
		}

	}

}

public class a0722 {

	public static void main(String[] args) {
		InputStreamReader r = new InputStreamReader(System.in);
		FileWriter f = null;
		int i;
		try {
			f=new FileWriter("ab.txt");
			while((i=r.read())!=-1) {
				f.write(i);
			}
			r.close();
			f.close();
		}catch(Exception e) {}
	}
}


public class a0722 extends JFrame {
		a0722(){
			Container c = getContentPane();
			c.setLayout(new FlowLayout());
			JButton btn1 = new JButton("사라짐");
			JButton btn2 = new JButton("위치값");
			JTextField jt1 = new JTextField(20);
			btn1.addMouseListener(new MouseListener() {
				
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
					btn1.setVisible(false);
					
				}
			});
			btn2.addMouseListener(new MouseListener() {
				
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
					System.out.println(getX()+getY());
					
				}
			});
			c.add(jt1);
			c.add(btn1);
			c.add(btn2);
			setSize(500,500);
			setVisible(true);
		}
	public static void main(String[] args) {
		new a0722();
	}
}
public class a0722   {
	

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("가");
		al.add("나다");
		al.add("라마바");
		int max=0;
		for(int i =0; i<al.size(); i++) {
			if(al.get(i).length()>max) {
				max = al.get(i).length();
			}
			
		}
		System.out.println(max);
	}
}

public class a0722 extends JFrame {
	JLabel jl1 = new JLabel("계산출력");
	JButton btn1 = new JButton("cal");

	a0722() {
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		btn1.addMouseListener(new MouseListener() {

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
				Aa a = new Aa();
				a.setVisible(true);

			}
		});

		c.add(btn1);
		c.add(jl1);
		setSize(500, 500);
		setVisible(true);
	}

	class Aa extends JDialog {
		JTextField f1 = new JTextField(15);
		JTextField f2 = new JTextField(15);
		JButton btn2 = new JButton("ADD");

		Aa() {
			setLayout(new FlowLayout());
			add(new JLabel("두수를 더합니다"));
			add(f1);
			add(f2);
			add(btn2);
			setSize(300, 300);

			btn2.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					setVisible(false);// 다이어로그창은 종료됨
					int sum = Integer.valueOf(f1.getText()) + Integer.valueOf(f2.getText());
					jl1.setText(Integer.toString(sum));
				}
			});

		}

	}

	public static void main(String[] args) {
		new a0722();
	}

}

class Number {

	int a;
	double b;

	static void pr(int a) {
		System.out.println(a);
	}

	void show(double b) {
		this.b = b;
		System.out.println(b);
	}
}

public class a0722 {

	public static void main(String[] args) {
		Number.pr(100);

		Number n = new Number();

		n.show(3.14);
	}
}

public class a0722 extends JFrame {
	static double a = (int) (Math.random() * 50) + 1;
	a0722() {
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn1 = new JButton("+5");
		JButton btn2 = new JButton("-5");
		JButton btn3 = new JButton("/5");
		
		JTextField jf = new JTextField(30);
		jf.setText(String.valueOf(a));
		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				jf.setText(String.valueOf(a+5));
				a=a+5;
			}
		});
		btn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				jf.setText(String.valueOf(a + -5));
				a=a-5;
			}
		});
		btn3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				jf.setText(String.valueOf(a / 5));
				a=a/5;
			}
		});

		c.add(btn1);
		c.add(btn2);
		c.add(btn3);
		c.add(jf);
		setSize(500, 500);
		setVisible(true);
	}

	public static void main(String[] args) {
		new a0722();
	}
}
public class a0722 {
	public static void main(String[] args) {
		Map<Integer, Double> m = new HashMap<Integer,Double>();
		m.put(2, 3.5);
		m.put(3, 5.5);
		m.put(4, 6.5);
		Set<Map.Entry<Integer, Double>> s = m.entrySet();
		for(Map.Entry<Integer, Double> m1: s) {//for-each구문
			System.out.println(m1.getValue());
			System.out.println(m1.getKey());
		}
	}
}
Comparable => compareTo()
Comparator => compare()
class Stu1 implements Comparable<Stu1>{
	
	String name;
	int grade;
	Stu1(String name, int grade){
		this.name=name;
		this.grade=grade;
	}
	
	public int compareTo(Stu1 t) {
		if(grade>t.grade)
			return 1;
		else if(grade<t.grade)
			return -1;
		else  
			return 0;
	}
	public String toString() {
		return name+ "   "+ grade;
	}
}
public class a0722 {
	public static void main(String[] args) {
		TreeSet<Stu1> t = new TreeSet<Stu1>();
		t.add(new Stu1("미미",96));
		t.add(new Stu1("두두",100));
		t.add(new Stu1("히히",50));
		Iterator<Stu1> it = t.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	
}

public class a0722 {
	public static void main(String[] args) {
		HashMap<String, Integer> h = new HashMap<String, Integer>();
		h.put("수", 95);
		h.put("우", 90);
		h.put("미", 85);
		Set s = h.entrySet();
		Iterator it = s.iterator();
		while(it.hasNext()) {
			Map.Entry e = (Map.Entry)it.next();
			System.out.println("이름: " +e.getKey() +", 점수 : "+e.getValue());


		}

		
		
	}
}

class Coffe {
	int price;
	int num;


	Coffe(int p, int n) {
		price = p;
		num = n;
	}

	int total() {
		return price*num;
	}
}
public class a0722 {
	public static void main(String[] args) {
		Coffe c[] = new Coffe[3];
		int a[] = {300,500,400};
		int b[] = {1,2,3};
		int sum=0;
		for(int i=0; i<3; i++) {
			c[i] = new Coffe(a[i],b[i]);
			sum+=c[i].total();
		}
		System.out.println(sum);
	}
}


class Sh {

	private int num = 0;

	synchronized public void add() {

		int n = num;

		Thread.yield();

		n += 10;

		num = n;

		System.out.println(num);

	}

}

class Student extends Thread {
	String n;
	Sh s;

	Student(String n, Sh s) {
		this.n = n;
		this.s = s;
	}

	public void run() {

		int sum = 0;
		try {
			while (true) {
				s.add();
				sleep(1000);
			}
		} catch (Exception e) {
		}
		;
	}
}

public class a0722 {
	public static void main(String[] args) {
		Sh sh = new Sh();

		Student th1 = new Student("jack", sh);

		Student th2 = new Student("tom", sh);

		th1.start();

		th2.start();
	}
}

public class a0722 {
	public static void main(String[] args) throws IOException {
		BufferedWriter out = null;
		BufferedReader in = null;

		ServerSocket ser = null;
		Socket so = null; // 서버쪽에서 필요한 객체들

		Scanner s = new Scanner(System.in);
		try {
			ser = new ServerSocket(9999);
		} catch (Exception e) {
		}
		System.out.println("연결 기다리고있다");
		// 클라이언트가 연결요청이 올때까지 기다린다.
		try {
			so = ser.accept(); // 연결 수락
		} catch (Exception e) {
		}

		System.out.println("기다린다..");
		// 서버쪽에서 클라이언트한테 메시지 보낸다.
		try {
			out = new BufferedWriter(new OutputStreamWriter(so.getOutputStream()));
			in = new BufferedReader(new InputStreamReader(so.getInputStream()));

			while (true) {
				String msg = in.readLine();
				if (msg.equals("stop")) {
					System.out.println("종료");
					break;
				}
				System.out.println("보내기: ");
				String outmsg = s.nextLine();
				out.write(outmsg + "\n");
				out.flush();
				// 현재 버퍼에 저장되어있는 내용을
				// 클라이언트한테 전송하고
				// 버퍼를 비운다.
			}
		} catch (Exception e) {

		} finally {
			try {
				s.close();
				so.close();
				ser.close();
			} catch (Exception e) {
				System.out.println("오류 발생");
			}
		}
	}
}
*/
public class a0722 {
	public static void main(String[] args)  {
		String p = "가 나 다 라";
		StringTokenizer s = new StringTokenizer(p," ");
		System.out.println("개수:"+s.countTokens());
		
	}
}
	
