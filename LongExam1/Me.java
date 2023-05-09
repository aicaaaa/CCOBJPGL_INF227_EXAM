public class Me implements Tourist {

    static int budget = 1000;

    public void visit() {
        System.out.print("Enjoying my stay");
    }

    public void visit(Bohol bohol) {
        if (budget < bohol.airFare) {
            System.out.println("i dont have enough budget for Bohol!");

        } else {
            System.out.println("I have budget for bohol!");
            budget = budget - bohol.airFare;
        }
        checkBudget();

    }

    public void visit(Boracay boracay) {
        if (budget < boracay.airFare) {
            System.out.println("i can't afford to go to Boracay!");

        } else {
            System.out.println("Boracay, here we go!");
            budget = budget - boracay.airFare;
        }
        checkBudget();
    }

    public void visit(CagayandeOro cagayandeOro) {
        if (budget < cagayandeOro.airFare) {
            System.out.println("I don't have enough budget for Cagayan de Oro!");

        } else {
            System.out.println("i can finally visit Cagayan de Oro!");
            budget = budget - cagayandeOro.airFare;
        }
        checkBudget();

    }

    public void visit(Cebu cebu) {

        if (budget < cebu.airFare) {
            System.out.println("Sadly, my budget was not enough for Cebu!");

        } else {
            System.out.println("Hello Cebu! i can finally meet my friends");
            budget = budget - cebu.airFare;
        }
        checkBudget();
    }

    public void visit(Siargao siargao) {

        if (budget < siargao.airFare) {
            System.out.println("I cannot afford to go to Siargao");

        } else {
            System.out.println("I love Siargao");
            budget = budget - siargao.airFare;
        }
        checkBudget();

    }

    public void visit(Zamboanga zamboanga) {

        if (budget < zamboanga.airFare) {
            System.out.println("My budget is too low for Zamboanga");

        } else {
            System.out.println("Zambonga here i come!");
            budget = budget - zamboanga.airFare;
        }
        checkBudget();

    }

    public void checkBudget() {
        System.out.println("my budget is " + budget);

    }
}