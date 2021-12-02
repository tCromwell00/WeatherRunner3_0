package UC.WeatherRunner.model;




import javax.persistence.*;

@Entity
@Table(name="records")
public class Logbook {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name="id")
    private int id;
    //Perhaps we should use Date type? But since we're not sure, so we'll use SQL Date or Java Date, let it keep as is.
    @Column(name="date")
    private String date;

    @Column(name="distance")
    private double distance;

    @Column(name="time")
    private String time;

    @Column(name="weather")
    private String weather;




    public Logbook(int id, String date, double distance, String time, String weather) {
        this.id = id;
        this.date = date;
        this.distance = distance;
        this.time = time;
        this.weather = weather;
    }

    public Logbook(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    @Override
    public String toString() {
        return "Logbook{" +
                "id=" + id +
                ", date='" + date + '\'' +
                ", distance='" + distance + '\'' +
                ", time='" + time + '\'' +
                ", weather='" + weather + '\'' +
                '}';
    }
}