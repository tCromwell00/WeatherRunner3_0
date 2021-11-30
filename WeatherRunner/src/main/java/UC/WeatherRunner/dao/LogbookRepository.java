package UC.WeatherRunner.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import UC.WeatherRunner.model.Logbook;
import org.springframework.stereotype.Repository;


public interface LogbookRepository extends JpaRepository<Logbook, Integer> {


	public List<Logbook> findAll();

}