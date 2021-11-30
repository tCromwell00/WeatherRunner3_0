package UC.WeatherRunner;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Forecast {

    private String updateTime;
    private Periods[] periods;

    public Forecast() {
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String date) {
        this.updateTime = date;
    }

    public Periods[] getPeriods() {
        return periods;
    }

    public void setPeriods(Periods[] value) {
        this.periods = value;
    }

    @Override
    public String toString() {
        return "Quote{" +
                "updateTime='" + updateTime + '\'' +
                ", periods=" + periods +
                '}';
    }
}