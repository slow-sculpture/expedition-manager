package expedition.utils.fileReader;

import expedition.members.Person;

import java.util.List;


public interface IFileReader<E> {
    List<E> read();
}
