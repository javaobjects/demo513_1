package 变量;

public class Test变量的作用域 {

	public static void main(String[] args) {

		Order order = new Order();
		
		Order o2 = new Order();
		
		Order o3 = new Order();
		
		Order o4 = new Order();
		
		System.out.println(Order.number);
		System.out.println(order.orderId);
	}

}
