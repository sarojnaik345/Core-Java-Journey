import java.util.Scanner;

public class Insert_an_element_At_a_given_position {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array:");
        int arr_size = sc.nextInt();
        int array[]= new int[arr_size];

        System.out.println("Enter the element of the array:");
        for(int i =0;i<arr_size;i++)
        {
            array[i] = sc.nextInt();
        }

        System.out.println("the element of the array are:");
         for(int i =0;i<arr_size;i++)
        {
            System.out.print(array[i]+" ");
        }
        System.out.println();
        int element,index_position;
        System.out.println("enter the elemnt to be inserted:");
        element = sc.nextInt();
        System.out.println("enter the index_positon to be inserted:");
        index_position = sc.nextInt();

        if(index_position> arr_size || index_position<0)
        {
            System.out.println("invalid index position!");
            
            
        }
        else 
        {
            array[index_position]= element;
            System.out.println("after the insertion:");
            for(int i =0;i<arr_size;i++)
        {
            System.out.println(array[i]+" ");
        }
        }
        
        sc.close();


    }
}
