public class Developer extends Employee{
    private String programingLanguage;

    public Developer(String name, float salary, String programingLanguage) {
        super(name, salary);
        this.programingLanguage = programingLanguage;
    }

    @Override
    public String getDetails(){
        return String.format("%s,%s",super.getDetails(),getProgramingLanguage());
    }

    public String getProgramingLanguage() {
        return programingLanguage;
    }

    public void setProgramingLanguage(String programingLanguage) {
        this.programingLanguage = programingLanguage;
    }
}
