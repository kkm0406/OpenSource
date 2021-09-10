import java.util.Scanner;
public class practice4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 3개를 입력하세요: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a>=b) {
			if(b>=c)
				System.out.println("중간값은 "+b);
			else if(c>=a)
				System.out.println("중간값은 "+a);
			else 
				System.out.println("중간값은 "+c);
		}
		else {
			if(c<=a)
				System.out.println("중간값은 "+a);
			else if(b<=c)
		    	System.out.println("중간값은 "+b);
			else
				System.out.println("중간값은 "+c);
					
		}

		sc.close();
	}

}
