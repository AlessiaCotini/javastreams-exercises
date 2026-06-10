import entities.Product;

void main(String[] args) {
    List<Product> listaProdotti = new ArrayList<>();

    listaProdotti.add(new Product(2542L, "A Forest", "Book", 12.56));
    listaProdotti.add(new Product(5966L, "Just Like Heaven", "Book", 120.56));
    listaProdotti.add(new Product(2557L, "Close To Me", "Book", 19.99));
    listaProdotti.add(new Product(2525L, "Lovesong", "Book", 29.50));
    listaProdotti.add( new Product(742L, "A Letter to Elise", "Book", 261.20));

    listaProdotti.add(new Product(362L, "Pictures Of You", "Baby", 15.30));
    listaProdotti.add(new Product(6566L, "High", "Baby", 150.30));
    listaProdotti.add(new Product(55857L, "Mint Car", "Baby", 19.99));
    listaProdotti.add(new Product(7955L, "Push", "Baby", 59.50));
    listaProdotti.add(new Product(4245L, "M", "Baby", 561.20));

    listaProdotti.add(new Product(362L, "Boys Dont Cry", "Boys", 15.30));
    listaProdotti.add(new Product(6566L, "Friday I'm In Love", "Boys", 150.30));
    listaProdotti.add(new Product(55857L, "The Lovecats", "Boys", 19.99));
    listaProdotti.add(new Product(7955L, "Lullaby", "Boys", 59.50));
    listaProdotti.add(new Product(4245L, "Play For Today", "Boys", 561.20));

    System.out.println("ESERCIZIO UNO");
    List<Product> libriPrezzoAlto = new ArrayList<>();
    libriPrezzoAlto = listaProdotti.stream().filter(product -> Objects.equals(product.getCategory(), "Book")).filter(product -> product.getPrice()>100).toList();
    System.out.println(libriPrezzoAlto);

    System.out.println("ESERCIZIO DUE");
    


    System.out.println("ESERCIZIO TRE");


    System.out.println("ESERCIZIO QUATTRO");



}

