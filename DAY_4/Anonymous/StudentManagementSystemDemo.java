package DAY_4.Anonymous;

abstract class Student {
    abstract void study();
    abstract void writeExam();

    void attendClass() {
        System.out.println("Student attending class");
    }
}

public class StudentManagementSystemDemo {
    public static void main(String[] args) {

        Student student = new Student() {
            @Override
            void study() {
                System.out.println("Studying for exams");
            }

            @Override
            void writeExam() {
                System.out.println("Writing final exam paper");
            }
        };

        student.study();
        student.writeExam();
        student.attendClass();

        Student anotherStudent = new Student() {
            @Override
            void study() {
                System.out.println("Reviewing notes");
            }

            @Override
            void writeExam() {
                System.out.println("Taking online exam");
            }
        };

        anotherStudent.study();
        anotherStudent.writeExam();
        anotherStudent.attendClass();
    }
}