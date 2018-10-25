package ermaklessons;

import java.util.Iterator;

public class GradesList implements Iterable<Integer> {
    private Grade head = null;
    private Grade last = null;
    private int size;
    
    public GradesList(int val) {
        head = new Grade(val);
        last = head;
        size = 1;
    }
    
    public GradesList() {
        size = 0;
    }
    
    public void add(int val) {
        size++;
        if(head == null) {
            head = new Grade(val);
            last = head;
        }
        else {
            Grade grade = new Grade(val);
            last.setNext(grade);
            last = grade;
        }
    }
    
    public int getSize() {
        return size;
    }
    
    @Override
    public Iterator iterator() {
        return new Iterator() {
            private Grade currentGrade = head;

            @Override
            public boolean hasNext() {
                return currentGrade != null;
            }

            @Override
            public Integer next() {
                int val = currentGrade.getValue();
                currentGrade = currentGrade.getNext();
                return val;
            }
        };
    }
}
