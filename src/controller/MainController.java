package controller;


import model.Kenndaten;
import model.Kosten;
import model.Verbrauch;
import view.MainGUI;

import java.awt.event.ActionEvent;

public class MainController {
    // give access for model and controller classes
    private static MainGUI mainGUI;

    private static Kenndaten kenndaten;
    private static Verbrauch verbrauch;
    private static Kosten kosten;

    private static KenndatenController kenndatenController;
    private static VerbrauchController verbrauchController;
    private static KostenController kostenController;

    public MainController() {
        // initialize imported model and controller classes
        // with  giving access to classes in MainController's class header through accsess modifier static
        // classes are directly accsessable
        mainGUI = new MainGUI();

        kenndaten = new Kenndaten();
        verbrauch = new Verbrauch();
        kosten = new Kosten();

        kenndatenController = new KenndatenController(mainGUI, kenndaten);
        verbrauchController = new VerbrauchController(mainGUI, kenndaten, verbrauch);
        kostenController = new KostenController(mainGUI, kenndaten, kosten, verbrauch);

        //connect event with its depending listener
        // short version
        mainGUI.setBerechneBtnListener(this::performButtonPress);

        // expanded version
        /*

        mainGUI.setBerechneBtnListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent ae) {
                performButtonPress(ae);
                }
             }
         }

         */

        //CAVE: for adding multiple methods in one ActionListener, group them together
        //      like in line 57 as method performButtonPress(ActionEvent ae)


    }

    public void performButtonPress(ActionEvent ae) {
        System.out.println("//Start of processing user inputs");
        kenndatenController.proceedKenndaten();
        System.out.println("------");

        System.out.println("//Start of calculation");
        verbrauchController.calculateVerbrauch();
        kostenController.calculateKosten();
        System.out.println("------");

        System.out.println("//Start of GUI implementation");
        verbrauchController.placeVerbrauchInGUI();
        kostenController.placeKostenInGUI();
        System.out.println("// DONE!");
    }

    public static void main(String[] args) {
        // Goal is to keep main method with as less code as possible.
        // algorithm should be proceed outside of main method
        new MainController();
    }
}
