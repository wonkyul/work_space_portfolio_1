package CollectionExs;

import java.util.Iterator;
import java.util.Vector;

public class IteratorEx1 {

	public static void main(String[] args) {
		Vector<String> v = new Vector<String>(2,5);
		v.add("구자철");
		v.add("손흥민");
		v.add("기성용");
		System.out.println("벡터크기:"+v.size());;
		
		Iterator<String> it = v.iterator();//Iterator 얻기
		while(it.hasNext()) {
			System.out.println(it.next());
			it.remove();
			System.out.println("벡터크기:" + v.size());
			
		}
		//System.out.println(it.next());
		//System.out.println(v.size());
		
		
	}
}
