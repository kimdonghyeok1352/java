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

public class ������ extends JFrame {
	JCheckBox cafe [] = new JCheckBox[3];
	//��ü�迭
	String menu [] = {"��","���⽺����","�Ƹ޶�Ű��"};
	JLabel total;
	//����
	������() {
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
			total.setText("����"+sum+"��");
			
		}
		
	}
	public static void main(String[] args) {
		new ������();

	}

}