package UC.WeatherRunner;

import UC.WeatherRunner.model.Logbook;
import UC.WeatherRunner.service.LogbookService;
import UC.WeatherRunner.service.LogbookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/WeatherRunner")
public class WeatherRunnerController {


    public LogbookServiceImpl logbookService;

    @Autowired
    public WeatherRunnerController (LogbookServiceImpl theLogbookService) { logbookService = theLogbookService;}

    //mapping for "/list"
    @GetMapping("/list")
    public String listLogbooks(Model theModel){
        List<Logbook> theLogbooks = logbookService.findAll();

        //add logbooks to the spring model
        theModel.addAttribute("logbooks",theLogbooks);

        return "logbooks/list-logbooks";
    }

    @GetMapping("/forecast")
    public String showForecast(){
        return "logbooks/forecast";
    }

    @GetMapping("/newLog")
    public String newLog(Model theModel){

        //Model attribute for databinding
        Logbook theLogbook = new Logbook();
        theModel.addAttribute("logbook",theLogbook);
        return "logbooks/create-logbook";
    }

    @GetMapping("/viewUpdateForm")
    public String viewUpdateForm(@RequestParam("logbookId") int theId, Model theModel){

        Logbook theLogbook = logbookService.findById(theId);


        theModel.addAttribute("logbook",theLogbook);


        return "logbooks/create-logbook";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam("logbookId") int theId){
        //remove logbook
        logbookService.deleteById(theId);
        return "redirect:/WeatherRunner/list";
    }

    @PostMapping("/save")
    public String saveLogbook(@ModelAttribute("logbook") Logbook theLogbook){

        //Register the logbook
        logbookService.save(theLogbook);

        //Block duplicate submission for accidental page refresh
        return "redirect:/WeatherRunner/list";
    }


}
