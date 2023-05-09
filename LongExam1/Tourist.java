interface Tourist {

    int budget = 0;

    void visit();

    void visit(Bohol bohol);

    void visit(Boracay boracay);

    void visit(CagayandeOro cagayandeOro);

    void visit(Cebu cebu);

    void visit(Siargao siargao);

    void visit(Zamboanga zamboanga);

    default void visit(Locations locations) {
        System.out.println("Arrived on your destination");
    }

    void checkBudget();
}