/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Views;

import Controllers.ControllerConserto;
import Forms.FormListarConsertoCliente;
import Forms.FormListarProduto;
import Interfaces.FalhaException;
import Interfaces.ObjetoSelecionavel;
import Models.Conserto;
import Models.Status;
import java.awt.event.ItemListener;

/**
 *
 * @author oseas
 */
public class FormAtualizarOrdemDeServico extends javax.swing.JFrame {

    private final ControllerConserto controllerConserto = new ControllerConserto();
    private Conserto conserto;

    public Conserto getConserto() {
        return conserto;
    }

    public void setConserto(Conserto conserto) {
        this.conserto = conserto;
        controllerConserto.setConserto(conserto);
        controllerConserto.preencherForm(INPUT_DESC, INPUT_CLIENTE, INPUT_DESC, INPUT_DESC);
        INPUT_CLIENTE.setText(conserto.getConsIdveiculo().getVeiIdcliente().getCliIdpessoa().getPesNome());
        INPUT_VEICULO.setText(conserto.getConsIdveiculo().getVeiPlaca());
        this.setCampoStatus();
    }
    
    public void setCampoStatus(){
        for (Status status : Status.getStatus()) {
            INPUT_STATUS.addItem(status.getStatDescricao());
        }
    }
    
    /**
     * Creates new form FormAtualizarOrdemDeServico
     */
    public FormAtualizarOrdemDeServico() {
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

        BG_INPUT_VEICULO = new javax.swing.JPanel();
        TEXT_VEICULO = new javax.swing.JLabel();
        INPUT_VEICULO = new javax.swing.JTextPane();
        BG_INPUT_CLIENTE = new javax.swing.JPanel();
        TEXT_CLIENTE = new javax.swing.JLabel();
        INPUT_CLIENTE = new javax.swing.JTextPane();
        HEADER = new javax.swing.JPanel();
        TEXT_TITLE = new javax.swing.JLabel();
        BG_INPUT_DESCRICAO = new javax.swing.JPanel();
        TEXT_DESCRICAO = new javax.swing.JLabel();
        INPUT_DESCRICAO = new javax.swing.JScrollPane();
        INPUT_DESC = new javax.swing.JTextPane();
        BUTTON_EDITAR = new javax.swing.JButton();
        BG_INPUT_VEICULO1 = new javax.swing.JPanel();
        TEXT_VEICULO1 = new javax.swing.JLabel();
        INPUT_STATUS = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        HEADER.setBackground(new java.awt.Color(159, 172, 172));

        TEXT_TITLE.setFont(new java.awt.Font("Arial", 1, 35)); // NOI18N
        TEXT_TITLE.setForeground(new java.awt.Color(255, 255, 255));
        TEXT_TITLE.setText("ATUALIZAR ORDEM DE SERVIÇO");

        javax.swing.GroupLayout HEADERLayout = new javax.swing.GroupLayout(HEADER);
        HEADER.setLayout(HEADERLayout);
        HEADERLayout.setHorizontalGroup(
            HEADERLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HEADERLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TEXT_TITLE)
                .addGap(199, 199, 199))
        );
        HEADERLayout.setVerticalGroup(
            HEADERLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HEADERLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(TEXT_TITLE, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        BG_INPUT_DESCRICAO.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        TEXT_DESCRICAO.setBackground(new java.awt.Color(238, 238, 238));
        TEXT_DESCRICAO.setFont(new java.awt.Font("Arial", 0, 23)); // NOI18N
        TEXT_DESCRICAO.setText("Descrição:");

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

        BUTTON_EDITAR.setBackground(new java.awt.Color(0, 204, 204));
        BUTTON_EDITAR.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BUTTON_EDITAR.setForeground(new java.awt.Color(255, 255, 255));
        BUTTON_EDITAR.setText("ATUALIZAR");
        BUTTON_EDITAR.setToolTipText("");
        BUTTON_EDITAR.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BUTTON_EDITAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BUTTON_EDITARActionPerformed(evt);
            }
        });

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
                .addComponent(INPUT_STATUS, 0, 214, Short.MAX_VALUE)
                .addGap(27, 27, 27))
        );
        BG_INPUT_VEICULO1Layout.setVerticalGroup(
            BG_INPUT_VEICULO1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BG_INPUT_VEICULO1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BG_INPUT_VEICULO1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(INPUT_STATUS)
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BG_INPUT_CLIENTE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BG_INPUT_VEICULO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BG_INPUT_VEICULO1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(BG_INPUT_DESCRICAO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BUTTON_EDITAR, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(332, 332, 332))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(BUTTON_EDITAR, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BUTTON_EDITARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUTTON_EDITARActionPerformed
        try{
            controllerConserto.setConserto(conserto);
            controllerConserto.setCampos(INPUT_STATUS, INPUT_DESC);
            controllerConserto.validarDados();
            controllerConserto.getConserto().salvar();
            this.setVisible(false);
            FormListarConsertoCliente.atualizar();
        }catch(FalhaException $erro){
            
        }
    }//GEN-LAST:event_BUTTON_EDITARActionPerformed

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
            java.util.logging.Logger.getLogger(FormAtualizarOrdemDeServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormAtualizarOrdemDeServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormAtualizarOrdemDeServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormAtualizarOrdemDeServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormAtualizarOrdemDeServico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BG_INPUT_CLIENTE;
    private javax.swing.JPanel BG_INPUT_DESCRICAO;
    private javax.swing.JPanel BG_INPUT_VEICULO;
    private javax.swing.JPanel BG_INPUT_VEICULO1;
    private javax.swing.JButton BUTTON_EDITAR;
    private javax.swing.JPanel HEADER;
    private javax.swing.JTextPane INPUT_CLIENTE;
    private javax.swing.JTextPane INPUT_DESC;
    private javax.swing.JScrollPane INPUT_DESCRICAO;
    private javax.swing.JComboBox<String> INPUT_STATUS;
    private javax.swing.JTextPane INPUT_VEICULO;
    private javax.swing.JLabel TEXT_CLIENTE;
    private javax.swing.JLabel TEXT_DESCRICAO;
    private javax.swing.JLabel TEXT_TITLE;
    private javax.swing.JLabel TEXT_VEICULO;
    private javax.swing.JLabel TEXT_VEICULO1;
    // End of variables declaration//GEN-END:variables
}
