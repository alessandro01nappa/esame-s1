public class Video extends ElementoMultimediale implements Riproducibile {

    private int durata;
    private int volume;
    private int luminosity;

    public Video(String titolo, int durata, int volume, int luminosity) {
        super(titolo);
        this.durata = durata;
        this.volume = volume;
        this.luminosity = luminosity;
    }

    public void alzaVolume() {
        this.volume = this.volume + 1;
    }

    public void abbassaVolume() {
        if (this.volume <= 0) {
            return;
        }
        this.volume = this.volume - 1;
    }

    public void aumentaLuminosita() {
        this.luminosity = this.luminosity + 1;
    }

    public void diminuisciLuminosita() {
        if (this.luminosity <= 0) {
            return;
        }
        this.luminosity = this.luminosity - 1;
    }

    public void play() {
        for (int i = 0; i < this.durata; i++) {

            System.out.print(getTitolo());

            for (int j = 0; j < this.volume; j++) {
                System.out.print("!");
            }

            for (int k = 0; k < this.luminosity; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}