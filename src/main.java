public class main {
    public static void main(String[] args) {
        produitFruit p1 = new produitFruit(1254, "fraise", "fruit", 12.3, "mars");
        produitFruit p2 = new produitFruit(1224,"pasteque","fruit",50,"juin");
        produitFruit p3 = new produitFruit(7896, "mandarine","fruit",25.6,"decembre");
        produitLegume p4 = new produitLegume(8521,"artichauts","légume",14,"javier");
        produit p5 = new produit(1021,"lait","delice",1.3);
        magasin m1 = new magasin(1, "Carrefour", "rades");
        magasin m2 = new magasin(2,"Monoprix","carthage");
        m1.addProduct(p1);
        m1.addProduct(p2);
        m1.addProduct(p3);
        m1.addProduct(p4);
        m1.showMagasin();
        p1.determinerTypeProduit();
        p4.determinerTypeProduit();
        p5.determinerTypeProduit();
        m1.calculStock();
    }
}
