package com.sislog.gui;
import java.util.Date;
import java.text.*;
import javax.swing.JFormattedTextField;
import javax.swing.text.MaskFormatter;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import com.sislog.sistemalogin.*;


public class GUI_TelaCadastro extends javax.swing.JFrame {
    MaskFormatter mascaraData;
    protected String nome_usuario, email_usuario, tel_usuario,
            nascimento_usuario, estado_usuario, cidade_usuario;
    
    public GUI_TelaCadastro() {
        try {
            /*Componente que recebe a data de nascimento do ususario.
            Deve ser declarado antes da inicializacao dos componentes.*/
            mascaraData = new MaskFormatter("##/##/####");
        } catch (ParseException ex) {
            System.out.println("Ocorreu um erro na criação da mascara do"
                    + " componente data:\n\n" + ex);
        }
        initComponents();
        /*Atributos responsáveis por centralizar o texto de Aviso */
        StyledDocument doc = jPane_Menssagem.getStyledDocument();
        SimpleAttributeSet center = new SimpleAttributeSet();
        StyleConstants.setAlignment(center, StyleConstants.ALIGN_CENTER);
        doc.setParagraphAttributes(0, doc.getLength(), center, false);
    }
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNome = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JLabel();
        txtCidade = new javax.swing.JLabel();
        txtEmail = new javax.swing.JLabel();
        txtData = new javax.swing.JLabel();
        lblNomeUser = new javax.swing.JTextField();
        lblTelefoneUser = new javax.swing.JTextField();
        lblEmailUser = new javax.swing.JTextField();
        // Inicializando o JFormattedTextField com o formato de data
        lblDataUser = new JFormattedTextField(new SimpleDateFormat("dd/MM/yyyy"));

        // Adicionando o FocusListener ao lblDataUser
        lblDataUser.addFocusListener(new java.awt.event.FocusAdapter() {
            @Override
            public void focusLost(java.awt.event.FocusEvent evt) {
                lblDataUserFocusLost(evt);
            }
        });
        lblDataUser = new javax.swing.JFormattedTextField(mascaraData);
        lblEstados_Brasil = new javax.swing.JComboBox<>();
        txtEstado = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPane_Menssagem = new javax.swing.JTextPane();
        btnCadastrar = new javax.swing.JButton();
        lblCidades = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sislog");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        txtNome.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtNome.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtNome.setText("Nome:");

        txtTelefone.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtTelefone.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtTelefone.setText("Telefone:");

        txtCidade.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtCidade.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtCidade.setText("Cidade:");

        txtEmail.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtEmail.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtEmail.setText("Email:");

        txtData.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtData.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtData.setText("Data de Nascimento:");

        lblNomeUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblNomeUserActionPerformed(evt);
            }
        });

        lblTelefoneUser.setToolTipText("(DD)9000-0000");
        lblTelefoneUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblTelefoneUserActionPerformed(evt);
            }
        });

        lblEmailUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblEmailUserActionPerformed(evt);
            }
        });

        try {
            lblDataUser.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        lblDataUser.setText("");
        lblDataUser.setToolTipText("dd/mm/yyyy");
        lblDataUser.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                lblDataUserFocusLost(evt);
            }
        });
        lblDataUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblDataUserActionPerformed(evt);
            }
        });

        lblEstados_Brasil.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblEstados_Brasil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "________", "Acre (AC)", "Alagoas (AL)", "Amapá (AP)", "Amazonas (AM)", "Bahia (BA)", "Ceará (CE)", "Distrito Federal (DF)", "Espírito Santo (ES)", "Goiás (GO)", "Maranhão (MA)", "Mato Grosso (MT)", "Mato Grosso do Sul (MS)", "Minas Gerais (MG)", "Pará (PA)", "Paraíba (PB)", "Paraná (PR)", "Pernambuco (PE)", "Piauí (PI)", "Rio de Janeiro (RJ)", "Rio Grande do Norte (RN)", "Rio Grande do Sul (RS)", "Rondônia (RO)", "Roraima (RR)", "Santa Catarina (SC)", "São Paulo (SP)", "Sergipe (SE)", "Tocantins (TO)" }));
        lblEstados_Brasil.setToolTipText("");

        txtEstado.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtEstado.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtEstado.setText("Estado:");

        jPane_Menssagem.setEditable(false);
        jPane_Menssagem.setBorder(null);
        jPane_Menssagem.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jPane_Menssagem.setText("Para se cadastrar inisra seus dados abaixo:");
        jScrollPane1.setViewportView(jPane_Menssagem);

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        lblCidades.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "________", "Aracaju", "Belo Horizonte", "Belém", "Boa Vista", "Brasília", "Campo Grande", "Cuiabá", "Curitiba", "Florianópolis", "Fortaleza", "Goiânia", "João Pessoa", "Macapá", "Maceió", "Manaus", "Natal", "Palmas", "Porto Alegre", "Porto Velho", "Recife", "Rio Branco", "Rio de Janeiro", "Salvador", "São Luís", "São Paulo", "Teresina", "Vitória", "_________", "Outra" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 701, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblTelefoneUser, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(txtNome)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lblNomeUser, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(txtTelefone)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtEstado)
                                .addGap(18, 18, 18)
                                .addComponent(lblEstados_Brasil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtEmail)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblEmailUser))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtData)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblDataUser, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtCidade)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblCidades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCadastrar)
                        .addGap(307, 307, 307)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtEmail)
                                .addComponent(lblEmailUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtData)
                                    .addComponent(lblDataUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCidade)
                            .addComponent(lblCidades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNome)
                            .addComponent(lblNomeUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTelefoneUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEstado)
                            .addComponent(lblEstados_Brasil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(btnCadastrar)
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblNomeUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblNomeUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblNomeUserActionPerformed

    private void lblTelefoneUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblTelefoneUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblTelefoneUserActionPerformed

    private void lblEmailUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblEmailUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblEmailUserActionPerformed

    private void lblDataUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblDataUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblDataUserActionPerformed

    private void lblDataUserFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lblDataUserFocusLost
        
        String data_digitada = lblDataUser.getText();
        /*Evento que permite deixar o campo data de nascimento vazio.*/
        SimpleDateFormat eventoData = new SimpleDateFormat("dd/MM/yyyy");
        try{
            Date data_usuario = (Date) eventoData.parse(data_digitada);
            java.sql.Date SQL_converte_data = new java.sql.Date(data_usuario.getTime());
            lblDataUser.setValue(eventoData.format(SQL_converte_data));
            }
        catch(ParseException erroEvento){
                System.out.println("Erro: data de nascimento vazia\n" +
                        erroEvento);    
        }
        finally{
            lblDataUser.setFocusLostBehavior(JFormattedTextField.PERSIST);
            if (lblDataUser.getText().trim().isEmpty()) {
            lblDataUser.setText(" ");
            lblDataUser.setValue(null);
            }
        }
    }//GEN-LAST:event_lblDataUserFocusLost

        /*O botão "Cadastrar" pega as dados do usuário e as envia para a classe
        CadastroSQL*/
    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        
        nome_usuario = lblNomeUser.getText();
        email_usuario = lblEmailUser.getText();
        tel_usuario = lblTelefoneUser.getText();
        nascimento_usuario = lblDataUser.getText();
        estado_usuario = lblEstados_Brasil.getSelectedItem().toString();
        cidade_usuario = lblCidades.getSelectedItem().toString();
        /*Intancia de Cadastro, que pega as variaveis para o cadastro.*/
        CadastroSQL sql_cad = new CadastroSQL();
        sql_cad.setNome(nome_usuario);
        sql_cad.setEmail(email_usuario);
        sql_cad.setTelefone(tel_usuario);
        sql_cad.setDTNascimento(nascimento_usuario);
        sql_cad.setEstado(estado_usuario);
        sql_cad.setCidade(cidade_usuario);
        sql_cad.criacodigo();
        sql_cad.criasenha(); //METODO TEMPORARIO
        try {
            sql_cad.connect();
        } catch (ParseException falha) {
            System.out.println("A interface gráfica falhou na conecxão com a"
                    + " classe de cadastro\n" + falha.getMessage() + "\n");
        }
        
    }//GEN-LAST:event_btnCadastrarActionPerformed

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
            java.util.logging.Logger.getLogger(GUI_TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_TelaCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    protected javax.swing.JTextPane jPane_Menssagem;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> lblCidades;
    private javax.swing.JFormattedTextField lblDataUser;
    private javax.swing.JTextField lblEmailUser;
    private javax.swing.JComboBox<String> lblEstados_Brasil;
    private javax.swing.JTextField lblNomeUser;
    private javax.swing.JTextField lblTelefoneUser;
    private javax.swing.JLabel txtCidade;
    private javax.swing.JLabel txtData;
    private javax.swing.JLabel txtEmail;
    private javax.swing.JLabel txtEstado;
    private javax.swing.JLabel txtNome;
    private javax.swing.JLabel txtTelefone;
    // End of variables declaration//GEN-END:variables
}
