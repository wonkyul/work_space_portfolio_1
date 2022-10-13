package CollectionExs;

import java.util.HashMap;
import java.util.Set;

public class MapEx1 {
	public static void main(String[] args) {
		String [] msg = {"Berlin","Dortmund","Frankfurt","Gelsenkirchen","Hamburg"};
		HashMap<Integer,String> map = 
				new HashMap<>();//HashMap 생성
		for(int i = 0 ; i<msg.length ; i++)
			map.put(i, msg[i]);//맵에 저장
		Set<Integer> keys = map.keySet();
		for(Integer n : keys)
			System.out.println(map.get(n));//맵에서 읽어오기
		
	}
}
