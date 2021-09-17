import java.util.Scanner;

public class example16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("컴퓨터와 가위 바위 보 게임을 합니다");
		System.out.print("가위 바위 보!! ");
		String tmp = sc.next();
		String str[] = {"가위", "바위", "보"};
		while(!tmp.equals("그만")) {
			int n = (int)(Math.random()*3);
			if(str[n].equals("가위")) {
				if(tmp.equals("가위"))
					System.out.println("사용자: "+tmp+", 컴퓨터: "+str[n]+", 비겼습니다");
				else if(tmp.equals("바위"))
					System.out.println("사용자: "+tmp+", 컴퓨터: "+str[n]+", 사용자가 이겼습니다");
				else if(tmp.equals("보"))
					System.out.println("사용자: "+tmp+", 컴퓨터: "+str[n]+", 컴퓨터가 이겼습니다");
					
			}
			else if(str[n].equals("바위")) {
				if(tmp.equals("바위"))
					System.out.println("사용자: "+tmp+", 컴퓨터: "+str[n]+", 비겼습니다");
				else if(tmp.equals("보"))
					System.out.println("사용자: "+tmp+", 컴퓨터: "+str[n]+", 사용자가 이겼습니다");
				else if(tmp.equals("가위"))
					System.out.println("사용자: "+tmp+", 컴퓨터: "+str[n]+", 컴퓨터가 이겼습니다");
					
			}
			else if(str[n].equals("보")) {
				if(tmp.equals("보"))
					System.out.println("사용자: "+tmp+", 컴퓨터: "+str[n]+", 비겼습니다");
				else if(tmp.equals("가위"))
					System.out.println("사용자: "+tmp+", 컴퓨터: "+str[n]+", 사용자가 이겼습니다");
				else if(tmp.equals("바위"))
					System.out.println("사용자: "+tmp+", 컴퓨터: "+str[n]+", 컴퓨터가 이겼습니다");
					
			}
			System.out.print("가위 바위 보!! ");
			tmp = sc.next();
		}
		System.out.print("게임을 종료합니다...");
		sc.close();
		return ;
	}

}
