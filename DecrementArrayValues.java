//This program prints an array with values decremented by 1 in Java

public class DecrementArrayValues {
    public static void main(String args[])
    {
        int arr[] = {100,200,300,400,500};
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = arr[i]-1;
            System.out.print(arr[i]+" ");
        }
    }
}