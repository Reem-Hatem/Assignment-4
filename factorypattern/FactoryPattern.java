package factorypattern;
import java.util.Scanner;
public class FactoryPattern {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter staff rank: ");
        String member=input.nextLine();
        System.out.println("Enter staff salary: ");
        double salary=input.nextDouble();
        System.out.println("Enter staff years of work: ");
        double years=input.nextDouble();
        MemberFactory m = new MemberFactory();
        Staff s = m.getmember(member, salary, years);
        s.GetSalary();
        s.getYearsOfWork();
    }
    
}
