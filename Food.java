import java.util.ArrayList;
import java.util.Scanner;

class Food
{
    String dish_name;
    int food_id;
    double price;
    double set_price;
    String restaurant_name;

    void Display()
    {
        System.out.println();
        System.out.println("Restaurant Name : "+restaurant_name);
        System.out.println("Dish Name : "+dish_name);
        System.out.println("Dish Id : "+food_id);
        System.out.println("Price : "+price);
        //System.out.println();
    }

    Scanner sc = new Scanner(System.in);

    ArrayList<Food> store(){
        ArrayList<Food> F = new ArrayList<>();

//MACDONALD'S
        Food F1 = new Food();
        F1.food_id = 1;
        F1.restaurant_name = "MACDONALD'S";
        F1.dish_name = "McAloo Tikki Burger";
        F1.price = 70;

        Food F2 = new Food();
        F2.food_id = 2;
        F2.restaurant_name = "MACDONALD'S";
        F2.dish_name = "McVeggie Burger";
        F2.price = 160;

        Food F3 = new Food();
        F3.food_id = 3;
        F3.restaurant_name = "MACDONALD'S";
        F3.dish_name = "McSpicy Delux Panner Burger";
        F3.price = 220;

//DOMINO's
        Food F4 = new Food();
        F4.food_id = 4;
        F4.restaurant_name = "DOMINO'S";
        F4.dish_name = "Farmhouse";
        F4.price = 460;

        Food F5 = new Food();
        F5.food_id = 5;
        F5.restaurant_name = "DOMINO'S";
        F5.dish_name = "Margherita";
        F5.price = 240;

        Food F6 = new Food();
        F6.food_id = 6;
        F6.restaurant_name = "DOMINO'S";
        F6.dish_name = "Garlic Breadsticks";
        F6.price = 110;

//BURGER KING
        Food F7 = new Food();
        F7.food_id = 7;
        F7.restaurant_name = "BURGER KING";
        F7.dish_name = "Whooper Jr Veg with Cheese Burger";
        F7.price = 175;

        Food F8 = new Food();
        F8.food_id = 8;
        F8.restaurant_name = "BURGER KING";
        F8.dish_name = "Crispy Veg Burger + Fries";
        F8.price = 185;

        Food F9 = new Food();
        F9.food_id = 9;
        F9.restaurant_name = "BURGER KING";
        F9.dish_name = "BK Veggie Burger + Taco";
        F9.price = 230;

//BELGIAN WAFFLE
        Food F10 = new Food();
        F10.food_id = 10;
        F10.restaurant_name = "BELGIAN WAFFLE";
        F10.dish_name = "Almond Brownie Waffle";
        F10.price = 185;


        Food F11 = new Food();
        F11.food_id = 11;
        F11.restaurant_name = "BELGIAN WAFFLE";
        F11.dish_name = "Naked Nutella Waffle";
        F11.price = 185;

        Food F12 = new Food();
        F12.food_id = 12;
        F12.restaurant_name = "BELGIAN WAFFLE";
        F12.dish_name = "Death by Chocolate Waffle Cake(Single Layer)";
        F12.price = 360;

//SHAKTI SANDWICHES
        Food F13 = new Food();
        F13.food_id = 13;
        F13.restaurant_name = "SHAKTI";
        F13.dish_name = "Pizza Sandwich";
        F13.price = 220;

        Food F14 = new Food();
        F14.food_id = 14;
        F14.restaurant_name = "SHAKTI";
        F14.dish_name = "Boss Sandwich(Best of Shakti Sandwich)";
        F14.price = 200;

        Food F15 = new Food();
        F15.food_id = 15;
        F15.restaurant_name = "SHAKTI";
        F15.dish_name = "Cheese Veg Sandwich";
        F15.price = 180;

        F.add(F1);
        F.add(F2);
        F.add(F3);
        F.add(F4);
        F.add(F5);
        F.add(F6);
        F.add(F7);
        F.add(F8);
        F.add(F9);
        F.add(F10);
        F.add(F11);
        F.add(F12);
        F.add(F13);
        F.add(F14);
        F.add(F15);

        return F;
    }
    void display_all(ArrayList<Food> f)
    {
        for (int i=0;i<f.size();i++)
        {
            if (i%3==0)
            {
                System.out.println("======================================================");
                System.out.println("Restaurant Name : "+f.get(i).restaurant_name);
                System.out.println("Dish Name : "+f.get(i).dish_name);
                System.out.println("Dish Id : "+f.get(i).food_id);
                System.out.println("Price : "+f.get(i).price);
            }

            else
            {
                System.out.println();
                System.out.println("Restaurant Name : "+f.get(i).restaurant_name);
                System.out.println("Dish Name : "+f.get(i).dish_name);
                System.out.println("Dish Id : "+f.get(i).food_id);
                System.out.println("Price : "+f.get(i).price);
            }
        }
        System.out.println("======================================================");
    }

    void search_by_price(ArrayList<Food> f)
    {
        System.out.println("Choose Option");
        System.out.println("1. Below 100");
        System.out.println("2. Range 100-200");
        System.out.println("3. Range 200-300");
        System.out.println("4. Over 300");
        int choice = sc.nextInt();

        switch (choice)
        {
            case 1:
            {
                for (int i=0;i<f.size();i++)
                {
                    if (f.get(i).price<=100)
                    {
                        f.get(i).Display();
                    }
                }
                break;
            }

            case 2:
            {
                for (int i=0;i<f.size();i++)
                {
                    if (f.get(i).price>100 && f.get(i).price<=200)
                    {
                        f.get(i).Display();
                    }
                }
                break;
            }

            case 3:
            {
                for (int i=0;i<f.size();i++)
                {
                    if (f.get(i).price>200 && f.get(i).price<=300)
                    {
                        f.get(i).Display();
                    }
                }
                break;
            }

            case 4:
            {
                for (int i=0;i<f.size();i++)
                {
                    if (f.get(i).price>300)
                    {
                        f.get(i).Display();
                    }
                }
                break;
            }

            default:
            {
                System.out.println("Invalid Choice");
            }
        }
    }

    void search_by_name(ArrayList<Food> f)
    {
        System.out.print("Enter Dish Name : ");
        String d_name = sc.nextLine();
        boolean flag = false;
        for (int i = 0; i <f.size(); i++)
        {
            if (d_name.equalsIgnoreCase(f.get(i).dish_name))
            {
                flag = true;
                f.get(i).Display();
            }
        }

        if(flag==false)
        {
            System.out.println("Invalid Name");
        }
    }

    void search_by_restaurant(ArrayList<Food> f) {
        System.out.print("Enter Restaurant Name For Menu : ");
        String rest_name = sc.nextLine();
        boolean flag = false;
        for (int i = 0; i <f.size(); i++)
        {
            if (rest_name.equalsIgnoreCase(f.get(i).restaurant_name))
            {
                flag = true;
                f.get(i).Display();
            }
        }

        if(flag==false)
        {
            System.out.println("Invalid Name");
        }
    }
}

//class Restaurant
//{
//  void add_cart(Restaurant item[])
//    {
//        System.out.print("Enter Item To Add In Your Cart : ");
//        String choice = sc.nextLine();
//
//        for (int i=0;i< item.length;i++)
//        {
//            if (choice.charAt(0)=='Y' || choice.charAt(0)=='y')
//            {
//                set_price += item[i].price;
//            }
//
//            else if (choice.charAt(0)=='N' || choice.charAt(0)=='n')
//            {
//                break;
//            }
//
//            else
//            {
//                System.out.println("Enter Correct Choice");
//            }
//        }
//    }
//
//
//
//    void setPrice()
//    {
//        System.out.print("Enter Quantity : ");
//        int quantity = sc.nextInt();
//        set_price *= quantity;
//    }
//}