import java.util.Scanner;

public class test
{
    final static String GREEN = "\u001b[32;1m";
    final static String YELLOW = "\u001b[33m";
    final static String reset = "\u001b[0m";
    public static void main(String[] args)
    {
        customer c = new customer("kunal12", "Kunal Prajapati", "12345", "9839743210");
        int startingChoice = 0;
        while (true)
        {
            startingChoice = starting();
            if(startingChoice==1 || startingChoice==2)
            {
                break;
            }
            else
            {
                System.out.println("INVALID CHOICE");
                startingChoice = starting();
            }
        }
    }

    static int starting()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println(YELLOW+"\n===================================WELCOME====================================");
        System.out.println("\t\t1 << ADMIN >>\t\t     2 << CUSTOMER >>");
        System.out.println("==============================================================================");
        System.out.print("\nENTER YOUR CHOICE : "+reset);
        int intial_choice = sc.nextInt();

        return intial_choice;
    }
}
