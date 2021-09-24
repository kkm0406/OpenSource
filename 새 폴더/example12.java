import java.awt.desktop.SystemSleepEvent;
import java.util.Arrays;
import java.util.Scanner;

class Seat{
    private String [] seats = new String[10];
    private String [] seatsName = {"S", "A", "B"};

    Seat(){
        Arrays.fill(seats, "---");
    }
    public String[] getSeats() {
        return seats;
    }

    public String getSeatsName(int num) {
        return seatsName[num];
    }

    public void Reservation(String name, int num) {
        seats[num] = name;
    }

    public boolean DeleteSeat(String name) {
        boolean flag = false;
        for(int i=0;i<seats.length;i++){
            if(seats[i].equals(name)){
                seats[i] = "---";
                flag = true;
            }
        }
        if(!flag){
            System.out.println("일치하는 이름이 없습니다");
        }
        return flag;
    }
}

public class example12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("명품콘서트홀 예약 시스템입니다.");
        System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4 >> ");
        Seat[] seat = new Seat[3];
        for(int i=0;i<3;i++){
            seat[i] = new Seat();
        }
        int N = sc.nextInt();
        while(N!=4){
            int seatNum;
            String name;
            int num;
            switch (N) {
                case 1 -> {
                    System.out.print("좌석구분 S(1), A(2), B(3) >> ");
                    seatNum = sc.nextInt();
                    while(true){
                        if(seatNum==1||seatNum==2||seatNum==3){
                            System.out.println(seat[seatNum - 1].getSeatsName(seatNum - 1) + ">>" +
                                    Arrays.toString(seat[seatNum - 1].getSeats()));
                            break;
                        }
                        else{
                            System.out.print("좌석 선택을 다시 해주세요 >> ");
                            seatNum = sc.nextInt();
                        }
                    }
                    System.out.print("이름 >> ");
                    name = sc.next();
                    System.out.print("번호 >> ");
                    num = sc.nextInt();
                    while(true){
                        if(num>=1&&num<=10) {
                            seat[seatNum - 1].Reservation(name, num - 1);
                            break;
                        }
                        else{
                            System.out.print("없는 번호 입니다 다시 입력하세요 >> ");
                            num = sc.nextInt();
                        }
                    }

                }
                case 2 -> {
                    for (int i = 0; i < 3; i++) {
                        System.out.println(seat[i].getSeatsName(i) + ">>" +
                                Arrays.toString(seat[i].getSeats()));
                    }
                    System.out.println("<<<조회를 완료하였습니다>>>");
                }
                case 3 -> {
                    System.out.print("좌석 S(1), A(2), B(3) >> ");
                    seatNum = sc.nextInt();
                    while(true){
                        if(seatNum==1||seatNum==2||seatNum==3){
                            System.out.println(seat[seatNum - 1].getSeatsName(seatNum - 1) + ">>" +
                                    Arrays.toString(seat[seatNum - 1].getSeats()));
                            System.out.print("이름 >> ");
                            name = sc.next();
                            while(true){
                                boolean flag = seat[seatNum - 1].DeleteSeat(name);
                                if(flag)
                                    break;
                                else{
                                    System.out.print("일치하는 이름이 없습니다. 다시 입력하세요 >> ");
                                    name = sc.next();
                                }
                            }


                            break;
                        }
                        else{
                            System.out.print("좌석 선택을 다시 해주세요 >> ");
                            seatNum = sc.nextInt();
                        }
                    }
                }
                default -> {
                    System.out.println("메뉴 번호를 다시 입력하세요");
                }
            }
            System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4 >> ");
            N = sc.nextInt();
        }
        sc.close();
    }
}
