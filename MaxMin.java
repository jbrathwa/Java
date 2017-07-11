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