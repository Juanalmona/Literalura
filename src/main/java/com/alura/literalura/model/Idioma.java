package com.alura.literalura.model;

public enum Idioma {
    ES("es"),
    EN("en"),
    FR("fr"),
    PT("pt");
    String idioma;

    private Idioma(String idioma) {
        this.idioma = idioma;
    }

    public String getIdioma() {
        return idioma;
    }

    public static Idioma fromString(String text) {
        for (Idioma idioma : Idioma.values()) {
            if (idioma.idioma.equalsIgnoreCase(text)) {
                return idioma;
            }
        }
        throw new IllegalArgumentException("No se encontro nada: " + text);
    }
}
