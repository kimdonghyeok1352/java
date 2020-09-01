import java.awt.Checkbox;

import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

 

 

public class pratice1212 extends JFrame {

		pratice1212(){

			Container c = getContentPane();

			c.setBounds(200,200,800,700);

			c.setLayout(null);

			JLabel log = new JLabel("☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆회원가입☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆");

			log.setBounds(30, 40, 800, 40);

			c.add(log);

			

			JLabel name_la = new JLabel("이름:");//이름

			name_la.setBounds(50,100,80,50);

			c.add(name_la);

			

			JTextField name_t=new JTextField("");//이름적는 텍스트필드

			name_t.setBounds(140,115,80,20);

			c.add(name_t);

			

			CheckboxGroup CG = new CheckboxGroup();//남녀 체크박스 선택

			Checkbox man = new Checkbox("남자",CG,true);

			Checkbox girl = new Checkbox("여자",CG,true);

			c.add(man);

			c.add(girl);

			man.setBounds(240,100,50,50);

			girl.setBounds(300,100,50,50);

			

			JLabel birth_la = new JLabel("생년월일:");//생년월일 

			birth_la.setBounds(50, 140, 80, 50);

			c.add(birth_la);

			

			JTextField birth_t1 = new JTextField("");//생년월일 적는 텍스트

			birth_t1.setBounds(140,155,50,20);

			c.add(birth_t1);

			JTextField birth_t2 = new JTextField("");

			birth_t2.setBounds(200,155,30,20);

			c.add(birth_t2);

			JTextField birth_t3 = new JTextField("");

			birth_t3.setBounds(240,155,50,20);

			c.add(birth_t3);

			

			JLabel id_la = new JLabel("ID:"); //ID

			id_la.setBounds(50,180,80,50);

			c.add(id_la);
			
			JTextField id_t = new JTextField("");//ID텍스트창
			id_t.setBounds(140,193,80,20);
			c.add(id_t);
			
			JButton b = new JButton("아이디 중복");//ID중복확인 버튼
			b.setBounds(250,193,110,20);
			c.add(b);
			
			JLabel pw_la = new JLabel("PW:");//PW
			pw_la.setBounds(50,220,80,50);
			c.add(pw_la);
			
			JPasswordField pw_t = new JPasswordField("");//PW텍스트창
			pw_t.setBounds(140,235,130,20);
			c.add(pw_t);
			
			JLabel pw_la1 = new JLabel("PW재입력:");//PW재입력
			pw_la1.setBounds(50,260,80,50);
			c.add(pw_la1);
			
			JPasswordField pw_t1 = new JPasswordField("");//PW텍스트창
			pw_t1.setBounds(140,275,130,20);
			c.add(pw_t1);
			
			JLabel email_la = new JLabel("email입력:");//email
			email_la.setBounds(50,300,80,50);
			c.add(email_la);
			
			JTextField email_t = new JTextField("");//email텍스트창
			email_t.setBounds(140,315,100,20);
			c.add(email_t);
			
			JLabel email_la1 = new JLabel("@");//email @
			email_la1.setBounds(240,315,20,20);
			c.add(email_la1);
			
			JTextField email_t1 = new JTextField("");//email 주소입력
			email_t1.setBounds(260,315,100,20);
			c.add(email_t1);
			
			JLabel email_la2= new JLabel("ex)1234@naver.com");//email 예시
			email_la2.setBounds(150,335,120,20);
			c.add(email_la2);
			
			JLabel phone_la = new JLabel("핸드폰 번호:"); //핸드폰번호
			phone_la.setBounds(50,350,80,50);
			c.add(phone_la);
			
			Choice phone_t1 = new Choice(); //핸드폰번호 앞자리 선택
			phone_t1.setBounds(140,365,50,20);
			phone_t1.add("010");
			phone_t1.add("011");
			phone_t1.add("016");
			phone_t1.add("017");
			phone_t1.add("018");
			phone_t1.add("019");
			c.add(phone_t1);
			JTextField phone_t2 = new JTextField("");
			phone_t2.setBounds(200,365,70,20);
			c.add(phone_t2);
			JTextField phone_t3 = new JTextField("");
			phone_t3.setBounds(280,365,70,20);
			c.add(phone_t3);
			
			Choice email = new Choice(); //이메일 주소 선정
			email.setBounds(360,314,100,50);
			email.add("직접입력");
			email.add("naver.com");
			email.add("hanmail.net");
			email.add("yahoo.co.kr");
			email.add("nate.com");
			c.add(email);
			
			JLabel tel_la = new JLabel("전화번호:");//전화번호
			tel_la.setBounds(50,400,80,50);
			c.add(tel_la);
			
			Choice tel_t1 = new Choice();//지역번호선택
			tel_t1.setBounds(140,415,50,20);
			tel_t1.add("02");
			tel_t1.add("051");
			tel_t1.add("061");
			tel_t1.add("055");
			c.add(tel_t1);
			
			JTextField tel_t2 = new JTextField(""); //전화번호 입력
			tel_t2.setBounds(200,415,70,20);
			c.add(tel_t2);
			JTextField tel_t3 = new JTextField("");
			tel_t3.setBounds(280,415,70,20);
			c.add(tel_t3);
			
			
			JLabel u_la = new JLabel("우편번호");//우편번호
			u_la.setBounds(50,450,80,50);
			c.add(u_la);
			JTextField u_t = new JTextField("");
			u_t.setBounds(140,465,50,20);
			c.add(u_t);
			JLabel u_la3 = new JLabel("-");
			u_la3.setBounds(200,465,10,10);
			c.add(u_la3);
			JTextField u_t1 = new JTextField("");
			u_t1.setBounds(220,465,50,20);
			c.add(u_t1);
			
			JButton u_b = new JButton("우편번호 검색");
			u_b.setBounds(280,465,130,25);
			c.add(u_b);
			
			JLabel ju_la1 = new JLabel("주소:");
			ju_la1.setBounds(50,490,80,50);
			c.add(ju_la1);
			
			JTextField ju_t = new JTextField("");
			ju_t.setBounds(140,500,350,20);
			c.add(ju_t);
			
			JButton jb10 = new JButton("가입");//가입버튼
			jb10.setBounds(200,550,70,30);
			c.add(jb10);
			
			JButton jb11 = new JButton("취소");//취소버튼
			jb11.setBounds(290,550,70,30);
			c.add(jb11);
			
			jb10.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {//비밀번호 일치하면 확인버튼 누르면 프로그램종료 아닐시는 경고창
					String a = pw_t.getText();
					String b = pw_t1.getText();
					String s="";
					 
					
					if(name_t.getText().equals(s) || birth_t1.getText().equals(s) || birth_t2.getText().equals(s) ||  birth_t3.getText().equals(s) || id_t.getText().equals(s) || email_t.getText().equals(s) || email_t1.getText().equals(s) || phone_t2.getText().equals(s) || phone_t3.getText().equals(s) || tel_t2.getText().equals(s) || tel_t3.getText().equals(s) || u_t.getText().equals(s) || u_t1.getText().equals(s) || ju_t.getText().equals(s)) {
						JOptionPane.showMessageDialog(null,"모든사항은 필수사항입니다","경고",0);
					
					}
					else {
						
						if(a.equals(b)) {
							JOptionPane.showMessageDialog(null, "회원가입 완료");
							Login l = new Login();
							dispose();
						}
						else {
							JOptionPane.showMessageDialog(null,"비밀번호가 일치하지 않습니다","경고",0);
						}
					}
				}
			});
			jb11.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					System.exit(0);
					
				}
			});
			
			
			
			setVisible(true);
			setSize(620, 700);

		}

	public static void main(String[] args) {

		new pratice1212();

 

	}

 

}
