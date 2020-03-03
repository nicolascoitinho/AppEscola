package view;

import javax.swing.event.InternalFrameEvent;
import javax.swing.event.InternalFrameListener;

public class GUIEscola extends javax.swing.JFrame implements InternalFrameListener {

    private boolean flagGUICurso = false;
    private boolean flagGUIAluno = false;
    private boolean flagGUITurma = false;
    private boolean flagGUIProfessor = false;
 
    
    private void abrirGUICurso(){
        if(!flagGUICurso){            
            GUICurso gp = new GUICurso();
            jdAreaTrabalho.add(gp);
            gp.setVisible(true);
            flagGUICurso = true;
            gp.addInternalFrameListener(this);
        }
    }
    
    private void abrirGUIAluno(){
        if(!flagGUIAluno){            
            GUIAluno ap = new GUIAluno();
            jdAreaTrabalho.add(ap);
            ap.setVisible(true);
            flagGUIAluno = true;
            ap.addInternalFrameListener(this);
        }
    }
    
    private void abrirGUITurma(){
        if(!flagGUITurma){            
            GUITurma tp = new GUITurma();
            jdAreaTrabalho.add(tp);
            tp.setVisible(true);
            flagGUITurma = true;
            tp.addInternalFrameListener(this);
        }
    }
    private void abrirGUIProfessor(){
        if(!flagGUIProfessor){            
            GUIProfessor p = new GUIProfessor();
            jdAreaTrabalho.add(p);
            p.setVisible(true);
            flagGUIProfessor = true;
            p.addInternalFrameListener(this);
        }
    }  
    
    public GUIEscola() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jdAreaTrabalho = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmCurso = new javax.swing.JMenuItem();
        jmTurma = new javax.swing.JMenuItem();
        jmProfessor = new javax.swing.JMenuItem();
        jmAluno = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Escola");

        javax.swing.GroupLayout jdAreaTrabalhoLayout = new javax.swing.GroupLayout(jdAreaTrabalho);
        jdAreaTrabalho.setLayout(jdAreaTrabalhoLayout);
        jdAreaTrabalhoLayout.setHorizontalGroup(
            jdAreaTrabalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
        );
        jdAreaTrabalhoLayout.setVerticalGroup(
            jdAreaTrabalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 779, Short.MAX_VALUE)
        );

        jMenu1.setText("Cadastro");

        jmCurso.setText("Curso");
        jmCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmCursoActionPerformed(evt);
            }
        });
        jMenu1.add(jmCurso);

        jmTurma.setText("Turma");
        jmTurma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmTurmaActionPerformed(evt);
            }
        });
        jMenu1.add(jmTurma);

        jmProfessor.setText("Professor");
        jmProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmProfessorActionPerformed(evt);
            }
        });
        jMenu1.add(jmProfessor);

        jmAluno.setText("Aluno");
        jmAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmAlunoActionPerformed(evt);
            }
        });
        jMenu1.add(jmAluno);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdAreaTrabalho)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdAreaTrabalho)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmCursoActionPerformed
        abrirGUICurso();
    }//GEN-LAST:event_jmCursoActionPerformed

    private void jmAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmAlunoActionPerformed
        abrirGUIAluno();
    }//GEN-LAST:event_jmAlunoActionPerformed

    private void jmTurmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmTurmaActionPerformed
        abrirGUITurma();
    }//GEN-LAST:event_jmTurmaActionPerformed

    private void jmProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmProfessorActionPerformed

       abrirGUIProfessor();
    }//GEN-LAST:event_jmProfessorActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUIEscola.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIEscola.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIEscola.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIEscola.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIEscola().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JDesktopPane jdAreaTrabalho;
    private javax.swing.JMenuItem jmAluno;
    private javax.swing.JMenuItem jmCurso;
    private javax.swing.JMenuItem jmProfessor;
    private javax.swing.JMenuItem jmTurma;
    // End of variables declaration//GEN-END:variables

    @Override
    public void internalFrameOpened(InternalFrameEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void internalFrameClosing(InternalFrameEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void internalFrameClosed(InternalFrameEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void internalFrameIconified(InternalFrameEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void internalFrameDeiconified(InternalFrameEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void internalFrameActivated(InternalFrameEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void internalFrameDeactivated(InternalFrameEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
