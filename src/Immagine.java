public class Immagine extends ElementoMultimediale {
    // Variabile specifica solo per le immagini
    private int luminosity;

    // Costruttore:
    public Immagine(String titolo, int luminosita) {
        super(titolo);
        this.luminosity = luminosita;
    }

    // Metodi per regolare la luminosità
    public void aumentaLuminosita() {
        this.luminosity = 1 + this.luminosity;
    }

    public void diminuisciLuminosita() {
        if (this.luminosity > 0) {
            this.luminosity = this.luminosity - 1;
        }
    }

    // Metodo specifico per mostrare l'immagine
    public void show() {
        System.out.print(getTitolo());
        // Ciclo for per stampare
        for (int i = 0; i < this.luminosity; i++) {
            System.out.print("*");
        }
        // Vado a capo alla fine
        System.out.println();
    }
}
