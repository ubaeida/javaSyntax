import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Backend + AI World!");

        // Variables & Data Types
        int age = 25;
        double salary = 4500.75;
        char gender = 'A';
        boolean isBackendDeveloper = true;
        String name = "Ubaeida";

        // Operators
        int a = 10;
        int b = 5;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);

        // Conditional Statements
        if (age >= 18) {
            System.out.println("Adult");
        } else {
            System.out.println("Minor");
        }
        System.out.println("short if statement " + (age >= 18 ? "Adult" : "Minor"));

        //for loop
        for (int i = 1; i <= 5; i++) {
            System.out.println("for loop " + i);
        }
        //while loop
        int number = 1;
        while (number <= 5) {
            System.out.println("while loop " + number);
            number++;
        }

        //Methods
        System.out.println("Methods " + add(a, b));

        //Arrays
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Numbers array " + Arrays.toString(numbers));
        for (int num : numbers) {
            System.out.println(num);
        }
        System.out.println("numbers[0]= "  + numbers[0]);
        System.out.println("numbers.length= " +numbers.length);

        // Creating an ArrayList
        ArrayList<Integer> list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println("ArrayList " + list);

        //HashMsp
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Ubaeida", 30);
        hashMap.put("Alkayal", 45);
        hashMap.put("Alaa", 20);
        System.out.println("HashMap " + hashMap);
        for(Map.Entry<String , Integer> entry : hashMap.entrySet()) {
            System.out.println("Entry " + entry);
            System.out.println("Key " +entry.getKey());
            System.out.println("Value " +entry.getValue());
        }
        System.out.println("Hash Map Contains Ubaeida? " + hashMap.containsKey("Ubaeida"));
        System.out.println("Hash Map Contains 20? " + hashMap.containsValue(20));
        System.out.println("Hash Map Contains 25? " + hashMap.containsValue(25));
        hashMap.remove("Alaa");
        System.out.println("HashMap " + hashMap);

        //Exercise 1
        //Find even numbers from 1 to 50.
        for (int i = 0; i <= 50;i++) {
            if (i  % 2 == 0) {
                System.out.println(i);
            }
        }

        //Exercise 2
        System.out.println("Methods " + multiplies(a, b));
        //Compile-Time Polymorphism Exercise
        System.out.println("Compile-Time Polymorphism " + add(5,6));
        System.out.println("Compile-Time Polymorphism " + add(5,6,8));

        //Exercise 4
        //Find the largest number in an array.
        int[] nums = {3,7,2,9,1};
        int largestNum = 0;
        for (int num : nums) {
            if (num > largestNum) {largestNum = num;}
        }
        System.out.println("Largest Number " +largestNum);

        // Exception Handling in java
        // try with resources
        try(Scanner input = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            System.out.println(input.nextInt() /0);
        }catch(InputMismatchException e) {
            System.out.println("That is not a valid number.");
        }catch (ArithmeticException e) {
            System.out.println("You cannot divide by zero!.");
        }catch (Exception e) {
            //Safety net
            System.out.println("Something went wrong");
        }finally {
            System.out.println("This always excited");;
        }
    }

    //Methods
    static int add(int a, int b) {
        return a + b;
    }

    //Compile-Time Polymorphism
    static int add(int a, int b, int c) {
        return a + b + c;
    }
    //Exercise 2
    //Create a method that multiplies two numbers.
    static int multiplies(int a, int b) {
        return a * b;
    }

}
