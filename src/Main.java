import java.util.List;
import java.util.Scanner;

public class Main {
    private static Scanner scanner;

	public static void main(String[] args) {
    	scanner = new Scanner(System.in);
    	
        //lien du fichier (src/numver.csv pour tester)
        System.out.print("Entrer le lien du csv: ");
        String fileName = scanner.nextLine();
        
        //v�rifie que c'est bien un csv 
        if (!fileName.endsWith(".csv")) {
            System.out.println("fichier invalide");
            scanner.close();
            return;
        }

        //demander � l'utilisateur le type d'op�ration
        System.out.print("+ ou * : ");
        char operation = scanner.nextLine().charAt(0);

        //on v�rifie que l'op�ration est valide
        if (operation != '+' && operation != '*') {
            System.out.println("Op�ration invalide. Juste '+' ou '*'");
            scanner.close();
            return;
        }
        
        //On d�clare nos classes
        InputFile input = new InputFile();
        Calculating calculating = new Calculating();
        Output output = new Output();
        
        //cr�ons notre liste � travers notre CSV
        List<Integer> numbers = input.readNumbersFromFile(fileName);
        //on effectue le calcul 
        List<Integer> result = calculating.calcul(numbers, operation);
        //affichons le r�sultat
        output.printResults(numbers, result, operation);
    }
}
