import java.util.Scanner;
public class practice4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("���� 3���� �Է��ϼ���: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a>=b) {
			if(b>=c)
				System.out.println("�߰����� "+b);
			else if(c>=a)
				System.out.println("�߰����� "+a);
			else 
				System.out.println("�߰����� "+c);
		}
		else {
			if(c<=a)
				System.out.println("�߰����� "+a);
			else if(b<=c)
		    	System.out.println("�߰����� "+b);
			else
				System.out.println("�߰����� "+c);
					
		}

		sc.close();
	}

}
