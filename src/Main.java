public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Backend + AI World!");

        // Variables & Data Types
        int age = 25;
        double salary = 4500.75;
        char gender = 'A';
        boolean isBackendDeveloper = true;
        String  name = "Ubaeida";

        // Operators
        int a = 10;
        int b = 5;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);

        // Conditional Statements
        if (age >= 18){
            System.out.println("Adult");
        }else {
            System.out.println("Minor");
        }

        //for loop
        for (int i =1 ; i<=5; i++ ){
            System.out.println("for loop " + i);
        }
        //while loop
        int i =1;
        while (i <=5) {
            System.out.println("while loop " + i);
            i++;
        }

        //Methods
        System.out.println("Methods " + add(a,b));
    }

    //Methods
    static int add(int a, int b){
        return a+b;
    }
}
