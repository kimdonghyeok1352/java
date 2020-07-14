package pac;

class PhoneNum {
	String name;
	String phone;
	PhoneNum(String n, String p){
		name = n;
		phone = p;
	}
	void show() {
		System.out.println("이름"+name);
		System.out.println("번호"+phone);
	}
}
class School extends PhoneNum{
	String major;
	School(String n, String p ,String m){
		super(n,p);
		major = m;
	}
	void show() {	//오버라이딩
		super.show();
		System.out.println(major);
	}
}
class Worker extends PhoneNum{
	String grade;
	Worker(String n, String p,String g){
		super(n,p);
		grade = g;
	}
	void show() {
		super.show();
		System.out.println(grade);
	}
}