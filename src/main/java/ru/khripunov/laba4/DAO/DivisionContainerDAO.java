package ru.khripunov.laba4.DAO;

import ru.khripunov.laba4.models.DivisionContainer;

public class DivisionContainerDAO {
    private DivisionContainer divisionContainer;


    public DivisionContainerDAO() {
        this.divisionContainer = new DivisionContainer();
    }

    public DivisionContainerDAO(DivisionContainer divisionContainer) {
        this.divisionContainer = divisionContainer;
    }

    public Boolean search(String name){
        for(int i=0;i<divisionContainer.getDivisions().size();i++)
        {
            if(divisionContainer.getDivisions().get(i).getName().charAt(0)==name.charAt(0)) {
                return true;
            }
        }
        return false;
    }
    public int searchIndex(String name){
        for(int i=0;i<divisionContainer.getDivisions().size();i++)
        {
            if(divisionContainer.getDivisions().get(i).getName()==name)
                return divisionContainer.getDivisions().get(i).getID();
        }
        return -1;
    }

    public DivisionContainer getDivisionContainer() {
        return divisionContainer;
    }

    public void setDivisionContainer(DivisionContainer divisionContainer) {
        this.divisionContainer = divisionContainer;
    }
}
