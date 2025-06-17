import java.util.Scanner;
public class AgeChecker {
        Scanner scanner=new Scanner(System.in);
    public void readNameAndAge() {
        String name;
        int age;
        System.out.print("Name? :");
        name=scanner.next();
        System.out.print("Age? :");
        age=scanner.nextInt();
        System.out.println("Hello "+name+",You are "+age+ " years old springs young");
    }
    public static void main(String[] args)
    {
        (new AgeChecker()).readNameAndAge();
    }
}
