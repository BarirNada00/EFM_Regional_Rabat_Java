public class Module {
    private int code;
    private String intitule;
    private int masseHoraire;

    public Module(int code, String intitule, int masseHoraire) {
        this.code = code;
        this.intitule = intitule;
        this.masseHoraire = masseHoraire;
    }

    public Module(int code, String intitule) {
        this.code = code;
        this.intitule = intitule;
    }

    public int getMasseHoraire() {
        return masseHoraire;
    }

    public void setMasseHoraire(int masseHoraire) {
        this.masseHoraire = masseHoraire;
    }

    @Override
    public String toString() {
        return "Module{" +
                "code=" + code +
                ", intitule='" + intitule + '\'' +
                ", masseHoraire=" + masseHoraire +
                '}';
    }
}
