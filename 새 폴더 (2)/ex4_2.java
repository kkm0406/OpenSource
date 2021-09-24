import java.util.Scanner;

class rectangle{
    int width;
    int height;

    public int getArea(){
        return width*height;
    }
}
public class ex4_2 {
    public static void main(String[] args) {
        rectangle rect = new rectangle();
        Scanner sc = new Scanner(System.in);
        System.out.print(">> ");
        rect.width = sc.nextInt();
        rect.height = sc.nextInt();
        System.out.println("사각형의 면적은 "+rect.getArea());

    }
}
