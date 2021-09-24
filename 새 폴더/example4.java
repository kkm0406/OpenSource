public class example4 {
    public static class Rectangle{
        private int x, y, width, height;
        Rectangle(int x, int y, int w, int h){
            this.x = x;
            this.y = y;
            this.width = w;
            this.height = h;
        }
        public void show(){
            System.out.println("("+x+", "+y+")에서 크기가 "+width+"x"+height+"인 사각형");
        }
        public int square(){
            return width*height;
        }
        public boolean contains(Rectangle tmp){
            if(x<tmp.x && y<tmp.y && (x+width)>(tmp.x+ tmp.width) && (y+height)>(tmp.y+ tmp.height))
                return true;
            else
                return false;
        }
    }
    public static void main(String[] args) {
        Rectangle r = new Rectangle(2, 2, 8, 7);
        Rectangle s = new Rectangle(5, 5, 6, 6);
        Rectangle t = new Rectangle(1, 1, 10, 10);

        r.show();
        System.out.println("s의 면적은 "+s.square());
        if(t.contains(r))
            System.out.println("t는 r을 포함합니다");
        if(t.contains(s))
            System.out.println("t는 s를 포함합니다");
            
        
    }
}
