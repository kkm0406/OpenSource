import java.util.Scanner;
public class Hello {

	public static int sum(int n, int m) {
		return n+m;
	}
	
	public static void main(String[] args) {
        //2-1
//		int i = 20;
//		int s;
//		char a;
//		
//		s = sum(i, 20);
//		a = '?';
//		System.out.println(a);
//		System.out.println("Hello");
//		System.out.println(s);
		
		//2-2
//		final double PI = 3.14;
//		
//		double radius = 10.0;
//		double circleArea = radius*radius*PI;
//		System.out.println("���� ���� = "+circleArea);
		
		//2-3
//		byte b = 127;
//		int i = 100;
//		
//		System.out.println(b+i);
//		System.out.println(10/4);
//		System.out.println(10.0/4);
//		System.out.println((char)0x12340041);
//		System.out.println((byte)(b+i));
//		System.out.println((int)2.9+1.8);
//		System.out.println((int)(2.9+1.8));
//		System.out.println((int)2.9+(int)1.8);
		
		//2-4
//		System.out.println("�̸�, ����, ����, ü��, ���� ���θ� ��ĭ���� �и��Ͽ� �Է��ϼ���");
//		Scanner sc = new Scanner(System.in);
//		
//		String name = sc.next();
//		System.out.print("�̸��� "+name+", ");
//		String city = sc.next();
//		System.out.print("���ô� "+city+", ");
//		int age = sc.nextInt();
//		System.out.print("���̴� "+age+"��, ");
//		double weight = sc.nextDouble();
//		System.out.print("ü���� "+weight+"kg, ");
//		boolean single= sc.nextBoolean();
//		System.out.print("���� ���δ� "+single+"�Դϴ�");
//		
//		sc.close();
		
		//2-5
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("������ �Է��ϼ���: ");
//		int time = sc.nextInt();
//		int second = time%60;
//		int min = (time/60)%60;
//		int hour = (time/60)/60;
//		
//		System.out.print(time+"�ʴ� "+hour+"�ð� "+min+"�� "+second+"���Դϴ�" );
//		sc.close();
		
		//2-6
//		int a=3, b=3, c=3;
//		
//		a+=3;
//		b*=3;
//		c%=2;
//		System.out.println("a="+a+", b="+b+", c="+c );
//		
//		int d=3;
//		a=d++;
//		System.out.println("a="+a+", d="+d );
//		a=++d;
//		System.out.println("a="+a+", d="+d );
//		a=d--;
//		System.out.println("a="+a+", d="+d );
//		a=--d;
//		System.out.println("a="+a+", d="+d );
		
		//2-7
//		System.out.println('a'>'b');
//		System.out.println(3>=2);
//		System.out.println(-1<0);
//		System.out.println(3.45<=2);
//		System.out.println(3==2);
//		System.out.println(3!=2);
//		System.out.println(!(3!=2));
//		
//		System.out.println((3>2)&&(3>4));
//		System.out.println((3!=2)||(-1>0));
		
		//2-8
//		int a=3, b=5;
//		System.out.println("�� ���� ���� "+((a>b)?(a-b):(b-a)));
		
		//2-9
//		short a=(short)0x55ff;
//		short b=(short)0x00ff;
//		
//		System.out.println("[��Ʈ ���� ���]");
//		System.out.printf("%04x\n",(short)(a&b));
//		System.out.printf("%04x\n",(short)(a|b));
//		System.out.printf("%04x\n",(short)(a^b));
//		System.out.printf("%04x\n",(short)(~a));
//		
//		byte c=20;
//		byte d=-8;
//		
//		System.out.println("[����Ʈ ���� ���]");
//		System.out.println(c<<2);
//		System.out.println(c>>2);
//		System.out.println(d>>2);
//		System.out.printf("%x\n", (d >>>2));
		
		//2-10
//		Scanner sc = new Scanner(System.in);
//		System.out.println("������ �Է��Ͻÿ�: ");
//		int score=sc.nextInt();
//		if(score>=80) {
//			System.out.println("�����մϴ�! �հ��Դϴ�");
//		}
//		sc.close();
		
		//2-11
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("���� �Է��Ͻÿ�: ");
//		int number = sc.nextInt();
//		
//		if(number%3==0) {
//			System.out.println("3�� ����Դϴ�");
//		}
//		else {
//			System.out.println("3�� ����� �ƴմϴ�");
//		}
//		
//		sc.close();
		
		//2-12
//		char grade;
//		Scanner sc = new Scanner(System.in);
//		System.out.println("������ �Է��Ͻÿ�(0~100): ");
//		int score = sc.nextInt();
//		if(score>=90)
//			grade='a';
//		else if(score>=80)
//			grade='b';
//		else if(score>=70)
//			grade = 'c';
//		else if(score>=60)
//			grade = 'd';
//		else
//			grade = 'f';
//		System.out.println("������ "+grade+"�Դϴ�");
//	    sc.close();
//	}
		
		//2-13
//		Scanner sc = new Scanner(System.in);
//		System.out.println("������ �Է��Ͻÿ�(0~100): ");
//		int score = sc.nextInt();
//		
//		System.out.println("�г��� �Է��ϼ���(1~4): ");
//		int year = sc.nextInt();
//		
//		if(score>=60) {
//			if(year!=4)
//				System.out.println("�հ�");
//			else if(score>=70)
//				System.out.println("�հ�");
//			else
//				System.out.println("���հ�");
//		}
//		else
//			System.out.println("���հ�");
//		
//		sc.close();
		
		//2-14
//		Scanner sc = new Scanner(System.in);
//		char grade;
//		System.out.println("������ �Է��Ͻÿ�(0~100): ");
//		int score = sc.nextInt();
//		switch(score/10) {
//		case 10:
//		case 9:
//			grade = 'a';
//			break;
//		case 8:
//			grade = 'b';
//			break;
//		case 7:
//			grade = 'c';
//			break;
//		case 6:
//			grade = 'd';
//			break;
//			default:
//				grade='f';
//				break;
//			
//		}
//		
//		System.out.println("������ "+grade+"�Դϴ�");
//		sc.close();
		
		//2-15
		Scanner sc = new Scanner(System.in);
		System.out.println("���� Ŀ�� �帱���?");
		String order = sc.next();
		int price = 0;
		switch(order) {
		case "����������":
		case "īǪġ��":
		case "ī���":
			price=3500;
			break;
		case "�Ƹ޸�ī��":
			price=2000;
			break;
		default:
			System.out.println("�޴��� �����ϴ�");
			break;
		}
		if(price!=0)
			System.out.println(order+"�� "+price+"���Դϴ�");
		sc.close();
		
		
	}
}
