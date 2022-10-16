public class employee {
    public int id;
    public String nom;
    public String adresse;
    public int nbrHeures;
    public double salaire;

    public employee() {
    }

    public employee( int id,String nom, String adresse, int nbrHeures) {
        this.id = id;
        this.nom = nom;
        this.adresse = adresse;
        this.nbrHeures = nbrHeures;
        this.salaire = salaire;
    }

    // methods

    public void afficherEmployee () {
        System.out.println(this.toString());
    }



    @Override
    public String toString() {
        return "employee {" + "id=" + id + ", nom=" + nom + ", adresse = " + adresse + ", nombre d'heures ="   + nbrHeures + " salaire = " + salaire + "}";
    }

}
