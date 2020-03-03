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
import model.bean.Turma;


public class TurmaDAO {
    public void create(Turma t){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
     
        try {
            stmt = con.prepareStatement("INSERT INTO turma (id_curso,qtd_alunos) VALUES (?,?)");
            //stmt.setInt(1, t.getIdTurma());
            stmt.setInt(1, t.getIdCurso());
            stmt.setInt(2, t.getQtdAlunos());
            stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(TurmaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public List<Turma> read(){
        List<Turma> turma = new ArrayList<>();
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try {
            stmt = con.prepareStatement("SELECT * FROM turma");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Turma t = new Turma();
                t.setIdTurma(rs.getInt("id_turma"));
                t.setIdCurso(rs.getInt("id_curso"));
                t.setQtdAlunos(rs.getInt("qtd_alunos"));
                turma.add(t);
            }
        } catch (SQLException ex) {
            Logger.getLogger(TurmaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }        
        return turma;
    }
    
    public void update(Turma t){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
      
        try {
            stmt = con.prepareStatement("UPDATE turma SET id_curso = ?, qtd_alunos = ? WHERE id_turma = ?");
            
            stmt.setInt(1, t.getIdCurso());
            stmt.setInt(2, t.getQtdAlunos());
            stmt.setInt(3, t.getIdTurma());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        
        } catch (SQLException ex) {
            Logger.getLogger(TurmaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public void delete(Turma t){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM turma WHERE id_turma = ?");
            stmt.setInt(1, t.getIdTurma());
            stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(TurmaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
}
