public class Odd_from_500_to_300_While_loop {
    public static void main(String args[])
    {
        int i=500;
        while(i>=300)
        {
            if(i%2!=0)
            {
                System.out.println(i);
            }
            i--;
        }
        System.out.println("Sucess!");
    }
}
