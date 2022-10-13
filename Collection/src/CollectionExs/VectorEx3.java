package CollectionExs;

import java.util.Vector;

public class VectorEx3 {
		public static void main(String[] args) {
			Vector<Double> v =  new Vector<Double>(2,5);
			
			//자원 추가
			v.add(100.3);
			v.add(3.14);
			v.addElement(1000.);
			
			int size = v.size();//요소의 수
			Double[] data = new Double[size];
			v.copyInto(data);
			for(double n : data)
				System.out.println(n);
			
		}

}
