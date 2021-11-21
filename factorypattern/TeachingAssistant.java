package factorypattern;

public class TeachingAssistant implements Staff {
    private double salary;
    private double yearsofwork;
    public TeachingAssistant(){}
    public TeachingAssistant(double salary, double yearsofwork){
        this.salary=salary;
        this.yearsofwork=yearsofwork;
    }
    public void GetSalary(){
        System.out.println("Teaching assistant salary = "+salary);
    }
    public void getYearsOfWork(){
        System.out.println("Teaching assistant years of work = "+yearsofwork);
    }
}
