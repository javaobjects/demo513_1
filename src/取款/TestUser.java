package 取款;

public class TestUser {

	public static void main(String[] args) {
		//把User类实例化，在堆区里开咯一个房间，然后再把地址给到栈区里面的user1变量 
//		静态初始化块static{}
//		对象的初始化块{}
//		User()
		User user1 = new User(100);
		user1.getId();
//		Java语言的特点，初始化块总是先执行，构造方法后执行
//		对象的初始化块{}
//		User()
		User user2 = new User();
		
//		对象的初始化块{}
//		User()
		User user3 = new User();
		
	}
}
