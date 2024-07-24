package academic.model;

/**
 * @author NIM Nama
 */
public class Student {

    private String Id;
    private String Name;
    private String Year;
    private String StudyProgram;

    public Student() {
        this.Id = "";
        this.Name = "";
        this.StudyProgram = "";
        this.Year = "";
    }

    public Student(String Id, String Name, int Year, String StudyProgram) {
        this.Id = "";
        this.Name = "";
        this.Year = "";
        this.StudyProgram = "";

    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getYear() {
        return Year;
    }

    public void setYear(String Year) {
        this.Year = Year;
    }

    public String getStudyProgram() {
        return StudyProgram;
    }

    public void setStudyProgram(String StudyProgram) {
        this.StudyProgram = StudyProgram;
    }

    @Override
    public String toString() {
        return this.Id + "|" +
                this.Name + "|" +
                this.Year + "|" +
                this.StudyProgram;

    }

}