public class produitFruit extends produit{

    public produitFruit (int id, String label, String type, double quantite, String saison ) {
        this.id = id;
        this.label = label;
        this.type = type;
        this.quantite = quantite;
        this.saison = saison;
    }

    public String determinerTypeProduit() {
        System.out.println("fruit");

        return "Fruit";

}


    @Override
    public String  toString() {
        return ("produit =  { " + "" + id + "," + label +"," + type + ","+ quantite + "," + saison +  " }" );
    }
}
