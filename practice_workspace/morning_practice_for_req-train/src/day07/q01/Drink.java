package day07.q01;

public class Drink {
	private int price;
	private String name;
	
	public Drink() {
		price = 120;
		name = "ビタミン麦茶";
		
	}
	
	public Drink(int price,String name) {
		
	}
	
	public void show() {
		System.out.println(name + price + "円");
	}
}
