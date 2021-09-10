import java.util.Scanner;
public class practice6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("1~99사이의 정수를 입력하세요 ");
		int num = sc.nextInt();
		int a = num/10;
		int b = num%10;
		int cnt=0;
		if(a==3||a==6||a==9)
			cnt++;
		if(b==3||b==6||b==9)
			cnt++;
		
		if(cnt==1)
			System.out.print("박수짝");
		if(cnt==2)
			System.out.print("박수짝짝");
		sc.close();
	}

}
