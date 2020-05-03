package srp;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

class Persistence {
    /**
     *
     * @param journal : Journal entries to be saved to the file
     * @param filename : file name to be saved with
     * @param overwrite : boolean check to create a new file
     * @throws FileNotFoundException
     *
     * @author Nikita Buxy
     */
    void saveToFIle(Journal journal, String filename, boolean overwrite) throws FileNotFoundException {
        if(overwrite || new File(filename).exists() ){
            try(PrintStream out = new PrintStream(filename)) {
                out.println(journal.toString());
            }
        }
    }
}
