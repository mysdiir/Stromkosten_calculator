package controller;

import model.Kenndaten;
import view.MainGUI;

public class KenndatenController {
    // external classes that are used in this controller
   MainGUI mainGUI;
   Kenndaten kenndaten;

   public KenndatenController(MainGUI mainGUI, Kenndaten kenndaten) {
       this.mainGUI = mainGUI;
       this.kenndaten = kenndaten;
   }

    public void proceedKenndaten() {
       // unsure if it's a comfy way to outplay input datatype error, but it worked with exception handling
        try {
            kenndaten.setVerbrauchWatt(Float.parseFloat(
                    mainGUI.getVerbrauchWatt_TextField().getText()
            ));
            System.out.println("Verbrauch in Watt: " +
                    kenndaten.getVerbrauchWatt());

        } catch (NumberFormatException e) {
            mainGUI.fehlerDialog("Fehler in Eingabe des Verbrauchs" +  "\n" +
                    "Eingabe ist keine gültige Zahl!" + "\n" +
                    "Bitte einen gültigen Zahlenwert eingeben!");
        }

        try {
            kenndaten.setBetriebsstundenTag(Integer.parseInt(
                    mainGUI.getBetriebsstundenTag_TextField().getText()

            ));
            System.out.println("Betriebsstunden pro Tag: " +
                    kenndaten.getBetriebsstundenTag());

        } catch (NumberFormatException e) {
            mainGUI.fehlerDialog("Fehler in Eingabe der Betriebsstunden" + "\n" +
                    "Eingabe ist keine gültige Zahl!" + "\n" +
                    "Bitte geben sie einen gültigen Tageswert ein");
        }

        try {
            kenndaten.setBetriebstageWoche(Integer.parseInt(
                    mainGUI.getBetriebsstundenWoche_TextField().getText()
            ));
            System.out.println("Betriebstage pro Woche: " +
                    kenndaten.getBetriebstageWoche());

        } catch (NumberFormatException e) {
            mainGUI.fehlerDialog("Fehler in Eingabe der Betriebstage" + "\n" +
                    "Eingabe ist keine gültige Zahl! " + "\n" +
                    "Bitte einen gültigen Zahlenwert eingeben!");
        }

        try {
            kenndaten.setPreisProkWh(Float.parseFloat(
                    mainGUI.getStrompreis_TextField().getText()
            ));
            System.out.println("Preis pro kWh: " +
                    kenndaten.getPreisProkWh());

        } catch (NumberFormatException e) {
            mainGUI.fehlerDialog("Fehler in Eingabe des Preises pro kWh" + "\n" +
                    "Eingabe ist keinee gültige Zahl! " + "\n" +
                    "Bitte einen gültigen Zahlenwert eingeben!");
        }
    }
}
