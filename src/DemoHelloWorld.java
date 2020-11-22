/*import java.util.Scanner;

public class DemoHelloWorld {
    public static void main(String [] args){
methods of Scanner class
                    String next();
This method will read the next available string from the input
                    input: Vaibhav Diwan
            input: 123 vaibhav
                    String String
                            close();

                            how to call a method
                    Scanner object=new Scanner(System.in);
object.next();
String nextLine(); // This will read complete line from the input


import java.util.Scanner;
construct an object
                    objectName=new type(System.in);
you can combine declaration and construction of object
                    Scanner object = new Scanner(System.in);// declaration and construction of an object

                    className objectReference=new className(arguments);












        System.out.print("Hello,");
        System.out.print(rollNumber+",");
        System.out.print(rank);
        System.out.println(f);
        user input by using scanner class
                Scanner class
    // to create an object
        type objectReference;  // declarations of an object
        className nameOfObject;
        // construct an object
        className objectReference=new className(arguments);
        create an  object of scanner class
                Scannner object=new Scannner(System.in)
    }
}
*/

/*import java.util.Scanner;
public class DemoHelloWorld {
        public static void main(String [] args){
        Scanner object = new Scanner(System.in);
       // String name;
      //  name="vaibhav";
       // String FullName=new String("vaibhav diwan");
       // String s="a";
              //  System.out.println("Enter you fullName");
            //  String name=object.nextLine();
            //  System.out.println("Enter your age");
            //  byte age=object.nextByte();
            //  System.out.println("Enter 4 digit code");
            // short code=object.nextShort();
            //  System.out.println("Enter your cpi");
            //   double cpi=object.nextDouble();
            //   int mob=9826798267;
              /*   System.out.println("Enter your mobile number");
                 long mob=object.nextLong();
                 System.out.println("Enter your exam status true for pass/false for fail");
                 boolean passed = object.nextBoolean();
                 System.out.println("Name : "+name);
                 System.out.println("4-digit code:"+code);
                System.out.println("CPI:"+cpi);
                System.out.println("Mobile Number:"+mobile);
                System.out.println("Passes:"+passed);



        } */


        import java.util.Scanner;
        public class DemoHelloWorld {
            public static void main(String[] args) {
                Scanner object=new Scanner(System.in);
                System.out.println("Enter your firstName");
                String firstName=object.next();
                System.out.println("Enter your rollNumber");
                int rollNumber=object.nextInt();
                System.out.println("Enter your percentage");
                double percentage=object.nextDouble();
                System.out.println("Enter your section");
                String section=object.next();
                System.out.println("Enter your course year");
                int year=object.nextInt();
                object.nextLine();
                System.out.println("Enter your course");
                String course=object.nextLine();
                // output
                System.out.println("FirstName :"+firstName);
                System.out.println("Roll Number :"+rollNumber);
                System.out.println("Percentage :"+percentage);
                System.out.println("Section :"+section);
                System.out.println("Year :"+year);
                System.out.println("Course :"+course);

            }
        }