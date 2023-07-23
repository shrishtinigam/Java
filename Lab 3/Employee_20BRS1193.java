public class Employee_20BRS1193{
	int id;
	String name;
	String department;
	int salary;
	String designation;

    public void incentive(){
        salary = (int)(1.1 * (double)salary);
    }

    public void incentive(boolean isExceptional){
        if(isExceptional){
            salary = (int)(1.1 * (double)salary) + 10000;
        }else{
            salary = (int)(1.1 * (double)salary);
        }
    }

    public Employee_20BRS1193(int id, String name, String department, int salary, String designation){
        this.id = id;
	    this.name = name;
	    this.department = department;
	    this.salary = salary;
	    this.designation = designation;
    }
    public static void main(String args[]){
        Employee_20BRS1193 p1 = new Employee_20BRS1193(1, "Meher Shrishti Nigam", "IT", 90000, "Senior Developer");
        Employee_20BRS1193 p2 = new Employee_20BRS1193(2, "Tanisha Kumar", "Manager", 120000, "Senior Manager");
        Employee_20BRS1193 p3 = new Employee_20BRS1193(3, "Lekha Vardhini", "Product", 140000, "Senior Designer");
        
        System.out.println("Salaries Before:");
        System.out.println(p1.salary);
        System.out.println(p2.salary);
        System.out.println(p3.salary);

        p1.incentive();
        p2.incentive(false);
        p3.incentive(true);

        System.out.println("Salaries After Incentive:");
        System.out.println(p1.salary);
        System.out.println(p2.salary);
        System.out.println(p3.salary);
    }
}