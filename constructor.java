
public class constructor{ //// DEFINING CLASS
    public static class student{ /// creating an object (student)
        int rno;
        String name;
        double percent;


        public void printinfo()/// creating a function for printing purpose
        {
            System.out.println(this.name);
            System.out.println(this.percent);
        }


      /// types of constructors
        /// TYPE 1: NON - PARAMETERISED constructor
       /* student()
        {
            System.out.println(" constructor has been called");
            //IF NOT CALLED JAVA CREATES ITS OWN CONSTRUCTOR
        }*/

    ///TYPE 2:PARAMETERISED constructor
//    student(String name,int percent)
//    {
//        this.name=name;
//        this.percent=percent;
//    }

   /// type 3: copy constructors
    student(student s2)
    {
        this.name=s2.name;
        this.percent=s2.percent;
    }

    student(){}///empty constructor

}
    public static void main(String[] args) {
     student x= new student();
       x.name="aman";
       x.percent=90;
        student y =new student(x);
        y.printinfo() ;

       // System.out.println(x.name);

        /// calling a function

    }
}
