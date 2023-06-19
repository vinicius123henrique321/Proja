package dao;

import factory.ConnectionFactory;
import java.util.List;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
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
            stmt.setLong(2, aluno.getCpf());
            stmt.setDouble(3, aluno.getPeso());
            stmt.setDouble(4, aluno.getAltura());
            stmt.setString(5, aluno.getDataNascimento());
            stmt.execute();
            stmt.close();
        }
        catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }
    
    public void atualizarAluno(Aluno aluno) {
        String sql = "UPDATE alunos SET aln_nome = ?, aln_data = ?, aln_peso = ?, aln_altura = ?, aln_cpf = ? WHERE aln_id = ?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, aluno.getNome());
            stmt.setString(2, aluno.getDataNascimento());
            stmt.setDouble(3, aluno.getPeso());
            stmt.setDouble(4, aluno.getAltura());
            stmt.setLong(5, aluno.getCpf());
            stmt.setInt(6, aluno.getId());
            stmt.executeUpdate();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    public void excluir(int id) {
        String sql = "DELETE FROM alunos WHERE aln_id = ?";
        Connection conn = new ConnectionFactory().getConnection();
        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);
            stmt.executeUpdate();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    public ArrayList<Aluno> obterAlunos() {
        String sql = "select * from alunos;";
        ArrayList<Aluno> alunos = new ArrayList<>();
        try{
            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                int id = rs.getInt("aln_id");
                Long cpf = rs.getLong("aln_cpf");
                String nome = rs.getString("aln_nome");
                String dataN = rs.getString("aln_data");
                double peso = rs.getDouble("aln_peso");
                double altura = rs.getDouble("aln_altura");
                Aluno aluno = new Aluno();
                aluno.setCpf(cpf);
                aluno.setNome(nome);
                aluno.setId(id);
                aluno.setDataNascimento(dataN);
                aluno.setPeso(peso);
                aluno.setAltura(altura);
                alunos.add(aluno);
            }
            return alunos;
        }
        catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }
    
    public double calcularIMC(int id) throws SQLException{
        String sql = "select aln_altura, aln_peso from alunos where aln_id = (?);";
        try{
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if(rs.next()){
                double peso = rs.getDouble("aln_peso");
                double altura = rs.getDouble("aln_altura");
                double imc = (peso /(altura * altura));
                return imc;
            }
            else{
                System.out.println("eita");
            }
            stmt.execute();
            stmt.close();
        } 
        catch (SQLException u) {
            throw new RuntimeException(u);
        }
        return 0;
    }
    
    public ArrayList<Aluno> pesquisarAlunos(String nomeP) {
        String sql = "select * from alunos where aln_nome = (?);";
        ArrayList<Aluno> alunos = new ArrayList<>();
        try{
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, nomeP);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                int id = rs.getInt("aln_id");
                Long cpf = rs.getLong("aln_cpf");
                String nome = rs.getString("aln_nome");
                String dataN = rs.getString("aln_data");
                int peso = rs.getInt("aln_peso");
                double altura = rs.getFloat("aln_altura");
                Aluno aluno = new Aluno();
                aluno.setCpf(cpf);
                aluno.setNome(nome);
                aluno.setId(id);
                aluno.setDataNascimento(dataN);
                aluno.setPeso(peso);
                aluno.setAltura(altura);
                alunos.add(aluno);
            }
            return alunos;
        }
        catch (SQLException u) {
            throw new RuntimeException(u);
        }   
}    
}