import java.util.*;

class Deepsthambh
{
    public void Display(String s)
    {
        for(int i = 0; i < s.length(); i++)
        {
            System.out.println(s.charAt(i));
        }
    }
}

class Program296
{
    public static void main(String Ar[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Please string : ");
        String str = sobj.nextLine();

        Deepsthambh obj = new Deepsthambh();
        obj.Display(str);
    }
}