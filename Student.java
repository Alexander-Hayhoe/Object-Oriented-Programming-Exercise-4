public class Student extends User {

    int cohortNumber;
    String name;
    private String age;

    public Student(String name, int age, int cohortNumber) {
        super(name, age);
        this.cohortNumber = cohortNumber;
    }

    public void studentDisplay() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Cohort: " + this.cohortNumber);
    }
}
