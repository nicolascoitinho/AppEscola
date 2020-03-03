package model.bean;

public class Aluno {
    private int idAluno;
    private int ra;
    private String nomeAluno;
    private int idCurso;
    private int idTurma;

    public int getIdAluno() {
        return idAluno;
    }

    public void setIdAluno(int idAluno) {
        this.idAluno = idAluno;
    }

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
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
        return  "Id Aluno = " + idAluno + 
                "\nRa = " + ra + 
                "\nNome Aluno = " + nomeAluno + 
                "\nId Curso = " + idCurso + 
                "\nId Turma = " + idTurma;
    }
    
}
