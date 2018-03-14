package expedition.utils.fileWriter;

import expedition.members.Person;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class CsvFileWriter implements IFileWriter<Person> {
    private String path;

    public CsvFileWriter(String path) {
        this.path = path;
    }

    @Override
    public void write(List<Person> list) {

        try {
            BufferedWriter bw  = new BufferedWriter(new FileWriter(path));
            bw.write("first name / last name / age / sex\n");
            for(Person p : list){
                bw.write(p.getDescription()+"\n");

            }
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
