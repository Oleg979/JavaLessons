package ermaklessons;

import java.util.Arrays;

public class Test {
    public static void main(String args[]) {
        Student jack = new Student("Jack");
        jack.addGrade(5,4,5,4,5,3,8,2,6,7);
        for(int v : jack.getGrades())
            System.out.print(v + " ");
    }
}
