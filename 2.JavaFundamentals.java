import java.util.Scanner;

class JavaFundamentals {

    public static void run() {

        // nameAgeAndAnnualIncome();
        // nameAgeAndInitials();
        personalInformation();
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

        System.out.println(
                "My name is " + name + "," + " my age is " + age + " and I hope to earn " + annualPay + " per year.");

    }

    public static void nameAgeAndInitials() {

        String firstName = "Nata";
        String middleName = " ";
        String lastName = "Stor";
        char firstInitial = 'N';
        char middleInitial = ' ';
        char lastInitial = 'S';

        System.out.println("Full name: " + firstName + " " + middleName + " " + lastName);
        System.out.println("Initials: " + firstInitial + ". " + lastInitial + ".");

    }

    public static void personalInformation() {
        String name = "Nataliya";
        String address = "1544 Good Street";
        String city = "Harrisburg";
        String state = "PA";
        int zip = 19873;
        // String phoneNumber = "215-687-1497";
        long phoneNumber = 2156871497l;
        String a = String.valueOf(phoneNumber).substring(0, 3);
        String b = String.valueOf(phoneNumber).substring(3, 6);
        String c = String.valueOf(phoneNumber).substring(7);

        String phoneNumberString = String.join("-", a, b, c);

        String collegeMajor = "Web Development";

        System.out.println(name + "\n" + address + "\n" + city + "\n" + state + "\n" + zip + "\n" + phoneNumberString + "\n" + collegeMajor);
    }

}