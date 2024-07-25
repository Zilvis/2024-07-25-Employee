public class Manager extends Employee{
    private String department;

    public Manager(String name, float salary, String department) {
        super(name, salary);
        this.department = department;
    }

    @Override
    public String getDetails(){
        return String.format("%s,%s",super.getDetails(),getDepartment());
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }


}
