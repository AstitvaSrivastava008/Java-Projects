public class modifier {
    // Private variables - encapsulation
    private String name;
    private int age;
    private double gpa;

    // Constructor
    public modifier(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        }
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age with validation
    public void setAge(int age) {
        if (age > 0 && age < 100) {
            this.age = age;
        }
    }

    // Getter for gpa
    public double getGpa() {
        return gpa;
    }

    // Setter for gpa with validation
    public void setGpa(double gpa) {
        if (gpa >= 0.0 && gpa <= 4.0) {
            this.gpa = gpa;
        }
    }

    // Additional method
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age + ", GPA: " + gpa);
    }

    public static void main(String[] args) {
        modifier student = new modifier("John", 20, 3.8);
        student.displayInfo();
        student.setGpa(3.9);
        System.out.println("Updated GPA: " + student.getGpa());
    }
}