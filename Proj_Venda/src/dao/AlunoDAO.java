package dao;

import factory.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.Aluno;


public class AlunoDAO {
    private Connection connection;
    
    public AlunoDAO() {
    this.connection = new ConnectionFactory().getConnection();
    }
    
    public void adicionaAluno(Aluno aluno) {
        String sql = "INSERT INTO alunos(aln_nome) VALUES(?)";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, aluno.getNome());
            stmt.execute();
            stmt.close();
        }
        catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }
    
    public void adicionaCpf(Aluno aluno) {
        String sql = "INSERT INTO alunos(aln_cpf) VALUES(?)";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, aluno.getCpf());
            stmt.execute();
            stmt.close();
        }
        catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }
    
    public void adicionaPeso(Aluno aluno) {
        String sql = "INSERT INTO alunos(aln_peso) VALUES(?)";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, aluno.getPeso());
            stmt.execute();
            stmt.close();
        }
        catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }
    
    public void adicionaAltura(Aluno aluno) {
        String sql = "INSERT INTO alunos(aln_altura) VALUES(?)";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setFloat(1, aluno.getAltura());
            stmt.execute();
            stmt.close();
        }
        catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }
    
    public void adicionaData(Aluno aluno) {
        String sql = "INSERT INTO alunos(aln_data) VALUES(?)";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1,  aluno.getDataNascimento());
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
}