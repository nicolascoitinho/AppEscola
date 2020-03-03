package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.bean.Aluno;


public class AlunoDAO {
    public void create(Aluno a){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
     
        try {
            stmt = con.prepareStatement("INSERT INTO aluno (ra,nome_aluno,id_curso,id_turma) VALUES (?,?,?,?)");
            stmt.setInt(1, a.getRa());
            stmt.setString(2, a.getNomeAluno());
            stmt.setInt(3, a.getIdCurso());
            stmt.setInt(4, a.getIdTurma());
            stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(AlunoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public List<Aluno> read(){
        List<Aluno> aluno = new ArrayList<>();
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try {
            stmt = con.prepareStatement("SELECT * FROM aluno");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Aluno a = new Aluno();
                a.setRa(rs.getInt("ra"));
                a.setNomeAluno(rs.getString("nome_aluno"));
                a.setIdCurso(rs.getInt("id_curso"));
                a.setIdTurma(rs.getInt("id_turma"));
                aluno.add(a);
            }
        } catch (SQLException ex) {
            Logger.getLogger(TurmaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }        
        return aluno;
    }
    
    public void update(Aluno a){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
      
        try {
            stmt = con.prepareStatement("UPDATE aluno SET ra = ?, nome_aluno = ?, id_curso = ?, id_turma = ? WHERE id_aluno = ?");
            stmt.setInt(1, a.getRa());
            stmt.setString(2, a.getNomeAluno());
            stmt.setInt(3, a.getIdCurso());
            stmt.setInt(4, a.getIdTurma());
            stmt.setInt(5, a.getIdAluno());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        
        } catch (SQLException ex) {
            Logger.getLogger(AlunoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public void delete(Aluno a){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM aluno WHERE id_aluno = ?");
            stmt.setInt(1, a.getIdAluno());
            stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(AlunoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
}
