import java.util.Scanner;

public class example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("소문자 알파벳 하나를 입력하시오: ");
		String str = sc.next();
		char ch = str.charAt(0);
		int num = 0;
		for(int i=0;i<26;i++) {
			if((char)('a'+i)==ch)
				num = i;
		}
		int k = num;
		for(int i=0;i<=num;i++) {
			for(int j=0;j<=k;j++) {
				System.out.print((char)('a'+j));
			}
			k -= 1;
			System.out.println();
		}
		
		sc.close();
	}
}
