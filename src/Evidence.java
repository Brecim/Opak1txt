import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Evidence {

ArrayList<Zakaznik> list = new ArrayList();
int limit = 25;



    public void addZak(Zakaznik zak) {
        list.add(zak);
    }

    public void delZak(Zakaznik zak) {
        list.remove(zak);
    }

    public void delLastZak() {
        list.remove(list.get(list.size() - 1));
    }

    public ArrayList<Zakaznik> selRecordsLimit(int limit) {
        this.limit = limit;
        ArrayList<Zakaznik> records = new ArrayList<>();
        for (Zakaznik zakaznik : list) {
            if (zakaznik.getPocetProdeju() > limit) {
                records.add(zakaznik);
            }
        }
        return records;
    }

    public double uhAvg() {
        int recordCount = 0;
        int totalSales = 0;
        for (Zakaznik zakaznik : list) {
            if (zakaznik.getMesto().equals("Uherské Hradiště")) {
                recordCount++;
                totalSales += zakaznik.getPocetProdeju();
            }
        }
        if (recordCount == 0) {
            return 0;
        } else {
            return (double) totalSales / recordCount;
        }
    }

}
