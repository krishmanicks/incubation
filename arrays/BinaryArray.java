import java.util.Arrays;
 
class BinaryArray
{
	 
    private static void swap(int[] A, int i, int j)
    {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
	
    public static void sort(int[] A)
    {
        int pivot = 1;
        int j = 0;

        for (int i = 0; i < A.length; i++)
        {
            if (A[i] < pivot)
            {
                swap(A, i, j);
                j++;
            }
        }
    }
 
    public static void main (String[] args)
    {
        int[] A = { 0, 0, 1, 0, 1, 1, 0, 1, 0, 0 };
 
        sort(A);
        System.out.println(Arrays.toString(A));
    }
}
