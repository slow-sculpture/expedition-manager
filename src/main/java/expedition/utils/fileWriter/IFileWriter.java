package expedition.utils.fileWriter;

import java.util.List;

public interface IFileWriter<E> {
    void write(List<E> list);
}
