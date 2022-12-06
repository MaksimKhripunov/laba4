package ru.khripunov.laba4.conrollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.khripunov.laba4.DAO.HumanContainerDAO;

@Controller
@RequestMapping("/container")
public class HumanContainerContoller {
    private HumanContainerDAO humanContainerDAO;

@Autowired
    public HumanContainerContoller(HumanContainerDAO humanContainerDAO) {
        this.humanContainerDAO = humanContainerDAO;
    }
@GetMapping()
    public String showHumanContainer(Model model){
     humanContainerDAO.makeList();
     model.addAttribute("number", humanContainerDAO.getHumanContainer().getPeople());
     return "container/showFullList";
    }



    public HumanContainerDAO getHumanContainerDAO() {
        return humanContainerDAO;
    }

    public void setHumanContainerDAO(HumanContainerDAO humanContainerDAO) {
        this.humanContainerDAO = humanContainerDAO;
    }
}
