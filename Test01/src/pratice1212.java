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

			JLabel log = new JLabel("�١١١١١١١١١١١١١١١١١�ȸ�����ԡ١١١١١١١١١١١١١١١١١�");

			log.setBounds(30, 40, 800, 40);

			c.add(log);

			

			JLabel name_la = new JLabel("�̸�:");//�̸�

			name_la.setBounds(50,100,80,50);

			c.add(name_la);

			

			JTextField name_t=new JTextField("");//�̸����� �ؽ�Ʈ�ʵ�

			name_t.setBounds(140,115,80,20);

			c.add(name_t);

			

			CheckboxGroup CG = new CheckboxGroup();//���� üũ�ڽ� ����

			Checkbox man = new Checkbox("����",CG,true);

			Checkbox girl = new Checkbox("����",CG,true);

			c.add(man);

			c.add(girl);

			man.setBounds(240,100,50,50);

			girl.setBounds(300,100,50,50);

			

			JLabel birth_la = new JLabel("�������:");//������� 

			birth_la.setBounds(50, 140, 80, 50);

			c.add(birth_la);

			

			JTextField birth_t1 = new JTextField("");//������� ���� �ؽ�Ʈ

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
			
			JTextField id_t = new JTextField("");//ID�ؽ�Ʈâ
			id_t.setBounds(140,193,80,20);
			c.add(id_t);
			
			JButton b = new JButton("���̵� �ߺ�");//ID�ߺ�Ȯ�� ��ư
			b.setBounds(250,193,110,20);
			c.add(b);
			
			JLabel pw_la = new JLabel("PW:");//PW
			pw_la.setBounds(50,220,80,50);
			c.add(pw_la);
			
			JPasswordField pw_t = new JPasswordField("");//PW�ؽ�Ʈâ
			pw_t.setBounds(140,235,130,20);
			c.add(pw_t);
			
			JLabel pw_la1 = new JLabel("PW���Է�:");//PW���Է�
			pw_la1.setBounds(50,260,80,50);
			c.add(pw_la1);
			
			JPasswordField pw_t1 = new JPasswordField("");//PW�ؽ�Ʈâ
			pw_t1.setBounds(140,275,130,20);
			c.add(pw_t1);
			
			JLabel email_la = new JLabel("email�Է�:");//email
			email_la.setBounds(50,300,80,50);
			c.add(email_la);
			
			JTextField email_t = new JTextField("");//email�ؽ�Ʈâ
			email_t.setBounds(140,315,100,20);
			c.add(email_t);
			
			JLabel email_la1 = new JLabel("@");//email @
			email_la1.setBounds(240,315,20,20);
			c.add(email_la1);
			
			JTextField email_t1 = new JTextField("");//email �ּ��Է�
			email_t1.setBounds(260,315,100,20);
			c.add(email_t1);
			
			JLabel email_la2= new JLabel("ex)1234@naver.com");//email ����
			email_la2.setBounds(150,335,120,20);
			c.add(email_la2);
			
			JLabel phone_la = new JLabel("�ڵ��� ��ȣ:"); //�ڵ�����ȣ
			phone_la.setBounds(50,350,80,50);
			c.add(phone_la);
			
			Choice phone_t1 = new Choice(); //�ڵ�����ȣ ���ڸ� ����
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
			
			Choice email = new Choice(); //�̸��� �ּ� ����
			email.setBounds(360,314,100,50);
			email.add("�����Է�");
			email.add("naver.com");
			email.add("hanmail.net");
			email.add("yahoo.co.kr");
			email.add("nate.com");
			c.add(email);
			
			JLabel tel_la = new JLabel("��ȭ��ȣ:");//��ȭ��ȣ
			tel_la.setBounds(50,400,80,50);
			c.add(tel_la);
			
			Choice tel_t1 = new Choice();//������ȣ����
			tel_t1.setBounds(140,415,50,20);
			tel_t1.add("02");
			tel_t1.add("051");
			tel_t1.add("061");
			tel_t1.add("055");
			c.add(tel_t1);
			
			JTextField tel_t2 = new JTextField(""); //��ȭ��ȣ �Է�
			tel_t2.setBounds(200,415,70,20);
			c.add(tel_t2);
			JTextField tel_t3 = new JTextField("");
			tel_t3.setBounds(280,415,70,20);
			c.add(tel_t3);
			
			
			JLabel u_la = new JLabel("�����ȣ");//�����ȣ
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
			
			JButton u_b = new JButton("�����ȣ �˻�");
			u_b.setBounds(280,465,130,25);
			c.add(u_b);
			
			JLabel ju_la1 = new JLabel("�ּ�:");
			ju_la1.setBounds(50,490,80,50);
			c.add(ju_la1);
			
			JTextField ju_t = new JTextField("");
			ju_t.setBounds(140,500,350,20);
			c.add(ju_t);
			
			JButton jb10 = new JButton("����");//���Թ�ư
			jb10.setBounds(200,550,70,30);
			c.add(jb10);
			
			JButton jb11 = new JButton("���");//��ҹ�ư
			jb11.setBounds(290,550,70,30);
			c.add(jb11);
			
			jb10.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {//��й�ȣ ��ġ�ϸ� Ȯ�ι�ư ������ ���α׷����� �ƴҽô� ���â
					String a = pw_t.getText();
					String b = pw_t1.getText();
					String s="";
					 
					
					if(name_t.getText().equals(s) || birth_t1.getText().equals(s) || birth_t2.getText().equals(s) ||  birth_t3.getText().equals(s) || id_t.getText().equals(s) || email_t.getText().equals(s) || email_t1.getText().equals(s) || phone_t2.getText().equals(s) || phone_t3.getText().equals(s) || tel_t2.getText().equals(s) || tel_t3.getText().equals(s) || u_t.getText().equals(s) || u_t1.getText().equals(s) || ju_t.getText().equals(s)) {
						JOptionPane.showMessageDialog(null,"�������� �ʼ������Դϴ�","���",0);
					
					}
					else {
						
						if(a.equals(b)) {
							JOptionPane.showMessageDialog(null, "ȸ������ �Ϸ�");
							Login l = new Login();
							dispose();
						}
						else {
							JOptionPane.showMessageDialog(null,"��й�ȣ�� ��ġ���� �ʽ��ϴ�","���",0);
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
