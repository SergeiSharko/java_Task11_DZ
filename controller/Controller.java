package Task1.controller;

import Task1.data.User;
import Task1.service.DataService;

public class Controller {

    private DataService datServ = new DataService();

    public void createUser(User user, String discript) {
        datServ.createUser(user, discript);
    }

    public void read(String type) {        
        System.out.println(datServ.read(type));
    }    
       
}
