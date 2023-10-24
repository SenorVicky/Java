import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x;
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }   
        System.out.println("Enter a Number you want to search : ");
        x=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if(x==arr[i])
            {System.out.println(arr[i]+"Number are found at Index : "+ i);
            return;
        }}
    }
}
