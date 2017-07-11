import java.util.Scanner;
class FindMaxMin
{
    public static void main(String[] args)
    {        
        Scanner sc = new Scanner(System.in);
        MaxMin num = new MaxMin();
        System.out.println("total numbers");
        int N= sc.nextInt();
        int number[] = new int[N];
        System.out.println("Enter numbers");
        for(int i=0;i<N;i++)
        {
            number[i] = sc.nextInt();
        }
        System.out.println("Maximum number is :"+ num.max(number));
        System.out.println("Minimum number is :"+ num.min(number));
        
    }
}
