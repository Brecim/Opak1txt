import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Zakaznik zak1 = new Zakaznik("Karel Dvořák", LocalDate.of(2005, 12, 31), "Uherské Hradiště", 45);
        Zakaznik zak2 = new Zakaznik("Radim Karlík", LocalDate.of(2002, 4, 15), "Uherský Brod", 52);

     Evidence ev = new Evidence();
     FileManage fm = new FileManage(ev);

     ev.addZak(zak1);
     ev.addZak(zak2);
     ev.delLastZak();

     fm.fileOut();
     fm.fileIn();



    }
}