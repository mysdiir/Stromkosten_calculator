package controller;

import model.Kenndaten;
import model.Kosten;
import model.Verbrauch;
import view.MainGUI;

import java.text.DecimalFormat;

public class KostenController {

    MainGUI mainGUI;
    Kenndaten kenndaten;
    Kosten kosten;
    Verbrauch verbrauch;

    public KostenController(MainGUI mainGUI, Kenndaten kenndaten, Kosten kosten,
                            Verbrauch verbrauch) {
        this.mainGUI = mainGUI;
        this.kenndaten = kenndaten;
        this.kosten = kosten;
        this.verbrauch = verbrauch;

    }

    public void calculateKosten() {
        kosten.setKostenTag(
                verbrauch.getVerbrauchTag() * kenndaten.getPreisProkWh()
        );
        //System.out.println("Kosten pro Tag: " + verbrauch.getVerbrauchTag() + "€");

        kosten.setKostenWoche(
                kosten.getKostenTag() * kenndaten.getBetriebstageWoche()
        );
        //System.out.println("Kosten pro Woche: " + verbrauch.getVerbrauchWoche() + "€");

        kosten.setKostenMonat(kosten.getKostenWoche() * 4);
        //System.out.println("Kosten pro Monat: " + verbrauch.getVerbrauchMonat() + "€");

        kosten.setKostenJahr(kosten.getKostenMonat() * 12);
        //System.out.println("Kosten pro Jahr: " + verbrauch.getVerbrauchJahr() + "€");


    }
    public void placeKostenInGUI() {

        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);

        kosten.setKostenTag(Float.parseFloat(
                df.format(kosten.getKostenTag())
        ));
        mainGUI.getKostenTag_Label().setText(
                String.valueOf(kosten.getKostenTag() + "€"
                ));


        kosten.setKostenWoche(Float.parseFloat(
                df.format(kosten.getKostenWoche())
        ));
        mainGUI.getKostenWoche_Label().setText(
                String.valueOf(kosten.getKostenWoche() + "€"
                ));


        kosten.setKostenMonat(Float.parseFloat(
                df.format(kosten.getKostenMonat())
        ));
        mainGUI.getKostenMonat_Label().setText(
                String.valueOf(kosten.getKostenMonat() + "€"
                ));


        kosten.setKostenJahr(Float.parseFloat(
                df.format(kosten.getKostenJahr())
        ));
        mainGUI.getKostenJahr_Label().setText(
                String.valueOf(kosten.getKostenJahr() + "€"
                ));
        }

}

