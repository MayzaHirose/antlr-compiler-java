package compiler.util;

public enum TipoDeDado {
	INT("int"), STRING("string"), BOOL("bool");
	
	private final String text;

	TipoDeDado(final String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }
}
