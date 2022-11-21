package io.sankalp.aggregatorservice.dtos;

public class ResponseDTO {

    private String studentName;
    private int rollNumber;
    private int classNumber;
    private AddressDTO address;

    private String parentsPhoneNumber;

    private DepartmentDTO department;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public int getClassNumber() {
        return classNumber;
    }

    public void setClassNumber(int classNumber) {
        this.classNumber = classNumber;
    }

    public AddressDTO getAddress() {
        return address;
    }

    public void setAddress(AddressDTO address) {
        this.address = address;
    }

    public String getParentsPhoneNumber() {
        return parentsPhoneNumber;
    }

    public void setParentsPhoneNumber(String parentsPhoneNumber) {
        this.parentsPhoneNumber = parentsPhoneNumber;
    }

    public DepartmentDTO getDepartment() {
        return department;
    }

    public void setDepartment(DepartmentDTO department) {
        this.department = department;
    }

    public ResponseDTO prepareResponse ( StudentDTO student, DepartmentDTO department ) {
        this.studentName = student.getName ();
        this.address = student.getAddress ();
        this.classNumber = student.getClassNumber ();
        this.department = department;
        this.parentsPhoneNumber = student.getParentsPhoneNumber ();
        this.rollNumber = student.getRollNumber ();

        return this;
    }
}
