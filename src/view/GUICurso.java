package view;

import javax.swing.JOptionPane;
import javax.swing.event.InternalFrameListener;
import javax.swing.table.DefaultTableModel;
import model.bean.Curso;
import model.dao.CursoDAO;

public class GUICurso extends javax.swing.JInternalFrame{
    
    public GUICurso() {
        initComponents();
        readGUICurso();
    }

    private void readGUICurso (){
        DefaultTableModel modelo = (DefaultTableModel) jtablecurso.getModel();
        modelo.setNumRows(0);
        CursoDAO curso = new CursoDAO ();
        for (Curso c : curso.read()){
            modelo.addRow(new Object[]{
                c.getIdCurso(),
                c.getNomeCurso()
            });
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jtCurso = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jbCadastrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtablecurso = new javax.swing.JTable();

        setClosable(true);
        setTitle("Curso");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastrar"));

        jLabel1.setText("Cadastrar Curso");

        jbCadastrar.setText("CADASTRAR");
        jbCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCadastrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jtCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(jbCadastrar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbCadastrar))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        jtablecurso.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Curso", "Nome do Curso"
            }
        ));
        jtablecurso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtablecursoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtablecurso);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCadastrarActionPerformed
        Curso c = new Curso();
        CursoDAO curso = new CursoDAO();
        
        
        c.setNomeCurso(jtCurso.getText());
        curso.create(c);
        readGUICurso();

        jtCurso.setText(null);
        
        
        JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
    
       
    }//GEN-LAST:event_jbCadastrarActionPerformed

    private void jtablecursoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtablecursoMouseClicked
        if(jtablecurso.getSelectedRow() != -1){
            jtCurso.setText(jtablecurso.getValueAt(jtablecurso.getSelectedRow(),1).toString());
        }

        
    }//GEN-LAST:event_jtablecursoMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbCadastrar;
    private javax.swing.JTextField jtCurso;
    private javax.swing.JTable jtablecurso;
    // End of variables declaration//GEN-END:variables
}
