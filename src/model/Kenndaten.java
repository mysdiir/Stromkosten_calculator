package model;

public class Kenndaten {
    private float verbrauchWatt;
    private int betriebsstundenTag;
    private int betriebstageWoche;
    private float preisProkWh;

    public Kenndaten() {}

    public float getVerbrauchWatt() {
        return verbrauchWatt;
    }
    public void setVerbrauchWatt(float verbrauchWatt) {
        this.verbrauchWatt = verbrauchWatt;
    }

    public int getBetriebsstundenTag() {
        return betriebsstundenTag;
    }
    public void setBetriebsstundenTag(int betriebsstundenTag) {
        this.betriebsstundenTag = betriebsstundenTag;
    }

    public int getBetriebstageWoche() {
        return betriebstageWoche;
    }
    public void setBetriebstageWoche(int betriebstageWoche) {
        this.betriebstageWoche = betriebstageWoche;
    }

    public float getPreisProkWh() {
        return preisProkWh;
    }
    public void setPreisProkWh(float preisProkWh) {
        this.preisProkWh = preisProkWh;
    }

}


