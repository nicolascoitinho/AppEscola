package model.bean;

public class Professor {
    private int idProfessor;
    private int chapa;
    private String nomeProfessor;
    private int idCurso;
    private int idTurma;

    public int getIdProfessor() {
        return idProfessor;
    }

    public void setIdProfessor(int idProfessor) {
        this.idProfessor = idProfessor;
    }

    public int getChapa() {
        return chapa;
    }

    public void setChapa(int chapa) {
        this.chapa = chapa;
    }

    public String getNomeProfessor() {
        return nomeProfessor;
    }

    public void setNomeProfessor(String nomeProfessor) {
        this.nomeProfessor = nomeProfessor;
    }

    public int getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    public int getIdTurma() {
        return idTurma;
    }

    public void setIdTurma(int idTurma) {
        this.idTurma = idTurma;
    }

    @Override
    public String toString() {
        return "Id Professor = " + idProfessor + 
                "\nChapa = " + chapa + 
                "\nNome Professor=" + nomeProfessor + 
                "\nId Curso = " + idCurso + 
                "\nId Turma=" + idTurma;
    }
    
}
