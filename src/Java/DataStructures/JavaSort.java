package Java.DataStructures;

import java.util.*;

class Student {
    private int id;
    private String fname;
    private double cgpa;

    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getFname() {
        return fname;
    }

    public double getCgpa() {
        return cgpa;
    }

}

//Complete the code
public class JavaSort {

    static final Comparator<Student> CGPA_ORDER = new Comparator<Student>() {
        @Override
        public int compare(Student o1, Student o2) {
            int cgpaCmpValue = Double.compare(o2.getCgpa(), o1.getCgpa());
            int fnameCmpValue = o1.getFname().compareTo(o2.getFname());
            int idCmpValue = Integer.compare(o1.getId(), o2.getId());
            return cgpaCmpValue != 0 ? cgpaCmpValue : fnameCmpValue != 0 ? fnameCmpValue : idCmpValue;
        }
    };

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<Student> studentList = new ArrayList<Student>();
        while (testCases > 0) {
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            Student st = new Student(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }
        Collections.sort(studentList, CGPA_ORDER);
        for (Student st : studentList) {
            System.out.println(st.getFname());
        }
    }
}



