package view;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.bean.Aluno;
import model.bean.Curso;
import model.bean.Turma;
import model.dao.AlunoDAO;
import model.dao.CursoDAO;
import model.dao.TurmaDAO;


public class GUIAluno extends javax.swing.JInternalFrame {

    
    public GUIAluno() {
        initComponents();
        viewComboBox1();
        viewComboBox2();
    }
    
  
    
    private void readGUIAlunos() {
        DefaultTableModel modelo = (DefaultTableModel) jtAreaAluno.getModel();
        modelo.setNumRows(0);
        AlunoDAO adao = new AlunoDAO();
        for (Aluno a : adao.read()) {
            modelo.addRow(new Object[]{
                a.getIdAluno(),
                a.getRa(),
                a.getNomeAluno(),
                a.getIdCurso(),
                a.getIdTurma()
            });
        }
    }
    
    private void viewComboBox1() {        
        CursoDAO cdao = new CursoDAO();
        for(Curso c : cdao.read()){
            jcCurso.addItem(c.toString());
        }
    }
    
    private void viewComboBox2() {        
        TurmaDAO tdao = new TurmaDAO();
        for(Turma t : tdao.read()){
            jcTurma.addItem(t.toString());
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jtRaAluno = new javax.swing.JTextField();
        jlAluno = new javax.swing.JLabel();
        jlNomeAluno = new javax.swing.JLabel();
        jtNomeAluno = new javax.swing.JTextField();
        jtCurso = new javax.swing.JLabel();
        jcCurso = new javax.swing.JComboBox<>();
        jlTurma = new javax.swing.JLabel();
        jcTurma = new javax.swing.JComboBox<>();
        jbCadAluno = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtAreaAluno = new javax.swing.JTable();

        setTitle("Cadastro Aluno");

        jLayeredPane1.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastro"));

        jlAluno.setText("RA do Aluno");

        jlNomeAluno.setText("Nome do Aluno");

        jtNomeAluno.setToolTipText("");

        jtCurso.setText("Curso");

        jlTurma.setText("Turma");

        jbCadAluno.setText("CADASTRAR");
        jbCadAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCadAlunoActionPerformed(evt);
            }
        });

        jLayeredPane1.setLayer(jtRaAluno, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jlAluno, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jlNomeAluno, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jtNomeAluno, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jtCurso, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jcCurso, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jlTurma, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jcTurma, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jbCadAluno, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(jtNomeAluno)
                        .addContainerGap())
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtRaAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlNomeAluno))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(jcCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jcTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(jtCurso)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jlTurma)
                        .addGap(174, 174, 174))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(jbCadAluno)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jlAluno)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtRaAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlNomeAluno)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtNomeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtCurso)
                    .addComponent(jlTurma))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(jbCadAluno)
                .addContainerGap())
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Lista de Aunos"));

        jtAreaAluno.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "RA", "Nome", "Curso", "Turma"
            }
        ));
        jtAreaAluno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtAreaAlunoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtAreaAluno);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLayeredPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbCadAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCadAlunoActionPerformed
        Aluno a = new Aluno();
        AlunoDAO aluno = new AlunoDAO();
        
        
        a.setRa(Integer.parseInt(jtRaAluno.getText()));
        a.setNomeAluno(jtNomeAluno.getText());
        a.setIdCurso(jcCurso.getSelectedIndex());
        a.setIdTurma(jcTurma.getSelectedIndex());
        aluno.create(a);
        readGUIAlunos();

        jtRaAluno.setText(null);
        jtNomeAluno.setText(null);
        
        
        
        JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
        
        
    }//GEN-LAST:event_jbCadAlunoActionPerformed

    private void jtAreaAlunoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtAreaAlunoMouseClicked
        if(jtAreaAluno.getSelectedRow() != -1){
            jtRaAluno.setText(jtAreaAluno.getValueAt(jtAreaAluno.getSelectedRow(), 1).toString());
            jtNomeAluno.setText(jtAreaAluno.getValueAt(jtAreaAluno.getSelectedRow(), 2).toString());
            jcCurso.setSelectedIndex(Integer.parseInt(jtAreaAluno.getValueAt(jtAreaAluno.getSelectedRow(), 3).toString()));
            jcTurma.setSelectedIndex(Integer.parseInt(jtAreaAluno.getValueAt(jtAreaAluno.getSelectedRow(), 4).toString()));
        }


        
    
    }//GEN-LAST:event_jtAreaAlunoMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbCadAluno;
    private javax.swing.JComboBox<String> jcCurso;
    private javax.swing.JComboBox<String> jcTurma;
    private javax.swing.JLabel jlAluno;
    private javax.swing.JLabel jlNomeAluno;
    private javax.swing.JLabel jlTurma;
    private javax.swing.JTable jtAreaAluno;
    private javax.swing.JLabel jtCurso;
    private javax.swing.JTextField jtNomeAluno;
    private javax.swing.JTextField jtRaAluno;
    // End of variables declaration//GEN-END:variables
}
