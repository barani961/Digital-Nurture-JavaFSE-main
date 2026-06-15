public class StudentMain {
    public static void main(String[] args) {
        Student student = new Student.Builder()
                .setName("hari")
                        .setFatherName("marley")
                                .setAddress("Square Street")
                                        .build();

        System.out.println(student);
    }
}
