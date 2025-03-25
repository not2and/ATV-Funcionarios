public enum Nivel {
    TRAINEE('t', "Trainee"),
    JUNIOR('j', "Junior"),
    PLENO('p', "Pleno"),
    SENIOR('s', "Senior");

    private char codigo;
    private String descricao;

    Nivel(char codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public char getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public static Nivel fromCodigo(char codigo) {
        for (Nivel nivel : Nivel.values()) {
            if (nivel.getCodigo() == codigo) {
                return nivel;
            }
        }
        return null; // ou lançar uma exceção se o código for inválido
    }

    @Override
    public String toString() {
        return descricao;
    }
}
