package modelo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import javax.swing.JOptionPane;

public class Aluno {
    protected int id;
    protected Long Cpf;
    protected String Nome;
    protected String DataNascimento;
    protected double Peso;
    protected double Altura;       

    public Aluno(Long cpf, String nome, String dataNascimento, double peso, double altura) {
        this.Cpf = cpf;
        this.Nome = nome;
        this.DataNascimento = dataNascimento;
        this.Peso = peso;
        this.Altura = altura;
    }

    public Aluno() {
       
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public double getAltura(){
        return Altura;
    }
    
    public void setAltura(double altura){
        this.Altura = altura;
    }
    
    public String getNome(){
        return Nome;
    }
    
    public void setNome(String nome){
        this.Nome = nome;
    }
    
    public Long getCpf(){
        return Cpf;
    }
    
    public void setCpf(Long cpf){ 
        this.Cpf = cpf;
    }
    
    public String getDataNascimento(){
        return DataNascimento;
    }
    
    public void setDataNascimento(String dataNascimento){
        this.DataNascimento = dataNascimento;
    }
    
    public double getPeso(){
        return Peso;
    }
    
    public void setPeso(double peso){
        this.Peso = peso;
    }
    
     public double getIMC() {
        double IMC = Peso / java.lang.Math.pow(Altura, 2);
        return IMC;
    }
     
     public void exportarIMC() {
    try {
        String path = System.getProperty("user.home") + File.separator + "Downloads";
        File arq = new File(path, "imc.txt");
        
        if (arq.exists()) {
            FileWriter fileWriter = new FileWriter(arq, true);
            BufferedWriter escrita = new BufferedWriter(fileWriter);
            double imc = getIMC();
            escrita.newLine();
            
            if (imc < 18.5) {
                escrita.write("CPF: " + getCpf() + " Nome: " + getNome() + " IMC: " + String.format("%.2f", imc) + " Data de gerada: " + new Date() + " Classificação: Abaixo do peso normal");
            } else if (imc >= 18.5 && imc <= 24.9) {
                escrita.write("CPF: " + getCpf() + " Nome: " + getNome() + " IMC: " + String.format("%.2f", imc) + " Data de gerada: " + new Date() + " Classificação: Peso normal");
            } else if (imc >= 25.0 && imc <= 29.9) {
                escrita.write("CPF: " + getCpf() + " Nome: " + getNome() + " IMC: " + String.format("%.2f", imc) + " Data de gerada: " + new Date() + " Classificação: Excesso de peso");
            } else if (imc >= 30.0 && imc <= 34.9) {
                escrita.write("CPF: " + getCpf() + " Nome: " + getNome() + " IMC: " + String.format("%.2f", imc) + " Data de gerada: " + new Date() + " Classificação: Obesidade classe I");
            } else if (imc >= 35.0 && imc <= 39.9) {
                escrita.write("CPF: " + getCpf() + " Nome: " + getNome() + " IMC: " + String.format("%.2f", imc) + " Data de gerada: " + new Date() + " Classificação: Obesidade classe II");
            } else {
                escrita.write("CPF: " + getCpf() + " Nome: " + getNome() + " IMC: " + String.format("%.2f", imc) + " Data de gerada: " + new Date() + " Obesidade classe III");
            }
            
            escrita.close();
        } else {
            arq.createNewFile();
            FileWriter fileWriter = new FileWriter(arq, true);
            BufferedWriter escrita = new BufferedWriter(fileWriter);
            double imc = getIMC();
            escrita.write("CPF: " + getCpf() + " Nome: " + getNome() + " IMC: " + String.valueOf(imc) + " Data de gerada: " + new Date());
            escrita.close();
        }
    } catch (IOException e) {
        System.out.println(e);
        JOptionPane.showMessageDialog(null, e);
    }
}  
}

