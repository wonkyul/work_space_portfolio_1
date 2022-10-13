package Ex;

import java.util.Random;

public class RandomEx1 {

	public static void main(String[] args) {
		String [] lesson = {"Java Beg","JSP","XML&Java","EJB"};
		Random r1 = new Random();
		
		int index = r1.nextInt(4);
		System.out.println("선택과목 :" + lesson[index]);
	}

}
