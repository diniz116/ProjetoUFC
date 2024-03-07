public class Main {
    public static void main(String[] args) {
            Lutador l[] = new Lutador[4];

            l[0] = new Lutador("John", 25, "EUA", 78.3f, 2, 0, 1);
            l[1] = new Lutador("Vitor", 21, "Brasil", 63.5f, 3, 1, 2);
            l[2] = new Lutador("Julius", 29, "Holanda", 88.0f, 6, 2, 1);
            l[3] = new Lutador("Smith", 27, "Belgica", 77.7f, 4, 2, 2);

            Luta UEC01 = new Luta();
            UEC01.marcarLuta(l[0], l[1]);
            UEC01.Lutar();
            l[0].status();
            l[1].status();
        }
    }
