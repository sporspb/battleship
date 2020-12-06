import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        if (line.isBlank()) {
            System.out.println("0");
        } else {
            String[] array = line.trim().split("\\s+");
            System.out.println(array.length);
        }
        reader.close();
    }
}