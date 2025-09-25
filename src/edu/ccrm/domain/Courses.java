package edu.ccrm.domain;
public class Courses {
	private String code;
    private String title;
    private int credits;
    private Instructor instructor;
    private Semester semester;
    private String department;
    public Courses(String code, String title, int credits, Instructor instructor, Semester semester, String department) {
        this.code = code;
        this.title = title;
        this.credits = credits;
        this.instructor = instructor;
        this.semester = semester;
        this.department = department;
    }
    public void setTitle(String title) { this.title = title; }
    public void setCredits(int credits) { this.credits = credits; }
    public void setInstructor(Instructor instructor) { this.instructor = instructor; }
    public void setSemester(Semester semester) { this.semester = semester; }
    public void setDepartment(String department) { this.department = department; }
    
    public String getCode() { return code; }
    public String getTitle() { return title; }
    public int getCredits() { return credits; }
    public Instructor getInstructor() { return instructor; }
    public Semester getSemester() { return semester; }
    public String getDepartment() { return department; }
    @Override
    public String toString() {
        return String.format("Course[code=%s, title=%s, credits=%d, instructor=%s, semester=%s, department=%s]",
                code, title, credits,
                instructor != null ? instructor.getName() : "TBA",
                semester, department);
    }
}
