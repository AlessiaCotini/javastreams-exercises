import entities.Customer;
import entities.Order;
import entities.Product;

void main(String[] args) {
    List<Product> listaProdotti = new ArrayList<>();
    List<Order> listaOrdini = new ArrayList<>();
    List<Customer> listaUtenti = new ArrayList<>();

    Customer Alessia = new Customer("Ale");
    Customer Edo = new Customer("Edo");
    Customer Anto = new Customer("Anto");
    Customer Robi = new Customer("Ro");
    Customer Edy = new Customer("Edy");

    listaUtenti.add(Alessia);
    listaUtenti.add(Edo);
    listaUtenti.add(Anto);
    listaUtenti.add(Robi);
    listaUtenti.add(Edy);

    Product librouno = new Product(2542L, "A Forest", "Book", 12.56);
    Product librodue = new Product(5966L, "Just Like Heaven", "Book", 120.56);
    Product librotre = new Product(2557L, "Close To Me", "Book", 19.99);
    Product libroquattro = new Product(2525L, "Lovesong", "Book", 29.50);
    Product librocinque = new Product(742L, "A Letter to Elise", "Book", 261.20);

    Product babyuno = new Product(362L, "Pictures Of You", "Baby", 15.30);
    Product babydue = new Product(6566L, "High", "Baby", 150.30);
    Product babytre = new Product(55857L, "Mint Car", "Baby", 19.99);
    Product babyunoquattro = new Product(7955L, "Push", "Baby", 59.50);
    Product babycinque = new Product(4245L, "M", "Baby", 561.20);

    Product boysuno = new Product(362L, "Boys Dont Cry", "Boys", 15.30);
    Product boysdue = new Product(6566L, "Friday I'm In Love", "Boys", 150.30);
    Product boystre = new Product(55857L, "The Lovecats", "Boys", 19.99);
    Product boysquattro = new Product(7955L, "Lullaby", "Boys", 59.50);
    Product boyscinque = new Product(4245L, "Play For Today", "Boys", 561.20);

    listaProdotti.add(librouno);
    listaProdotti.add(librodue);
    listaProdotti.add(librotre);
    listaProdotti.add(libroquattro);
    listaProdotti.add(librocinque);

    listaProdotti.add(babyuno);
    listaProdotti.add(babydue);
    listaProdotti.add(babytre);
    listaProdotti.add(babyunoquattro);
    listaProdotti.add(babycinque);

    listaProdotti.add(boysuno);
    listaProdotti.add(boysdue);
    listaProdotti.add(boystre);
    listaProdotti.add(boysquattro);
    listaProdotti.add(boyscinque);

    List<Product> prodottiPrimoOrdine = new ArrayList<>();
    prodottiPrimoOrdine.add(librocinque);
    prodottiPrimoOrdine.add(babytre);
    prodottiPrimoOrdine.add(babycinque);

    List<Product> prodottiSecondoOrdine = new ArrayList<>();
    prodottiPrimoOrdine.add(librouno);
    prodottiPrimoOrdine.add(babydue);
    prodottiPrimoOrdine.add(boysdue);

    List<Product> prodottiTerzoOrdine = new ArrayList<>();
    prodottiPrimoOrdine.add(boystre);
    prodottiPrimoOrdine.add(librotre);
    prodottiPrimoOrdine.add(babyunoquattro);

    List<Product> prodottiQuartoOrdine = new ArrayList<>();
    prodottiPrimoOrdine.add(librodue);
    prodottiPrimoOrdine.add(boysdue);
    prodottiPrimoOrdine.add(boyscinque);

    List<Product> prodottiQuintoOrdine = new ArrayList<>();
    prodottiPrimoOrdine.add(libroquattro);
    prodottiPrimoOrdine.add(librocinque);
    prodottiPrimoOrdine.add(librouno);

    Order primoOrdine = new Order(prodottiPrimoOrdine, Alessia);
    Order secondoOrdine = new Order( prodottiSecondoOrdine, Anto);
    Order terzoOrdine = new Order(prodottiTerzoOrdine, Edo);
    Order quartoOrdine = new Order (prodottiQuartoOrdine, Robi);
    Order quintoOrdine = new Order (prodottiQuintoOrdine, Edy);

    listaOrdini.add(primoOrdine);
    listaOrdini.add(secondoOrdine);
    listaOrdini.add(terzoOrdine);
    listaOrdini.add(quartoOrdine);
    listaOrdini.add(quintoOrdine);

    System.out.println("ESERCIZIO UNO");
    List<Product> libriPrezzoAlto = new ArrayList<>();
    libriPrezzoAlto = listaProdotti.stream().filter(product -> Objects.equals(product.getCategory(), "Book")).filter(product -> product.getPrice() > 100).toList();
    System.out.println(libriPrezzoAlto);

    System.out.println("ESERCIZIO DUE");
    List<Order> listaOrdiniBaby = listaOrdini.stream()
            .filter(order -> order.getProducts().stream()
                    .anyMatch(product -> product.getCategory().equals("Baby"))).toList();
    listaOrdiniBaby.forEach(System.out::println);

    System.out.println("ESERCIZIO TRE");
    List<Product> listaBoys = listaProdotti.stream()
                    .filter(product -> Objects.equals(product.getCategory(), "Boys")).toList();
    listaBoys.forEach(product -> {product.setPrice(product.getPrice()*0.9);});
    listaBoys.forEach(System.out::println);

    System.out.println("ESERCIZIO QUATTRO");
    LocalDate today = LocalDate.now();
    List<Order> listaRistrettaOrdini = listaOrdini.stream()
            .filter(order -> order.getOrderDate().equals(today)).toList();
    for (Order order : listaRistrettaOrdini) {
        if (order.getCustomerTier() != 2){}else{order.getProducts();}
    }
    listaRistrettaOrdini.forEach(System.out::println);
}

