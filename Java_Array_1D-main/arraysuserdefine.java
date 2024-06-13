
import java.util.*;
public class arraysuserdefine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the Size ");
        int size = sc.nextInt();
        int numbers[] = new int[size];

        System.out.println("Please Enter your number ");
        for(int i = 0; i < size ;i++) {
            numbers[i]= sc.nextInt();
        }
        System.out.println("The array is : ");
        for(int i = 0; i< size;i++){
            System.out.println(numbers[i]);

        }
            
        }
    }

