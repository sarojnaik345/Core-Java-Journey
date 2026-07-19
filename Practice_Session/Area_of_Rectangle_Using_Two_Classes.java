import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class GetLengthWeidth{
    private int  length ;
    private int weidth;
    void set(int length,int weidth)
    {
        this.length = length;
        this.weidth = weidth;
    }
    int getLength()
    {
        return this.length;
    }
    int getWeidth()
    {
        return this.weidth;
    }
}
class AreaRectangle{
     
    AreaRectangle(int length, int weidth)
    {
        float area = length * weidth;
        System.out.println("Area of reactangle is : "+area);
    }
}

public class Area_of_Rectangle_Using_Two_Classes {
    public static void main(String args[])
    {
        try{
            BufferedReader ob = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enetr the lenght of rectangle:");
        int weidth = Integer.parseInt(ob.readLine());
        System.out.println("Enetr the lenght of rectangle:");
        int height = Integer.parseInt(ob.readLine());
         GetLengthWeidth glw = new GetLengthWeidth();
        glw.set(weidth,height);
        
        AreaRectangle ar = new AreaRectangle(glw.getLength(),glw.getWeidth());
        }
        catch(IOException io)
        {
            System.out.println(io);
        }
       

    }
}
