import java.util.ArrayList;
import java.util.Scanner;
public class admin
{
    final static String BLUE = "\033[1;94m";
    final static String YELLOW = "\u001b[33m";
    final static String reset = "\u001b[0m";
    Scanner sc = new Scanner(System.in);
    Food c = new Food();
    ArrayList<Food> stock = c.store();
    String userName = "admin";
    String password = "admin123";
    void adminLogin()
    {
        String un = "";
        String pass = "";
        int x = 0;
        while (!(un.equals(userName) && pass.equals(pass)))
        {
            if(x>0)
            {
                System.out.println("\nINVALID CREDENTIALS");
            }

            System.out.print(BLUE+"ENTER USER NAME : "+reset);
            un = sc.next();
            System.out.print(BLUE+"ENTER PASSWORD : "+reset);
            pass = sc.next();
            x++;
        }
        makeChanges();
    }

    void checkStock(){
        c.display_all(stock);
    }
    void makeChanges(){
        int choice = 0;
        while (choice!=5) {
            System.out.println(BLUE+"\nWHAT WOULD YOU LIKE TO DO ?");
            System.out.println("\n==============================================================================");
            System.out.println("\t1 . SHOW CARS\t2 . EDIT NAME\t3 . EDIT PRICE\t4 . ADD CAR");
            System.out.println("===============================< 5 . EXIT >===================================");
            System.out.print("ENTER CHOICE : "+reset);
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    checkStock();
                    break;
                case 2:
                    editName();
                    break;
                case 3:
                    editPrice();
                    break;
                case 4:
                    addFood();
                    break;
                case 5:
                    System.out.println(YELLOW+"\n\nOPERATION COMPLETED SUCCESSFULLY\n\n"+reset);
                    Main.main(null);
                    break;
                default:
                    break;
            }
        }
    }
}
