package Day4;
import java.util.Scanner;
public class HW_Gift {
    public static void main(String[] args) {
        Scanner myCart = new Scanner(System.in);
        System.out.println("\t \t id prices: \n");
        System.out.println("\t \t 123:$2.49 \n");
        System.out.println("\t \t 124:$4.79 \n");
        System.out.println("\t \t 125:$1.65 \n");
        System.out.println("\t \t 126:$7.88 \n");
        System.out.println("\t \t 127:$0.99 \n");
        System.out.println("Please enter item1 id:\n");
        int itemId1 = 123;
        itemId1 = myCart.nextInt();
        if (!(itemId1 == 123))
        {
            System.out.println("Please enter appropriate itemId1:");
        }
        System.out.println("Please enter quantity1:\n");
        int quantity1 = 1;
        quantity1 = myCart.nextInt();
        System.out.println("Please enter item2 id:\n");
        int itemId2 = 124;
        itemId2 = myCart.nextInt();
        if (!(itemId2 == 124))
        {
            System.out.println("Please enter appropriate itemId2:");
        }
        System.out.println("Please enter quantity2:\n");
        int quantity2 = 1;
        quantity2 = myCart.nextInt();
        System.out.println("Please enter item3 id:\n");
        int itemId3 = 125;
        itemId3 = myCart.nextInt();
        if (!(itemId3 == 125))
        {
            System.out.println("Please enter appropriate itemId3:");
        }
        System.out.println("Please enter quantity3:\n");
        int quantity3 = 1;
        quantity3 = myCart.nextInt();
        if (itemId1 == 123 && quantity1 == 1 && itemId2 == 124 && quantity2 == 1 && itemId3 == 125 && quantity3 == 1)
        {
            double a= quantity3*1.65;
            double b = quantity2*4.79;
            double c = quantity1*2.49;
            System.out.println("item id \tquantity \t price");
            System.out.println("------------------------------");
            System.out.println("123 \t \t 1  \t \t $"+(quantity1*2.49));
            System.out.println("124 \t \t 1  \t \t $"+(quantity2*4.79));
            System.out.println("125 \t \t 1  \t \t $"+(quantity3*1.65));
            System.out.print("Total \t \t "+(quantity1 + quantity2 + quantity3));
            System.out.print("\t \t  \t $" +(a+b+c));

        }
        else if (!(itemId1 == 123 && itemId2 == 124 && itemId3 == 125))
        {
            System.out.println("Please run the code again w/t appropriate itemIds:");
        }
        else if (quantity1 >= 1 && quantity2 >= 1 && quantity3 >= 1)
        {
            double a= quantity3*1.65;
            double b = quantity2*4.79;
            double c = quantity1*2.49;
            System.out.println("item id \tquantity \t price");
            System.out.println("------------------------------");
            System.out.println("123 \t \t 1  \t \t $"+(quantity1*2.49));
            System.out.println("124 \t \t 1  \t \t $"+(quantity2*4.79));
            System.out.println("125 \t \t 1  \t \t $"+(quantity3*1.65));
            System.out.print("Total \t \t "+(quantity1 + quantity2 + quantity3));
            System.out.print("\t \t  \t $" +(a+b+c));
        }
    }
}
