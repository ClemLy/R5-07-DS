public class Q6
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
                // Issue : Inverser l'affichage du triangle
                for (int i = n; i >= 1; i--)
                {
                    // Issue : Afficher des ‘x’ à la place des ‘*’
                    System.out.println("x".repeat(i));
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

        System.out.println("Test");
    }
}
