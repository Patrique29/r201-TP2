/**
 * Etudiant
 */
public class Etudiant {

    private String nom;
    private double[][] bulletin;
    private final String[] MATIERES;
    private final double[] COEFFICIENTS ;

    public Etudiant(String nom,String[] matieres,double[] coefficients,double[][] bulletin){
        this.nom = nom;
    }
}