package exam1013;

public class StudentExample {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student("홍길동","hong@example.com","20251234");


        System.out.println("Student 1:");
        System.out.println("Name: " + student1.getName());
        System.out.println("Email: " + student1.getEmail());
        System.out.println("ID: " + student1.getId());
        
        System.out.println("Student 2:");
        System.out.println("Name: " + student2.getName());
        System.out.println("Email: " + student2.getEmail());
        System.out.println("ID: " + student2.getId());
    }
}

