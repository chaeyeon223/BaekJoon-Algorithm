import java.util.Scanner;
	public class Ex08_voca {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			String voca=sc.nextLine().toUpperCase(); //값입력받아서 대문자로 변환
			int[] vocalist=new int[26];
			int max=0;
			char result=0;
			
			for(int i=0;i<voca.length();i++) {
				vocalist[voca.charAt(i)-'A']++;
				//int asc=voca.charAt(i); //char > int 자동형변환 
				//vocalist[asc-65]++; //대문자 A : 65 >> 배열 index 0부터 시작 가능 >> asc(77)-65인 index[12] : M의 개수 ++ 
				if(vocalist[voca.charAt(i)-'A']>max) {
					max=vocalist[voca.charAt(i)-'A'];
					result=voca.charAt(i);
					}
				else if(vocalist[voca.charAt(i)-'A']==max) {
					result='?';
					}
				}System.out.println(result);
		}
}