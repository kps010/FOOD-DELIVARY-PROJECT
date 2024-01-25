import javax.swing.JOptionPane;
import java.util.*;

class Food_Delivery
{
    final static String GREEN = "\u001b[32;1m";
    final static String YELLOW = "\u001b[33m";
    final static String reset = "\u001b[0m";
    static customer c = new customer("kunal12", "Kunal Prajapati", "12345", "9839743210");
    public static void main(String[] args)
    {
        c ;
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
        System.out.println();
        if(startingChoice==1)
        {
            admin a = new admin();
            a.adminLogin();
        }
        else
        {
            int intial_choice=0;
            while (true)
            {
                intial_choice = homePage();
                if(intial_choice==1 || intial_choice==2)
                {
                    break;
                }
                else
                {
                    intial_choice = homePage();
                }
            }
            System.out.println();
            switch (intial_choice)
            {
                case 1:
                    register();
                    login();
                    menu();
                    break;
                case 2:
                    login();
                    menu();
                    break;
        }
        System.out.println(YELLOW+"\n\nTHANK YOU FOR VISITING!\n"+reset);
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

    static public int homePage()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println(YELLOW+"\n===================================WELCOME====================================");
        System.out.println("\t\t1 . << REGISTER >>\t\t2 . << LOGIN >>");
        System.out.println("==============================================================================");
        System.out.print("\nENTER YOUR CHOICE : "+reset);
        int intial_choice = sc.nextInt();

        return intial_choice;
    }
        //  LOGIN METHOD
    static void login()
    {
        Scanner sc = new Scanner(System.in);
        String id;
        String pass;

        boolean log = false;
        int z=0;
        while (!log)
        {
            if(z>0)
            {
                System.out.println("\nINAVLID USER ID OR PASSWORD !!\n");
            }
            System.out.print("Enter User ID: ");
            id = sc.next();
            System.out.print("Enter password: ");
            pass = sc.next();

            if(!(id.equals(c.id) && pass.equals(c.password)))
            {
                continue;
            }
            else
            {
                log = true;
                break;
            }
        }

    }
        //  REGISTER METHOD
    static void register()
    {
        boolean check = true;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        String mno = "";

        while (true)
        {
            System.out.print("Enter Mobile Number: ");
            mno = sc.next();
            if(mno.length()!=10)
            {
                System.out.println("INVALID LENGTH");
            }
            else if(mno.length()==10)
            {
                for(int i=0 ; i<10 ; i++)
                {
                    if(mno.charAt(i)<='9' && mno.charAt(i)>='0')
                    {
                        continue;
                    }
                    else
                    {
                        check = false;
                        break;
                    }
                }
                if(!check)
                {
                    System.out.println("INVALID");
                }
                else
                {
                    break;
                }
            }
        }
        verifyMobileNo(mno,name);
    }
    static void verifyMobileNo(String mno,String name)
    {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int otp = 1000+random.nextInt(10000);
        JOptionPane.showMessageDialog(null, "YOUR OTP IS : "+otp, "VERIFT", JOptionPane.PLAIN_MESSAGE);
        String enteredOtp = JOptionPane.showInputDialog(null,"ENTER OTP ","enter here");
        if(otp == Integer.parseInt(enteredOtp))
        {
            JOptionPane.showMessageDialog(null, "MOBILE NUMBER VERIFIED!","SUCCESSFUL",JOptionPane.PLAIN_MESSAGE);

            System.out.print("Enter Password: ");
            String pass = sc.next();

            String[] arr = name.split(" ");
            String userId = arr[0] + mno.charAt(7) + mno.charAt(8) + mno.charAt(9);

            System.out.println("\nYOUR USER ID: " + userId);
            System.out.println("YOUR PASSWORD: " + pass + "\n");

            customer c = new customer(userId, name, pass, mno);
            userData.add(c);
            size++;
        }
        else
        {
            JOptionPane.showMessageDialog(null, "WRONG OTP", "INVALID", JOptionPane.ERROR_MESSAGE);
        }
    }
        //  SEARCH METHOD
    static void search()
    {
        Food food = new Food();
        ArrayList<Food> Stock = food.store();
        Scanner sc = new Scanner(System.in);
        System.out.println(YELLOW+"\n==============================================================================");
        System.out.println("1 . SEARCH BY NAME\t 2 . SEARCH BY COMPANY\t 3 . SEARCH BY PRICE");
        System.out.println("==============================================================================");
        System.out.print("\nENTER YOUR CHOICE : "+reset);
        int s = sc.nextInt();
        switch (s)
        {
            case 1:
                food.search_by_name(Stock);
                break;
            case 2:
                food.search_by_restaurant(Stock);
                break;
            case 3:
                food.search_by_price(Stock);
                break;
            default:
                System.out.println("INVALID INPUT");
                break;
        }
    }
}