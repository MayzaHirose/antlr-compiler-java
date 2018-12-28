package grace.util;

public enum TipoDeDado {
	INT("int"), STRING("string"), BOOL("bool"), VAZIO("vazio");
	
	private final String text;

	TipoDeDado(final String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }
}
