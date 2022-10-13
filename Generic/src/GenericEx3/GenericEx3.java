package GenericEx3;

public class GenericEx3<T> {
		T v;
		public GenericEx3() {}
		public GenericEx3(T n){
				v = n;
		}
		public void set(T n){
			v = n;
		}
		public T get(){
			return v;
		}
		public static void main(String[] args) {
				GenericEx3<?> g3 = new GenericEx3<String>("String객체");
				//g3.set();
				String s = (String)g3.get();
				System.out.println("g2의 결과 : "+s);
				
		}
}
