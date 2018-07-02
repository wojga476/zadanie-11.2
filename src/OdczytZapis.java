import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OdczytZapis {

    public static void main(String[] args) throws IOException {
        WeatherApi weatherApi = new WeatherApi();
        List<String> lista = new ArrayList<>();
        File file = new File("cities.txt");
        Scanner sc = new Scanner(file);
        while (sc.hasNextLine()) {
            lista.add(sc.nextLine());
        }
        sc.close();

        List<WeatherTemp> listaWeather = new ArrayList<>();
        for (int i = 0; i < lista.size(); i++) {
            listaWeather.add(new WeatherTemp(lista.get(i),weatherApi.getDescription(lista.get(i)),weatherApi.getTemperature(lista.get(i))));
        }
        System.out.println(listaWeather.toString());
        FileWriter fileWriter = new FileWriter("Cities2.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        for (int i = 0; i < listaWeather.size(); i++) {
            bufferedWriter.write("" + listaWeather.get(i));
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
    }
}
