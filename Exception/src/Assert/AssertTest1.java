package Assert;

public class AssertTest1 {

	public static void main(String[] args) {
		String str = "";
		assert str.length()>0 :  "시작시 인자값이 없습니다.";
		System.out.println(str);
	}

}
