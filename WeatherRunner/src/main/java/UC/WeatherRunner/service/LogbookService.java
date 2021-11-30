package UC.WeatherRunner.service;


import java.util.List;

import UC.WeatherRunner.model.Logbook;
import org.springframework.stereotype.Service;

@Service
public interface LogbookService {

    public List<Logbook> findAll();

    public Logbook findById(int theId);

    public void save(Logbook logbookToBeSaved);

    public void deleteById(int logbookID);

}