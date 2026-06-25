public class TestSingleton
{
    public static void main(String args[])
    {
        Logger l1= Logger.getInstance();
        Logger l2= Logger.getInstance();

        if(l1==l2)
        {
            System.out.println("Only a single object created\nSingleton Successful");
        }
        else
        {
            System.out.println("Multiple objects created");
        }

    }
}