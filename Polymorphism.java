public class Polymorphism {
    public static class Student {
        /// creating an object (student)
        int rno;
        String name;
        double percent;
         int age;

        public void printinfo(String name)/// creating a function for printing purpose
        {
            System.out.println(name);

        }
        public void printinfo(int age)/// creating a function for printing purpose
        {
            System.out.println(age);

        }

        public void printinfo(String name,double percent)/// creating a function for printing purpose
        {
            System.out.println(name+" "+percent+" ");

        }
    }

    public static void main(String[] args) {
        Student x = new Student();
        x.name = "Aman";
        x.percent = 90;

        x.printinfo(x.name, x.percent);



    }
}


