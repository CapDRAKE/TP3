import java.util.ArrayList;
import java.util.List;

//on gère notre logique de caclul
public class Calculating {
    public List<Integer> calcul(List<Integer> numbers, char operation) {
        List<Integer> results = new ArrayList<>();
        if (numbers == null || numbers.isEmpty()) {
            return results;  //va reetourner une liste vide si la liste est vide ou nulle
        }
        
        int cumulativeResult = (operation == '+') ? 0 : 1; //pour gérer le fait de pas faire de multiplication par 0
        for (int number : numbers) {
        	switch(operation) {
        		case '+':
        			cumulativeResult += number;
        			break;
        		case '*':
        			cumulativeResult *= number;
        			break;
        	}
        	//add à la list
            results.add(cumulativeResult);
        }
        return results;
    }
}
