package academic.model;

import java.util.Scanner;

/**
 * @author 12S20049 MeidaButarbutar
 */
public class Enrollment {

    private String Code;
    private String Id;
    private String AcademicYear;
    private String Semester;
    Scanner input = new Scanner(System.in);

    public Enrollment() {
        this.Code = input.nextLine();
        this.Id = input.nextLine();
        this.AcademicYear = input.nextLine();
        this.Semester = input.nextLine();
    }

    public void setCode(String Code) {
        this.Code = Code;

    }

    public String getCode() {
        return Code;
    }

    public void setId(String Id) {
        this.Id = Id;

    }

    public String getId() {

        return Id;
    }

    public void setAcademicYear(String AcademicYear) {
        this.AcademicYear = AcademicYear;

    }

    public String getAcademicYear() {
        return AcademicYear;
    }

    public void setSemester(String Semester) {
        this.Semester = Semester;

    }

    public String getSemester() {
        return Semester;

    }

    @Override
    public String toString() {
        return this.Code + "|" +
                this.Id + "|" +
                this.AcademicYear + "|" +
                this.Semester + "None";

    }
}
