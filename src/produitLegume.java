public class produitLegume extends produit{

    public produitLegume (int id, String label, String type, double quantite, String saison ) {
        this.id = id;
        this.label = label;
        this.type = type;
        this.quantite = quantite;
        this.saison = saison;
    }

    public String determinerTypeProduit() {
        System.out.println("legume");

        return "Fruit";
    }

    @Override
    public String  toString() {
        return ("produit =  { " + "" + id + "," + label +"," + type + ","+ quantite + "," + saison +  " }" );
    }

}
