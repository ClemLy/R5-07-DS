public class Q5
{
    public static void main(String[] args)
    {
        if (args.length < 1)
        {
            System.out.println("Veuillez fournir un nombre en paramètre.");
            return;
        }

        try
        {
            int n = Integer.parseInt(args[0]);

            if (n > 0)
            {
                for (int i = 1; i <= n; i++)
                {
                    System.out.println("*".repeat(i));
                }
            }

            else
            {
                System.out.println("Veuillez entrer un nombre positif.");
            }
        }
        
        catch (NumberFormatException e)
        {
            System.out.println("Le paramètre fourni doit être un entier.");
        }
    }
}
