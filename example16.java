import java.util.Scanner;

public class example16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("��ǻ�Ϳ� ���� ���� �� ������ �մϴ�");
		System.out.print("���� ���� ��!! ");
		String tmp = sc.next();
		String str[] = {"����", "����", "��"};
		while(!tmp.equals("�׸�")) {
			int n = (int)(Math.random()*3);
			if(str[n].equals("����")) {
				if(tmp.equals("����"))
					System.out.println("�����: "+tmp+", ��ǻ��: "+str[n]+", �����ϴ�");
				else if(tmp.equals("����"))
					System.out.println("�����: "+tmp+", ��ǻ��: "+str[n]+", ����ڰ� �̰���ϴ�");
				else if(tmp.equals("��"))
					System.out.println("�����: "+tmp+", ��ǻ��: "+str[n]+", ��ǻ�Ͱ� �̰���ϴ�");
					
			}
			else if(str[n].equals("����")) {
				if(tmp.equals("����"))
					System.out.println("�����: "+tmp+", ��ǻ��: "+str[n]+", �����ϴ�");
				else if(tmp.equals("��"))
					System.out.println("�����: "+tmp+", ��ǻ��: "+str[n]+", ����ڰ� �̰���ϴ�");
				else if(tmp.equals("����"))
					System.out.println("�����: "+tmp+", ��ǻ��: "+str[n]+", ��ǻ�Ͱ� �̰���ϴ�");
					
			}
			else if(str[n].equals("��")) {
				if(tmp.equals("��"))
					System.out.println("�����: "+tmp+", ��ǻ��: "+str[n]+", �����ϴ�");
				else if(tmp.equals("����"))
					System.out.println("�����: "+tmp+", ��ǻ��: "+str[n]+", ����ڰ� �̰���ϴ�");
				else if(tmp.equals("����"))
					System.out.println("�����: "+tmp+", ��ǻ��: "+str[n]+", ��ǻ�Ͱ� �̰���ϴ�");
					
			}
			System.out.print("���� ���� ��!! ");
			tmp = sc.next();
		}
		System.out.print("������ �����մϴ�...");
		sc.close();
		return ;
	}

}
