interface Shape1{
    final double PI=3.14;
    void draw();
    double getArea();
    default public void redraw() {
        System.out.print("--- 다시 그립니다. ");
        draw();
    }
}

class Circle1 implements Shape1{
    int r;
    public Circle1(int r) {
        this.r=r;
    }
    public void draw() {
        System.out.println("반지름이 "+r+"인 원 입니다.");
    }
    public double getArea() {
        return r*r*PI;
    }
}

class Oval implements Shape1{
    int x,y;
    public Oval(int x,int y) {
        this.x=x;
        this.y=y;
    }
    public double getArea() {
        return x*y*PI;
    }
    public void draw() {
        System.out.println(x+"x"+y+"에 내접하는 타원입니다.");
    }
}

class Rect1 implements Shape1{
    int x,y;
    public Rect1(int x,int y) {
        this.x=x;
        this.y=y;
    }
    public double getArea() {
        return x*y;
    }
    public void draw() {
        System.out.println(x+"x"+y+"크기의 사각형 입니다.");
    }
}
public class ex14 {
    public static void main(String[] args) {
        Shape1 [] list= new Shape1[3];
        list[0] = new Circle1(10);
        list[1]=new Oval(20,30);
        list[2]=new Rect1(10,40);
        for(int i=0;i<list.length;i++) list[i].redraw();
        for(int i=0;i<list.length;i++) System.out.println("면적은 "+list[i].getArea());
    }
}
