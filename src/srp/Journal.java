package srp;

import java.util.ArrayList;
import java.util.List;

/**
 * Class to add/remove an entry into the journal...
 *
 * @author Nikita Buxy
 */
public class Journal {

    private final List<String> entries = new ArrayList<>();
    private static int count = 0;

    /**
     *
     * @param text input to be added into the journal
     */
    void addEntry(String text) {
        entries.add("" + (++count) + ": " + text);
    }

    /**
     *
     * @param index count of the journal entries
     */
    public void removeEntry(int index) {
        entries.remove(index);
    }

    @Override
    public String toString() {
        return String.join(System.lineSeparator(), entries);
    }

}

