package UC.WeatherRunner;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.Arrays;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Properties {

    private Periods[] periods;
    private String updateTime;

    public Periods[] getPeriods() {
        return periods;
    }

    public void setPeriods(Periods[] periods) {
        this.periods = periods;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "Properties{" +
                "periods=" + Arrays.toString(periods) +
                ", updateTime='" + updateTime + '\'' +
                '}';
    }
}
