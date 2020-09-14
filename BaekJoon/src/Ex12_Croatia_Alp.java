import java.util.Scanner;

public class Ex12_Croatia_Alp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("단어를 입력하세요");
		String word=sc.nextLine();
		
		String[] croword={"c=","c-","d-","lj","nj","s=","dz=","z="};

		for(int i=0;i<croword.length;i++) {
			if(word.contains(croword[i])) {
				word=word.replaceAll(croword[i],"A");
			}
		}

		System.out.println(word.length());
	}

}
