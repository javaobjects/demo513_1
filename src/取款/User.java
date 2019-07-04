package 取款;
/**
 * 用户类
* <p>Title: User</p>  
* <p>Description: </p>  
* @author xianxian 
* @date 2019年7月4日
 */
public class User {
	
	//构造方法:是一个空构造方法
	public User(){
		System.out.println("User()");
	}
	//有参构造方法
	public User(int id){
		System.out.println("User("+id+")");
		this.id = id;
	}
	
	
	{
		System.out.println("对象的初始化块{}");
		//初始化块(对象的初始化块)
	}
	
	static {
		System.out.println("静态初始化块static{}");
		//静态初始化块(类的初始化块)
	}
	//静态属性,类的属性
	private static int count;

	
	//属性 (一般使用封闭类)，成员属性，变量，成员变量，对象属性
	private int id;
	private String username;
	private String phone;
	private String birthday;
	
	private IDCard idCard;
	
	//静态方法，类的方法
	public static void printNmae() {
		System.out.println("pringName()");
	}
	
	//成员方法，成员函数，对象的行为
	public int getId() {
		System.out.println("getId()" + id);
		return id;
	}
	
	public String getUsername() {
		System.out.println("getUsername()");
		return username;
	}
	
	//非static方法是对象方法  一定要把当前类实例化 ，利用实例化对象来调用这个方法
	public void setUsername(String username) {
		this.username = username;
	}
	
	//成员内部类
	private class InnerClass {
		
	}
	//静态内部类
	private static class InnerStaticClass {
		
	}
}
