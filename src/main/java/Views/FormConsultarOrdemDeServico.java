/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Views;

import Controllers.ControllerConserto;
import Controllers.DAO;
import Forms.FormListarCliente;
import Forms.FormListarConsertoCliente;
import Forms.FormListarProduto;
import Forms.FormListarProdutoConserto;
import Interfaces.FalhaException;
import Models.Conserto;
import Models.Estoque;

/**
 *
 * @author oseas
 */
public class FormConsultarOrdemDeServico extends javax.swing.JFrame {


    private final ControllerConserto controllerConserto = new ControllerConserto();
    private final FormAtualizarOrdemDeServico formAtualizarOrdemDeServico = new FormAtualizarOrdemDeServico();
    private final FormSelecionarProdutoOrdem formSelecionarProdutoOrdem = new FormSelecionarProdutoOrdem();
    private Conserto conserto;
    /**
     * Creates new form FormConsultarOrdemDeServico
     */
    public FormConsultarOrdemDeServico() {
        initComponents();
    }
    
    public void setConserto(Conserto conserto){
        this.conserto = conserto;
        controllerConserto.setConserto(conserto);
        controllerConserto.preencherForm(INPUT_VEICULO, INPUT_CLIENTE, INPUT_STATUS, INPUT_DESC, INPUT_TOTAL);
        FormListarProdutoConserto.setTabela(ProdutosTable);
        FormListarProdutoConserto.setConserto(conserto);
        FormListarProdutoConserto.atualizar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BG_INPUT_VEICULO = new javax.swing.JPanel();
        TEXT_VEICULO = new javax.swing.JLabel();
        INPUT_VEICULO = new javax.swing.JTextPane();
        HEADER = new javax.swing.JPanel();
        TEXT_TITLE = new javax.swing.JLabel();
        BG_INPUT_CLIENTE = new javax.swing.JPanel();
        TEXT_CLIENTE = new javax.swing.JLabel();
        INPUT_CLIENTE = new javax.swing.JTextPane();
        BUTTON_EDITAR = new javax.swing.JButton();
        BG_INPUT_DESCRICAO = new javax.swing.JPanel();
        TEXT_DESCRICAO = new javax.swing.JLabel();
        INPUT_DESCRICAO = new javax.swing.JScrollPane();
        INPUT_DESC = new javax.swing.JTextPane();
        BUTTON_EXCLUIR = new javax.swing.JButton();
        BG_INPUT_VEICULO1 = new javax.swing.JPanel();
        TEXT_VEICULO1 = new javax.swing.JLabel();
        INPUT_STATUS = new javax.swing.JTextPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        ProdutosTable = new javax.swing.JTable();
        TEXT_TITLE1 = new javax.swing.JLabel();
        BUTTON_EDITAR1 = new javax.swing.JButton();
        BG_INPUT_CLIENTE1 = new javax.swing.JPanel();
        TEXT_CLIENTE1 = new javax.swing.JLabel();
        INPUT_TOTAL = new javax.swing.JTextPane();
        BUTTON_EDITAR2 = new javax.swing.JButton();

        BG_INPUT_VEICULO.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        TEXT_VEICULO.setBackground(new java.awt.Color(238, 238, 238));
        TEXT_VEICULO.setFont(new java.awt.Font("Arial", 0, 23)); // NOI18N
        TEXT_VEICULO.setText("Veiculo:");

        INPUT_VEICULO.setBorder(null);
        INPUT_VEICULO.setFont(new java.awt.Font("Segoe UI", 0, 28)); // NOI18N
        INPUT_VEICULO.setToolTipText("Quantidade");
        INPUT_VEICULO.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        INPUT_VEICULO.setEnabled(false);

        javax.swing.GroupLayout BG_INPUT_VEICULOLayout = new javax.swing.GroupLayout(BG_INPUT_VEICULO);
        BG_INPUT_VEICULO.setLayout(BG_INPUT_VEICULOLayout);
        BG_INPUT_VEICULOLayout.setHorizontalGroup(
            BG_INPUT_VEICULOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BG_INPUT_VEICULOLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TEXT_VEICULO, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(INPUT_VEICULO, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                .addContainerGap())
        );
        BG_INPUT_VEICULOLayout.setVerticalGroup(
            BG_INPUT_VEICULOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BG_INPUT_VEICULOLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BG_INPUT_VEICULOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(INPUT_VEICULO, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TEXT_VEICULO, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        HEADER.setBackground(new java.awt.Color(159, 172, 172));

        TEXT_TITLE.setFont(new java.awt.Font("Arial", 1, 35)); // NOI18N
        TEXT_TITLE.setForeground(new java.awt.Color(255, 255, 255));
        TEXT_TITLE.setText("CONSULTAR ORDEM DE SERVIÇO");

        javax.swing.GroupLayout HEADERLayout = new javax.swing.GroupLayout(HEADER);
        HEADER.setLayout(HEADERLayout);
        HEADERLayout.setHorizontalGroup(
            HEADERLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HEADERLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TEXT_TITLE)
                .addGap(273, 273, 273))
        );
        HEADERLayout.setVerticalGroup(
            HEADERLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HEADERLayout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(TEXT_TITLE, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        BG_INPUT_CLIENTE.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        TEXT_CLIENTE.setBackground(new java.awt.Color(238, 238, 238));
        TEXT_CLIENTE.setFont(new java.awt.Font("Arial", 0, 23)); // NOI18N
        TEXT_CLIENTE.setText("Cliente:");

        INPUT_CLIENTE.setBorder(null);
        INPUT_CLIENTE.setFont(new java.awt.Font("Segoe UI", 0, 28)); // NOI18N
        INPUT_CLIENTE.setToolTipText("Quantidade");
        INPUT_CLIENTE.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        INPUT_CLIENTE.setEnabled(false);

        javax.swing.GroupLayout BG_INPUT_CLIENTELayout = new javax.swing.GroupLayout(BG_INPUT_CLIENTE);
        BG_INPUT_CLIENTE.setLayout(BG_INPUT_CLIENTELayout);
        BG_INPUT_CLIENTELayout.setHorizontalGroup(
            BG_INPUT_CLIENTELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BG_INPUT_CLIENTELayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TEXT_CLIENTE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(INPUT_CLIENTE, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                .addContainerGap())
        );
        BG_INPUT_CLIENTELayout.setVerticalGroup(
            BG_INPUT_CLIENTELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BG_INPUT_CLIENTELayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BG_INPUT_CLIENTELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(INPUT_CLIENTE, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TEXT_CLIENTE, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        BUTTON_EDITAR.setBackground(new java.awt.Color(0, 204, 204));
        BUTTON_EDITAR.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BUTTON_EDITAR.setForeground(new java.awt.Color(255, 255, 255));
        BUTTON_EDITAR.setText("EDITAR");
        BUTTON_EDITAR.setToolTipText("");
        BUTTON_EDITAR.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BUTTON_EDITAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BUTTON_EDITARActionPerformed(evt);
            }
        });

        BG_INPUT_DESCRICAO.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        TEXT_DESCRICAO.setBackground(new java.awt.Color(238, 238, 238));
        TEXT_DESCRICAO.setFont(new java.awt.Font("Arial", 0, 23)); // NOI18N
        TEXT_DESCRICAO.setText("Descrição:");

        INPUT_DESC.setEnabled(false);
        INPUT_DESCRICAO.setViewportView(INPUT_DESC);

        javax.swing.GroupLayout BG_INPUT_DESCRICAOLayout = new javax.swing.GroupLayout(BG_INPUT_DESCRICAO);
        BG_INPUT_DESCRICAO.setLayout(BG_INPUT_DESCRICAOLayout);
        BG_INPUT_DESCRICAOLayout.setHorizontalGroup(
            BG_INPUT_DESCRICAOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BG_INPUT_DESCRICAOLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TEXT_DESCRICAO, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(INPUT_DESCRICAO, javax.swing.GroupLayout.DEFAULT_SIZE, 868, Short.MAX_VALUE)
                .addContainerGap())
        );
        BG_INPUT_DESCRICAOLayout.setVerticalGroup(
            BG_INPUT_DESCRICAOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BG_INPUT_DESCRICAOLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BG_INPUT_DESCRICAOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BG_INPUT_DESCRICAOLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(TEXT_DESCRICAO, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(70, Short.MAX_VALUE))
                    .addGroup(BG_INPUT_DESCRICAOLayout.createSequentialGroup()
                        .addComponent(INPUT_DESCRICAO)
                        .addContainerGap())))
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

        BG_INPUT_VEICULO1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        TEXT_VEICULO1.setBackground(new java.awt.Color(238, 238, 238));
        TEXT_VEICULO1.setFont(new java.awt.Font("Arial", 0, 23)); // NOI18N
        TEXT_VEICULO1.setText("Status:");

        INPUT_STATUS.setBorder(null);
        INPUT_STATUS.setFont(new java.awt.Font("Segoe UI", 0, 28)); // NOI18N
        INPUT_STATUS.setToolTipText("Quantidade");
        INPUT_STATUS.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        INPUT_STATUS.setEnabled(false);

        javax.swing.GroupLayout BG_INPUT_VEICULO1Layout = new javax.swing.GroupLayout(BG_INPUT_VEICULO1);
        BG_INPUT_VEICULO1.setLayout(BG_INPUT_VEICULO1Layout);
        BG_INPUT_VEICULO1Layout.setHorizontalGroup(
            BG_INPUT_VEICULO1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BG_INPUT_VEICULO1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TEXT_VEICULO1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(INPUT_STATUS, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                .addGap(19, 19, 19))
        );
        BG_INPUT_VEICULO1Layout.setVerticalGroup(
            BG_INPUT_VEICULO1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BG_INPUT_VEICULO1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BG_INPUT_VEICULO1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(INPUT_STATUS, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TEXT_VEICULO1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ProdutosTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Produto", "Quantidade", "Valor"
            }
        ));
        jScrollPane1.setViewportView(ProdutosTable);

        TEXT_TITLE1.setFont(new java.awt.Font("Arial", 1, 35)); // NOI18N
        TEXT_TITLE1.setText("Produtos");

        BUTTON_EDITAR1.setBackground(new java.awt.Color(0, 204, 0));
        BUTTON_EDITAR1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BUTTON_EDITAR1.setForeground(new java.awt.Color(255, 255, 255));
        BUTTON_EDITAR1.setText("ADICIONAR PRODUTO");
        BUTTON_EDITAR1.setToolTipText("");
        BUTTON_EDITAR1.setActionCommand("CONSULTAR PRODUTO");
        BUTTON_EDITAR1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BUTTON_EDITAR1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BUTTON_EDITAR1ActionPerformed(evt);
            }
        });

        BG_INPUT_CLIENTE1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        TEXT_CLIENTE1.setBackground(new java.awt.Color(238, 238, 238));
        TEXT_CLIENTE1.setFont(new java.awt.Font("Arial", 0, 23)); // NOI18N
        TEXT_CLIENTE1.setText("Total:");

        INPUT_TOTAL.setBorder(null);
        INPUT_TOTAL.setFont(new java.awt.Font("Segoe UI", 0, 28)); // NOI18N
        INPUT_TOTAL.setToolTipText("Quantidade");
        INPUT_TOTAL.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        INPUT_TOTAL.setEnabled(false);

        javax.swing.GroupLayout BG_INPUT_CLIENTE1Layout = new javax.swing.GroupLayout(BG_INPUT_CLIENTE1);
        BG_INPUT_CLIENTE1.setLayout(BG_INPUT_CLIENTE1Layout);
        BG_INPUT_CLIENTE1Layout.setHorizontalGroup(
            BG_INPUT_CLIENTE1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BG_INPUT_CLIENTE1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TEXT_CLIENTE1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(INPUT_TOTAL, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                .addContainerGap())
        );
        BG_INPUT_CLIENTE1Layout.setVerticalGroup(
            BG_INPUT_CLIENTE1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BG_INPUT_CLIENTE1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BG_INPUT_CLIENTE1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(INPUT_TOTAL, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TEXT_CLIENTE1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        BUTTON_EDITAR2.setBackground(new java.awt.Color(204, 0, 102));
        BUTTON_EDITAR2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BUTTON_EDITAR2.setForeground(new java.awt.Color(255, 255, 255));
        BUTTON_EDITAR2.setText("REMOVER PRODUTO");
        BUTTON_EDITAR2.setToolTipText("");
        BUTTON_EDITAR2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BUTTON_EDITAR2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BUTTON_EDITAR2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HEADER, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(69, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BG_INPUT_CLIENTE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BG_INPUT_VEICULO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(BG_INPUT_VEICULO1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(BG_INPUT_DESCRICAO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(64, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(147, 147, 147)
                                .addComponent(TEXT_TITLE1)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BUTTON_EDITAR, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BUTTON_EXCLUIR, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(191, 191, 191))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(121, 121, 121)
                                .addComponent(BG_INPUT_CLIENTE1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
            .addGroup(layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(BUTTON_EDITAR1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BUTTON_EDITAR2, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(HEADER, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BG_INPUT_CLIENTE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BG_INPUT_VEICULO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BG_INPUT_VEICULO1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BG_INPUT_DESCRICAO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TEXT_TITLE1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(BUTTON_EDITAR, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BUTTON_EXCLUIR, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(95, 95, 95)
                        .addComponent(BG_INPUT_CLIENTE1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BUTTON_EDITAR1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BUTTON_EDITAR2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(123, 123, 123))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BUTTON_EDITARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUTTON_EDITARActionPerformed
        formAtualizarOrdemDeServico.setConserto(conserto);
        formAtualizarOrdemDeServico.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BUTTON_EDITARActionPerformed

    private void BUTTON_EXCLUIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUTTON_EXCLUIRActionPerformed
        try {
            conserto.excluir();
            FormListarConsertoCliente.atualizar();
            this.setVisible(false);
        } catch (FalhaException ex) {
        }
    }//GEN-LAST:event_BUTTON_EXCLUIRActionPerformed

    private void BUTTON_EDITAR1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUTTON_EDITAR1ActionPerformed
        this.setVisible(false);
        formSelecionarProdutoOrdem.setConserto(conserto);
        formSelecionarProdutoOrdem.setVisible(true);
    }//GEN-LAST:event_BUTTON_EDITAR1ActionPerformed

    private void BUTTON_EDITAR2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUTTON_EDITAR2ActionPerformed
        int linha = ProdutosTable.getSelectedRow();
       int codigoLote = Integer.parseInt(ProdutosTable.getValueAt(linha,0).toString());
        Estoque estoque = DAO.getInstance().find(Estoque.class, codigoLote);
       if(estoque instanceof Estoque){
        try {
            estoque.excluir();
            FormListarProdutoConserto.atualizar();;
        } catch (FalhaException ex) {
        }
       }
    }//GEN-LAST:event_BUTTON_EDITAR2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BG_INPUT_CLIENTE;
    private javax.swing.JPanel BG_INPUT_CLIENTE1;
    private javax.swing.JPanel BG_INPUT_DESCRICAO;
    private javax.swing.JPanel BG_INPUT_VEICULO;
    private javax.swing.JPanel BG_INPUT_VEICULO1;
    private javax.swing.JButton BUTTON_EDITAR;
    private javax.swing.JButton BUTTON_EDITAR1;
    private javax.swing.JButton BUTTON_EDITAR2;
    private javax.swing.JButton BUTTON_EXCLUIR;
    private javax.swing.JPanel HEADER;
    private javax.swing.JTextPane INPUT_CLIENTE;
    private javax.swing.JTextPane INPUT_DESC;
    private javax.swing.JScrollPane INPUT_DESCRICAO;
    private javax.swing.JTextPane INPUT_STATUS;
    private javax.swing.JTextPane INPUT_TOTAL;
    private javax.swing.JTextPane INPUT_VEICULO;
    private javax.swing.JTable ProdutosTable;
    private javax.swing.JLabel TEXT_CLIENTE;
    private javax.swing.JLabel TEXT_CLIENTE1;
    private javax.swing.JLabel TEXT_DESCRICAO;
    private javax.swing.JLabel TEXT_TITLE;
    private javax.swing.JLabel TEXT_TITLE1;
    private javax.swing.JLabel TEXT_VEICULO;
    private javax.swing.JLabel TEXT_VEICULO1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
