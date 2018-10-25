package ermaklessons;

public class Student {
    private String name;
    private GradesList grades = new GradesList();
    
    public Student(String name) {
        this.name = name;
    }
    
    public int[] getGradesAsArray() {
        int[] res = new int[grades.getSize()];
        int count = 0;
        for(int grade : grades) 
            res[count++] = grade;
        return res;
    }

    public GradesList getGrades() {
        return grades;
    };
    
    public void addGrade(int... vals) {
        for(int val : vals)
            grades.add(val);
    }
    
    public String getName() {
        return name;
    }
}
