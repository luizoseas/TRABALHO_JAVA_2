/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Views;

import Controllers.ControllerProduto;
import Controllers.DAO;
import Forms.FormListarProduto;
import Interfaces.FalhaException;
import Models.Estoque;
import Models.Produto;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author oseas
 */
public class FormConsultarProduto extends javax.swing.JFrame {
    private FormAtualizarProduto formAtualizarProduto;
    private Produto produto;
    private static Estoque estoqueDAO = new Estoque();
    private static DefaultTableModel Tabela;
    private FormConsultarEstoque formConsultarEstoque;
    private FormCadastrarEstoque formCadastrarEstoque;
    private final ControllerProduto controllerProduto = new ControllerProduto();
    /**
     * Creates new form FormConsultarProduto
     */
    public FormConsultarProduto() {
        initComponents();
        setTabela((DefaultTableModel) TABLE_LOTES.getModel());
    }
    
    private static void setTabela(DefaultTableModel tabela){
        Tabela = tabela;
    }

    @Override
    public void setVisible(boolean b) {
        super.setVisible(b); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        atualizarTabelaLote(produto);
    }
    
    
    public static void atualizarTabelaLote(Produto produto){
        Tabela.getDataVector().removeAllElements();
        for (Estoque prod : produto.getEstoqueList()) {
            String data[] = {prod.getIdestoque()+"","R$ "+prod.getEstPreco(),prod.getEstQuantidade()+" unid"};
            Tabela.addRow(data);   
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BG_INPUT_DTVALIDADE = new javax.swing.JPanel();
        TEXT_DTVALIDADE = new javax.swing.JLabel();
        INPUT_DTVALIDADE = new com.toedter.calendar.JDateChooser();
        BUTTON_EDITAR = new javax.swing.JButton();
        BG_INPUT_NOME = new javax.swing.JPanel();
        TEXT_NOME = new javax.swing.JLabel();
        INPUT_NOME = new javax.swing.JTextPane();
        HEADER = new javax.swing.JPanel();
        TEXT_TITLE = new javax.swing.JLabel();
        BUTTON_EXCLUIR = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TABLE_LOTES = new javax.swing.JTable();
        BUTTON_CONSULTAR_LOTE = new javax.swing.JButton();
        TEXT_TITLELOTE = new javax.swing.JLabel();
        BUTTON_CADASTRAR_LOTE = new javax.swing.JButton();
        BUTTON_ATUALIZAR = new javax.swing.JButton();

        BG_INPUT_DTVALIDADE.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        TEXT_DTVALIDADE.setBackground(new java.awt.Color(238, 238, 238));
        TEXT_DTVALIDADE.setFont(new java.awt.Font("Arial", 0, 23)); // NOI18N
        TEXT_DTVALIDADE.setText("Data Validade:");

        INPUT_DTVALIDADE.setEnabled(false);

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

        BUTTON_EDITAR.setBackground(new java.awt.Color(0, 204, 204));
        BUTTON_EDITAR.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BUTTON_EDITAR.setForeground(new java.awt.Color(255, 255, 255));
        BUTTON_EDITAR.setText("EDITAR");
        BUTTON_EDITAR.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BUTTON_EDITAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BUTTON_EDITARActionPerformed(evt);
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
        INPUT_NOME.setEnabled(false);

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

        HEADER.setBackground(new java.awt.Color(159, 172, 172));

        TEXT_TITLE.setFont(new java.awt.Font("Arial", 1, 35)); // NOI18N
        TEXT_TITLE.setForeground(new java.awt.Color(255, 255, 255));
        TEXT_TITLE.setText("CONSULTAR PRODUTO");

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

        BUTTON_EXCLUIR.setBackground(new java.awt.Color(255, 51, 51));
        BUTTON_EXCLUIR.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BUTTON_EXCLUIR.setForeground(new java.awt.Color(255, 255, 255));
        BUTTON_EXCLUIR.setText("EXCLUIR");
        BUTTON_EXCLUIR.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BUTTON_EXCLUIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BUTTON_EXCLUIRActionPerformed(evt);
            }
        });

        TABLE_LOTES.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Preço", "Quantidade"
            }
        ));
        jScrollPane1.setViewportView(TABLE_LOTES);

        BUTTON_CONSULTAR_LOTE.setBackground(new java.awt.Color(0, 102, 255));
        BUTTON_CONSULTAR_LOTE.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BUTTON_CONSULTAR_LOTE.setForeground(new java.awt.Color(255, 255, 255));
        BUTTON_CONSULTAR_LOTE.setText("CONSULTAR LOTE");
        BUTTON_CONSULTAR_LOTE.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BUTTON_CONSULTAR_LOTE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BUTTON_CONSULTAR_LOTEActionPerformed(evt);
            }
        });

        TEXT_TITLELOTE.setFont(new java.awt.Font("Arial", 1, 35)); // NOI18N
        TEXT_TITLELOTE.setText("Lotes");

        BUTTON_CADASTRAR_LOTE.setBackground(new java.awt.Color(0, 204, 51));
        BUTTON_CADASTRAR_LOTE.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BUTTON_CADASTRAR_LOTE.setForeground(new java.awt.Color(255, 255, 255));
        BUTTON_CADASTRAR_LOTE.setText("CADASTRAR LOTE");
        BUTTON_CADASTRAR_LOTE.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BUTTON_CADASTRAR_LOTE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BUTTON_CADASTRAR_LOTEActionPerformed(evt);
            }
        });

        BUTTON_ATUALIZAR.setBackground(new java.awt.Color(0, 204, 255));
        BUTTON_ATUALIZAR.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BUTTON_ATUALIZAR.setForeground(new java.awt.Color(255, 255, 255));
        BUTTON_ATUALIZAR.setText("Atualizar");
        BUTTON_ATUALIZAR.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BUTTON_ATUALIZAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BUTTON_ATUALIZARActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HEADER, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(BUTTON_EDITAR, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BUTTON_EXCLUIR, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(BG_INPUT_NOME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(120, 120, 120))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(BG_INPUT_DTVALIDADE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap()))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(260, 260, 260)
                                .addComponent(TEXT_TITLELOTE)
                                .addGap(185, 185, 185)
                                .addComponent(BUTTON_ATUALIZAR, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(BUTTON_CONSULTAR_LOTE, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(BUTTON_CADASTRAR_LOTE, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 612, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(HEADER, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(BG_INPUT_NOME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(BG_INPUT_DTVALIDADE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TEXT_TITLELOTE)
                    .addComponent(BUTTON_ATUALIZAR, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BUTTON_CONSULTAR_LOTE, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BUTTON_CADASTRAR_LOTE, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BUTTON_EDITAR, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BUTTON_EXCLUIR, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BUTTON_EDITARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUTTON_EDITARActionPerformed
        Produto produto = DAO.getInstance().find(Produto.class, this.produto.getIdproduto());
        if(produto instanceof Produto){
            if(!(formAtualizarProduto instanceof FormAtualizarProduto)){
                formAtualizarProduto = new FormAtualizarProduto();
            }
            formAtualizarProduto.setVisible(true);
            this.setVisible(false);
            formAtualizarProduto.setProduto(produto);
        }
    }//GEN-LAST:event_BUTTON_EDITARActionPerformed

    private void BUTTON_EXCLUIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUTTON_EXCLUIRActionPerformed
        try {
            if(this.produto.excluir()){
                this.setVisible(false);
                FormListarProduto.atualizar();
            }
        } catch (FalhaException ex) {
        }
    }//GEN-LAST:event_BUTTON_EXCLUIRActionPerformed

    private void BUTTON_CONSULTAR_LOTEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUTTON_CONSULTAR_LOTEActionPerformed
        this.setVisible(false);
        int linha = TABLE_LOTES.getSelectedRow();
       int codigoLote = Integer.parseInt(TABLE_LOTES.getValueAt(linha,0).toString());
       Estoque estoque = DAO.getInstance().find(Estoque.class, codigoLote);
       if(estoque instanceof Estoque){
        if(!(this.formConsultarEstoque instanceof FormConsultarEstoque)){
            this.formConsultarEstoque = new FormConsultarEstoque();
        }
        this.formConsultarEstoque.setEstoque(estoque);
        this.formConsultarEstoque.setVisible(true);
       }
    }//GEN-LAST:event_BUTTON_CONSULTAR_LOTEActionPerformed

    private void BUTTON_CADASTRAR_LOTEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUTTON_CADASTRAR_LOTEActionPerformed
        if(!(formCadastrarEstoque instanceof FormCadastrarEstoque)){
            formCadastrarEstoque = new FormCadastrarEstoque();
        }
        formCadastrarEstoque.setProduto(this.produto);
        formCadastrarEstoque.setVisible(true);
    }//GEN-LAST:event_BUTTON_CADASTRAR_LOTEActionPerformed

    private void BUTTON_ATUALIZARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUTTON_ATUALIZARActionPerformed
        FormListarProduto.atualizar();
    }//GEN-LAST:event_BUTTON_ATUALIZARActionPerformed


    public void setProduto(Produto produto){
        this.produto = produto;
        controllerProduto.setProduto(produto);
        controllerProduto.preencherForm(INPUT_NOME, INPUT_DTVALIDADE);

    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BG_INPUT_DTVALIDADE;
    private javax.swing.JPanel BG_INPUT_NOME;
    private javax.swing.JButton BUTTON_ATUALIZAR;
    private javax.swing.JButton BUTTON_ATUALIZAR2;
    private javax.swing.JButton BUTTON_ATUALIZAR3;
    private javax.swing.JButton BUTTON_CADASTRAR_LOTE;
    private javax.swing.JButton BUTTON_CONSULTAR_LOTE;
    private javax.swing.JButton BUTTON_EDITAR;
    private javax.swing.JButton BUTTON_EXCLUIR;
    private javax.swing.JPanel HEADER;
    private com.toedter.calendar.JDateChooser INPUT_DTVALIDADE;
    private javax.swing.JTextPane INPUT_NOME;
    private javax.swing.JTable TABLE_LOTES;
    private javax.swing.JLabel TEXT_DTVALIDADE;
    private javax.swing.JLabel TEXT_NOME;
    private javax.swing.JLabel TEXT_TITLE;
    private javax.swing.JLabel TEXT_TITLELOTE;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
