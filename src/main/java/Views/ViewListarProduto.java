/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Views;

import Controllers.DAO;
import Forms.FormListarProduto;
import Models.Produto;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author oseas
 */
public class ViewListarProduto extends javax.swing.JInternalFrame {

    private FormCadastrarProduto formCadastrarProduto;
    private FormConsultarProduto formConsultarProduto;
        private boolean iniciado = false;
    private static Produto produtoDAO = new Produto();
    ;
    /**
     * Creates new form FormListarProduto
     */
    public ViewListarProduto() {
        if(!iniciado){
            initComponents();
            iniciado = true;
        }
    }

    @Override
    public void setVisible(boolean aFlag) {
        if(!iniciado){
            initComponents();
            iniciado = true;
        }
        super.setVisible(aFlag); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        FormListarProduto.setTabela(TABLE_PRODUTOS);
        FormListarProduto.atualizar();
        
    }
    
    
    


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BUTTON_CADASTRAR = new javax.swing.JButton();
        TABLE = new javax.swing.JScrollPane();
        TABLE_PRODUTOS = new javax.swing.JTable();
        BUTTON_CONSULTAR = new javax.swing.JButton();
        HEADER = new javax.swing.JPanel();
        TEXT_TITLE = new javax.swing.JLabel();
        BUTTON_ATUALIZAR = new javax.swing.JButton();

        BUTTON_CADASTRAR.setBackground(new java.awt.Color(0, 102, 0));
        BUTTON_CADASTRAR.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BUTTON_CADASTRAR.setForeground(new java.awt.Color(255, 255, 255));
        BUTTON_CADASTRAR.setText("CADASTRAR");
        BUTTON_CADASTRAR.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BUTTON_CADASTRAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BUTTON_CADASTRARActionPerformed(evt);
            }
        });

        TABLE_PRODUTOS.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nome", "Data Validade"
            }
        ));
        TABLE_PRODUTOS.setToolTipText("");
        TABLE.setViewportView(TABLE_PRODUTOS);

        BUTTON_CONSULTAR.setBackground(new java.awt.Color(0, 204, 204));
        BUTTON_CONSULTAR.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BUTTON_CONSULTAR.setForeground(new java.awt.Color(255, 255, 255));
        BUTTON_CONSULTAR.setText("CONSULTAR");
        BUTTON_CONSULTAR.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BUTTON_CONSULTAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BUTTON_CONSULTARActionPerformed(evt);
            }
        });

        HEADER.setBackground(new java.awt.Color(159, 172, 172));

        TEXT_TITLE.setFont(new java.awt.Font("Arial", 1, 25)); // NOI18N
        TEXT_TITLE.setForeground(new java.awt.Color(255, 255, 255));
        TEXT_TITLE.setText("LISTAR PRODUTOS");

        javax.swing.GroupLayout HEADERLayout = new javax.swing.GroupLayout(HEADER);
        HEADER.setLayout(HEADERLayout);
        HEADERLayout.setHorizontalGroup(
            HEADERLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HEADERLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TEXT_TITLE)
                .addContainerGap())
        );
        HEADERLayout.setVerticalGroup(
            HEADERLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TEXT_TITLE, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
        );

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
                .addGap(145, 145, 145)
                .addComponent(BUTTON_CONSULTAR, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BUTTON_CADASTRAR, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(134, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(TABLE, javax.swing.GroupLayout.PREFERRED_SIZE, 958, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BUTTON_ATUALIZAR, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(HEADER, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BUTTON_ATUALIZAR, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TABLE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BUTTON_CONSULTAR, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BUTTON_CADASTRAR, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BUTTON_CADASTRARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUTTON_CADASTRARActionPerformed
        if(!(this.formCadastrarProduto instanceof FormCadastrarProduto)){
            this.formCadastrarProduto = new FormCadastrarProduto();
        }
        this.formCadastrarProduto.setVisible(true);
    }//GEN-LAST:event_BUTTON_CADASTRARActionPerformed

    private void BUTTON_CONSULTARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUTTON_CONSULTARActionPerformed
       int linha = TABLE_PRODUTOS.getSelectedRow();
       int codigoProduto = Integer.parseInt(TABLE_PRODUTOS.getValueAt(linha,0).toString());
       Produto produto = DAO.getInstance().find(Produto.class, codigoProduto);
       if(produto instanceof Produto){
        if(!(this.formConsultarProduto instanceof FormConsultarProduto)){
            this.formConsultarProduto = new FormConsultarProduto();
        }
        this.formConsultarProduto.setProduto(produto);
        this.formConsultarProduto.setVisible(true);
       }

    }//GEN-LAST:event_BUTTON_CONSULTARActionPerformed

    private void BUTTON_ATUALIZARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUTTON_ATUALIZARActionPerformed
        FormListarProduto.atualizar();
    }//GEN-LAST:event_BUTTON_ATUALIZARActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BUTTON_ATUALIZAR;
    private javax.swing.JButton BUTTON_CADASTRAR;
    private javax.swing.JButton BUTTON_CONSULTAR;
    private javax.swing.JPanel HEADER;
    private javax.swing.JScrollPane TABLE;
    private javax.swing.JTable TABLE_PRODUTOS;
    private javax.swing.JLabel TEXT_TITLE;
    // End of variables declaration//GEN-END:variables
}
