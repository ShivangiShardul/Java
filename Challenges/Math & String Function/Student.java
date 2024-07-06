class Student {

    String name;
    int age;
    int rollNumber;
    String house;

    Student(){

    }

    Student(String name, int age, int rollNumber, String house){
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
        this.house = house;
    }

    public String toString(){
        return "Student name is " + name + " , age " + age + " years, and roll number " + rollNumber + " is living in " + house;
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.name = "Niti";
        student.age = 25;
        student.rollNumber = 12;
        student.house = "East Aria";
        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student);

        Student student1 = new Student("Manik",28,22,"Lokhandwala");
        System.out.println(student1);
    }

}
