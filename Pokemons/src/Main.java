import ru.ifmo.se.pokemon.*;

public class Main {
    public static void main(String[] args) {
        Battle battle = new Battle();
        battle.addAlly(new OricorioPomPom("Axel", 10));
        battle.addFoe(new Clamperl("Salchow", 10));
        battle.addAlly(new Huntail("Toeloop", 10));
        battle.addFoe(new Flygon("Loop", 10));
        battle.addAlly(new Trapinch("Flip", 10));
        battle.addFoe(new Vibrava("Lutz", 10));
        battle.go();
    }
}