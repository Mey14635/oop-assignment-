import java.util.Scanner;
    public class RunTillStop {
        Scanner sc = new Scanner(System.in);
        void showHello() {
            String choice;
            System.out.println("for hello type h,anything else to stop ");
            choice = sc.next();
            while ("h".equals(choice)) {
                System.out.println("hello");
                choice = sc.next();
            }
            System.out.println("stop");

        }
    }


