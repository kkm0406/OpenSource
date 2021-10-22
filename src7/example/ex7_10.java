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
            tmp = a.pop(); 
            if (tmp == null) 
                break;
            else
                s.push(tmp); 
        }
        return s;
    }

    public static void main(String[] args) {
        GStack2<Double> gs =
                new GStack2<Double>();
        for (int i = 0; i < 5; i++) {
            gs.push(new Double(i));
        }
        gs = reverse(gs);
        for (int i = 0; i < 5; i++) {
            System.out.println(gs.pop());
        }

    }
}

