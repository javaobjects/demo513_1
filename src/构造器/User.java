package 构造器;

public class User {
	
	/*
	 * 如果一个类给它定义好咯之后没有给它构造方法 
	 * 默认有一个空的构造方法，它不需要声明，只管用就行咯
	 * Java虚拟机承认
	 * 只要显示的声明咯一个构造方法，原先默认的空构造器就没有咯
	 */
//	public void User() {
//		//不是构造方法
//	}
	public User() {
		
	}
	
	public User(int id) {
		this.id = id;
	}
	
	private int id;
	private String name;
	private String password;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public User(int id, String name, String password) {
		this.id = id;
		this.name = name;
		this.password = password;
	}
	
	/*
	 * 构造器（构造方法/构造器，Constructor）
		具有与类相同的名称
		不含返回值类型
		不能在方法中用return语句返回一个值
		一般访问权限为public
		    在一个类中，具有上述特征的方法就是构造器。
		构造器的作用
		完成对象的创建，即完成对象的实例化
		一般使用构造器来完成对成员变量的初始化
	 */
	
	
	
}
