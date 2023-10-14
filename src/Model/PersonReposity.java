package Model;


import Model.PersonAccess;
import java.util.ArrayList;
import Model.Person;

public class PersonReposity implements InterfacePersonFile{

   

    @Override
    public void readFile(String path,ArrayList<Person> listPerson) {
            PersonAccess.Intance().readFile(path, listPerson);
    }

    @Override
    public boolean writeFile() {
       return PersonAccess.Intance().saveFile();
        
    }

    @Override
    public void findPerson(ArrayList<Person> listPerson) {
         PersonAccess.Intance().findPerson(listPerson);
    }

    @Override
    public void displayAll(ArrayList<Person> listPerson) {
        PersonAccess.Intance().displayAll(listPerson);
    }
    
    
    
    
}