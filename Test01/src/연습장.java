import java.awt.Container;
import java.awt.FileDialog;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.StringTokenizer;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class 연습장 extends JFrame {
	JCheckBox cafe [] = new JCheckBox[3];
	//객체배열
	String menu [] = {"라떼","딸기스무디","아메라키노"};
	JLabel total;
	//총합
	연습장() {
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		Check ch = new Check();
		for(int i =0; i<cafe.length; i++) {
			cafe[i] = new JCheckBox(menu[i]);
			c.add(cafe[i]);
			cafe[i].addItemListener(ch);
		}
		total = new JLabel();
		c.add(total);
		setSize(500,500);
		setVisible(true);
	}	
	class Check implements ItemListener{
		int sum=0;
		public void itemStateChanged(ItemEvent e) {
			if(e.getStateChange()==ItemEvent.SELECTED) {
				if(e.getItem()==cafe[0]) {
					sum+=5000;
				}
				else if(e.getItem()==cafe[1]) {
					sum+=4000;
				}
				else
					sum+=4500;
			}
			total.setText("현재"+sum+"원");
			
		}
		
	}
	public static void main(String[] args) {
		new 연습장();

	}

}