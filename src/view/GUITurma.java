package view;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.bean.Curso;
import model.bean.Turma;
import model.dao.CursoDAO;
import model.dao.TurmaDAO;


public class GUITurma extends javax.swing.JInternalFrame {

   
    public GUITurma() {
        initComponents();
        viewComboBox1();
        
    }
    
    private void readGUITurma() {
        DefaultTableModel modelo = (DefaultTableModel) jtAreaTurma.getModel();
        modelo.setNumRows(0);
        TurmaDAO tdao = new TurmaDAO();
        for (Turma t : tdao.read()) {
            modelo.addRow(new Object[]{
                t.getIdTurma(),
                t.getIdCurso(),
                t.getQtdAlunos()
            });
        }
    }
    
    private void viewComboBox1() {        
        CursoDAO cdao = new CursoDAO();
        for(Curso c : cdao.read()){
            jcCursoT.addItem(c.toString());
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jtQtdAluno = new javax.swing.JTextField();
        jlQtdAluno = new javax.swing.JLabel();
        jcCursoT = new javax.swing.JComboBox<>();
        jlCurso = new javax.swing.JLabel();
        jbCadastrarT = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtAreaTurma = new javax.swing.JTable();

        setTitle("Cadastro de Turma");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastro"));

        jlQtdAluno.setText("Quantidade Alunos");

        jlCurso.setText("Curso");

        jbCadastrarT.setText("CADASTRAR");
        jbCadastrarT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCadastrarTActionPerformed(evt);
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
                            .addComponent(jtQtdAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlQtdAluno))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlCurso)
                            .addComponent(jcCursoT, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jbCadastrarT))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlQtdAluno)
                    .addComponent(jlCurso))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtQtdAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcCursoT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jbCadastrarT)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Lista de Turma"));

        jtAreaTurma.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Turma", "ID Curso", "Quantidade Alunos"
            }
        ));
        jtAreaTurma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtAreaTurmaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtAreaTurma);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 482, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbCadastrarTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCadastrarTActionPerformed
        Turma t = new Turma();
        TurmaDAO turma = new TurmaDAO();
        
        
        t.setIdCurso(jcCursoT.getSelectedIndex());
        t.setQtdAlunos(Integer.parseInt(jtQtdAluno.getText()));
        turma.create(t);
        readGUITurma();
        
        jtQtdAluno.setText(null);
        
        
        JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
    }//GEN-LAST:event_jbCadastrarTActionPerformed

    private void jtAreaTurmaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtAreaTurmaMouseClicked
        if(jtAreaTurma.getSelectedRow() != -1){
            jcCursoT.setSelectedIndex(Integer.parseInt(jtAreaTurma.getValueAt(jtAreaTurma.getSelectedRow(), 1).toString()));
            jtQtdAluno.setText(jtAreaTurma.getValueAt(jtAreaTurma.getSelectedRow(), 2).toString());
        }

        
    }//GEN-LAST:event_jtAreaTurmaMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbCadastrarT;
    private javax.swing.JComboBox<String> jcCursoT;
    private javax.swing.JLabel jlCurso;
    private javax.swing.JLabel jlQtdAluno;
    private javax.swing.JTable jtAreaTurma;
    private javax.swing.JTextField jtQtdAluno;
    // End of variables declaration//GEN-END:variables
}
