package App;
import Question.Question;
import java.util.Scanner;

public class App<exit, option> {

    public static void main(String[] args) {

        String q1 = "Jakiego typu bohaterem jest Leon? \n " +
                "(a): Epicki \n (b): Legendarny \n (c): Mityczny";
        String q2 = "Zaznacz jednego bohatera mitycznego? \n " +
                "(a): Bo \n (b): Shelly \n (c): Tara";
        String q3 = "Jaki superatak ma Gene? \n " +
                "(a): wypuszcza chmurę \n (b): rzuca wieli granat \n (c): może przyciągać przeciwników";
        String q4 = "Która z postaci podczas strzału dodatkowo zatruwa przeciwnika zabierając mu życie? \n " +
                "(a): Leon \n (b): Pipper \n (c): Crow";
        String q5 = "Jakiego koloru Bul ma kamizelkę w wersi podstawowej? \n " +
                "(a): niebieskiej \n (b): czarnej \n (c): zielonej";
        String q6 = "Która z postaci jest następna do odblokowania w aleii nagród zaraz po Dynamite? \n " +
                "(a): Tick \n (b): Bo \n (c): 8-BITOWIEC";
        String q7 = "Która dostepna w grze plansza pozwala na rozgrywkę solo? \n " +
                "(a): Zbiory klejnotów \n (b): Zadyma \n (c): Starcie";

        Question[] question = {
                new Question(q1, "b"),
                new Question(q2, "c"),
                new Question(q3, "c"),
                new Question(q4, "c"),
                new Question(q5, "b"),
                new Question(q6, "b"),
                new Question(q7, "c"),

        };
        brawlTest(question);


    }

    public static void brawlTest(Question[] questions) {//logika pytań pętla FOR
        System.out.println("Quiz dla fanów gry Brawl Stars versja 1.0");
        System.out.println();
        System.out.println("W grze Brawl Stars możesz sterować jednym z 36 dostępnych " +
                "zadymiarzy.\n" +
                "Każdy z nich jest wyjątkowy na swój sposób. Każdy bohater posiada inną broń, superatak oraz \n" +
                "inną gwiezdną moc. To sprawia, że każdym gra się inaczej. Musisz samodzielnie przetestować \n" +
                "wszystkich bohaterów by sprawdzić czym Ci się gra najlepiej i dostosowywać bohatera do planszy.\n");


        int score = 0;
        Scanner out = new Scanner(System.in);


        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i].prompt);
            String answer = out.nextLine();
            if (answer.equals(questions[i].answer)) {
                score++;
            }

        }

        System.out.println("Twój wynik to: " + score);
        System.out.println(score + "/" + questions.length);

        Scanner sc = new Scanner(System.in);
        final int exit = 0;
        final int easy = 1;
        final int medium = 2;
        final int hard = 3;
        int option = -1;

        Scanner output = new Scanner(System.in);
        while (option != exit) {
            System.out.println();
            System.out.println("Jaki poziom trudności miał quiz?");
            System.out.println(easy + " łatwy");
            System.out.println(medium + " średni");
            System.out.println(hard + " trudny");
            System.out.println(exit + " - Wyjście z quizu");
            System.out.println();
            System.out.println("Do dzieła");
            option = output.nextInt();
            output.nextLine();  //potrzebne ponieważ wyżej jest INT, liczba.
            // Inaczej przeskoczy wiersz i nie zaczeka na użytkownika

            switch (option) { //Przypisanie funkcji PRZYCISKOM 1 2 3 czyli case!
                case easy:
                    System.out.println();
                    System.out.println("Musisz być dobrym graczem");
                    break;

                case medium:
                    System.out.println();
                    System.out.println("Trochę sie grało co?");
                    break;
                case hard:
                    System.out.println();
                    System.out.println("Masz zainstalowaną grę?");
                    break;
                case exit:
                    System.out.println();
                    System.out.println("Zamykam program. Miłego dnia.");
                    break;

                default://Jeżeli ktoś naciśnie inna opcję, zabezpieczenie.
                    System.out.println("Niepoprawny numer opcji. Wybierz właściwy 0 1 lub 2 lub 3");


            }

        }
    }
}



