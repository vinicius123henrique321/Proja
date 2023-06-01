package Model;

import java.util.Date;

public class Aluno {
    protected int Cpf;
    protected String Nome;
    protected Date DataNascimento;
    protected float Peso;
    protected int Altura;
    
    public Aluno(int cpf, String nome, Date dataNascimento, float peso, int altura){
        this.Altura = altura;
        this.Cpf = cpf;
        this.DataNascimento = dataNascimento;
        this.Nome = nome;
        this.Peso = peso;
    }
    
    public int getAltura(){
        return Altura;
    }
    
    public void setAltura(int altura){
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
    
    public Date getDataNascimento(){
        return DataNascimento;
    }
    
    public void setDataNascimento(Date dataNascimento){
        this.DataNascimento = dataNascimento;
    }
    
    public float getPeso(){
        return Peso;
    }
    
    public void setPeso(float peso){
        this.Peso = peso;
    }
}
