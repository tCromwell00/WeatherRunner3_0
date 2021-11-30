package UC.WeatherRunner.service;

import UC.WeatherRunner.dao.LogbookRepository;
import UC.WeatherRunner.model.Logbook;
import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Service;

import javax.persistence.PersistenceContext;
import java.util.List;
import java.util.Optional;

@Service
public class LogbookServiceImpl implements LogbookService {


    private LogbookRepository logbookRepository;


    @Autowired
    public LogbookServiceImpl(LogbookRepository theLogbookRepository) {
        logbookRepository=theLogbookRepository;
    }

    @Override
    public List<Logbook> findAll() {return logbookRepository.findAll();}

    @Override
    public Logbook findById(int theId){
        Optional<Logbook> logbookID = logbookRepository.findById(theId);

        Logbook theLogbook = null;
        if (logbookID.isPresent()){
            theLogbook = logbookID.get();
        }
        else{
            //logbookID not found
            throw new RuntimeException("The logbookID you've entered is invalid - " + theId);
        }

        return theLogbook;

    }

    @Override
    public void save(Logbook theLogbook) { logbookRepository.save(theLogbook); }

    @Override
    public void deleteById(int theId) { logbookRepository.deleteById(theId);}



}