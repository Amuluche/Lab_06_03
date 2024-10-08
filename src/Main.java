//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner Scanner=new Scanner(System.in);
        System.out.println("Enter the height of the rectangle: ");
        double height=Scanner.nextInt();
        System.out.println("Enter the width of the rectangle: ");
        double width=Scanner.nextInt();
        double area=height*width;
        double diagonal=height*height + width*width;

        do {System.out.println("The area of the rectangle is "+area);
            if (height > 0 && width > 0){break;}
        }while(height > 0 && width > 0);

        do {System.out.println("The diagonal length of the rectangle is "+diagonal);
            if (height > 0 || width > 0){break;}
        }while(width > 0 || height > 0);

    }
}