import java.util.*;
public class Department {
    String name;
    ArrayList<Doctor> doctors = new ArrayList<>();

    public Department(String name) {
        this.name = name;
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public void displayDepartmentInfo() {
        System.out.println("Department: " + name);
        for (Doctor d : doctors) {
            d.dispalyInfo();
        }
    }
}