import java.util.Scanner;

class Phone{
    public String name;
    public String tel;
    Phone(String name, String tel){
        this.name = name;
        this.tel = tel;
    }

    public String getName() {
        return name;
    }

    public String getTel() {
        return tel;
    }
}
public class example8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("인원수>> ");
        int num = sc.nextInt();

        Phone[] p = new Phone[num];

        for(int i=0;i<num;i++){
            System.out.print("이름과 전화번호(이름과 번호는 빈 칸없이 입력)>> ");
            String name = sc.next();
            String tel = sc.next();
            p[i] = new Phone(name, tel);
        }
        System.out.println("저장되었습니다...");

        System.out.print("검색할 이름>> ");
        String search = sc.next();
        while(!search.equals("그만")){
            boolean flag = false;
            for(int i=0;i<num;i++){
                if(search.equals(p[i].name)){
                    flag = true;
                    System.out.println(p[i].name+"의 전화번호는 "+p[i].tel+"입니다");
                }
            }
            if(!flag)
                System.out.println(search+"이(가) 없습니다");

            System.out.print("검색할 이름>> ");
            search = sc.next();
        }

        sc.close();
    }
}
