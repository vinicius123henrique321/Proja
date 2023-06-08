package modelo;

public class Aluno {
    private int aln_id;
    private String aln_nome;

    public void setId(int id) {
        this.aln_id = id;
    }

    public void setNome(String nome) {
        this.aln_nome = nome;
    }
    
    public int getId() {
        return aln_id;
    }

    public String getNome() {
        return aln_nome;
    }

}
