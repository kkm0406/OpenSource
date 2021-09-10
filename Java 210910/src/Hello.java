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
//		System.out.println("원의 면적 = "+circleArea);
		
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
//		System.out.println("이름, 도시, 나이, 체중, 독신 여부를 빈칸으로 분리하여 입력하세요");
//		Scanner sc = new Scanner(System.in);
//		
//		String name = sc.next();
//		System.out.print("이름은 "+name+", ");
//		String city = sc.next();
//		System.out.print("도시는 "+city+", ");
//		int age = sc.nextInt();
//		System.out.print("나이는 "+age+"살, ");
//		double weight = sc.nextDouble();
//		System.out.print("체중은 "+weight+"kg, ");
//		boolean single= sc.nextBoolean();
//		System.out.print("독신 여부는 "+single+"입니다");
//		
//		sc.close();
		
		//2-5
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("정수를 입력하세요: ");
//		int time = sc.nextInt();
//		int second = time%60;
//		int min = (time/60)%60;
//		int hour = (time/60)/60;
//		
//		System.out.print(time+"초는 "+hour+"시간 "+min+"분 "+second+"초입니다" );
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
//		System.out.println("두 수의 차는 "+((a>b)?(a-b):(b-a)));
		
		//2-9
//		short a=(short)0x55ff;
//		short b=(short)0x00ff;
//		
//		System.out.println("[비트 연산 결과]");
//		System.out.printf("%04x\n",(short)(a&b));
//		System.out.printf("%04x\n",(short)(a|b));
//		System.out.printf("%04x\n",(short)(a^b));
//		System.out.printf("%04x\n",(short)(~a));
//		
//		byte c=20;
//		byte d=-8;
//		
//		System.out.println("[시프트 연산 결과]");
//		System.out.println(c<<2);
//		System.out.println(c>>2);
//		System.out.println(d>>2);
//		System.out.printf("%x\n", (d >>>2));
		
		//2-10
//		Scanner sc = new Scanner(System.in);
//		System.out.println("점수를 입력하시오: ");
//		int score=sc.nextInt();
//		if(score>=80) {
//			System.out.println("축하합니다! 합격입니다");
//		}
//		sc.close();
		
		//2-11
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("수를 입력하시오: ");
//		int number = sc.nextInt();
//		
//		if(number%3==0) {
//			System.out.println("3의 배수입니다");
//		}
//		else {
//			System.out.println("3의 배수가 아닙니다");
//		}
//		
//		sc.close();
		
		//2-12
//		char grade;
//		Scanner sc = new Scanner(System.in);
//		System.out.println("점수를 입력하시오(0~100): ");
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
//		System.out.println("학점은 "+grade+"입니다");
//	    sc.close();
//	}
		
		//2-13
//		Scanner sc = new Scanner(System.in);
//		System.out.println("점수를 입력하시오(0~100): ");
//		int score = sc.nextInt();
//		
//		System.out.println("학년을 입력하세요(1~4): ");
//		int year = sc.nextInt();
//		
//		if(score>=60) {
//			if(year!=4)
//				System.out.println("합격");
//			else if(score>=70)
//				System.out.println("합격");
//			else
//				System.out.println("불합격");
//		}
//		else
//			System.out.println("불합격");
//		
//		sc.close();
		
		//2-14
//		Scanner sc = new Scanner(System.in);
//		char grade;
//		System.out.println("점수를 입력하시오(0~100): ");
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
//		System.out.println("학점은 "+grade+"입니다");
//		sc.close();
		
		//2-15
		Scanner sc = new Scanner(System.in);
		System.out.println("무슨 커피 드릴까요?");
		String order = sc.next();
		int price = 0;
		switch(order) {
		case "에스프레소":
		case "카푸치노":
		case "카페라떼":
			price=3500;
			break;
		case "아메리카노":
			price=2000;
			break;
		default:
			System.out.println("메뉴에 없습니다");
			break;
		}
		if(price!=0)
			System.out.println(order+"는 "+price+"원입니다");
		sc.close();
		
		
	}
}
