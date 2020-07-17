package month7;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Desktop.Action;
import java.awt.FlowLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.ContainerEvent;
import java.awt.event.ContainerListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Scanner;
import java.util.StringTokenizer;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/*
class Text implements ActionListener{
	JTextArea jt;
	Text(JTextArea jt){
		this.jt=jt;
	}
	public void actionPerformed(ActionEvent e) {
		jt.setText("삭제됬다");
		jt.append("내용입력");
	}
}
public class a20200716 {

	public static void main(String[] args) {
		JFrame j = new JFrame();
		j.setLayout(new FlowLayout());
		
		JTextArea jt = new JTextArea(10,20);
		jt.append("내용입력");
	
		
		jt.setLineWrap(true);
		//자동 줄바꿈 여부 설정
		JButton btn1 = new JButton("삭제 버튼");
		btn1.addActionListener(new Text(jt));
			j.add(btn1);
			
			
		
		j.add(jt);
		
		j.setVisible(true);
	}

}


public class a20200716 extends JFrame{
	String s [] = {"라이언","어피치"};
	ImageIcon im [] = {new ImageIcon("C:/Users/soldesk/Desktop/aa.jpg"),
			new ImageIcon("C://Users//soldesk//Desktop/bb.jpg") 
	};
	JLabel j = new JLabel(im[0]);
	a20200716(){
			Container c = getContentPane();
			c.setLayout(new FlowLayout());
			JComboBox com = new JComboBox(s);
			
			c.add(com);
			c.add(j);
			com.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					JComboBox c = (JComboBox)e.getSource();
					int i = c.getSelectedIndex();
					//콤보박스의 선택된 아이템 인덱스 알아내기
					j.setIcon(im[i]);
				}
			});
			setVisible(true);
	}
	public static void main(String[] args) {
		new a20200716();
	}

}

public class a20200716 {
	
	public static void main(String[] args) {
		String p = "1+2+3+4+5";
		StringTokenizer s = new StringTokenizer(p,"+");
		int sum = 0;
		while(s.hasMoreTokens()) {//반환할 토큰이 남아있는가
			sum += Integer.parseInt(s.nextToken());
			
		}
		System.out.println(sum);
	}

}

class MovieThread extends Thread {
	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.println("영화를 재생합니다.");
		}
	}
}

class MusicThread implements Runnable {
	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.println("음악을 재생합니다.");
		}
	}
}

public class a20200716 {
	public static void main(String[] args) {

		Thread th1 = new MovieThread();
		Thread th2 = new Thread(new MusicThread());
		th1.start();
		th2.start();

		
		

	}
}

public class a20200716 {
	public static void main(String[] args) {
		int a = (int) (Math.random() * 100) + 1;
		int b = a % 10, c = a / 10;
		if(b%3==0) {System.out.print("짝");}
		if(c%3==0) {System.out.print("짝");}
			System.out.println(a);
		
		
	}
}

public class a20200716 extends JFrame{
	a20200716(){
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn1 = new JButton("ok");
		JButton btn2 = new JButton("cancel");
		btn1.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				btn1.setBackground(Color.red);
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				System.out.println("확인");
				
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
				// TODO Auto-generated method stub
				
			}
		});
		btn2.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				btn2.setEnabled(false);
				
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
				// TODO Auto-generated method stub
				
			}
		});
		c.add(btn1);
		c.add(btn2);
		setSize(250,250);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new a20200716();
	}
}

public class a20200716 extends JFrame {
	a20200716(){
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JRadioButton jr1 = new JRadioButton("magenta");
		JRadioButton jr2 = new JRadioButton("red");
		c.add(jr1);
		c.add(jr2);
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(jr1);
		bg.add(jr2);
		
		jr1.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				jr1.setBackground(Color.magenta);
				
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
				// TODO Auto-generated method stub
				
			}
		});
		jr2.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				jr2.setBackground(Color.red);
				
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
				// TODO Auto-generated method stub
				
			}
		});
		setSize(500,500);
		setVisible(true);
	}
	public static void main(String[] args) {
		new a20200716();
	}

}

public class a20200716 extends JFrame {
	a20200716(){
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JLabel j1 = new JLabel("안녕");
		j1.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				j1.add
				
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
				// TODO Auto-generated method stub
				
			}
		});
			
			
			
			
			
		setSize(500,500);
		setVisible(true);
	}
	public static void main(String[] args) {
		new a20200716();
	}
}

public class a20200716 extends JFrame {

	public a20200716() {

		JLabel j = new JLabel("Hi");

		this.add(j);
		j.addMouseListener(new MouseListener() {

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
				j.setText("안녕");

			}
		});
		this.setLayout(new FlowLayout());

		this.setSize(500, 500);
		setVisible(true);

	}

	public static void main(String[] args) {
// TODO Auto-generated method stub

		new a20200716();

	}

}

class Book {
	String a;
	int b;

	Book(String a) {
		this.a=a;
		this.b=50000;
	}

	Book(String a, int b) {
		this.a = a;
		this.b = b;
	}

	void title() {
		System.out.println(a + "는" + " " + b + "원");
	}
}

public class a20200716 {
	public static void main(String[] args) {
		Book b1 = new Book("자바");

		b1.title(); // 자바는 40000원

		Book b2 = new Book("파이썬", 30000);

		b2.title(); // 파이썬 30000원
	}
}


public class a20200716 extends JFrame {
	a20200716() {

		setVisible(true);
		Th t = new Th(); // Thread 클래스를 상속받음
		t.start();
	}

	class Th extends Thread {
		public void run() {
			
				Container c = getContentPane();
				c.setBackground(Color.black);
				try {
					sleep(3000);// 10초
				} catch (Exception e) {
					return;
				}
				c.setBackground(Color.CYAN);
			
		}
	}

	public static void main(String[] args) {
		new a20200716();
	}
}

public class a20200716 extends JFrame{
	JLabel j = new JLabel("문자열");
	a20200716(){
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(j);
		setVisible(true);
		c.addKeyListener(new Key());
		c.requestFocus();//컨텐트팬에 포커스 설정
						 //키입력가능하도록
		setVisible(true);
	}
	class Key extends KeyAdapter{
		public void keyPressed(KeyEvent e) {
			int a = (int)(Math.random()*256);
			int b = (int)(Math.random()*256);
			int c = (int)(Math.random()*256);
			switch(e.getKeyChar()) {
			//입력된 하나의 문자 얻어내기
			case '\n':
				j.setText(a+ " "+ b + " " + c);
				getContentPane().setBackground(new Color(a,b,c));
				break;
			case 'p':
				System.exit(0);//프로그램 종료
			}
		}
	}
public static void main(String[] args) {
		new a20200716();
	}
}

public class a20200716 extends JFrame{
	
	a20200716(){
		setTitle("다이얼로그");
		Container c = getContentPane();
		c.add(new Dia(),BorderLayout.NORTH);
		setVisible(true);
	}
	class Dia extends Panel{
		JButton btn1 = new JButton("이름입력");
		JTextField  j1 = new JTextField(10);
		JButton btn2 = new JButton("확인");
		JButton btn3 = new JButton("메시지");
		
		Dia(){
			setBackground(Color.green);
			add(btn1);
			add(btn2);
			add(btn3);
			add(j1);
			btn1.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					String name = JOptionPane.showInputDialog("이름입력");
					if(name!=null) { //이름을 입력했다는 의미
						j1.setText(name);
					}
					
				}
			});
			btn2.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					int r  = JOptionPane.showConfirmDialog(null,"계속 하나요?","확인",JOptionPane.YES_NO_CANCEL_OPTION);
					if(r==JOptionPane.CLOSED_OPTION) {
						j1.setText("선택안했다");
					}
					else if (r==JOptionPane.YES_NO_CANCEL_OPTION) {
						j1.setText("네");
					}
				}
			});
			btn3.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(null,"경고","메시지",JOptionPane.ERROR_MESSAGE);
					
				}
			});
		}
	}
public static void main(String[] args) {
		new a20200716();
	}
}*/

class St<T>{
	int i;
	Object ary[];
	St(){
		i=0;
		ary = new Object[10];
		//배열 10개 생성
	}
	void push(T t) {
		if(i==10) {//인덱스가 다 찾으면 
			return;//종료
		}
		ary[i] = t;
		i++;
	}
	T pop() {
		if(i==0) {//스택이 비어있어 삭제할 값이 없다
			return null;
		}
		i--;
		return (T)ary[i];
	}
}
public class a20200716 {
	

	public static void main(String[] args) {
		
		St<String> s = new St<String>();
		s.push("낚시");
		s.push("cccn");
		s.push("12313");
		for(int i = 0; i< 3; i++) {
			System.out.println(s.pop());
		}
	}

}
