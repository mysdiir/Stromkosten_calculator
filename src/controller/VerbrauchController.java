package controller;

import model.Kenndaten;
import model.Verbrauch;
import view.MainGUI;

import java.text.DecimalFormat;

public class VerbrauchController {

    MainGUI mainGUI;
    Kenndaten kenndaten;
    Verbrauch verbrauch;

    public VerbrauchController(MainGUI mainGUI, Kenndaten kenndaten,
                               Verbrauch verbrauch) {
        this.mainGUI = mainGUI;
        this.kenndaten = kenndaten;
        this.verbrauch = verbrauch;

    }

    public void calculateVerbrauch() {
        //System.out.println("Kenndaten Verbrauch in Watt: " + kenndaten.getVerbrauchWatt());
        verbrauch.setVerbrauchTag(
                ((kenndaten.getVerbrauchWatt() / 1000) * kenndaten.getBetriebsstundenTag())
                * kenndaten.getPreisProkWh()
        );
        //System.out.println("Verbrauch pro Tag: " + verbrauch.getVerbrauchTag() + "kWh");

        verbrauch.setVerbrauchWoche(
                verbrauch.getVerbrauchTag() * kenndaten.getBetriebstageWoche()
        );
        //System.out.println("Verbrauch pro Woche: " + verbrauch.getVerbrauchWoche() + "kWh");

        verbrauch.setVerbrauchMonat(
                verbrauch.getVerbrauchWoche() * 4
        );
        //System.out.println("Verbrauch pro Monat: " + verbrauch.getVerbrauchWoche() + "kWh");

        verbrauch.setVerbrauchJahr(
                verbrauch.getVerbrauchMonat() * 12
        );
        //System.out.println("Verbrauch pro Jahr: " + verbrauch.getVerbrauchJahr() + "kWh");
    }
    public void placeVerbrauchInGUI() {

        // optical output for 2 decimal numbers in GUI
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);

        verbrauch.setVerbrauchTag(Float.parseFloat(
                df.format(verbrauch.getVerbrauchTag())
                ));
        mainGUI.getVerbrauchTag_Label().setText(
                String.valueOf(verbrauch.getVerbrauchTag() + " kWh"
                ));


        verbrauch.setVerbrauchWoche(Float.parseFloat(
                df.format(verbrauch.getVerbrauchWoche())
        ));
        mainGUI.getVerbrauchWoche_Label().setText(
                String.valueOf(verbrauch.getVerbrauchWoche() + " kWh"
                ));


        verbrauch.setVerbrauchMonat(Float.parseFloat(
                df.format(verbrauch.getVerbrauchMonat())
        ));
        mainGUI.getVerbauchMonat_Label().setText(
                String.valueOf(verbrauch.getVerbrauchMonat() + " kWh"
                ));


        verbrauch.setVerbrauchJahr(Float.parseFloat(
                df.format(verbrauch.getVerbrauchJahr())
        ));
        mainGUI.getVerbrauchJahr_Label().setText(
                String.valueOf(verbrauch.getVerbrauchJahr() + " kWh"
                ));
    }



}



