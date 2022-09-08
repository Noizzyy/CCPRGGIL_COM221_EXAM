public class student{
   
    String surname;
    String firstname;
    char   middleInitial;
    String dateOfBirth;
    int    studentNumber;
    String studentEmailAddress;
    boolean iAmAwesome;

    public void saySurname() {
        System.out.println("surname - " + surname);
    }
    
    public void sayfirstname() {
        System.out.println("firstname - " + firstname);
    }

    public void saymiddleInitial() {
        System.out.println("middleInitial - " + middleInitial);
    }

    public void saydateofbirth() {
        System.out.println("Date of Birth - " + dateOfBirth);   
    }
    public void saystudentnum() {
        System.out.println("Studen Number - " + studentNumber);   
    }
    public void saystudentEmail() {
        System.out.println("studentEmailAddress - " + studentEmailAddress);   
    }
    public void sayiamasomel() {
        System.out.println("iAmAwesome - " + iAmAwesome);   
    }
    
}
