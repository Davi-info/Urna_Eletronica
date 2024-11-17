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

    
}
