package lunes;

// Atributos
public class Candidato {
    private DatosPersona dp;
    private int numVotos;
    private static String nomMaxVotado;
    private static int numMaxVotos;

    // Constructor
    public Candidato(String uNombre, String uDNI, String uProvincia, int uNumVotos) {
        dp = new DatosPersona(uNombre, uDNI, uProvincia);
        this.numVotos = uNumVotos;
        this.nomMaxVotado = "";
        this.numMaxVotos = 0;
    }

    public Candidato(String uNombre, String uDNI, String uProvincia) {
        dp = new DatosPersona(uNombre, uDNI, uProvincia);
        this.numVotos = 0;
        this.nomMaxVotado = "";
        this.numMaxVotos = 0;
    }

    // Getters and Setters
    public int getNumVotos() {
        return numVotos;
    }

    public void setNumVotos(int numVotos) {
        this.numVotos = numVotos;
    }

    public String getNomMaxVotado() {
        return nomMaxVotado;
    }

    public void setNomMaxVotado(String nomMaxVotado) {
        Candidato.nomMaxVotado = nomMaxVotado;
    }

    public int getNumMaxVotos() {
        return numMaxVotos;
    }

    public void setNumMaxVotos(int numMaxVotos) {
        Candidato.numMaxVotos = numMaxVotos;
    }

    public DatosPersona getDp() {
        return dp;
    }

    public void setDpNombre(String pNombre) {
        this.dp.setNombre(pNombre);
    }

    public void setDpDNI(String pDNI) {
        this.dp.setDNI(pDNI);
    }

    public void setDpProvincia(String pProvincia) {
        this.dp.setProvincia(pProvincia);
    }

    // toString
    public String toString() {
        return dp.toString() + "\nNumero de votos: " + this.numVotos;
    }

    // Metodos
    public void voto() {
        numVotos++;
        if (numVotos > getNumMaxVotos()) {
            nomMaxVotado = dp.getNombre();
            numMaxVotos = numVotos;
        }

    }
} // class end
