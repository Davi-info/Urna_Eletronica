public class Cargo {

    //Atributos.
    private String nomeCargo;
    private int numeroVagas;

    //Construtor.
    public Cargo(nomeCargo, numeroVagas){
        this.nomeCargo = nomeCargo;
        this.numeroVagas = numeroVagas;
    }


    public String getNomeCargo() {
        return nomeCargo;
    }

    public void setNomeCargo(String nomeCargo) {
        this.nomeCargo = nomeCargo;
    }

    public int getNumeroVagas() {
        return numeroVagas;
    }

    public void setNumeroVagas(int numeroVagas) {
        this.numeroVagas = numeroVagas;
    }
}
