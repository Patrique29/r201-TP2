import javax.print.DocFlavor.STRING;

/**
 * Etudiant
 */
public class Etudiant {

    // à complété en cours
    private String nom;
    private double[][] bulletin;
    private final String[] MATIERES;
    private final double[] COEFFICIENTS ;

    //à faire en cours
    public Etudiant(){
        MATIERES = new String[4];
        COEFFICIENTS = new double[4];
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getNom() {
        return nom;
    }


    public int getNbMatieres(){
        return MATIERES.length;
    }

    public double getUneNote(int iMatiere, int i){
        return bulletin[iMatiere][i];
    }

    private void initialisation(){
        for(int i = 0; i < bulletin.length;i++){
            for(int ii = 0; ii < bulletin[i].length;ii++){
                bulletin[i][ii] = (Math.random() *21);
            }
        }
    }

    public double moyenneMatiere(int iMatiere){
        double somme = 0;
        for(int i = 0; i < bulletin[iMatiere].length;i++){
            somme += bulletin[iMatiere][i];
        }
        return (somme/bulletin[iMatiere].length);
    }

    public double moyenneGenerale(){
        double result;
        double numerateur = 0;
        double denominateur = 0; 
        for(int i = 0; i < bulletin.length;i++){
            for(int ii = 0; ii < bulletin[i].length;ii++){
                numerateur += bulletin[i][ii]*COEFFICIENTS[i];
                denominateur += COEFFICIENTS[i];
            }
        }
        result = numerateur/denominateur;
        return result;
    }

    public String meilleureNote(){
        double noteMax = 0;
        String matiere = "";
        String result;
        for(int i = 0; i < bulletin.length;i++){
            for(int ii = 0; ii < bulletin[i].length;ii++){
                if(noteMax < bulletin[i][ii]){
                    matiere = this.MATIERES[i];
                    noteMax = bulletin[i][ii];
                }
            }
        }
        result = "La note maximal est de "+ noteMax +"/20 dans "+ matiere; 
        return result;
    }


    public String toString() {
        //TODO
        return "Nom : "+ this.nom;
    }
}