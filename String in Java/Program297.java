import java.util.*;

class Deepsthambh
{
    public int SmallCount(String s)
    {
        int iCnt = 0;

        for(int i = 0; i < s.length(); i++)
        {
            if((s.charAt(i) >= 'a') && (s.charAt(i) <= 'z'))
            {
                iCnt++;
            }
        }
        return iCnt;
    }
}

class Program297
{
    public static void main(String Ar[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Please string : ");
        String str = sobj.nextLine();
        Deepsthambh obj = new Deepsthambh();
        int iRet = obj.SmallCount(str);
        System.out.println("Number of small case letters are : "+iRet);
    }
}