import java.util.*;
public class Insert_an_element_At_a_given_position1 {
    public static void main( String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array: ");
        int arr_size = sc.nextInt();

        int array[] = new int[arr_size+1];
        System.out.println("enter the elemrnt of array:");
        for(int i = 0;i<arr_size;i++)
        {
            array[i]=sc.nextInt();
        }

        System.out.println("enter the elemrnt of array:");
        for(int i = 0;i<arr_size;i++)
        {
            System.out.print(array[i]+" ");
        }
        System.out.println();
        System.out.println("enter the elemrnt to be inserted:");
        int element = sc.nextInt();
        System.out.println("enter the index position the  elemrnt to be inserted:");
        int index_position = sc.nextInt();

        if(index_position>arr_size||index_position<0)
            System.out.println("invalid index postion!.");
        else{
            for(int i =arr_size;i>index_position;i--){
                array[i]=array[i-1] ;
            }
            array[index_position] = element;
        }
        System.out.println("enter the elemrnt of array:");
        for(int i = 0;i<=arr_size;i++)
        {
            System.out.print(array[i]+" ");
        }

        sc.close();

    }

}
