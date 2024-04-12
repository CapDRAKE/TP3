import java.util.List;


//on va g�rer donc l'affichage ici
public class Output {
	public void printResults(List<Integer> numbers, List<Integer> results, char operation) {
        //On g�re l'affichage depuis notre list. C'est mieux que de refaire les calculs pour afficher
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(operation + "" + numbers.get(i) + " (=" + results.get(i) + ")");
        }
        System.out.println("-------");
        System.out.println("total = " + results.get(results.size() - 1) + " (" + operation + ")");
        //pour r�cup�rer notre dernier r�sultat on prends la taille de notre list -1
    }
}
