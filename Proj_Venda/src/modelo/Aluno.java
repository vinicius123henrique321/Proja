package modelo;

import java.time.LocalDate;

public class Aluno {
    private int id;
    protected int Cpf;
    protected String Nome;
    protected String DataNascimento;
    protected int Peso;
    protected float Altura;
    private float Imc;        
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public float getAltura(){
        return Altura;
    }
    
    public void setAltura(float altura){
        this.Altura = altura;
    }
    
    public String getNome(){
        return Nome;
    }
    
    public void setNome(String nome){
        this.Nome = nome;
    }
    
    public int getCpf(){
        return Cpf;
    }
    
    public void setCpf(int cpf){ 
        this.Cpf = cpf;
    }
    
    public String getDataNascimento(){
        return DataNascimento;
    }
    
    public void setDataNascimento(String dataNascimento){
        this.DataNascimento = dataNascimento;
    }
    
    public int getPeso(){
        return Peso;
    }
    
    public void setPeso(int peso){
        this.Peso = peso;
    }

    public float getImc() {
        return Imc;
    }

    public void setImc(float Imc) {
        this.Imc = Imc;
    }
}
