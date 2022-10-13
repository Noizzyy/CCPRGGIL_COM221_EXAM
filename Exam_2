import java.util.Scanner;

public class App {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        // Long exam 2
        // Total points possible (100 pts)
        // Methods and Conditions

        // Part I
        // 1. Create a method.
        // 2. Call the method.
        // 3. Print result of the method.

        // ==============================================================================
        // 1. Create a method that will:
        // print "ODD" if the last two digits of your student number is an odd number
        // print "EVEN" if the last two digits of your student number is an even number.
        // (10 pts)
        oldeven();

    
        // ==============================================================================

        // 2. Create a method that will:
        // print "PRIME" if the last digit of your student number is a prime number
        // print "COMPOSITE" if the last digit of your student number is a composite
        // number.
        // print "NEITHER" if the last digit of your student number is neither a prime
        // nor a composite number.
        // (10 pts)
        comprime();

        

        // ==============================================================================

        //3. Create a method that will return the sum of the character length of your
        //firstname and your surname. (10 pts)
        length();
       

        // ==============================================================================

        //4. Create a method that will take three whole numbers and print the largest
        //number.

        largest();


        // ==============================================================================

        // 5. Create a method and think of a formula to get the last 6 digits of your
        // student number. (10 pts)
        student();
        

        // =========================================================================================================================

        // Part II
        // Print "valid" if the result is true.
        // Print "invalid" if the result is false.

        // ==============================================================================
        // 6. Create a condition to check if the entered student number is your student
        // number. (10 pts)

        studentnum();

        // ==============================================================================

        // 7. Create a condition to check if your firstname is in UPPERCASE and your
        // lastname is in lowercase. (10 pts)
        namecondition1();
      
        // ==============================================================================

        // 8. Create a nested condition that will ask the specialization of the student
        // is taking
        // depending if the student is a BSIT or BSCS student.

        // Condition 1
        // if the student is BSIT, ask again if the student is taking MWAA or MAA.

        // Condition 2
        // if the student is BSCS, ask again if the student is taking ML or DF.
        specialization();


        // ==============================================================================

        // 9. Create a condition to check if the answer belongs to one of the possible
        // answers. (10 pts)

        // STEM
        // ICT
        // ABM
        // HUMSS
        // HOME ECONOMICS
        // ARTS AND DESIGN
        // TVL MARITIME
        strand();

    

        // ==============================================================================

        // 10. Create a condition to check if your student email address contains the
        // following pattern:
        // - Your surname
        // - The string "@students.national-u.edu.ph"
        // (10 pts)
        email();

        // ==============================================================================
        // Programming competition/Job interview level question (20 points)

        // 11. Mystery method :-)

        // Find the formula of method f(n) that accepts any positive integer n.

        // If n = 4, result is 2
        // f(4) = - 1 + 2 - 3 + 4 = 2

        // If n = 5, result is -3
        // f(5) = - 1 + 2 - 3 + 4 - 5 = - 3

    }

        static void oldeven(){
            
            System.out.println("1. ODD or EVEN numbers");
            System.out.print("Enter the last two digits of your student number: ");
            int lastTwoDigits = scan.nextInt();
    
            
            if(lastTwoDigits % 2 == 0){
                System.out.println(lastTwoDigits + "is Even ");
            } else{
                System.out.println(lastTwoDigits + "is Old ");
            }
        }    

        static void comprime(){

            System.out.println("2. PRIME or COMPOSITE number");
            System.out.print("Enter the last digit of your student number: ");
            int lastDigit = scan.nextInt();
            
            int i, m = 0, flag = 0;
            m = lastDigit/2;
                if (lastDigit==0||lastDigit==1){
                    System.out.println(lastDigit + "NITHER");
                }   else{

                    for(i = 2;i <= m; i++){
                        if (lastDigit % i ==0){
                            System.out.println(lastDigit + " is a composite number");
                            flag = 1;
                            break;
                        }
                    }
                    if (flag==0){
                        System.out.println(lastDigit + " is a prime number");
                    }
                }
        }

        static void length(){

            System.out.println("3. Length of your fullname");
            System.out.print("Enter your firstname: ");
            String firstName = scan.next();
            System.out.print("Enter your surname: ");
            String surName = scan.next();

            int totalchar = firstName.length() + surName.length();

            System.out.println("First Name: " + firstName.length());
            System.out.println("Surname: " + surName.length());
            System.out.println("Your fullname: " + firstName + surName);
            System.out.println("Total character of your name is "+ totalchar);

        }
        static void largest(){
                System.out.println("4. Largest Number");
            System.out.print("Enter first number: ");
            int firstNumber = scan.nextInt();
            System.out.print("Enter second number: ");
            int secondNumber = scan.nextInt();
            System.out.print("Enter third number: ");
            int thirdNumber = scan.nextInt();

            if (firstNumber > secondNumber && firstNumber > thirdNumber){
                System.out.println("The largest number is: " + firstNumber);
            }else{
                if (secondNumber > firstNumber && secondNumber > thirdNumber){
                    System.out.println("The largest number is: " + secondNumber);
                }else{
                    if (thirdNumber > firstNumber && thirdNumber > secondNumber){
                        System.out.println("The largest number is: " + thirdNumber);
                    }
                }
            }
        }

        static void student(){
            System.out.println("5. Last six digits");
            System.out.print("Enter your ten digit student number: ");
            int studentNumber = scan.nextInt();
            int lastSixDigits = studentNumber - 2022000000;
    
            System.out.println(lastSixDigits);
            
        }
        static void studentnum(){
            System.out.println("6. Student number validation");
            System.out.print("Enter your ten digit student number: ");
            int studentNumber = scan.nextInt();
            boolean sixIsValid;

            if (studentNumber == 2022103606){
                sixIsValid = true;
            }else{
                sixIsValid = false;
            }
            if (sixIsValid = true){
                System.out.println("Valid");
            }else{
                System.out.println("Invalid");

            }
        }

        static void namecondition1(){
            System.out.println("7. Case sensitivity check");
            System.out.print("Enter your firstname in UPPERCASE: ");
            String firstName = scan.next();
            System.out.print("Enter your surname in lowercase: ");
            String surName = scan.next();
            boolean fNameIsUppercase;
            boolean sNameIsLowercase;



            if (firstName == firstName.toUpperCase()){
                fNameIsUppercase = true;
            }else{
                fNameIsUppercase = false;
            }

            if (surName == surName.toLowerCase()){
                sNameIsLowercase = true;
            }else{
                sNameIsLowercase = false;
            }

            if (fNameIsUppercase = true){
                if (sNameIsLowercase = true){
                    System.out.println("valid");
                }else{
                    System.out.println("invalid");
                }
            }else{
                System.out.println("invalid");
            }
        }
        static void specialization(){
            System.out.println("8. Nested conditions");
            System.out.print("Enter your enrolled course (BSIT or BSCS): ");
            String course = scan.next();

            if (course.equals("BSIT")) {
                System.out.print("Enter your specialization (MWAA or MAA): ");
                String specialization1 = scan.next();
                System.out.println("valid.");
            } else if (course.equals("BSCS")) {
                System.out.print("Enter your specialization (DF or ML): ");
                String specialization2 = scan.next();
                System.out.println("valid.");
            } else {
                System.out.println("Invalid");
            }
        }
            
            
        static void strand(){
            System.out.println("9. Selection");
            System.out.println("Indicate your Senior High School Strand in CAPITALIZE letter");
            System.out.print("Enter your SHS strand: ");
            String strand = scan.next();
            
            switch (strand){
                case "STEM":
                    System.out.println("VALID");
                    break;
                case "ICT":
                    System.out.println("VALID");
                    break;
                case "HUMSS":
                    System.out.println("VALID");
                    break;
                case "HOME ECONOMICS":
                    System.out.println("VALID");
                    break; 
                case "ARTS AND DESIGN":
                    System.out.println("VALID");
                    break;
                case "TVL MARITIME":
                    System.out.println("VALID");
            default:
                    System.out.println("Invalid");

            }
        }
        static void email(){
            System.out.println("\n10. Validate student email address ");
            System.out.print("Enter your student email address: ");
            String studentEmailAddress = scan.next();
            boolean isEmailValid;

            if (studentEmailAddress == "bagadiongrz@students.national-u.edu.ph"){
                isEmailValid = true;
            }else{
                isEmailValid = false;
            }

            if (isEmailValid = true){
                System.out.println("valid");
            }else{
                System.out.println("invalid");
            }
    }
}
