import java.util.ArrayList;

public class Enseignant {
    private int Matricule;
    private String prenom;
    private String nom;
    private int echelle;
    Module module;
    private static int cpt=10000;
    private ArrayList<Module> listeModule;

    public Enseignant(int matricule, String prenom, String nom, int echelle, ArrayList<Module> listeModule) {
        this.Matricule = cpt++;
        this.prenom = prenom;
        this.nom = nom;
        this.echelle = echelle;
        this.listeModule = listeModule;
    }
    public void AjouterModule(Module module){
        listeModule.add(module);
    }
}
