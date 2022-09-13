package Week_4.Assignment;
class ABC
{
    void sum()
    {
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        int sum = 0;
        for(int i = 0; i< 10; i++)
        {
            sum = sum + array[i];
        }
        System.out.println("The sum is "+ sum);
        try
        {
            for (int i = 0; i < 11; i++)
            {
                sum = sum + array[i];
            }
        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException)
        {
            System.out.println(arrayIndexOutOfBoundsException);
        }
    }
}
public class ArrOutOfBound
 {
    public static void main(String[] args)
    {
        ABC abc=new ABC();
        abc.sum();
    }
 }
