package day09.q01;

import java.io.IOException;

public class ComPlayer {
	public int doJanken() throws IOException {
		int d =  (int) (Math.random()*2);
		
		System.out.println("コンピューターは"+ d + "を選んだ");
		return d;
	}
} 
