package srp;

/**
 *  Single Responsibility Principle Demo Class
 *
 *  @author Nikita Buxy
 */
public class Demo {

    public static void main(String args[]) throws Exception{
        Journal j = new Journal();
        j.addEntry("I am happy today");
        j.addEntry("I ate snacks today");
        System.out.println(j);

        Persistence p = new Persistence();
        String filename = "/home/nikita/IdeaProjects/testFiles/journal.txt";
        p.saveToFIle(j, filename, true);
    }
}
