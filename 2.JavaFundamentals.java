import java.util.Scanner;

class JavaFundamentals {

    public static void run() {

        //nameAgeAndAnnualIncome();
        nameAgeAndInitials();
    }

    /////////////////////////////////

    public static void nameAgeAndAnnualIncome() {
        String name;
        int age;
        double annualPay;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("What is your name? ");
        name = keyboard.nextLine();

        System.out.println("What is your age? ");
        age = keyboard.nextInt();

        System.out.println("What is your desired annual income? ");
        annualPay = keyboard.nextDouble();

        System.out.println("My name is " + name + "," + " my age is " + age + " and I hope to earn " + annualPay + " per year.");

    }

    public static void nameAgeAndInitials() {

        String firstName = "Nata"; 
        String middleName = " ";  
        String lastName = "Stor"; 
        char firstInitial = 'N';
        char middleInitial = ' ';
        char lastInitial = 'S';

        System.out.println("Full name: " + firstName + " " + middleName + " " + lastName);
        System.out.println("Initials: " + firstInitial + ". " + lastInitial + "." );
       
    }


    public static void personalInformation() {
        
    }

}