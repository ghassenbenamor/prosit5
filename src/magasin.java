public class magasin {

    // attributes
    private int id;

    private String  name;
    private String adress;
    private int capacity;

    private int nombreEmployees;
    private produit produits[];

    private employee employees[];
    final int maxCapacity = 50;

    final int maxEmployees = 20;

    //constructors

    public magasin() {

    }
    public magasin (int id,String Name, String adress) {
        this.id = id;
        this.name = name;
        this.adress = adress;
        this.capacity = 0;
        this.nombreEmployees = 0;
        this.produits = new produit[maxCapacity];
        this.employees = new employee[maxEmployees];
    }

    //getters

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAdress() {
        return adress;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getNombreEmployees() {
        return nombreEmployees;
    }

    //setters

    public void setId(int id) {
        this.id = id;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setName(String name) {
        this.name = name;
    }

    // methods

    public void addProduct (produit produit) {
        if (capacity<maxCapacity && searchProduct(produit) == false) {
            produits[capacity] =  produit;
            capacity++;
        }
    }

    public void showMagasin () {
        System.out.println(this);
        for (int i = 0; i< capacity; i++) {
            System.out.println(produits[i]);

        }
        System.out.println(", employees = {");
        for (int j=0; j < nombreEmployees; j++) {
            System.out.println(employees[j]);
        }
        System.out.println("}");
    }


    public void total () {
        System.out.println(this.capacity);
    }

    public boolean searchProduct(produit p) {
        boolean exist = false;
        for (int i=0; i<capacity;i++)
        {
            if(produits[i] == p) {
                exist = true;
                break;
            }
        }
        return exist;
    }
    public int searchProductById(int id) {
        int position = -1;
        for (int i=0; i < capacity; i++)
        {
            if(produits[i].getId() == id )
                position = i ;

        }
        return position;
    }

    public void deleteProduct(int id) {
        int position =  searchProductById(id);
        for(int i= position; i<capacity; i++)
        {
            produits[i] = produits[i+1];
        }
        produits[capacity] = null;
        capacity--;
    }

    public static void storeWithMostProducts(magasin m1, magasin m2) {
        if (m1.getCapacity() > m2.getCapacity())
            System.out.println("Magasin de "+ m1.getAdress() + " has more products");
        else if (m1.getCapacity() < m2.getCapacity())
            System.out.println("Magasin de "+ m2.getAdress()+ " has more products");
        else
            System.out.println("draw");
    }

    public void addEmployee (employee e) {
        if(nombreEmployees < maxEmployees) {
            employees[nombreEmployees] =  e;
            nombreEmployees++;
        }
    }

    public double calculStock() {
        double stock = 0;
        for (int i = 0; i<capacity;i++) {
            if (produits[i].type.equals("fruit") ) {
                stock = stock +  produits[i].quantite;
            }
        }
        System.out.println(stock);
        return stock;
    }

    @Override
    public String toString() {
        return "Magasin{" + "id=" + id + ", address=" + adress + ", capacite =" + capacity + "nombre d'employées = " + nombreEmployees + ", CAPACITE_MAX=" + maxCapacity + ", produits = {";
    }

}



