import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;


public class FileManage {

    Evidence ev = new Evidence();

    public void fileOut() {
        String nazevSouboru = "vystup.txt";

        try (PrintWriter out = new PrintWriter(new File(nazevSouboru));) {
            out.println(ev.list);
            out.close();
        } catch (FileNotFoundException e) {
            System.err.println(e + ": " + "Soubor nebyl nalezen.");
            System.exit(404);
        }

    }
}


