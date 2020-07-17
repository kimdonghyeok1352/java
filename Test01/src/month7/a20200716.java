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
		jt.setText("�������");
		jt.append("�����Է�");
	}
}
public class a20200716 {

	public static void main(String[] args) {
		JFrame j = new JFrame();
		j.setLayout(new FlowLayout());
		
		JTextArea jt = new JTextArea(10,20);
		jt.append("�����Է�");
	
		
		jt.setLineWrap(true);
		//�ڵ� �ٹٲ� ���� ����
		JButton btn1 = new JButton("���� ��ư");
		btn1.addActionListener(new Text(jt));
			j.add(btn1);
			
			
		
		j.add(jt);
		
		j.setVisible(true);
	}

}


public class a20200716 extends JFrame{
	String s [] = {"���̾�","����ġ"};
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
					//�޺��ڽ��� ���õ� ������ �ε��� �˾Ƴ���
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
		while(s.hasMoreTokens()) {//��ȯ�� ��ū�� �����ִ°�
			sum += Integer.parseInt(s.nextToken());
			
		}
		System.out.println(sum);
	}

}

class MovieThread extends Thread {
	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.println("��ȭ�� ����մϴ�.");
		}
	}
}

class MusicThread implements Runnable {
	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.println("������ ����մϴ�.");
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
		if(b%3==0) {System.out.print("¦");}
		if(c%3==0) {System.out.print("¦");}
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
				System.out.println("Ȯ��");
				
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
		JLabel j1 = new JLabel("�ȳ�");
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
				j.setText("�ȳ�");

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
		System.out.println(a + "��" + " " + b + "��");
	}
}

public class a20200716 {
	public static void main(String[] args) {
		Book b1 = new Book("�ڹ�");

		b1.title(); // �ڹٴ� 40000��

		Book b2 = new Book("���̽�", 30000);

		b2.title(); // ���̽� 30000��
	}
}


public class a20200716 extends JFrame {
	a20200716() {

		setVisible(true);
		Th t = new Th(); // Thread Ŭ������ ��ӹ���
		t.start();
	}

	class Th extends Thread {
		public void run() {
			
				Container c = getContentPane();
				c.setBackground(Color.black);
				try {
					sleep(3000);// 10��
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
	JLabel j = new JLabel("���ڿ�");
	a20200716(){
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(j);
		setVisible(true);
		c.addKeyListener(new Key());
		c.requestFocus();//����Ʈ�ҿ� ��Ŀ�� ����
						 //Ű�Է°����ϵ���
		setVisible(true);
	}
	class Key extends KeyAdapter{
		public void keyPressed(KeyEvent e) {
			int a = (int)(Math.random()*256);
			int b = (int)(Math.random()*256);
			int c = (int)(Math.random()*256);
			switch(e.getKeyChar()) {
			//�Էµ� �ϳ��� ���� ����
			case '\n':
				j.setText(a+ " "+ b + " " + c);
				getContentPane().setBackground(new Color(a,b,c));
				break;
			case 'p':
				System.exit(0);//���α׷� ����
			}
		}
	}
public static void main(String[] args) {
		new a20200716();
	}
}

public class a20200716 extends JFrame{
	
	a20200716(){
		setTitle("���̾�α�");
		Container c = getContentPane();
		c.add(new Dia(),BorderLayout.NORTH);
		setVisible(true);
	}
	class Dia extends Panel{
		JButton btn1 = new JButton("�̸��Է�");
		JTextField  j1 = new JTextField(10);
		JButton btn2 = new JButton("Ȯ��");
		JButton btn3 = new JButton("�޽���");
		
		Dia(){
			setBackground(Color.green);
			add(btn1);
			add(btn2);
			add(btn3);
			add(j1);
			btn1.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					String name = JOptionPane.showInputDialog("�̸��Է�");
					if(name!=null) { //�̸��� �Է��ߴٴ� �ǹ�
						j1.setText(name);
					}
					
				}
			});
			btn2.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					int r  = JOptionPane.showConfirmDialog(null,"��� �ϳ���?","Ȯ��",JOptionPane.YES_NO_CANCEL_OPTION);
					if(r==JOptionPane.CLOSED_OPTION) {
						j1.setText("���þ��ߴ�");
					}
					else if (r==JOptionPane.YES_NO_CANCEL_OPTION) {
						j1.setText("��");
					}
				}
			});
			btn3.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(null,"���","�޽���",JOptionPane.ERROR_MESSAGE);
					
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
		//�迭 10�� ����
	}
	void push(T t) {
		if(i==10) {//�ε����� �� ã���� 
			return;//����
		}
		ary[i] = t;
		i++;
	}
	T pop() {
		if(i==0) {//������ ����־� ������ ���� ����
			return null;
		}
		i--;
		return (T)ary[i];
	}
}
public class a20200716 {
	

	public static void main(String[] args) {
		
		St<String> s = new St<String>();
		s.push("����");
		s.push("cccn");
		s.push("12313");
		for(int i = 0; i< 3; i++) {
			System.out.println(s.pop());
		}
	}

}
