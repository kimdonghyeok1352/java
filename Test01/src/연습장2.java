import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Label;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

class Solution {
	int a1 = 0;
	int b1 = 0;
	int c1 = 0;
	public int[] solution(int[] answers) {
		int[] answer = {};
		int a[] = { 1, 2, 3, 4, 5 };
		int b[] = { 2, 1, 2, 3, 2, 4, 2, 5 };
		int c[] = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };
		for (int i = 0; i < answers.length; i++) {
			if (answers[i] == a[i % 5])
				a1++;
			if (answers[i] == b[i % 8])
				b1++;
			if (answers[i] == c[i % 10])
				c1++;
		}
		if (a1 == b1 && b1 == c1) {
			answer = new int[] { 1, 2, 3 };
		} else if (a1 == b1 && a1 > c1) {
			answer = new int[] { 1, 2 };
		} else if (a1 == c1 && c1 > b1) {
			answer = new int[] { 1, 3 };
		} else if (b1 == c1 && c1 > a1) {
			answer = new int[] { 2, 3 };
		} else {
			int max = a1;
			int aa = 1;
			if (max < b1)
				max = b1;
			aa = 2;
			if (max < c1)
				max = c1;
			aa = 3;
			answer = new int[] { aa };
		}
		return answer;
	}
void asdf() {
	System.out.println(a1);
	System.out.println(b1);
	System.out.println(c1);

}
}

public class ¿¬½ÀÀå2 {
	public static void main(String[] args) {
	Solution a=	new Solution();
	a.asdf();
	}
}