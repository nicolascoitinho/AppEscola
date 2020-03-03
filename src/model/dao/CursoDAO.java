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
import model.bean.Curso;

public class CursoDAO {
    public void create(Curso c){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
     
        try {
            stmt = con.prepareStatement("INSERT INTO curso (nome_curso) VALUES (?)");
            stmt.setString(1, c.getNomeCurso());
            stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CursoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public List<Curso> read(){
        List<Curso> curso = new ArrayList<>();
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        try {
            stmt = con.prepareStatement("SELECT * FROM curso");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Curso c = new Curso();
                c.setIdCurso(rs.getInt("id_curso"));
                c.setNomeCurso(rs.getString("nome_curso"));
                curso.add(c);
            }
        } catch (SQLException ex) {
            Logger.getLogger(CursoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }        
        return curso;
    }
    
    public void update(Curso c){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("UPDATE curso SET nome_curso = ? WHERE id_curso = ?");
            stmt.setString(1, c.getNomeCurso());
            stmt.setInt(2, c.getIdCurso());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        
        } catch (SQLException ex) {
            Logger.getLogger(CursoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public void delete(Curso c){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM curso WHERE id_curso = ?");
            stmt.setInt(1, c.getIdCurso());
            stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(CursoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }

    public Iterable<Curso> readForNomeDoCurso(String descr) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Iterable<Curso> read(String descr) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
