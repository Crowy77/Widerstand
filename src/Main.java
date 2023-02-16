public class Main {
    public static void main(String[] args) {

        Widerstand ws1 = new Widerstand("Grün", "Blau", "Schwarz", "Rot","Silber");
        System.out.println(ws1.RCon()+" "+"Ohm"+"\n"+ws1.Toleranz()+" "+"% Toleranz");

    }
}