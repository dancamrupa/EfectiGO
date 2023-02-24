package plataforma.efectigo.utils.enums;

public enum ActorNotepad {
    FOLIO("folio number");
    private final String key;

    ActorNotepad(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }
}
