package gui;

import dao.AlunoDAO;
import dao.AtividadesDAO;
import dao.SalasDAO;
import java.awt.List;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.event.ChangeEvent;
import modelo.Aluno;
import modelo.Atividades;
import modelo.Salas;
import java.util.ArrayList;
import java.util.Collection;
import static java.util.random.RandomGeneratorFactory.all;

public class ClienteGUI extends javax.swing.JFrame {

    private Object jTabbedPane;

    public ClienteGUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        EnviarAluno = new javax.swing.JButton();
        EnviarSalas = new javax.swing.JButton();
        EnviarAtv = new javax.swing.JButton();
        jTextFieldAluno = new javax.swing.JTextField();
        jTextFieldSalas = new javax.swing.JTextField();
        jTextFieldAtv = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        LimparAluno = new javax.swing.JButton();
        LimparSalas = new javax.swing.JButton();
        LimparAtv = new javax.swing.JButton();
        jTabbed = new javax.swing.JTabbedPane();
        jPanelAluno = new javax.swing.JPanel();
        exibicaoAlunos = new javax.swing.JLabel();
        jPanelSalas = new javax.swing.JPanel();
        jPanelAtv = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CRUD");
        setBackground(new java.awt.Color(255, 204, 0));
        setForeground(java.awt.Color.red);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/miragegroup-logo (1).png"))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(204, 102, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 0, 0)));

        EnviarAluno.setText("Enviar");
        EnviarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnviarAlunoActionPerformed(evt);
            }
        });

        EnviarSalas.setText("Enviar");
        EnviarSalas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnviarSalasActionPerformed(evt);
            }
        });

        EnviarAtv.setText("Enviar");
        EnviarAtv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnviarAtvActionPerformed(evt);
            }
        });

        jTextFieldAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAlunoActionPerformed(evt);
            }
        });

        jTextFieldSalas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSalasActionPerformed(evt);
            }
        });

        jTextFieldAtv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAtvActionPerformed(evt);
            }
        });

        jLabel7.setText("Nome:");

        jLabel8.setText("Salas");

        jLabel9.setText("Atividades:");

        jButton4.setText("Sair");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        LimparAluno.setText("Limpar");
        LimparAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimparAlunoActionPerformed(evt);
            }
        });

        LimparSalas.setText("Limpar");
        LimparSalas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimparSalasActionPerformed(evt);
            }
        });

        LimparAtv.setText("Limpar");
        LimparAtv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimparAtvActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldSalas, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(EnviarAluno)
                            .addComponent(EnviarSalas)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldAtv, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(EnviarAtv)))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LimparSalas)
                            .addComponent(LimparAluno))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(LimparAtv)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4)
                        .addGap(14, 14, 14))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EnviarAluno)
                    .addComponent(LimparAluno)
                    .addComponent(jTextFieldAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextFieldSalas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EnviarSalas)
                    .addComponent(LimparSalas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jTextFieldAtv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EnviarAtv)
                            .addComponent(LimparAtv))
                        .addGap(14, 14, 14))))
        );

        jTabbed.setBackground(new java.awt.Color(255, 255, 0));
        jTabbed.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jTabbedStateChanged(evt);
            }
        });

        jPanelAluno.setBackground(new java.awt.Color(153, 102, 255));
        jPanelAluno.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPanelAlunoFocusGained(evt);
            }
        });

        javax.swing.GroupLayout jPanelAlunoLayout = new javax.swing.GroupLayout(jPanelAluno);
        jPanelAluno.setLayout(jPanelAlunoLayout);
        jPanelAlunoLayout.setHorizontalGroup(
            jPanelAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAlunoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(exibicaoAlunos)
                .addContainerGap(721, Short.MAX_VALUE))
        );
        jPanelAlunoLayout.setVerticalGroup(
            jPanelAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAlunoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(exibicaoAlunos)
                .addContainerGap(239, Short.MAX_VALUE))
        );

        jTabbed.addTab("Alunos", jPanelAluno);

        jPanelSalas.setBackground(new java.awt.Color(153, 102, 255));

        javax.swing.GroupLayout jPanelSalasLayout = new javax.swing.GroupLayout(jPanelSalas);
        jPanelSalas.setLayout(jPanelSalasLayout);
        jPanelSalasLayout.setHorizontalGroup(
            jPanelSalasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 727, Short.MAX_VALUE)
        );
        jPanelSalasLayout.setVerticalGroup(
            jPanelSalasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 245, Short.MAX_VALUE)
        );

        jTabbed.addTab("Salas", jPanelSalas);

        jPanelAtv.setBackground(new java.awt.Color(153, 102, 255));

        javax.swing.GroupLayout jPanelAtvLayout = new javax.swing.GroupLayout(jPanelAtv);
        jPanelAtv.setLayout(jPanelAtvLayout);
        jPanelAtvLayout.setHorizontalGroup(
            jPanelAtvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 727, Short.MAX_VALUE)
        );
        jPanelAtvLayout.setVerticalGroup(
            jPanelAtvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 245, Short.MAX_VALUE)
        );

        jTabbed.addTab("Atividades", jPanelAtv);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTabbed))
                .addGap(82, 82, 82))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 16, Short.MAX_VALUE)
                .addComponent(jTabbed, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAlunoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldAlunoActionPerformed

    private void jTextFieldSalasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSalasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldSalasActionPerformed

    private void jTextFieldAtvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAtvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldAtvActionPerformed

    private void EnviarAtvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnviarAtvActionPerformed
        Atividades atv = new Atividades();
        atv.setAtv_nome(jTextFieldAtv.getText());
        
        if((jTextFieldAtv.getText().isEmpty())){
            JOptionPane.showMessageDialog(null,"o campo não pode retornar vazio");
        }
        else {
            AtividadesDAO dao = new AtividadesDAO();
            dao.adicionaAtividade(atv);
            JOptionPane.showMessageDialog(null, "A sala "+jTextFieldAtv.getText()+" foi cadastrada com sucesso!");
        }     
    }//GEN-LAST:event_EnviarAtvActionPerformed

    private void EnviarSalasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnviarSalasActionPerformed
        Salas sala = new Salas();
        sala.setSala_nome(jTextFieldSalas.getText());
        
        if((jTextFieldSalas.getText().isEmpty())){
            JOptionPane.showMessageDialog(null,"o campo não pode retornar vazio");
        }
        else {
            SalasDAO dao = new SalasDAO();
            dao.adicionaSala(sala);
            JOptionPane.showMessageDialog(null, "A sala "+jTextFieldSalas.getText()+" foi cadastrada com sucesso!");
        }  
    }//GEN-LAST:event_EnviarSalasActionPerformed

    private void EnviarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnviarAlunoActionPerformed
        Aluno aluno = new Aluno();
        aluno.setNome(jTextFieldAluno.getText());
        
        if((jTextFieldAluno.getText().isEmpty())){
            JOptionPane.showMessageDialog(null,"o campo não pode retornar vazio");
        }
        else {
            AlunoDAO dao = new AlunoDAO();
            dao.adicionaAluno(aluno);
            JOptionPane.showMessageDialog(null, "O aluno "+jTextFieldAluno.getText()+" foi cadastrado com sucesso!");
        }
    }//GEN-LAST:event_EnviarAlunoActionPerformed

    private void LimparAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimparAlunoActionPerformed
        jTextFieldAluno.setText(" ");
    }//GEN-LAST:event_LimparAlunoActionPerformed

    private void LimparSalasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimparSalasActionPerformed
        jTextFieldSalas.setText(" ");
    }//GEN-LAST:event_LimparSalasActionPerformed

    private void LimparAtvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimparAtvActionPerformed
        jTextFieldAtv.setText(" ");
    }//GEN-LAST:event_LimparAtvActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTabbedStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jTabbedStateChanged
        if(jTabbed.getSelectedIndex() == 0){
            AlunoDAO dao = new AlunoDAO();
            ArrayList<Aluno> alunos = dao.exibirAlunos();
            for (Aluno aluno: alunos){
                String aln = aluno.getNome();
                exibicaoAlunos.setText(aln);
                exibicaoAlunos.add(exibicaoAlunos);
            }
        }
        
    }//GEN-LAST:event_jTabbedStateChanged

    private void jPanelAlunoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPanelAlunoFocusGained

    }//GEN-LAST:event_jPanelAlunoFocusGained

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
            java.util.logging.Logger.getLogger(ClienteGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClienteGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClienteGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClienteGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClienteGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EnviarAluno;
    private javax.swing.JButton EnviarAtv;
    private javax.swing.JButton EnviarSalas;
    private javax.swing.JButton LimparAluno;
    private javax.swing.JButton LimparAtv;
    private javax.swing.JButton LimparSalas;
    private javax.swing.JLabel exibicaoAlunos;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelAluno;
    private javax.swing.JPanel jPanelAtv;
    private javax.swing.JPanel jPanelSalas;
    private javax.swing.JTabbedPane jTabbed;
    private javax.swing.JTextField jTextFieldAluno;
    private javax.swing.JTextField jTextFieldAtv;
    private javax.swing.JTextField jTextFieldSalas;
    // End of variables declaration//GEN-END:variables
}
