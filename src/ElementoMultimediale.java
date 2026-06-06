public abstract class ElementoMultimediale {
    // salvo il titolo dell'elemento
    private final String titolo;

    // Costruttore x riceve il titolo quando creiamo l'oggetto
    public ElementoMultimediale(String titolo) {
        this.titolo = titolo;
    }

    // Metodo per poter leggere il titolo da fuori
    public String getTitolo() {
        return titolo;
    }
}
