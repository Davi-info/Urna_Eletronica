public class Candidato {

    // Criando Atributos.
    private int idCandidato;
    private String nomeDoCandidato;
    private Cargo cargo;
    private String partido;

    // Construtor
    public Candidato(int idCandidato, String nomeCandidato, Cargo cargo, String partido){
        this.idCandidato = idCandidato;
        this.nomeDoCandidato = nomeCandidato;
        this.cargo = cargo;
        this.partido = partido;
    }

    public int getIdCandidato() {
        return idCandidato;
    }

    public void setIdCandidato(int idCandidato) {
        this.idCandidato = idCandidato;
    }

    public String getNomeDoCandidato() {
        return nomeDoCandidato;
    }

    public void setNomeDoCandidato(String nomeDoCandidato) {
        this.nomeDoCandidato = nomeDoCandidato;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public String getPartido() {
        return partido;
    }

    public void setPartido(String partido) {
        this.partido = partido;
    }

    
    
}
