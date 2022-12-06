package ru.khripunov.laba4.DAO;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.khripunov.laba4.models.Division;
import ru.khripunov.laba4.models.Human;
import ru.khripunov.laba4.models.HumanContainer;

import java.io.*;
import java.util.ArrayList;

import static java.io.File.*;

@Component
public class HumanContainerDAO {
    private HumanContainer humanContainer;
    private DivisionContainerDAO divisionContainerDAO;

@Autowired
    public HumanContainerDAO()  {
    this.humanContainer=new HumanContainer();
    this.divisionContainerDAO=new DivisionContainerDAO();
    }

      public void makeList()  {
        String csvFile = "C:\\Users\\khrip\\IdeaProjects\\laba4\\src\\main\\resources\\foreign_names.csv";
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ";";
        int id=1;
        ArrayList<Human> people=new ArrayList<>();
       try {
           br = new BufferedReader(new FileReader(csvFile));
       } catch (FileNotFoundException e) {
           throw new RuntimeException(e);
       }
        try {
            ArrayList<Division> divisions=new ArrayList<>();
            while ((line = br.readLine()) != null) {
                Division division;
                String[] nextLine=line.split(cvsSplitBy);
                if(divisionContainerDAO.getDivisionContainer().getDivisions().isEmpty())
                {
                    division =new Division(id,nextLine[4]);
                    divisions.add(division);
                    divisionContainerDAO.getDivisionContainer().setDivisions(divisions);
                    id++;
                }else if(divisionContainerDAO.search(nextLine[4])) {
                    division =new Division(divisionContainerDAO.searchIndex(nextLine[4]),nextLine[4]);
                }else{
                    division =new Division(id,nextLine[4]);
                    divisions.add(division);
                    divisionContainerDAO.getDivisionContainer().setDivisions(divisions);
                    id++;
                }
                Human human=new Human(Integer.valueOf(nextLine[0]),nextLine[1],nextLine[2],nextLine[3],division,Double.valueOf(nextLine[5]));
                people.add(human);
            }
            divisionContainerDAO.getDivisionContainer().setDivisions(divisions);
            humanContainer.setPeople(people);
            br.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    public HumanContainerDAO(HumanContainer humanContainer) {
        this.humanContainer = humanContainer;
    }

    public HumanContainer getHumanContainer() {
        return humanContainer;
    }

    public void setHumanContainer(HumanContainer humanContainer) {
        this.humanContainer = humanContainer;
    }

    public void setDivisionContainerDAO(DivisionContainerDAO divisionContainerDAO) {
        this.divisionContainerDAO = divisionContainerDAO;
    }
    public DivisionContainerDAO getDivisionContainerDAO() {
        return divisionContainerDAO;
    }
}
