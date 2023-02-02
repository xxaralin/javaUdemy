public class Worker {
    public int year=2022;
    private String name;
    private String birthDate;
    protected String endDate;

    public Worker(){

    }
    public Worker(String name, String birthDate){
        this.name=name;
        this.birthDate=birthDate;
    }
    public int getAge(){
        return year-Integer.parseInt(birthDate.substring(6));
    }
    public double collectPay(){
        return 0.0;
    }
    public void terminate(String endDate){
        this.endDate=endDate;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Worker worker1=new Worker("Hasan","23/05/1985");
        System.out.println(worker1);
        System.out.println(worker1.getAge());


        Employee employee1=new Employee("Blair","12/10/1997","13/04/2009");
        System.out.println(employee1);
        System.out.println("Age= "+employee1.getAge());
        System.out.println("Pay= "+employee1.collectPay());

        Employee employee2=new Employee("Serena","02/01/1997","13/04/2009");
        System.out.println(employee2);
        System.out.println("Age= "+employee2.getAge());
        System.out.println("Pay= "+employee2.collectPay());



        SalariedEmployee salariedEmployee1=new SalariedEmployee("Mahmut","24/09/1995","15/05/2015",30000);
        System.out.println(salariedEmployee1);
        System.out.println("pay= "+salariedEmployee1.collectPay());
        salariedEmployee1.retire();
        System.out.println("retired pay= "+salariedEmployee1.collectPay());



    }
}

class Employee extends Worker{
    private long employeeId;
    private String hireDate;
    private static int employeeNo=1;
    Employee(String hireDate){
        this.employeeId=Employee.employeeNo++;
        this.hireDate=hireDate;
    }
    Employee(String name,String birthDate, String hireDate){
        super(name, birthDate);
        this.employeeId=Employee.employeeNo++;
        this.hireDate=hireDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", hireDate='" + hireDate + '\'' +
                "} " + super.toString();
    }
}

class SalariedEmployee extends Employee{

    private double annualSalary;
    private boolean isRetired;
    SalariedEmployee(String name,String birthDate, String hireDate, double annualSalary){
        super(name, birthDate,hireDate);
        this.annualSalary=annualSalary;
    }
     public void retire(){
        terminate("12/12/2022");
        isRetired=true;
     }

     @Override
     public double collectPay(){
        double paycheck=annualSalary/26;
        double adjustedPay=(isRetired)? 0.7* paycheck : paycheck;
        return (int) adjustedPay;
     }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "annualSalary=" + annualSalary +
                ", isRetired=" + isRetired +
                "} " + super.toString();
    }
}
