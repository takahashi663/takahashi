package question03;

public class SystemMain03 {

	public static void main(String[] args) {
		int price = 30;
		int totalPrice = 300;
		int quantity = totalPrice/price;
		
		System.out.println("商品の購入数は"+ quantity + "です");
		
		int newPrice = price + 100;
		int changeQuantity = quantity--;
		newPrice = newPrice+=price;
		totalPrice = newPrice*quantity;
		
		System.out.println("商品の購入数は" + changeQuantity + "です");
		System.out.println("商品の新しい値段は" + newPrice + "に変更です");
		System.out.println("商品の購入合計金額は" + totalPrice + "です");
		
		double priceIncreaseRate = 1.1;
		
		int changePrice = (int) (newPrice*priceIncreaseRate);
		
		 System.out.println("商品の元の値段は" + newPrice + "です" );
		 System.out.println("商品の値上げ後の値段は" + changePrice + "です");

	}

}
