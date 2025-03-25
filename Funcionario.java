public class Funcionario {

    private String nome;
    private double salario;
    private Nivel nivel;
    private boolean afastado;

    public Funcionario(String nome, double salario, char nivelCodigo, boolean afastado) {
        this.nome = nome;
        this.salario = salario;
        this.nivel = Nivel.fromCodigo(nivelCodigo);
        this.afastado = afastado;
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Nivel getNivel() {
        return nivel;
    }

    public void setNivel(char nivelCodigo) {
        this.nivel = Nivel.fromCodigo(nivelCodigo);
    }

    public boolean isAfastado() {
        return afastado;
    }

    public void setAfastado(boolean afastado) {
        this.afastado = afastado;
        
    }

    public void aplicarDescontoPorFalta() {
        this.salario -= 1518.0 * 0.10; 
    }

    public void aplicarAumentoPorHoraExtra() {
        this.salario += 1518.0 * 0.10; 
    }

    @Override
    public String toString() {
        String afastadoDescricao = afastado ? "Sim" : "Não";
        return "Nome: " + nome + "\n" +
               "Salário: " + salario + "\n" +
               "Nível: " + nivel + "\n" +
               "Afastado: " + afastadoDescricao;
    }
}
