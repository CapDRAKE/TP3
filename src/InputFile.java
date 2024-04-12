import java.io.*;
import java.util.ArrayList;
import java.util.List;

//ici on gère la lecture du csv
public class InputFile {
    public List<Integer> readNumbersFromFile(String fileName) {
        List<Integer> numbers = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                numbers.add(Integer.parseInt(line));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return numbers;
    }
}
