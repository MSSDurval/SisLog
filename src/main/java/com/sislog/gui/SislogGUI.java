package com.sislog.gui;
import com.sislog.sistemalogin.Sislog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.text.*;


public class SislogGUI extends javax.swing.JFrame {
    private int tentativas = 0;
    public SislogGUI() {
        initComponents();
        /*Atributos responsáveis por centralizar o texto de Aviso */
        StyledDocument doc = lblAviso.getStyledDocument();
        SimpleAttributeSet center = new SimpleAttributeSet();
        StyleConstants.setAlignment(center, StyleConstants.ALIGN_CENTER);
        doc.setParagraphAttributes(0, doc.getLength(), center, false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCodigo = new javax.swing.JLabel();
        txtCodAcesso = new javax.swing.JTextField();
        lblSenha = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        txtSenhaAcesso = new javax.swing.JPasswordField();
        jScrollPane3 = new javax.swing.JScrollPane();
        lblAviso = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        lblCodigo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblCodigo.setText("Código:");

        txtCodAcesso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodAcessoActionPerformed(evt);
            }
        });

        lblSenha.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblSenha.setText("Senha:");

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Matheus\\OneDrive - Educacional\\Projetos e TCC\\Projetos\\Sistemas e Automatização\\SistemaLogin\\SisLog\\src\\main\\java\\com\\sislog\\icon\\SISicon.png")); // NOI18N

        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        lblAviso.setEditable(false);
        lblAviso.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblAviso.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                lblAvisoPropertyChange(evt);
            }
        });
        jScrollPane3.setViewportView(lblAviso);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(129, 129, 129)
                                .addComponent(btnLogin)
                                .addGap(76, 110, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCodAcesso)
                                    .addComponent(txtSenhaAcesso))
                                .addContainerGap())))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCodigo)
                            .addComponent(txtCodAcesso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSenha)
                            .addComponent(txtSenhaAcesso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnLogin))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void txtCodAcessoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodAcessoActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtCodAcessoActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        /*O ActionListener é uma interface, que será responsável por fechar a
        a janela do usuário ao tentar acessar o SisLog mais de 5 vezes.*/
        ActionListener acao = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(btnLogin);
                frame.dispose();
            }
        };
        
        /*O SisLog armazena as credencias do usuário.*/
        String CodigoAcesso = txtCodAcesso.getText();
        char[] Senha_Acesso = txtSenhaAcesso.getPassword();
        String SenhaAcesso = String.valueOf(Senha_Acesso);
        
        /*E as envia para a classe responsável (Sislog.java) para verificar - las*/
        Sislog Login = new Sislog();
        Login.RealizaLogin(CodigoAcesso,SenhaAcesso);
        int valorSucesso = Login.sucesso;
        
        if(valorSucesso == 1){
                lblAviso.setText("Login realizado com sucesso!\n");
                tentativas = 0;
        }
        else{
            lblAviso.setText("ERRO! \n" +
                     "Código de Acesso ou Senha incorretos! \n");
            tentativas++;
            System.out.println("tentativa:" + tentativas);
            }
          /* O SisLog bloqueará temporiamente o usuário de fazer Login caso ele
                erre mais de três vezes suas credencias, medida criada para evitar
                ataques de força bruta nas contas dos usuários.*/
        if(tentativas > 3){
            lblAviso.setText("\nATENÇÃO!!!\n\n" +
                        "Muitas Tentativas Incorretas!\n" +
                        "Tente Novamente Mais Tarde.\n");
            txtCodAcesso.setEnabled(false);
            txtSenhaAcesso.setEnabled(false);
            
            
            
        }if(tentativas >= 5){
            btnLogin.addActionListener(acao);
            this.dispose(); //Garante o fechamento da janela.
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosed

    private void lblAvisoPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_lblAvisoPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_lblAvisoPropertyChange

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
            java.util.logging.Logger.getLogger(SislogGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SislogGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SislogGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SislogGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SislogGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane3;
    public javax.swing.JTextPane lblAviso;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JTextField txtCodAcesso;
    private javax.swing.JPasswordField txtSenhaAcesso;
    // End of variables declaration//GEN-END:variables
}
