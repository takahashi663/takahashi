package question01;

public class SystemMain01 {

	public static void main(String[] args) {
		int applePrice = 100;
		String stationery = "鉛筆";
		
		applePrice = 200;
	    stationery = "消しゴム";
	    
	    int bananaPrice = applePrice;
	    String writingUtensils = stationery;
	    
	    System.out.println("リンゴの値段は" +applePrice + "円です");
	    System.out.println("バナナの値段は" +bananaPrice + "円です");
	    System.out.println("この筆記用具は" +writingUtensils+ "です");
	}

}
