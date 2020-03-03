package view;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.bean.Curso;
import model.bean.Professor;
import model.bean.Turma;
import model.dao.CursoDAO;
import model.dao.ProfessorDAO;
import model.dao.TurmaDAO;


public class GUIProfessor extends javax.swing.JInternalFrame {

    public GUIProfessor() {
        initComponents();
        viewComboBox1();
        viewComboBox2();
    }
    
    private void readGUIProfessor() {
        DefaultTableModel modelo = (DefaultTableModel) jtAreaProf.getModel();
        modelo.setNumRows(0);
        ProfessorDAO pdao = new ProfessorDAO();
        for (Professor p : pdao.read()) {
            modelo.addRow(new Object[]{
                
                p.getChapa(),
                p.getNomeProfessor(),
                p.getIdCurso(),
                p.getIdTurma(),
                p.getIdProfessor()
            });
        }
    }
    
    private void viewComboBox1() {        
        CursoDAO cdao = new CursoDAO();
        for(Curso c : cdao.read()){
            jcCursoP.addItem(c.toString());
        }
    }
    
    private void viewComboBox2() {        
        TurmaDAO tdao = new TurmaDAO();
        for(Turma t : tdao.read()){
            jcTurmaP.addItem(t.toString());
        }
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jlChapa = new javax.swing.JLabel();
        jtChapa = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtProfessor = new javax.swing.JTextField();
        jcCursoP = new javax.swing.JComboBox<>();
        jcTurmaP = new javax.swing.JComboBox<>();
        jlCurso = new javax.swing.JLabel();
        jlTurma = new javax.swing.JLabel();
        jbCadastroP = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtAreaProf = new javax.swing.JTable();

        setTitle("Cadastro Professor");
        setName(""); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastro"));

        jlChapa.setText("Chapa");

        jLabel2.setText("Nome do Professor");

        jtProfessor.setToolTipText("");

        jlCurso.setText("Curso");

        jlTurma.setText("Turma");

        jbCadastroP.setText("CADASTRO");
        jbCadastroP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCadastroPActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlChapa)
                            .addComponent(jtChapa, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jtProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbCadastroP))
                        .addGap(0, 239, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcCursoP, 0, 250, Short.MAX_VALUE)
                            .addComponent(jlCurso))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jlTurma)
                                .addGap(0, 181, Short.MAX_VALUE))
                            .addComponent(jcTurmaP, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlChapa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtChapa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlCurso)
                    .addComponent(jlTurma))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcCursoP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcTurmaP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbCadastroP)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Lista Professores"));

        jtAreaProf.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Professor", "Chapa", "Nome Professor", "ID Curso", "ID Turma"
            }
        ));
        jtAreaProf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtAreaProfMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtAreaProf);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbCadastroPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCadastroPActionPerformed
        Professor p = new Professor();
        ProfessorDAO prof = new ProfessorDAO();
        
        
        p.setChapa(Integer.parseInt(jtChapa.getText()));
        p.setNomeProfessor(jtProfessor.getText());
        p.setIdCurso(jcCursoP.getSelectedIndex());
        p.setIdTurma(jcTurmaP.getSelectedIndex());
        prof.create(p);
        readGUIProfessor();
        
        jtChapa.setText(null);
        jtProfessor.setText(null);

                
        JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
        
        
    }//GEN-LAST:event_jbCadastroPActionPerformed

    private void jtAreaProfMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtAreaProfMouseClicked
        if(jtAreaProf.getSelectedRow() != -1){
            jtChapa.setText(jtAreaProf.getValueAt(jtAreaProf.getSelectedRow(), 1).toString());
            jtProfessor.setText(jtAreaProf.getValueAt(jtAreaProf.getSelectedRow(), 2).toString());
            jcCursoP.setSelectedIndex(Integer.parseInt(jtAreaProf.getValueAt(jtAreaProf.getSelectedRow(), 3).toString()));
            jcTurmaP.setSelectedIndex(Integer.parseInt(jtAreaProf.getValueAt(jtAreaProf.getSelectedRow(), 4).toString()));
        }


        
    }//GEN-LAST:event_jtAreaProfMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbCadastroP;
    private javax.swing.JComboBox<String> jcCursoP;
    private javax.swing.JComboBox<String> jcTurmaP;
    private javax.swing.JLabel jlChapa;
    private javax.swing.JLabel jlCurso;
    private javax.swing.JLabel jlTurma;
    private javax.swing.JTable jtAreaProf;
    private javax.swing.JTextField jtChapa;
    private javax.swing.JTextField jtProfessor;
    // End of variables declaration//GEN-END:variables
}
