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

class MaxMin
{
    int max(int number[])
    {   
       int max=0;
        for(int i=0;i<number.length;i++)
        {
            if(number[max]<number[i])
            {
                max=i;
            }
        }
        return(number[max]);
    }

    int min(int number[])
    {
       int min=0;
        for(int i=0;i<number.length;i++)
        {
            if(number[min]>number[i])
            {
                min=i;
            }
        }
        return(number[min]);
    }
}
