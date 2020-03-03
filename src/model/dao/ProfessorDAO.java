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
import model.bean.Professor;

public class ProfessorDAO {
    public void create(Professor p){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("INSERT INTO professor (chapa, nome_professor, id_curso, id_turma) VALUES (?,?,?,?)");
            stmt.setInt(1, p.getChapa());
            stmt.setString(2, p.getNomeProfessor());
            stmt.setInt(3, p.getIdCurso());
            stmt.setInt(4, p.getIdTurma());
            stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ProfessorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public List<Professor> read(){
        List<Professor> professor = new ArrayList<>();
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try {
            stmt = con.prepareStatement("SELECT * FROM professor");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Professor p = new Professor();
                p.setIdProfessor(rs.getInt("id_professor"));
                p.setChapa(rs.getInt("chapa"));
                p.setNomeProfessor(rs.getString("nome_professor"));
                p.setIdCurso(rs.getInt("id_curso"));
                p.setIdTurma(rs.getInt("id_turma"));
                professor.add(p);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProfessorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }        
        return professor;
    }
    
    public void update(Professor p){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
      
        try {
            stmt = con.prepareStatement("UPDATE professor SET chapa = ?, nome_professor = ?, id_curso = ?, id_turma = ? WHERE id_professor = ?");
            stmt.setInt(1, p.getChapa());
            stmt.setString(2, p.getNomeProfessor());
            stmt.setInt(3, p.getIdCurso());
            stmt.setInt(4, p.getIdTurma());
            stmt.setInt(5, p.getIdProfessor());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        
        } catch (SQLException ex) {
            Logger.getLogger(ProfessorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public void delete(Professor p){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM professor WHERE id_professor = ?");
            stmt.setInt(1, p.getIdProfessor());
            stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ProfessorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
}
