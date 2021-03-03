import java.util.Scanner;

class JavaFundamentals {

    public static void run() {

        // nameAgeAndAnnualIncome();
        // nameAgeAndInitials();
        // personalInformation();
        // salesPrediction();
        // salesTax();
        // cookieCalories();
        // milesPerGallon();
        // testAvarage();
        circuitBoardProfit();
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

        System.out.println(name + "\n" + address + "\n" + city + "\n" + state + "\n" + zip + "\n" + phoneNumberString
                + "\n" + collegeMajor);
    }

    public static void salesPrediction() {
        long sales = 4600000;
        double totalSales = 0.62;
        double result = sales * totalSales;

        System.out.println(result);

    }

    public static void landCalculation() {

        double oneAcreOfLand = 43560;
        double squareFeet = 389767;

        double result = squareFeet / oneAcreOfLand;

        System.out.println(result);

    }

    public static void salesTax() {

        double purchase;
        double stateTax = 0.04;
        double countyTax = 0.02;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the amount of a purchase: ");
        purchase = keyboard.nextDouble();

        double stateTaxResult = purchase * stateTax;
        double countyTaxResult = purchase * countyTax;
        double totalOfSale = purchase + stateTaxResult + countyTaxResult;

        System.out.println("The amount of the purchase is: " + purchase);
        System.out.println("The state sales tax is: " + stateTaxResult);
        System.out.println("The county sales tax is: " + countyTaxResult);
        System.out.println("The total of the sale is: " + totalOfSale);
    }

    public static void cookieCalories() {

        Scanner keybord = new Scanner(System.in);
        System.out.println("Enter the number of cookies you ate: ");
        int consumedCookies = keybord.nextInt();

        int oneBagOfCookies = 40;
        int servings = 10;
        int caloriesInServing = 300;

        double caloriesInBag = servings * caloriesInServing;
        double caloriesInCookie = caloriesInBag/oneBagOfCookies;
        double totalCalories = consumedCookies * caloriesInCookie;

        System.out.println("The amount of the cookies consumed: " + consumedCookies);
        System.out.println("The amount of total calories consumed: " + totalCalories);

    }

    public static void milesPerGallon() {

Scanner keyboard = new Scanner(System.in);
System.out.println("Enter the number of miles driven: ");
double milesDriven = keyboard.nextDouble();  
System.out.println("Enter the gallons of gas used: ");
double gasUsed = keyboard.nextDouble();

double result = milesDriven/gasUsed;

System.out.println("Car miles per gallon is: " + result);
    }

    public static void testAvarage() {

Scanner keyboard = new Scanner(System.in);
System.out.println("Enter your first test score: ");
double firstScore = keyboard.nextDouble();
System.out.println("Enter your second test score: ");
double secondScore = keyboard.nextDouble();
System.out.println("Enter your third test score: ");
double thirdScore = keyboard.nextDouble();

double avarage = (firstScore + secondScore + thirdScore)/3;

System.out.println("The first score is: " + firstScore);
System.out.println("The second score is: " + secondScore);
System.out.println("The third score is: " + thirdScore);
System.out.printf("The avarege score is: " + "%.2f", + avarage);

    }

    public static void circuitBoardProfit() {

        
    }
}

