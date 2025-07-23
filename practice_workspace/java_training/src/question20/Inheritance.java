package question20;

public class Inheritance extends Question20_01 {
	private String hobby; 
	 
	 void setHobby(String hobby) { 
	 this.hobby = hobby; 
	 } 
	 
	 String getHobby() { 
	 return hobby; 
	 } 
	 
	 public void showHobby() {
		 System.out.println("私の趣味は" + hobby + "です");
	 }
}
