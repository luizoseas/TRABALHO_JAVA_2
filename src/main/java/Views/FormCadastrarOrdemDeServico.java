/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Views;

import Controllers.ControllerConserto;
import Forms.FormListarProdutoConserto;
import Forms.FormListarVeiculo;
import Interfaces.FalhaException;
import Models.Cliente;

/**
 *
 * @author oseas
 */
public class FormCadastrarOrdemDeServico extends javax.swing.JFrame {

    private final ControllerConserto controllerConserto = new ControllerConserto();
    private static Cliente cliente;
    /**
     * Creates new form FormCadastrarOrdemDeServico
     */
    public FormCadastrarOrdemDeServico() {
        initComponents();
    }
    
    
    
    public void setCliente(Cliente cliente){
        FormCadastrarOrdemDeServico.cliente = cliente;
        controllerConserto.setCliente(cliente);
        CLIENTE_INPUT.setText(cliente.getCliIdpessoa().getPesNome());
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
        SELECT_VEICULO = new javax.swing.JComboBox<>();
        BG_INPUT_CLIENTE = new javax.swing.JPanel();
        TEXT_CLIENTE = new javax.swing.JLabel();
        CLIENTE_INPUT = new javax.swing.JTextField();
        HEADER = new javax.swing.JPanel();
        TEXT_TITLE = new javax.swing.JLabel();
        BUTTON_CADASTRAR = new javax.swing.JButton();
        BG_INPUT_DESCRICAO = new javax.swing.JPanel();
        TEXT_DESCRICAO = new javax.swing.JLabel();
        INPUT_DESCRICAO = new javax.swing.JScrollPane();
        DESCRICAO = new javax.swing.JTextPane();
        BG_INPUT_VEICULO1 = new javax.swing.JPanel();
        TEXT_VEICULO1 = new javax.swing.JLabel();
        SELECT_STATUS = new javax.swing.JComboBox<>();

        BG_INPUT_VEICULO.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        TEXT_VEICULO.setBackground(new java.awt.Color(238, 238, 238));
        TEXT_VEICULO.setFont(new java.awt.Font("Arial", 0, 23)); // NOI18N
        TEXT_VEICULO.setText("Veiculo:");

        javax.swing.GroupLayout BG_INPUT_VEICULOLayout = new javax.swing.GroupLayout(BG_INPUT_VEICULO);
        BG_INPUT_VEICULO.setLayout(BG_INPUT_VEICULOLayout);
        BG_INPUT_VEICULOLayout.setHorizontalGroup(
            BG_INPUT_VEICULOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BG_INPUT_VEICULOLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TEXT_VEICULO, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SELECT_VEICULO, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8))
        );
        BG_INPUT_VEICULOLayout.setVerticalGroup(
            BG_INPUT_VEICULOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BG_INPUT_VEICULOLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BG_INPUT_VEICULOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TEXT_VEICULO, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(SELECT_VEICULO))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        BG_INPUT_CLIENTE.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        TEXT_CLIENTE.setBackground(new java.awt.Color(238, 238, 238));
        TEXT_CLIENTE.setFont(new java.awt.Font("Arial", 0, 23)); // NOI18N
        TEXT_CLIENTE.setText("Cliente:");

        CLIENTE_INPUT.setEnabled(false);

        javax.swing.GroupLayout BG_INPUT_CLIENTELayout = new javax.swing.GroupLayout(BG_INPUT_CLIENTE);
        BG_INPUT_CLIENTE.setLayout(BG_INPUT_CLIENTELayout);
        BG_INPUT_CLIENTELayout.setHorizontalGroup(
            BG_INPUT_CLIENTELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BG_INPUT_CLIENTELayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TEXT_CLIENTE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CLIENTE_INPUT, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                .addContainerGap())
        );
        BG_INPUT_CLIENTELayout.setVerticalGroup(
            BG_INPUT_CLIENTELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BG_INPUT_CLIENTELayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BG_INPUT_CLIENTELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(CLIENTE_INPUT)
                    .addComponent(TEXT_CLIENTE, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        HEADER.setBackground(new java.awt.Color(159, 172, 172));

        TEXT_TITLE.setFont(new java.awt.Font("Arial", 1, 35)); // NOI18N
        TEXT_TITLE.setForeground(new java.awt.Color(255, 255, 255));
        TEXT_TITLE.setText("ORDEM DE SERVIÇO");

        javax.swing.GroupLayout HEADERLayout = new javax.swing.GroupLayout(HEADER);
        HEADER.setLayout(HEADERLayout);
        HEADERLayout.setHorizontalGroup(
            HEADERLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HEADERLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TEXT_TITLE)
                .addGap(218, 218, 218))
        );
        HEADERLayout.setVerticalGroup(
            HEADERLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HEADERLayout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(TEXT_TITLE, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
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

        BG_INPUT_DESCRICAO.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        TEXT_DESCRICAO.setBackground(new java.awt.Color(238, 238, 238));
        TEXT_DESCRICAO.setFont(new java.awt.Font("Arial", 0, 23)); // NOI18N
        TEXT_DESCRICAO.setText("Descrição:");

        INPUT_DESCRICAO.setViewportView(DESCRICAO);

        javax.swing.GroupLayout BG_INPUT_DESCRICAOLayout = new javax.swing.GroupLayout(BG_INPUT_DESCRICAO);
        BG_INPUT_DESCRICAO.setLayout(BG_INPUT_DESCRICAOLayout);
        BG_INPUT_DESCRICAOLayout.setHorizontalGroup(
            BG_INPUT_DESCRICAOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BG_INPUT_DESCRICAOLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TEXT_DESCRICAO, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(INPUT_DESCRICAO)
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

        BG_INPUT_VEICULO1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        TEXT_VEICULO1.setBackground(new java.awt.Color(238, 238, 238));
        TEXT_VEICULO1.setFont(new java.awt.Font("Arial", 0, 23)); // NOI18N
        TEXT_VEICULO1.setText("Status:");

        javax.swing.GroupLayout BG_INPUT_VEICULO1Layout = new javax.swing.GroupLayout(BG_INPUT_VEICULO1);
        BG_INPUT_VEICULO1.setLayout(BG_INPUT_VEICULO1Layout);
        BG_INPUT_VEICULO1Layout.setHorizontalGroup(
            BG_INPUT_VEICULO1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BG_INPUT_VEICULO1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TEXT_VEICULO1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SELECT_STATUS, 0, 214, Short.MAX_VALUE)
                .addGap(27, 27, 27))
        );
        BG_INPUT_VEICULO1Layout.setVerticalGroup(
            BG_INPUT_VEICULO1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BG_INPUT_VEICULO1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BG_INPUT_VEICULO1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SELECT_STATUS)
                    .addGroup(BG_INPUT_VEICULO1Layout.createSequentialGroup()
                        .addComponent(TEXT_VEICULO1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HEADER, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(BG_INPUT_DESCRICAO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BG_INPUT_CLIENTE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BG_INPUT_VEICULO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BG_INPUT_VEICULO1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(82, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BUTTON_CADASTRAR, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(351, 351, 351))
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
                .addGap(18, 18, 18)
                .addComponent(BUTTON_CADASTRAR, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BUTTON_CADASTRARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUTTON_CADASTRARActionPerformed
        try {
            controllerConserto.setCampos(SELECT_VEICULO, SELECT_STATUS, DESCRICAO);
            controllerConserto.setCliente(cliente);
            controllerConserto.validarDados();
            controllerConserto.getConserto().salvar();
            FormListarProdutoConserto.atualizar();
            this.setVisible(false);
        } catch (FalhaException ex) {
        }
    }//GEN-LAST:event_BUTTON_CADASTRARActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BG_INPUT_CLIENTE;
    private javax.swing.JPanel BG_INPUT_DESCRICAO;
    private javax.swing.JPanel BG_INPUT_VEICULO;
    private javax.swing.JPanel BG_INPUT_VEICULO1;
    private javax.swing.JButton BUTTON_CADASTRAR;
    private javax.swing.JTextField CLIENTE_INPUT;
    private javax.swing.JTextPane DESCRICAO;
    private javax.swing.JPanel HEADER;
    private javax.swing.JScrollPane INPUT_DESCRICAO;
    private javax.swing.JComboBox<String> SELECT_STATUS;
    private javax.swing.JComboBox<String> SELECT_VEICULO;
    private javax.swing.JLabel TEXT_CLIENTE;
    private javax.swing.JLabel TEXT_DESCRICAO;
    private javax.swing.JLabel TEXT_TITLE;
    private javax.swing.JLabel TEXT_VEICULO;
    private javax.swing.JLabel TEXT_VEICULO1;
    // End of variables declaration//GEN-END:variables
}
