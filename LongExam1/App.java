public class App {
    public static void main(String[] args) throws Exception {

        // Long exam 1

        // 1. Add 5 new locations to visit
        // 2. Each location should have an airFare.
        // 3. Each time you visit a new location, your budget should decrease.
        // 4. In the visit method, print a message if you can visit the new location and
        // print another message if you cannot visit the location.
        // 5. Each time you visit a location, call the checkBudgetMethod

        Locations bohol = new Bohol();
        Locations boracay = new Boracay();
        Locations cagayandeOro = new CagayandeOro();
        Locations cebu = new Cebu();
        Locations siargao = new Siargao();
        Locations zamboanga = new Zamboanga();

        Me myself = new Me();
        bohol.accept(myself);
        boracay.accept(myself);
        cagayandeOro.accept(myself);
        cebu.accept(myself);
        siargao.accept(myself);
        zamboanga.accept(myself);

    }
}
