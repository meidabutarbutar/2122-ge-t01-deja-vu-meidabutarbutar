package academic.driver;

import academic.model.Enrollment;

/**
 * @author 12S0049 Meida Butarbutar
 */
public class Driver3 {

    public static void main(String[] _args) {

        Enrollment enrollment = new Enrollment();

        {
            enrollment.setCode("");
            enrollment.setId("");
            enrollment.setAcademicYear("");
            enrollment.setSemester("");
        }
        {
            System.out.println(enrollment);
        }
    }

}