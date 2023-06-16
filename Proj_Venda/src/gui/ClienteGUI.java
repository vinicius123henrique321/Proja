package gui;

import static com.sun.tools.javac.tree.TreeInfo.args;
import dao.AlunoDAO;
import java.awt.List;
import static java.lang.String.format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.event.ChangeEvent;
import modelo.Aluno;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import static java.util.random.RandomGeneratorFactory.all;
import javax.swing.table.DefaultTableModel;

public class ClienteGUI extends javax.swing.JFrame {
    public ClienteGUI() {
        initComponents();
        listarValores();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        EnviarAluno = new javax.swing.JButton();
        jTextFieldAluno = new javax.swing.JTextField();
        jTextFieldCpf = new javax.swing.JTextField();
        jTextFieldPeso = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        LimparAluno = new javax.swing.JButton();
        LimparCpf = new javax.swing.JButton();
        LimparPeso = new javax.swing.JButton();
        jTextFieldAltura = new javax.swing.JTextField();
        jTextFieldDataN = new javax.swing.JTextField();
        LimparAltura = new javax.swing.JButton();
        LimparDataN = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        editarButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaAluno = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();

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

        jTextFieldAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAlunoActionPerformed(evt);
            }
        });

        jTextFieldCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCpfActionPerformed(evt);
            }
        });

        jTextFieldPeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPesoActionPerformed(evt);
            }
        });

        jLabel7.setText("Nome:");

        jLabel8.setText("Cpf:");

        jLabel9.setText("Peso:");

        LimparAluno.setText("Limpar");
        LimparAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimparAlunoActionPerformed(evt);
            }
        });

        LimparCpf.setText("Limpar");
        LimparCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimparCpfActionPerformed(evt);
            }
        });

        LimparPeso.setText("Limpar");
        LimparPeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimparPesoActionPerformed(evt);
            }
        });

        jTextFieldAltura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAlturaActionPerformed(evt);
            }
        });

        jTextFieldDataN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDataNActionPerformed(evt);
            }
        });

        LimparAltura.setText("Limpar");
        LimparAltura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimparAlturaActionPerformed(evt);
            }
        });

        LimparDataN.setText("Limpar");
        LimparDataN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimparDataNActionPerformed(evt);
            }
        });

        jLabel1.setText("Altura:");

        jLabel2.setText("Nascimento:");

        editarButton.setText("Alterar");
        editarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarButtonActionPerformed(evt);
            }
        });

        jButton1.setText("Deletar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Exportar pdf");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldDataN, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EnviarAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(164, 164, 164)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(editarButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LimparCpf)
                    .addComponent(LimparPeso)
                    .addComponent(LimparAluno)
                    .addComponent(LimparAltura)
                    .addComponent(LimparDataN)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(LimparAluno)
                        .addComponent(jTextFieldAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LimparCpf)
                    .addComponent(jTextFieldCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LimparPeso)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(LimparAltura))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldDataN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(LimparDataN))
                .addGap(81, 81, 81)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(editarButton, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(EnviarAluno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(27, 27, 27))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(41, 43, 45)), "Alunos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        tabelaAluno.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "CPF", "ALUNOS", "NASCIMENTO", "PESO", "ALTURA", "IMC"
            }
        ));
        tabelaAluno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaAlunoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaAluno);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 723, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 516, Short.MAX_VALUE)
        );

        jButton4.setText("Sair");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton4)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAlunoActionPerformed

    }//GEN-LAST:event_jTextFieldAlunoActionPerformed

    private void jTextFieldCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCpfActionPerformed

    private void jTextFieldPesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPesoActionPerformed

    private void EnviarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnviarAlunoActionPerformed
        if((jTextFieldAluno.getText().isEmpty())){
            JOptionPane.showMessageDialog(null,"só é possível enviar se todos os campos forem preenchidos");
        } 
        else if((jTextFieldCpf.getText().isEmpty())){
            JOptionPane.showMessageDialog(null,"só é possível enviar se todos os campos forem preenchidos");
        }
        else if((jTextFieldPeso.getText().isEmpty())){
            JOptionPane.showMessageDialog(null,"só é possível enviar se todos os campos forem preenchidos");
        }
        else if((jTextFieldAltura.getText().isEmpty())){
            JOptionPane.showMessageDialog(null,"só é possível enviar se todos os campos forem preenchidos");
        }
        else if((jTextFieldDataN.getText().isEmpty())){
            JOptionPane.showMessageDialog(null,"só é possível enviar se todos os campos forem preenchidos");
        }
        else {
            AlunoDAO dao = new AlunoDAO();
            Aluno aluno = new Aluno();
            aluno.setNome(jTextFieldAluno.getText());
            
            Long cpf = Long.parseLong(jTextFieldCpf.getText());
            aluno.setCpf(cpf);
            
            double peso = Double.parseDouble(jTextFieldPeso.getText());
            aluno.setPeso(peso);
            
            double altura = Double.parseDouble(jTextFieldAltura.getText());
            aluno.setAltura(altura);
            
            String data = jTextFieldDataN.getText();
            String[] dataSeparada = data.split("/");
            LocalDate dataD = LocalDate.of(Integer.parseInt(dataSeparada[2]), Integer.parseInt(dataSeparada[1]), Integer.parseInt(dataSeparada[0]));
            aluno.setDataNascimento(dataD.toString());
            
            dao.adicionaAluno(aluno);
            JOptionPane.showMessageDialog(null, "O aluno "+jTextFieldAluno.getText()+" foi cadastrado com sucesso!");
            jTextFieldCpf.setText("");
            jTextFieldAluno.setText("");
            jTextFieldDataN.setText("");
            jTextFieldPeso.setText("");
            jTextFieldAltura.setText("");
        }
        listarValores();
    }//GEN-LAST:event_EnviarAlunoActionPerformed

    private void LimparAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimparAlunoActionPerformed
        jTextFieldAluno.setText("");
    }//GEN-LAST:event_LimparAlunoActionPerformed

    private void LimparCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimparCpfActionPerformed
        jTextFieldCpf.setText("");
    }//GEN-LAST:event_LimparCpfActionPerformed

    private void LimparPesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimparPesoActionPerformed
        jTextFieldPeso.setText("");
    }//GEN-LAST:event_LimparPesoActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextFieldAlturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAlturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldAlturaActionPerformed

    private void jTextFieldDataNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDataNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDataNActionPerformed

    private void LimparAlturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimparAlturaActionPerformed
        jTextFieldAltura.setText("");
    }//GEN-LAST:event_LimparAlturaActionPerformed

    private void LimparDataNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimparDataNActionPerformed
        jTextFieldDataN.setText("");
    }//GEN-LAST:event_LimparDataNActionPerformed

    private void editarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarButtonActionPerformed
        int response = JOptionPane.showConfirmDialog(this, "Tem certeza?", "Confirmar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

    if (response == JOptionPane.YES_OPTION) {
        
        Long cpf = Long.parseLong(jTextFieldCpf.getText());
        String nome = jTextFieldAluno.getText();
        String dataNascimento = jTextFieldDataN.getText();
        double peso = Double.parseDouble(jTextFieldPeso.getText());
        double altura = Double.parseDouble(jTextFieldAltura.getText());
        
        JOptionPane.showMessageDialog(null, "Alterado com sucesso!");
        jTextFieldCpf.setText("");
        jTextFieldAluno.setText("");
        jTextFieldDataN.setText("");
        jTextFieldPeso.setText("");
        jTextFieldAltura.setText("");
        

        Aluno aluno = new Aluno(cpf, nome, dataNascimento, peso, altura);
        DefaultTableModel model = (DefaultTableModel)tabelaAluno.getModel();
            int selectedRow = tabelaAluno.getSelectedRow();
            aluno.setId(Integer.parseInt(model.getValueAt(selectedRow, 0).toString()));
        new AlunoDAO().atualizarAluno(aluno);
        listarValores();
    }
    }//GEN-LAST:event_editarButtonActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Long cpf = Long.parseLong(jTextFieldCpf.getText());
        String nome = jTextFieldAluno.getText();
        String dataNascimento = jTextFieldDataN.getText();
        double peso = Double.parseDouble(jTextFieldPeso.getText());
        double altura = Double.parseDouble(jTextFieldAltura.getText());

        Aluno aluno = new Aluno(cpf, nome, dataNascimento, peso, altura);
        aluno.exportarIMC();

       JOptionPane.showMessageDialog(null, "IMC calculado e exportado para o arquivo imc.txt!");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tabelaAlunoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaAlunoMouseClicked
        DefaultTableModel model = (DefaultTableModel)tabelaAluno.getModel();
        int selectedRow = tabelaAluno.getSelectedRow();
        jTextFieldAluno.setText(model.getValueAt(selectedRow, 2).toString());
        jTextFieldCpf.setText(model.getValueAt(selectedRow, 1).toString());
        jTextFieldDataN.setText(model.getValueAt(selectedRow, 3).toString());
        jTextFieldPeso.setText(model.getValueAt(selectedRow, 4).toString());
        jTextFieldAltura.setText(model.getValueAt(selectedRow, 5).toString());
    }//GEN-LAST:event_tabelaAlunoMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        DefaultTableModel model = (DefaultTableModel)tabelaAluno.getModel();
            int selectedRow = tabelaAluno.getSelectedRow();
            if(selectedRow != -1){
                new AlunoDAO().excluir(Integer.parseInt(model.getValueAt(selectedRow, 0).toString()));
            listarValores();
            }   
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) throws ParseException {
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
    private javax.swing.JButton LimparAltura;
    private javax.swing.JButton LimparAluno;
    private javax.swing.JButton LimparCpf;
    private javax.swing.JButton LimparDataN;
    private javax.swing.JButton LimparPeso;
    private javax.swing.JButton editarButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldAltura;
    private javax.swing.JTextField jTextFieldAluno;
    private javax.swing.JTextField jTextFieldCpf;
    private javax.swing.JTextField jTextFieldDataN;
    private javax.swing.JTextField jTextFieldPeso;
    private javax.swing.JTable tabelaAluno;
    // End of variables declaration//GEN-END:variables

        private void listarValores() {
        try {
            DefaultTableModel model = (DefaultTableModel) tabelaAluno.getModel();
            model.setNumRows(0);

            ArrayList<Aluno> lista =  new AlunoDAO().obterAlunos();
            for (int i = 0; i < lista.size(); i++) {
                model.addRow(new Object []{
                    lista.get(i).getId(),
                    lista.get(i).getCpf(),
                    lista.get(i).getNome(),
                    lista.get(i).getDataNascimento(),
                    lista.get(i).getPeso(),
                    String.format("%.2f", lista.get(i).getAltura()),
                    String.format("%.2f",lista.get(i).getIMC())
        });
        }
        } catch (Exception exception) {
            // TODO: handle exception
            throw new RuntimeException(exception);
        }
    }
}
