package model;

public class Student implements Comparable<Student> {
    private String name;
    private String lastName;
    private int RFID;

    public Student(String name, String lastName, int RFID) {
        this.name = name;
        this.lastName = lastName;
        this.RFID = RFID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getRFID() {
        return RFID;
    }

    public void setRFID(int RFID) {
        this.RFID = RFID;
    }

    public boolean equals(Student student) {
        return name.equals(student.name)
                && lastName.equals(student.lastName);
    }
    public String getFullName(){
        return name + " " + lastName;
    }

    @Override
    public int compareTo(Student student) {
        return getFullName().compareTo(student.getFullName());
    }

}
