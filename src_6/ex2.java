public class ex2 {
    private int x, y, radius;

    public ex2(int x, int y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public String toString() {
        return "Circle("+x+","+y+")반지름"+radius;
    }

    public boolean equals(Object obj) {
        ex2 p = (ex2)obj;
        if(p.x == x && p.y == y) //중심이 같으면 같은 원이다.
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        ex2 a = new ex2(2, 3, 5); // 중심 (2, 3)에 반지름 5인 원
        ex2 b = new ex2(2, 3, 30); // 중심 (2, 3)에 반지름 30인 원
        System.out.println("원 a : " + a);
        System.out.println("원 b : " + b);
        if(a.equals(b))
            System.out.println("같은 원");
        else
            System.out.println("서로 다른 원");
    }
}
