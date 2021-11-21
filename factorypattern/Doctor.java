package factorypattern;

public class Doctor implements Staff{
    private double salary;
    private double yearsofwork;
    public Doctor(){}
    public Doctor(double salary, double yearsofwork){
        this.salary=salary;
        this.yearsofwork=yearsofwork;
    }
    public void GetSalary(){
        System.out.println("Doctor salary = "+salary);
    }
    public void getYearsOfWork(){
        System.out.println("Doctor years of work = "+yearsofwork);
    }
}
