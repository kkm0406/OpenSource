import java.util.Scanner;

public class example14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String course[] = {"Java", "C++", "HTMLS", "��ǻ�ͱ���", "�ȵ���̵�"};
		int score[] = {95, 88, 76, 62, 55};
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �̸�: ");
		String name = sc.next();
		while(!name.equals("�׸�")) {
			switch(name) {
			case "Java":
				System.out.println("Java�� ������ "+score[0]+"�Դϴ�");
				break;
			case "C++":
				System.out.println("C++�� ������ "+score[1]+"�Դϴ�");
				break;
			case "HTMLS":
				System.out.println("HTMLS�� ������ "+score[2]+"�Դϴ�");
				break;
			case "��ǻ�ͱ���":
				System.out.println("��ǻ�ͱ����� ������ "+score[3]+"�Դϴ�");
				break;
			case "�ȵ���̵�":
				System.out.println("�ȵ���̵��� ������ "+score[4]+"�Դϴ�");
				break;
			default:
				System.out.println("���� �����Դϴ�");
				break;
			}
			System.out.print("���� �̸�: ");
			name = sc.next();
			
		}
		sc.close();
		return ;
	}

}
