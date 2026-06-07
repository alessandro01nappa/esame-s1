//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ElementoMultimediale[] elementi = new ElementoMultimediale[5];

        int i = 0;
        while (i < 5) {
            System.out.println("Scegli il tipo per l'elemento " + (i + 1) + " (1 = Audio, 2 = Video, 3 = Immagine):");
            int scelta = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Inserisci il titolo:");
            String titolo = scanner.nextLine();

            if (scelta != 1) {
                if (scelta == 2) {
                    System.out.println("Inserisci la durata:");
                    int durata = scanner.nextInt();
                    System.out.println("Inserisci il volume:");
                    int volume = scanner.nextInt();
                    System.out.println("Inserisci la luminosita:");
                    int luminosita = scanner.nextInt();
                    elementi[i] = new Video(titolo, durata, volume, luminosita);
                } else {
                    if (scelta == 3) {
                        System.out.println("Inserisci la luminosita:");
                        int luminosita = scanner.nextInt();
                        elementi[i] = new Immagine(titolo, luminosita);
                    } else {
                        System.out.println("Scelta non valida, ripeti.");
                        i = i - 1;
                    }
                }
            } else {
                System.out.println("Inserisci la durata:");
                int durata = scanner.nextInt();
                System.out.println("Inserisci il volume:");
                int volume = scanner.nextInt();
                elementi[i] = new RegistrazioneAudio(titolo, durata, volume);
            }
            i++;
        }

        int comando = -1;
        while (comando != 0) {
            System.out.println("Quale elemento vuoi eseguire? Scegli da 1 a 5 o 0 per uscire:");
            comando = scanner.nextInt();

            if (comando >= 1 && comando <= 5) {
                ElementoMultimediale elemento = elementi[comando - 1];

                if (elemento instanceof Immagine) {
                    Immagine img = (Immagine) elemento;
                    img.show();
                } else {
                    if (elemento instanceof Riproducibile) {
                        Riproducibile rip = (Riproducibile) elemento;
                        rip.play();
                    }
                }
            } else {
                if (comando == 0) {
                    continue;
                }
                System.out.println("Posizione non valida.");
            }
        }

        scanner.close();
    }
}
