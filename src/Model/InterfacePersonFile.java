package Model;


import java.util.ArrayList;
import Model.Person;

public interface InterfacePersonFile {


    public void readFile(String path, ArrayList<Person> listPerson);

    public boolean writeFile();

    public void findPerson(ArrayList<Person> listPerson);

    public void displayAll(ArrayList<Person> listPerson);

}