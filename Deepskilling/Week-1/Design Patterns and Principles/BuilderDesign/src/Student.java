public class Student {
    private final String name;
    private final String address;
    private final String fatherName;


    private Student(Builder builder){
        this.name=builder.name;
        this.address=builder.address;
        this.fatherName=builder.fatherName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", fatherName='" + fatherName + '\'' +
                '}';
    }

    static class Builder{
        private  String name;
        private  String address;
        private  String fatherName;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }



        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Builder setFatherName(String fatherName) {
            this.fatherName=fatherName;
            return this;
        }

        public Student build(){
            return new Student(this);
        }
    }


}
