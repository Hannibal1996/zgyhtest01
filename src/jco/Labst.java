package jco;

/**
 * @author gyh
 * @create 2020-08-27 9:48
 */
public class Labst {
    private String labst;
    private String meins;

    public String getLabst() {
        return labst;
    }

    public void setLabst(String labst) {
        this.labst = labst;
    }

    public String getMeins() {
        return meins;
    }

    public void setMeins(String meins) {
        this.meins = meins;
    }

    @Override
    public String toString() {
        return "Labst{" +
                "labst='" + labst + '\'' +
                ", meins='" + meins + '\'' +
                '}';
    }
}
