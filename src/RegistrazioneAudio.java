public class RegistrazioneAudio extends ElementoMultimediale implements Riproducibile {
    // Variabili specifiche per l'audio
    private int durata;
    private int volume;

    // Costruttore
    public RegistrazioneAudio(String titolo, int durata, int volume) {
        super(titolo); // Chiama il cost.
        this.durata = durata;
        this.volume = volume;
    }

    // Metodi per regolare il volume
    public void alzaVolume() {
        this.volume = this.volume + 1;
    }

    public void abbassaVolume() {
        if (this.volume <= 0) {
            return;
        }
        this.volume = this.volume - 1;
    }

    // Implementazione del metodo play (qui non ho capito alcune cose di intellij)
    public void play() {
        int i = 0;
        while (i < this.durata) {

            // Stampa il titolo
            System.out.print(getTitolo());

            // Ciclo per stampare * in base al volume
            for (int j = 0; j < this.volume; j++) {
                System.out.print("*");
            }

            // Alla fine della riga, vado a capo
            System.out.println();
            i++;
        }
    }
}
