class Student {
    private String name;
    private String bloodGroup;
    private int age;
    private String registrationNumber;  // New private field for registration number

    // Constructor
    public Student(String name, String bloodGroup, int age, String registrationNumber) {
        this.name = name;
        this.bloodGroup = bloodGroup;
        this.age = age;
        this.registrationNumber = registrationNumber;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for blood group
    public String getBloodGroup() {
        return bloodGroup;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Getter for registration number
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    // Setter for name (optional, if you need to modify name after object creation)
    public void setName(String name) {
        this.name = name;
    }

    // Setter for blood group (optional, if you need to modify blood group after object creation)
    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    // Setter for age (optional, if you need to modify age after object creation)
    public void setAge(int age) {
        this.age = age;
    }

    // Setter for registration number (optional, if you need to modify registration number after object creation)
    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }
}

public class StudentManagement {
    public static void main(String[] args) {
        // Creating a Student object with registration number
        Student student = new Student("Raj", "A+", 12, "2023bit601");

        // Displaying Student details
        System.out.println("\nStudent Details:");
        System.out.println("Name: " + student.getName());
        System.out.println("Blood Group: " + student.getBloodGroup());
        System.out.println("Age: " + student.getAge());
        System.out.println("Registration Number: " + student.getRegistrationNumber());
    }
}
