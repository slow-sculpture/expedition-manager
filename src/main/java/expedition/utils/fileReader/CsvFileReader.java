package expedition.utils.fileReader;

import expedition.members.Person;

import java.io.BufferedReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class CsvFileReader implements IFileReader {
    private static final String SEPARATOR = ";";
    private String path;

    public CsvFileReader(String path){
        this.path=path;
    }

    @Override
    public List<Person> read() {
        List<Person> dataList = new ArrayList<>();

        try {
            BufferedReader bf = new BufferedReader(new FileReader(path));
            String line ="";
            String[] headers;
            int lineCounter = 1;
            while ((line = bf.readLine()) !=null){
                if(lineCounter==1){
                    headers = line.split(SEPARATOR);
                    lineCounter++;
                } else {
                    String[] tokens = line.split(SEPARATOR);

                    Person person = new Person(tokens[0], tokens[1]);
                    person.setAge(Integer.parseInt(tokens[2]));
                    person.setSex(tokens[3]);
                    dataList.add(person);
                }

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        return dataList;
    }
}
