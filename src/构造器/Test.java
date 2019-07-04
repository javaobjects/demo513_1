package 构造器;

public class Test {

	public static void main(String[] args) {
		//首先把User这个类（这个字节码文件）加载进内存，实例化第一个对象，第二个对象，第三个对象
		
		
		
		//把User类实例化，在截区里开咯一个房间，然后再把地址给到栈区里面的user1变量
		User user1 = new User();
		System.out.println(user1.getId());
		System.out.println(user1.getName());
		System.out.println(user1.getPassword());
		
		User user2 = new User(12);

		User user3 = new User(100,"zhangsan","123456");
	}
}
