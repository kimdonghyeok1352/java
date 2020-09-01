import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class reservation2 extends JFrame {
		reservation2(){
			Container c = getContentPane();
			c.setBounds(100,200,800,700);
			c.setLayout(null);
			
			JLabel jl1 = new JLabel("출발:");//출발 텍스트
			jl1.setBounds(40,50,28,28);
			c.add(jl1);
			
			Choice ch1 = new Choice();//출발지 선택
			ch1.setBounds(70,50,55,55);
			ch1.add("서울");
			ch1.add("부산");
			c.add(ch1);
			
			JLabel jl2 = new JLabel("==>");//화살표 텍스트
			jl2.setBounds(150,40,45,45);
			c.add(jl2);
			
			JLabel jl3 = new JLabel("도착:");//도착 텍스트
			jl3.setBounds(190,50,28,28);
			c.add(jl3);
			
			Choice ch2 = new Choice();//도착 선택
			ch2.setBounds(223,50,55,55);
			ch2.add("서울");
			ch2.add("부산");
			c.add(ch2);
			
			

			JButton jb1 = new JButton("날짜조회");//날짜조회 버튼
			jb1.setBounds(50,180,100,100);
			c.add(jb1);
			
			JButton jb2 = new JButton("열차조회"); //열차조회버튼
			jb2.setBounds(180,180,100,100);
			c.add(jb2);
			
			jb1.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					Calender cal = new Calender();
					
					
				}
			});

			
			
			setSize(350,350);
			setVisible(true);
		}
	public static void main(String[] args) {
		new reservation2();

	}

}
