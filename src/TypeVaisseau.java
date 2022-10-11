public enum TypeVaisseau {
    CHASSEUR("Chasseur"),
    FREGATE("Fregate"),
    CROISEUR("Croisseur"),
    CARGO("Cargo"),
    VAISSEAUMONDE("Vaisseau-Monde");

    final String typeVaisseau;

    private TypeVaisseau(String typeVaisseau) {
        this.typeVaisseau = typeVaisseau;
    }

}
