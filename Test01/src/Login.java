import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.event.MouseInputAdapter;

class Login extends JDialog{
		private static final int SCREEN_WIDTH = 0;
		private static final int SCREEN_HEIGHT = 0;
		JLabel j=new JLabel("로그인");
		JLabel j1=new JLabel("아이디");
		JLabel j2=new JLabel("비밀번호");
		JButton j3=new JButton("로그인");
		JLabel jb=new JLabel("회원가입");
		JTextField jtf=new JTextField(15);
		JTextField jtf2=new JTextField(15);		
		Login(){
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, Login.SCREEN_WIDTH, Login.SCREEN_HEIGHT);
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setLayout(null);//바꿈
		 
		 //jtf.setBorder(border)
		 add(j);
		 j.setForeground(Color.black);
		 j.setFont(new Font("굴림",Font.BOLD , 23));
		 j.setBounds(185,10, 491, 80);
	     add(j1);
		 j1.setForeground(Color.black);
		 j1.setFont(new Font("굴림",Font.BOLD , 23));
		 j1.setBounds(55, 125, 491, 80);
		 add(jtf);
		 jtf.setBounds(165, 145, 150, 40);
		 add(j2);
		 j2.setFont(new Font("굴림",Font.BOLD , 23));
		 j2.setBounds(55, 225, 491, 80);
		 add(jtf2);
		 jtf2.setBounds(165, 245, 150, 40);
		 add(j3);
		 j3.setFont(new Font("굴림", Font.PLAIN, 26));
	     j3.setBounds(350, 180, 118, 70);
	     contentPane.add(j3);
	     j3.setSize(120,100);
		 add(jb);
		 String id="양용석";
		 String pw="1234";
		 setVisible(true);
		 setSize(500, 380);
		 
         jb.addMouseListener(new MouseInputAdapter() {
        	 public void mouseClicked(MouseEvent e) {
        		 
        	 }
		});
	    j3.addActionListener(new ActionListener() {			
			public void actionPerformed(ActionEvent e) {				
				if(jtf.getText().equals(id)&&jtf2.getText().equals(pw)) {
					
					Aa a=new Aa();
					a.setSize(500,500);
					a.setVisible(true);
					}
					else{
					Aa1 a1=new Aa1();
					a1.setSize(500,500);
					a1.setVisible(true);
					}
					setVisible(false);
		    setVisible(false);
			}
		});	 
		}
		}

class Aa extends JDialog{
	Aa(){
		setLayout(new FlowLayout());
		add(new JLabel("성공"));
	}
}
class Aa1 extends JDialog{
	Aa1(){
		setLayout(new FlowLayout());
		add(new JLabel("실패"));
	}
}