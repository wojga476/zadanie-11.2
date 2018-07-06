import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OdczytZapis {

        public void odczyt() {
            List<String> lista = new ArrayList<>();
            File file = new File("Cities.txt");

            try {
                Scanner sc = new Scanner(file);
                while (sc.hasNextLine()) {
                    lista.add(sc.nextLine());
                }
                sc.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

        }

        public void zapis(){
            try {
                List<WeatherTemp> listaWeather = new ArrayList<>();
                FileWriter fileWriter = new FileWriter("Cities2.txt");
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                WeatherApi weatherApi =new WeatherApi();
                for (int i = 0; i < listaWeather.size(); i++) {
                    bufferedWriter.write("" + listaWeather.get(i));
                    bufferedWriter.newLine();
//                    listaWeather.add(new WeatherTemp(listaWeather.get(i),weatherApi.getDescription(listaWeather.get(i),weatherApi.getTemperature(listaWeather.get(i)));
                }
                System.out.println(listaWeather.toString());
                bufferedWriter.close();

            } catch (IOException e) {
                e.printStackTrace();
            }

        }
}
