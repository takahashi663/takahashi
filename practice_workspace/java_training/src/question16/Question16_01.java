package question16;

public class Question16_01 {
	private String name;
	private String composer;
	
	Question16_01() { 
		
		name = "灼熱Beach Side Bunny";
		composer = "DJ_Mass";
		
		
		this.name = name;
		this.composer = composer;
	
		 System.out.println(name + "と" + composer +"はコンストラクタです");
		 
		 
		 
		 } 
	public void show() {
		System.out.println("この曲の名前は" + name + "です");
		System.out.println("コンポーザーは" + composer + "です");
	}
	
		
	}

