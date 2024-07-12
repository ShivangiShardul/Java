import java.util.PriorityQueue;

class StudentPriorityQueue {

    public static void main(String[] args) {
      PriorityQueue<Student> priorityQueue= new PriorityQueue<>(new java.util.Comparator<Student>() {
          @Override
          public int compare(Student student, Student s1) {
              return student.getGrade() - s1.getGrade();
          }
      });

        priorityQueue.offer(new Student("Pratik",'A'));
        priorityQueue.offer(new Student("Shyam",'C'));
        priorityQueue.offer(new Student("Mayank",'D'));
        priorityQueue.offer(new Student("Pradip",'B'));
        priorityQueue.offer(new Student("Shubh",'A'));

        System.out.printf("Queue is %s\n",priorityQueue);
        System.out.printf("Got %s\n", priorityQueue.poll());
        System.out.printf("Got %s\n", priorityQueue.poll());
        System.out.printf("Got %s\n", priorityQueue.poll());
        System.out.printf("Got %s\n", priorityQueue.poll());
        System.out.printf("Got %s\n", priorityQueue.poll());

    }

    private static class Student{
        private final String name;
        private final char grade;

        public Student(String name, char grade) {
            this.name = name;
            this.grade = grade;
        }

        public String getName() {
            return name;
        }

        public char getGrade() {
            return grade;
        }

        @Override
        public String toString() {
            return name + " : " + grade ;
        }
    }
}
