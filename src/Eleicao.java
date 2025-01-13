import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Eleicao {
    
    // Criação dos atributos
    private String id;
    private String nomeEleicao;
    private Date dataInicio;
    private Date dataFim;
    private List<Candidato> candidatos;
    private List<Eleitor> eleitores;
    private Cargo cargo;
    private TipoEleicao tipo;

    // Construtor
    public Eleicao(int id, String nome, Date dataInicio, Date dataFim, Cargo cargo, TipoEleicao tipo) {
        this.id = id;
        this.nome = nome;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.candidatos = new ArrayList<>();
        this.eleitores = new ArrayList<>();
        this.cargo = cargo;
        this.tipo = tipo;
    }

    // Método para cadastrar candidato
        
}
