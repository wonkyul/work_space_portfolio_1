package Ex;

import java.util.Arrays;

public class ArrayEx1 {

	public static void main(String[] args) {
		String [] ar = {"fill()","in","the","Arrays"};
		
		Arrays.fill(ar, "Hana");//배열의 요소들을 "Hana"로 채운다.
		for(String n : ar)
			System.out.print(n + ",");
		
		System.out.println("\n------------------");
		Arrays.fill(ar, 1, 3, "♥");
		for(String n : ar)
			System.out.print(n+",");
	}
}
