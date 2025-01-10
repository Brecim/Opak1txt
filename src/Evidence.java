import java.time.LocalDate;
import java.util.ArrayList;

public class Evidence {

ArrayList<Zakaznik> list = new ArrayList();



    public void addZak(Zakaznik zak) {
        list.add(zak);
    }

    public void delZak(Zakaznik zak) {
        list.remove(zak);
    }

    public void delLastZak() {
        list.remove(list.get(list.size() - 1));
    }

}
