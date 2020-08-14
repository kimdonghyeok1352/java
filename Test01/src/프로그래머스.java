import java.util.Scanner;

class Solution {
	int n;
	String s = "수";
	String b = "박";
	String d = "";

	public String solution(int n) {
		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				d += s;
			} else {
				d += b;
			}
		}
		return d;
	}
}

public class 프로그래머스 {

	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.solution(3));
		
	}
	
}
