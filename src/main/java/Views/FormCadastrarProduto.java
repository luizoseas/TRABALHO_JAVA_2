/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Views;

import br.dev.lomm.automecanicapoo.database.Produto;

/**
 *
 * @author oseas
 */
public class FormCadastrarProduto extends javax.swing.JFrame {

    /**
     * Creates new form FormCadastrarProduto
     */
    public FormCadastrarProduto() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        HEADER = new javax.swing.JPanel();
        TEXT_TITLE = new javax.swing.JLabel();
        BG_INPUT_DTVALIDADE = new javax.swing.JPanel();
        TEXT_DTVALIDADE = new javax.swing.JLabel();
        INPUT_DTVALIDADE = new com.toedter.calendar.JDateChooser();
        BUTTON_CADASTRAR = new javax.swing.JButton();
        BG_INPUT_NOME = new javax.swing.JPanel();
        TEXT_NOME = new javax.swing.JLabel();
        INPUT_NOME = new javax.swing.JTextPane();

        HEADER.setBackground(new java.awt.Color(159, 172, 172));

        TEXT_TITLE.setFont(new java.awt.Font("Arial", 1, 35)); // NOI18N
        TEXT_TITLE.setForeground(new java.awt.Color(255, 255, 255));
        TEXT_TITLE.setText("CADASTRAR PRODUTOS");

        javax.swing.GroupLayout HEADERLayout = new javax.swing.GroupLayout(HEADER);
        HEADER.setLayout(HEADERLayout);
        HEADERLayout.setHorizontalGroup(
            HEADERLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HEADERLayout.createSequentialGroup()
                .addGap(235, 235, 235)
                .addComponent(TEXT_TITLE)
                .addGap(200, 200, 200))
        );
        HEADERLayout.setVerticalGroup(
            HEADERLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HEADERLayout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(TEXT_TITLE, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        BG_INPUT_DTVALIDADE.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        TEXT_DTVALIDADE.setBackground(new java.awt.Color(238, 238, 238));
        TEXT_DTVALIDADE.setFont(new java.awt.Font("Arial", 0, 23)); // NOI18N
        TEXT_DTVALIDADE.setText("Data Validade:");

        javax.swing.GroupLayout BG_INPUT_DTVALIDADELayout = new javax.swing.GroupLayout(BG_INPUT_DTVALIDADE);
        BG_INPUT_DTVALIDADE.setLayout(BG_INPUT_DTVALIDADELayout);
        BG_INPUT_DTVALIDADELayout.setHorizontalGroup(
            BG_INPUT_DTVALIDADELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BG_INPUT_DTVALIDADELayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TEXT_DTVALIDADE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(INPUT_DTVALIDADE, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
                .addContainerGap())
        );
        BG_INPUT_DTVALIDADELayout.setVerticalGroup(
            BG_INPUT_DTVALIDADELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BG_INPUT_DTVALIDADELayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BG_INPUT_DTVALIDADELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(INPUT_DTVALIDADE, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TEXT_DTVALIDADE, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        BUTTON_CADASTRAR.setBackground(new java.awt.Color(0, 204, 0));
        BUTTON_CADASTRAR.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BUTTON_CADASTRAR.setForeground(new java.awt.Color(255, 255, 255));
        BUTTON_CADASTRAR.setText("CADASTRAR");
        BUTTON_CADASTRAR.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BUTTON_CADASTRAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BUTTON_CADASTRARActionPerformed(evt);
            }
        });

        BG_INPUT_NOME.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        TEXT_NOME.setBackground(new java.awt.Color(238, 238, 238));
        TEXT_NOME.setFont(new java.awt.Font("Arial", 0, 23)); // NOI18N
        TEXT_NOME.setText("Nome:");

        INPUT_NOME.setBorder(null);
        INPUT_NOME.setFont(new java.awt.Font("Segoe UI", 0, 28)); // NOI18N
        INPUT_NOME.setToolTipText("Quantidade");
        INPUT_NOME.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        javax.swing.GroupLayout BG_INPUT_NOMELayout = new javax.swing.GroupLayout(BG_INPUT_NOME);
        BG_INPUT_NOME.setLayout(BG_INPUT_NOMELayout);
        BG_INPUT_NOMELayout.setHorizontalGroup(
            BG_INPUT_NOMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BG_INPUT_NOMELayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TEXT_NOME)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(INPUT_NOME, javax.swing.GroupLayout.DEFAULT_SIZE, 521, Short.MAX_VALUE)
                .addContainerGap())
        );
        BG_INPUT_NOMELayout.setVerticalGroup(
            BG_INPUT_NOMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BG_INPUT_NOMELayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BG_INPUT_NOMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(INPUT_NOME, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TEXT_NOME, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HEADER, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(250, 250, 250)
                .addComponent(BUTTON_CADASTRAR, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(250, 250, 250))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BG_INPUT_DTVALIDADE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(BG_INPUT_NOME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(120, 120, 120))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(HEADER, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(BG_INPUT_NOME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(BG_INPUT_DTVALIDADE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addComponent(BUTTON_CADASTRAR, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BUTTON_CADASTRARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUTTON_CADASTRARActionPerformed
        Produto produto = new Produto();
        produto.setProdNome(INPUT_NOME.getText().toString());
        produto.setProdValidade(INPUT_DTVALIDADE.getDate());
        if(produto.salvar()){
           FormListarProduto.atualizarTabela();
           this.setVisible(false);
           INPUT_DTVALIDADE.cleanup();
           INPUT_NOME.setText("");
        }
    }//GEN-LAST:event_BUTTON_CADASTRARActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BG_INPUT_DTVALIDADE;
    private javax.swing.JPanel BG_INPUT_NOME;
    private javax.swing.JButton BUTTON_CADASTRAR;
    private javax.swing.JPanel HEADER;
    private com.toedter.calendar.JDateChooser INPUT_DTVALIDADE;
    private javax.swing.JTextPane INPUT_NOME;
    private javax.swing.JLabel TEXT_DTVALIDADE;
    private javax.swing.JLabel TEXT_NOME;
    private javax.swing.JLabel TEXT_TITLE;
    // End of variables declaration//GEN-END:variables
}
