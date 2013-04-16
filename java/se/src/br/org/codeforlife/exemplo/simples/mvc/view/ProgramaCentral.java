/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.org.codeforlife.exemplo.simples.mvc.view;

import br.org.codeforlife.exemplo.conexao.banco.diego.FaltaParametroDeConexaoException;
import br.org.codeforlife.exemplo.conexao.banco.diego.NaoFoiEscolhidoBancoParaConectarException;
import br.org.codeforlife.exemplo.simples.mvc.control.Cliente;
import br.org.codeforlife.exemplo.simples.mvc.model.ClienteDAO;
import java.awt.Color;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Diego Passos Costa
 */
public class ProgramaCentral extends javax.swing.JFrame {

    /**
     * Creates new form ProgramaCentral
     */
    public ProgramaCentral() {
        initComponents();
        this.getContentPane().setBackground(Color.WHITE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelCadastro = new javax.swing.JLabel();
        jTextFieldCadastroNome = new javax.swing.JTextField();
        jTextFieldCadastroIdade = new javax.swing.JTextField();
        jButtonCadastro = new javax.swing.JButton();
        jLabelCadastroNome = new javax.swing.JLabel();
        jLabelCadastroIdade = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaInformacaoCadastro = new javax.swing.JTextArea();
        jSeparator1 = new javax.swing.JSeparator();
        jTextFieldConsultaId = new javax.swing.JTextField();
        jLabelConsulta = new javax.swing.JLabel();
        jLabelConsultaId = new javax.swing.JLabel();
        jButtonConsulta = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaInformacaoConsulta = new javax.swing.JTextArea();
        jLabelNome = new javax.swing.JLabel();
        jTextFieldConsultaNome = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelCadastro.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelCadastro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCadastro.setText("Cadastro");

        jTextFieldCadastroNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCadastroNomeActionPerformed(evt);
            }
        });

        jButtonCadastro.setText("Cadastrar");
        jButtonCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastroActionPerformed(evt);
            }
        });

        jLabelCadastroNome.setText("Nome:");

        jLabelCadastroIdade.setText("Idade:");

        jTextAreaInformacaoCadastro.setColumns(20);
        jTextAreaInformacaoCadastro.setRows(5);
        jScrollPane1.setViewportView(jTextAreaInformacaoCadastro);

        jTextFieldConsultaId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldConsultaIdActionPerformed(evt);
            }
        });

        jLabelConsulta.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelConsulta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelConsulta.setText("Consulta");

        jLabelConsultaId.setText("ID:");

        jButtonConsulta.setText("Consulta");
        jButtonConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultaActionPerformed(evt);
            }
        });

        jTextAreaInformacaoConsulta.setColumns(20);
        jTextAreaInformacaoConsulta.setRows(5);
        jScrollPane2.setViewportView(jTextAreaInformacaoConsulta);

        jLabelNome.setText("Nome:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabelCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonCadastro)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelCadastroIdade)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldCadastroIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelCadastroNome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldCadastroNome, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jLabelConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtonConsulta)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabelConsultaId)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldConsultaId, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabelNome)
                                        .addGap(5, 5, 5)
                                        .addComponent(jTextFieldConsultaNome, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabelCadastro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldCadastroNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelCadastroNome))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelCadastroIdade)
                            .addComponent(jTextFieldCadastroIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonCadastro))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelConsulta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldConsultaId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelConsultaId))
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelNome)
                            .addComponent(jTextFieldConsultaNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonConsulta))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(91, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldCadastroNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCadastroNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCadastroNomeActionPerformed

    private void jTextFieldConsultaIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldConsultaIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldConsultaIdActionPerformed

    private void jButtonCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastroActionPerformed
        //model
        //Cliente modelo
        //Cliente DAO modelo
        Cliente c = new Cliente();
        c.setNome(jTextFieldCadastroNome.getText());
        c.setIdade(Integer.parseInt(jTextFieldCadastroIdade.getText()));
        try {
            jTextAreaInformacaoCadastro.setText("Resultado do Cadastro --> " + ClienteDAO.insereCliente(c));
        } catch (ClassNotFoundException | FaltaParametroDeConexaoException | NaoFoiEscolhidoBancoParaConectarException | SQLException ex) {
            Logger.getLogger(ProgramaCentral.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonCadastroActionPerformed

    private void jButtonConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultaActionPerformed
        Cliente c = new Cliente();


        if (jTextFieldConsultaId.getText().equals("") && jTextFieldConsultaNome.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Digite alguma coisa sua budega!", "A Consultação", JOptionPane.ERROR_MESSAGE);

        } else if (!jTextFieldConsultaId.getText().equals("")) {
            c.setId(Integer.parseInt(jTextFieldConsultaId.getText()));
            try {
                c = ClienteDAO.consultaClienteId(c);
                jTextAreaInformacaoConsulta.setText("Resultado da Consulta --> ID: " + c.getId() + ";\n Nome: " + c.getNome() + "\n Idade: " + c.getIdade());
            } catch (ClassNotFoundException | FaltaParametroDeConexaoException | NaoFoiEscolhidoBancoParaConectarException | SQLException ex) {
                Logger.getLogger(ProgramaCentral.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else if (!jTextFieldConsultaNome.getText().equals("")) {
            c.setNome(jTextFieldConsultaNome.getText());
            try {
                Vector<Cliente> v = ClienteDAO.consultaClienteNome(c);
                Iterator i = v.iterator();
                jTextAreaInformacaoConsulta.setText("Resultado da Consulta -->\n");
                for (Cliente cliente : v) {
                    jTextAreaInformacaoConsulta.append("\n "+cliente.getId() + "; \n Nome: " + cliente.getNome() + "\n Idade: " + cliente.getIdade()+"\n-------\n");
                }
                

            } catch (ClassNotFoundException | FaltaParametroDeConexaoException | NaoFoiEscolhidoBancoParaConectarException | SQLException ex) {
                Logger.getLogger(ProgramaCentral.class.getName()).log(Level.SEVERE, null, ex);
            }
        }






    }//GEN-LAST:event_jButtonConsultaActionPerformed

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
            java.util.logging.Logger.getLogger(ProgramaCentral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProgramaCentral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProgramaCentral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProgramaCentral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProgramaCentral().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCadastro;
    private javax.swing.JButton jButtonConsulta;
    private javax.swing.JLabel jLabelCadastro;
    private javax.swing.JLabel jLabelCadastroIdade;
    private javax.swing.JLabel jLabelCadastroNome;
    private javax.swing.JLabel jLabelConsulta;
    private javax.swing.JLabel jLabelConsultaId;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextAreaInformacaoCadastro;
    private javax.swing.JTextArea jTextAreaInformacaoConsulta;
    private javax.swing.JTextField jTextFieldCadastroIdade;
    private javax.swing.JTextField jTextFieldCadastroNome;
    private javax.swing.JTextField jTextFieldConsultaId;
    private javax.swing.JTextField jTextFieldConsultaNome;
    // End of variables declaration//GEN-END:variables
}
