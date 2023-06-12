package dao;

import factory.ConnectionFactory;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import modelo.Aluno;


public class AlunoDAO {
    private Connection connection;
    
    public AlunoDAO() {
    this.connection = new ConnectionFactory().getConnection();
    }
    
    public void adicionaAluno(Aluno aluno) {
        String sql = "INSERT INTO alunos(aln_nome, aln_cpf, aln_peso, aln_altura, aln_data) VALUES(?, ?, ?, ?, ?)";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, aluno.getNome());
            stmt.setInt(2, aluno.getCpf());
            stmt.setInt(3, aluno.getPeso());
            stmt.setFloat(4, aluno.getAltura());
            stmt.setString(5, aluno.getDataNascimento());
            stmt.execute();
            stmt.close();
        }
        catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }
    
    public void atualizarAluno(Aluno aluno) {
        // implementação para atualizar pessoa no banco de dados
    }
    
    public void excluir(int id) {
        // implementação para excluir pessoa do banco de dados pelo id
    }
    
    public Aluno selecionarPorId() {
        Aluno aluno = new Aluno();
        // implementação para selecionar pessoa do banco de dados pelo id
        return aluno;
    }
    
    public ArrayList<Aluno> exibirAlunos() {
        String sql = "select * from aluno;";
        ArrayList<Aluno> alunos = new ArrayList<>();
        try{
            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                String nome = rs.getString("aln_nome");
                int id = rs.getInt("aln_id");
                Aluno aluno = new Aluno();
                aluno.setNome(nome);
                aluno.setId(id);
                alunos.add(aluno);
            }
            return alunos;
        }
        catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }
    
    public Aluno calcularIMC() throws SQLException{
        String sql = "select aln_altura, aln_peso from alunos where aln_id = 1";
        Aluno IMC = new Aluno();
        try{
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, 1);
            ResultSet rs = stmt.executeQuery();
            if(rs.next()){
                int peso = rs.getInt("aln_peso");
                float altura = rs.getFloat("aln_altura");
                int imc = (int) (peso /(altura * altura));
                IMC.setImc(imc);
            }
            else{
                System.out.println("eita");
            }
            stmt.execute();
            stmt.close();
            return IMC;
        } 
        catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }
}
    

    


