public class WeatherTemp {

    private String city;
    private String description;
    private int temp;

    @Override
    public String toString() {
        return "WeatherTemp{" +
                "city='" + city + '\'' +
                ", description='" + description + '\'' +
                ", temp=" + temp +
                '}';
    }
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    public WeatherTemp(String city, String description, int temp) {

        this.city = city;
        this.description = description;
        this.temp = temp;
    }
}
