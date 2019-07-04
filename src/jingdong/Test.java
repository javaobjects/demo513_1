package jingdong;

public class Test {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.walk();
		Person p2 = new Boss();
		p2.walk();
		Person p3 = new Consumer();
		p3.walk();
		Person p4 = new Admin();
		p4.walk();
		
		
//		得到如下结果，这就是封装继承，多态
//		person is walking.....
//		Boss is walking....
//		Consumer is listening....
//		Consumer is walking....
//		Boss is dancing....
//		Admin is walking....
//		Admin is singing....
	}
}
