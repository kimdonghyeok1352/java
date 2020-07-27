import java.util.Scanner;

class Work {
	private int num;
	private String name;
	private String dept;

	Work(int num, String name, String dept) {

	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
}

public class 연습장1 {

	public static void main(String[] args) {
		Work w = new Work(123,"a","b");
		while(true) {
			System.out.println("1.~~");
			System.out.println("2.~~");
			System.out.println("3.~~");
			Scanner n = new Scanner(System.in);
			System.out.println("번호입력");
			int z = n.nextInt();
			switch(z){
				case 1:
					System.out.println("휴대폰번호");
					int a = n.nextInt();
					w.setNum(a);
					
					System.out.println("이름");
					String b = n.next();
					w.setName(b);
					
					System.out.println("부서");
				    String c = n.next();
				    w.setDept(c);
				    
				    System.out.println(a);
				    System.out.println(b);
				    System.out.println(c);
				    break;
				case 2:
					System.out.println("찾고 싶은 휴대폰 번호 입력");
					int y = n.nextInt();
					if(y==w.getNum()) {
						System.out.println(w.getNum());
						System.out.println(w.getName());
						System.out.println(w.getDept());
					}
					break;
				case 3:
					System.out.println("프로그램종료");
					System.exit(0);
			}
		}
	}

}
