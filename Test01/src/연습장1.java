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

public class ������1 {

	public static void main(String[] args) {
		Work w = new Work(123,"a","b");
		while(true) {
			System.out.println("1.~~");
			System.out.println("2.~~");
			System.out.println("3.~~");
			Scanner n = new Scanner(System.in);
			System.out.println("��ȣ�Է�");
			int z = n.nextInt();
			switch(z){
				case 1:
					System.out.println("�޴�����ȣ");
					int a = n.nextInt();
					w.setNum(a);
					
					System.out.println("�̸�");
					String b = n.next();
					w.setName(b);
					
					System.out.println("�μ�");
				    String c = n.next();
				    w.setDept(c);
				    
				    System.out.println(a);
				    System.out.println(b);
				    System.out.println(c);
				    break;
				case 2:
					System.out.println("ã�� ���� �޴��� ��ȣ �Է�");
					int y = n.nextInt();
					if(y==w.getNum()) {
						System.out.println(w.getNum());
						System.out.println(w.getName());
						System.out.println(w.getDept());
					}
					break;
				case 3:
					System.out.println("���α׷�����");
					System.exit(0);
			}
		}
	}

}
