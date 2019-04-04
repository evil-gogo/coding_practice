package bitshifting;

public class Test 
{ 
    public static void leftshift(int i, int j) 
    {
        i <<= j; 
        System.out.println(i);
    } 
    public static void main(String args[]) 
    {
        int i = 4, j = 2; 
        leftshift(i, j); 
        System.out.print(i); 
    } 
}