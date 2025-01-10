import java.time.LocalDate;
import java.util.ArrayList;

public class Evidence {

ArrayList<Zakaznik> list = new ArrayList();

Zakaznik zak1 = new Zakaznik("Karel Dvořák", LocalDate.of(2005, 12, 31), "Uherské Hradiště", 52);
Zakaznik zak2 = new Zakaznik("Radim Karlík", LocalDate.of(2002, 4, 15), "Uherský Brod", 52);

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
