package view;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainGUI extends JFrame implements ActionListener {

    private MainGUI mainGUI;
    private JPanel mainPanel;

        private JPanel header_Panel;
        
        private JPanel kenndaten_Panel;
            private JTextField verbrauchWatt_TextField;
            private JTextField betriebsstundenTag_TextField;
            private JTextField betriebsstundenWoche_TextField;
            private JTextField strompreis_TextField;
            
        private JPanel verbrauch_Panel;
            private JLabel verbrauchTag_Label;
            private JLabel verbrauchWoche_Label;
            private JLabel verbauchMonat_Label;
            private JLabel verbrauchJahr_Label;

        private JPanel kosten_Panel;
            private JLabel kostenTag_Label;
            private JLabel kostenWoche_Label;
            private JLabel kostenMonat_Label;
            private JLabel kostenJahr_Label;

        private JPanel execution_Panel;
            private JButton berechneBtn;
        
        public MainGUI() {
            mainGUI = this;
            setTitle("Stromkosten Rechner");
            setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
            addComponent();
            pack();
            setVisible(true);
        }



    public void addComponent() {
            
            mainPanel = new JPanel();
            mainPanel.setLayout(new GridBagLayout());
            mainPanel.setMaximumSize(new Dimension(600, 200));
            mainPanel.setMinimumSize(new Dimension(600, 200));
            mainPanel.setPreferredSize(new Dimension(600, 200));
            add(mainPanel);


            header_Panel = new JPanel();
            header_Panel.setLayout(new GridBagLayout());
            GridBagConstraints gbc;
            gbc = new GridBagConstraints();
            gbc.gridx = 0;
            gbc.gridy = 0;
            gbc.gridwidth = 2;
            gbc.fill = GridBagConstraints.BOTH;
            mainPanel.add(header_Panel, gbc);


                final JLabel label14 = new JLabel();
                label14.setText("Stromkostenrechner");
                gbc = new GridBagConstraints();
                gbc.gridx = 0;
                gbc.gridy = 0;
                gbc.weightx = 1.0;
                gbc.weighty = 1.0;
                gbc.anchor = GridBagConstraints.WEST;
                header_Panel.add(label14, gbc);


                final JLabel label15 = new JLabel();
                label15.setText("Kenndaten");
                gbc = new GridBagConstraints();
                gbc.gridx = 0;
                gbc.gridy = 1;
                gbc.weightx = 1.0;
                gbc.weighty = 1.0;
                gbc.anchor = GridBagConstraints.WEST;
                header_Panel.add(label15, gbc);


                final JLabel label16 = new JLabel();
                label16.setText("Ergebnis");
                gbc = new GridBagConstraints();
                gbc.gridx = 1;
                gbc.gridy = 1;
                gbc.anchor = GridBagConstraints.WEST;
                header_Panel.add(label16, gbc);

            
            kenndaten_Panel = new JPanel();
            kenndaten_Panel.setLayout(new GridBagLayout());
            gbc = new GridBagConstraints();
            gbc.gridx = 0;
            gbc.gridy = 1;
            gbc.gridheight = 2;
            gbc.weightx = 1.0;
            gbc.weighty = 1.0;
            gbc.fill = GridBagConstraints.BOTH;
            mainPanel.add(kenndaten_Panel, gbc);


                final JLabel label1 = new JLabel();
                label1.setText("Verbrauch in Watt");
                gbc = new GridBagConstraints();
                gbc.gridx = 0;
                gbc.gridy = 0;
                gbc.anchor = GridBagConstraints.WEST;
                kenndaten_Panel.add(label1, gbc);
                    
                    verbrauchWatt_TextField = new JTextField();
                    gbc = new GridBagConstraints();
                    gbc.gridx = 2;
                    gbc.gridy = 0;
                    gbc.weightx = 2.0;
                    gbc.anchor = GridBagConstraints.WEST;
                    gbc.fill = GridBagConstraints.HORIZONTAL;
                    kenndaten_Panel.add(verbrauchWatt_TextField, gbc);
                
                
                final JLabel label2 = new JLabel();
                label2.setText("Betriebsstunden / Tag");
                gbc = new GridBagConstraints();
                gbc.gridx = 0;
                gbc.gridy = 1;
                gbc.anchor = GridBagConstraints.WEST;
                kenndaten_Panel.add(label2, gbc);
    
                    betriebsstundenTag_TextField = new JTextField();
                    gbc = new GridBagConstraints();
                    gbc.gridx = 2;
                    gbc.gridy = 1;
                    gbc.weightx = 2.0;
                    gbc.anchor = GridBagConstraints.WEST;
                    gbc.fill = GridBagConstraints.HORIZONTAL;
                    kenndaten_Panel.add(betriebsstundenTag_TextField, gbc);


                final JLabel label4 = new JLabel();
                label4.setText("Betriebsstunden / Woche");
                gbc = new GridBagConstraints();
                gbc.gridx = 0;
                gbc.gridy = 2;
                gbc.anchor = GridBagConstraints.WEST;
                kenndaten_Panel.add(label4, gbc);
                
                    betriebsstundenWoche_TextField = new JTextField();
                    gbc = new GridBagConstraints();
                    gbc.gridx = 2;
                    gbc.gridy = 2;
                    gbc.weightx = 2.0;
                    gbc.anchor = GridBagConstraints.WEST;
                    gbc.fill = GridBagConstraints.HORIZONTAL;
                    kenndaten_Panel.add(betriebsstundenWoche_TextField, gbc);

                
                final JLabel labelX = new JLabel();
                labelX.setText("Strompreis pro kWh");
                gbc = new GridBagConstraints();
                gbc.gridx = 0;
                gbc.gridy = 3;
                gbc.anchor = GridBagConstraints.WEST;
                kenndaten_Panel.add(labelX, gbc);
                
                    strompreis_TextField = new JTextField();
                    gbc = new GridBagConstraints();
                    gbc.gridx = 2;
                    gbc.gridy = 3;
                    gbc.weightx = 2.0;
                    gbc.anchor = GridBagConstraints.WEST;
                    gbc.fill = GridBagConstraints.HORIZONTAL;
                    kenndaten_Panel.add(strompreis_TextField, gbc);


            verbrauch_Panel = new JPanel();
            verbrauch_Panel.setLayout(new GridBagLayout());
            gbc = new GridBagConstraints();
            gbc.gridx = 1;
            gbc.gridy = 1;
            gbc.weightx = 1.0;
            gbc.weighty = 1.0;
            gbc.fill = GridBagConstraints.BOTH;
            mainPanel.add(verbrauch_Panel, gbc);
            
                final JLabel label5 = new JLabel();
                label5.setText("Verbrauch");
                gbc = new GridBagConstraints();
                gbc.gridx = 1;
                gbc.gridy = 0;
                gbc.anchor = GridBagConstraints.WEST;
                verbrauch_Panel.add(label5, gbc);


                final JLabel label6 = new JLabel();
                label6.setText("pro Tag");
                gbc = new GridBagConstraints();
                gbc.gridx = 1;
                gbc.gridy = 2;
                gbc.weightx = 1.0;
                gbc.anchor = GridBagConstraints.WEST;
                verbrauch_Panel.add(label6, gbc);

                    verbrauchTag_Label = new JLabel();
                    verbrauchTag_Label.setText("0,00 kWh");
                    gbc = new GridBagConstraints();
                    gbc.gridx = 2;
                    gbc.gridy = 2;
                    gbc.anchor = GridBagConstraints.WEST;
                    verbrauch_Panel.add(verbrauchTag_Label, gbc);


                final JLabel label7 = new JLabel();
                label7.setText("pro Woche");
                gbc = new GridBagConstraints();
                gbc.gridx = 1;
                gbc.gridy = 4;
                gbc.anchor = GridBagConstraints.WEST;
                verbrauch_Panel.add(label7, gbc);

                    verbrauchWoche_Label = new JLabel();
                    verbrauchWoche_Label.setText("0,00 kWh");
                    gbc = new GridBagConstraints();
                    gbc.gridx = 2;
                    gbc.gridy = 4;
                    gbc.anchor = GridBagConstraints.WEST;
                    verbrauch_Panel.add(verbrauchWoche_Label, gbc);
           

                final JLabel label8 = new JLabel();
                label8.setText("pro Monat");
                gbc = new GridBagConstraints();
                gbc.gridx = 1;
                gbc.gridy = 6;
                gbc.anchor = GridBagConstraints.WEST;
                verbrauch_Panel.add(label8, gbc);

                    verbauchMonat_Label = new JLabel();
                    verbauchMonat_Label.setText("0,00 kWh");
                    gbc = new GridBagConstraints();
                    gbc.gridx = 2;
                    gbc.gridy = 6;
                    gbc.anchor = GridBagConstraints.WEST;
                    verbrauch_Panel.add(verbauchMonat_Label, gbc);


                final JLabel label9 = new JLabel();
                label9.setText("pro Jahr");
                gbc = new GridBagConstraints();
                gbc.gridx = 1;
                gbc.gridy = 8;
                gbc.anchor = GridBagConstraints.WEST;
                verbrauch_Panel.add(label9, gbc);

                    verbrauchJahr_Label = new JLabel();
                    verbrauchJahr_Label.setText("0,00 kWh");
                    gbc = new GridBagConstraints();
                    gbc.gridx = 2;
                    gbc.gridy = 8;
                    gbc.anchor = GridBagConstraints.WEST;
                    verbrauch_Panel.add(verbrauchJahr_Label, gbc);

            
            kosten_Panel = new JPanel();
            kosten_Panel.setLayout(new GridBagLayout());
            gbc = new GridBagConstraints();
            gbc.gridx = 1;
            gbc.gridy = 2;
            gbc.weightx = 1.0;
            gbc.weighty = 1.0;
            gbc.fill = GridBagConstraints.BOTH;
            mainPanel.add(kosten_Panel, gbc);
            
                final JLabel label17 = new JLabel();
                label17.setText("Kosten");
                gbc = new GridBagConstraints();
                gbc.gridx = 1;
                gbc.gridy = 0;
                gbc.anchor = GridBagConstraints.WEST;
                kosten_Panel.add(label17, gbc);


                final JLabel label18 = new JLabel();
                label18.setText("pro Tag");
                gbc = new GridBagConstraints();
                gbc.gridx = 1;
                gbc.gridy = 2;
                gbc.weightx = 1.0;
                gbc.anchor = GridBagConstraints.WEST;
                kosten_Panel.add(label18, gbc);

                    kostenTag_Label = new JLabel();
                    kostenTag_Label.setText("0,00 €");
                    gbc = new GridBagConstraints();
                    gbc.gridx = 2;
                    gbc.gridy = 2;
                    gbc.anchor = GridBagConstraints.WEST;
                    kosten_Panel.add(kostenTag_Label, gbc);


            final JLabel label19 = new JLabel();
            label19.setText("pro Woche");
            gbc = new GridBagConstraints();
            gbc.gridx = 1;
            gbc.gridy = 4;
            gbc.anchor = GridBagConstraints.WEST;
            kosten_Panel.add(label19, gbc);

                kostenWoche_Label = new JLabel();
                kostenWoche_Label.setText("0,00 €");
                gbc = new GridBagConstraints();
                gbc.gridx = 2;
                gbc.gridy = 4;
                gbc.anchor = GridBagConstraints.WEST;
                kosten_Panel.add(kostenWoche_Label, gbc);
  
            
            final JLabel label20 = new JLabel();
            label20.setText("pro Monat");
            gbc = new GridBagConstraints();
            gbc.gridx = 1;
            gbc.gridy = 6;
            gbc.anchor = GridBagConstraints.WEST;
            kosten_Panel.add(label20, gbc);

                kostenMonat_Label = new JLabel();
                kostenMonat_Label.setText("0,00 €");
                gbc = new GridBagConstraints();
                gbc.gridx = 2;
                gbc.gridy = 6;
                gbc.anchor = GridBagConstraints.WEST;
                kosten_Panel.add(kostenMonat_Label, gbc);
            

            final JLabel label21 = new JLabel();
            label21.setText("pro Jahr");
            gbc = new GridBagConstraints();
            gbc.gridx = 1;
            gbc.gridy = 8;
            gbc.anchor = GridBagConstraints.WEST;
            kosten_Panel.add(label21, gbc);
            
                kostenJahr_Label = new JLabel();
                kostenJahr_Label.setText("0,00 €");
                gbc = new GridBagConstraints();
                gbc.gridx = 2;
                gbc.gridy = 8;
                gbc.anchor = GridBagConstraints.WEST;
                kosten_Panel.add(kostenJahr_Label, gbc);


        execution_Panel = new JPanel();
        execution_Panel.setLayout(new GridBagLayout());
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.BOTH;
        mainPanel.add(execution_Panel, gbc);

            berechneBtn = new JButton();
            berechneBtn.setText("berechnen");
            gbc = new GridBagConstraints();
            gbc.gridx = 0;
            gbc.gridy = 0;
            gbc.fill = GridBagConstraints.HORIZONTAL;
            execution_Panel.add(berechneBtn, gbc);

        }
    public void fehlerDialog(String message) {
            JOptionPane.showMessageDialog(this, message, "Fehler",
                    JOptionPane.ERROR_MESSAGE);
        }


    public JTextField getVerbrauchWatt_TextField() {
        return verbrauchWatt_TextField;
    }
    public JTextField getBetriebsstundenTag_TextField() {
        return betriebsstundenTag_TextField;
    }
    public JTextField getBetriebsstundenWoche_TextField() {
        return betriebsstundenWoche_TextField;
    }
    public JTextField getStrompreis_TextField() {
        return strompreis_TextField;
    }
    public JLabel getVerbrauchTag_Label() {
        return verbrauchTag_Label;
    }
    public JLabel getVerbrauchWoche_Label() {
        return verbrauchWoche_Label;
    }
    public JLabel getVerbauchMonat_Label() {
        return verbauchMonat_Label;
    }
    public JLabel getVerbrauchJahr_Label() {
        return verbrauchJahr_Label;
    }
    public JLabel getKostenTag_Label() {
        return kostenTag_Label;
    }
    public JLabel getKostenWoche_Label() {
        return kostenWoche_Label;
    }
    public JLabel getKostenMonat_Label() {
        return kostenMonat_Label;
    }
    public JLabel getKostenJahr_Label() {
        return kostenJahr_Label;
    }
    public JButton getBerechneBtn() {
        return berechneBtn;
    }



    // combine ActionListener to berechneBtn
    public void setBerechneBtnListener(ActionListener listener) {
        berechneBtn.addActionListener(listener);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}



