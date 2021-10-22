import java.util.*;
import java.util.Scanner;
import java.util.Vector;
class GStack2<T> {
    int tos;
    Object [] stck;
    public GStack2() {
        tos = 0;
        stck = new Object [10];
    }
    public void push(T item) {
        if(tos == 10)
            return;
        stck[tos] = item;
        tos++;
    }
    public T pop() {
        if(tos == 0)
            return null;
        tos--;
        return (T)stck[tos];
    }
}
public class ex7_10 {

    public static <T> GStack2<T> reverse(GStack2<T> a) {
        GStack2<T> s = new GStack2<T>();
        while (true) {
            T tmp;
            tmp = a.pop(); // 원래 스택에서 요소 하나를 꺼냄
            if (tmp == null) // 스택이 비었음
                break;
            else
                s.push(tmp); // 새 스택에 요소를 삽입
        }
        return s;
    }// 새 스택을 반환

    public static void main(String[] args) {
// Double 타입의 GStack 생성
        GStack2<Double> gs =
                new GStack2<Double>();
// 5개의 요소를 스택에 push
        for (int i = 0; i < 5; i++) {
            gs.push(new Double(i));
        }
        gs = reverse(gs);
        for (int i = 0; i < 5; i++) {
            System.out.println(gs.pop());
        }

    }
}

