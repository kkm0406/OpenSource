import java.util.Scanner;

public class example14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String course[] = {"Java", "C++", "HTMLS", "컴퓨터구조", "안드로이드"};
		int score[] = {95, 88, 76, 62, 55};
		Scanner sc = new Scanner(System.in);
		System.out.print("과목 이름: ");
		String name = sc.next();
		while(!name.equals("그만")) {
			switch(name) {
			case "Java":
				System.out.println("Java의 점수는 "+score[0]+"입니다");
				break;
			case "C++":
				System.out.println("C++의 점수는 "+score[1]+"입니다");
				break;
			case "HTMLS":
				System.out.println("HTMLS의 점수는 "+score[2]+"입니다");
				break;
			case "컴퓨터구조":
				System.out.println("컴퓨터구조의 점수는 "+score[3]+"입니다");
				break;
			case "안드로이드":
				System.out.println("안드로이드의 점수는 "+score[4]+"입니다");
				break;
			default:
				System.out.println("없는 과목입니다");
				break;
			}
			System.out.print("과목 이름: ");
			name = sc.next();
			
		}
		sc.close();
		return ;
	}

}
