package 变量;
/**
 * 订单类
* <p>Title: Order</p>  
* <p>Description: </p>  
* @author xianxian 
* @date 2019年7月4日
 */
public class Order {
	public Order()
	{
		System.out.println("空构造方法");
	}
	
	public Order(String suiyi)
	{
		System.out.println(suiyi);
	}
	
	public Order(int orderId)
	{
		//需求：在一个构造器中调用另外一个构造器，怎么写？
		this("xidada");
		this.orderId=orderId;
	}
	
	
	
	/*public Order()
	{
		//orderId++; not ok
		number++;//ok
	}*/
	
	/*类变量
	用static修饰的成员变量，它们在类被载入时创建，只要类存在，static变量就存在
	实例变量
	类体中声明的成员变量，即非static的属性
	局部变量
	方法体中声明的变量，方法中的参数，或代码块中声明的变量，都是局部变量
	局部变量只在方法调用的过程中有效，方法调用结束后失效*/
	/** 订单的数量 */
	static int number=0;
	/** 订单号 */
	int orderId;
	
	/**获取订单总价的方法 */
	public int getSumPrice(int price,int count)
	{
		int sumPrice=price*count;
		return sumPrice;
	}

	public int getOrderId() {
		return this.orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
}
