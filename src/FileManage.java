import java.io.*;
import java.time.LocalDate;
import java.util.Scanner;


public class FileManage {

    Evidence ev;

    public FileManage(Evidence ev) {
        this.ev = ev;
    }

    public void fileOut() {
        String nazevSouboru = "vystup.txt";

        try (PrintWriter out = new PrintWriter(new File(nazevSouboru));) {
            for (Zakaznik zakaznik : ev.list) {
                out.println(zakaznik.getJmeno() + ":" + zakaznik.getNarozeni() + ":" + zakaznik.getMesto() + ":" + zakaznik.getPocetProdeju());
            }
            out.close();
        } catch (FileNotFoundException e) {
            System.err.println(e + ": " + "Soubor nebyl nalezen.");
            System.exit(404);
        }

    }

    public void fileIn() {
        String nazevSouboru = "vystup.txt";

        try (Scanner sc = new Scanner(new BufferedReader(new FileReader(nazevSouboru)))) {
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] data = line.split(":");
                String jmeno = data[0].trim();
                LocalDate narozeni = LocalDate.parse(data[1].trim());
                String mesto = data[2].trim();
                int pocetProdeju = Integer.parseInt(data[3].trim());
                Zakaznik zakaznik = new Zakaznik(jmeno, narozeni, mesto, pocetProdeju);
                ev.addZak(zakaznik);

            }
        } catch (FileNotFoundException e) {
            System.err.println(e + ": " + "Soubor nebyl nalezen.");
            System.exit(404);
        } catch (IOException e) {
            System.err.println(e + ": " + "Chyba při čtení souboru.");
            System.exit(100);
        }

    }
}


