import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("enter String to reverse :");
        String before=sc.nextLine();
        String[] arr=before.split(" ");
        int length=arr.length;
        String aftre="";
        for(int i=length-1;i>=0;i--)
        {
           aftre+=arr[i]+" ";

        }

        System.out.println("after rev string is ::"+aftre);

                    }
}
