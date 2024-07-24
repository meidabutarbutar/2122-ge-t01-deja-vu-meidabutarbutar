package academic.model;

/**
 * @author 12S20049 Meida Butarbutar
 */
public class Course {

    private String code;
    private String Name;
    private int credit;
    private String passingGrade;

    public Course(String code, String Name, int credit, String passingGrade) {
        this.code = code;
        this.Name = Name;
        this.credit = credit;
        this.passingGrade = passingGrade;
    }

    public String getcode() {
        return code;
    }

    public void setcode(String code) {
        this.code = code;
    }

    public String getname() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getcredit() {
        return credit;
    }

    public void setcredit(int credit) {
        this.credit = credit;
    }

    public String getpassingGrade() {
        return passingGrade;
    }

    public void setpassingGrade(String passingGrade) {
        this.passingGrade = passingGrade;
    }

    @Override
    public String toString() {
        return this.code + "|" +
                this.Name + "|" +
                this.credit + "|" +
                this.passingGrade;

    }

}