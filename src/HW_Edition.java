import java.util.Scanner;
public class HW_Edition
{
    // Design a program for a grocery store. Ask at least 3 items id and quantity to user
    public static void main(String[] args) {
        Scanner myCart = new Scanner(System.in);
        System.out.println("\t \t id prices: \n");
        System.out.println("\t \t 123:$2.49 \n");
        System.out.println("\t \t 124:$4.79 \n");
        System.out.println("\t \t 125:$1.65 \n");
        System.out.println("\t \t 126:$7.88 \n");
        System.out.println("\t \t 127:$0.99 \n");
        System.out.println("Please enter item ID of the 1st item:\n");
        int itemId1;
        itemId1 = myCart.nextInt();
        System.out.println("Please enter quantity:\n");
        int quantity1;
        quantity1 = myCart.nextInt();
        System.out.println("Please enter item ID of the 2nd item:\n");
        int itemId2;
        itemId2 = myCart.nextInt();
        System.out.println("Please enter quantity:\n");
        int quantity2;
        quantity2 = myCart.nextInt();
        System.out.println("Please enter item ID of the 3rd item:\n");
        int itemId3;
        itemId3 = myCart.nextInt();
        System.out.println("Please enter quantity:\n");
        int quantity3;
        quantity3 = myCart.nextInt();
        // Cost
        double cost123 = 2.49;
        double cost124 = 4.79;
        double cost125 = 1.65;
        double cost126 = 7.88;
        double cost127 = 0.99;
        double result123;
        double result124;
        double result125;
        double result126;
        double result127;
        double result223;
        double result224;
        double result225;
        double result226;
        double result227;
        double result323;
        double result324;
        double result325;
        double result326;
        double result327;
        System.out.println("item id \t quantity \t price");
        System.out.println("------------------------------");
        System.out.println(itemId1);
        System.out.println(itemId2);
        System.out.println(itemId3);
        System.out.println(quantity1);
        System.out.println(quantity2);
        System.out.println(quantity3);
        //itemId1
        if (itemId1 == 123)
        {
            System.out.println(result123 = quantity1*cost123);
        }
        if (itemId1 == 124)
        {
            System.out.println(result124 = quantity1*cost124);
        }
        if (itemId1 == 125)
        {
            System.out.println(result125 = quantity1*cost125);
        }
        if (itemId1 == 125)
        {
            System.out.println(result125 = quantity1*cost125);
        }
        if (itemId1 == 126)
        {
            System.out.println(result126 = quantity1*cost126);
        }
        if (itemId1 == 127)
        {
            System.out.println(result127 = quantity1*cost127);
        }
        //itemId2
        if (itemId2 == 123)
        {
            System.out.println(result223 = quantity2*cost123);
        }
        if (itemId2 == 124)
        {
            System.out.println(result224 = quantity2*cost124);
        }
        if (itemId2 == 125)
        {
            System.out.println(result225 = quantity2*cost125);
        }
        if (itemId2 == 126)
        {
            System.out.println(result226 = quantity2*cost126);
        }
        if (itemId2 == 127)
        {
            System.out.println(result227 = quantity2*cost127);
        }
        //itemId3
        if (itemId3 == 123)
        {
            System.out.println(result323 = quantity3*cost123);
        }
        if (itemId3 == 124)
        {
            System.out.println(result324 = quantity3*cost124);
        }
        if (itemId3 == 125)
        {
            System.out.println(result325 = quantity3*cost125);
        }
        if (itemId3 == 126)
        {
            System.out.println(result326 = quantity3*cost126);
        }
        if (itemId3 == 127)
        {
            System.out.println(result327 = quantity3*cost127);
        }
    }
}