//정규표현식
public class Str {

	public static void main(String[] args) {
		String str="010-8488-0000";
		System.out.println(str.matches("\\d{3}-\\d{4}-\\d{4}"));
	}

}
