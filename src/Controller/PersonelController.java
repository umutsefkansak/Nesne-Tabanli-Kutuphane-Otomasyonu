
package Controller;

import DAO.PersonelDAO;


public class PersonelController {
    PersonelDAO dao;

    public PersonelDAO getDao() {
        if(this.dao == null){
            this.dao = new PersonelDAO();
        }
        return dao;
    }

    public void setDao(PersonelDAO dao) {
        this.dao = dao;
    }
    
}
