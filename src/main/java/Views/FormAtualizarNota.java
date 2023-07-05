/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Views;

/**
 *
 * @author oseas
 */
public class FormAtualizarNota extends javax.swing.JFrame {

    /**
     * Creates new form FormAtualizarNota
     */
    public FormAtualizarNota() {
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
        BG_INPUT_NNF = new javax.swing.JPanel();
        TEXT_NNF = new javax.swing.JLabel();
        INPUT_NNF = new javax.swing.JTextPane();
        BG_INPUT_FORNECEDOR = new javax.swing.JPanel();
        TEXT_FORNECEDOR = new javax.swing.JLabel();
        INPUT_FORNECEDOR = new javax.swing.JTextPane();
        BG_INPUT_DTENTRADA = new javax.swing.JPanel();
        TEXT_DTENTRADA = new javax.swing.JLabel();
        INPUT_DTENTRADA = new com.toedter.calendar.JDateChooser();
        BUTTON_ATUALIZAR = new javax.swing.JButton();
        BG_INPUT_DTCOMPRA = new javax.swing.JPanel();
        TEXT_DTCOMPRA = new javax.swing.JLabel();
        INPUT_DTCOMPRA = new com.toedter.calendar.JDateChooser();

        HEADER.setBackground(new java.awt.Color(159, 172, 172));

        TEXT_TITLE.setFont(new java.awt.Font("Arial", 1, 35)); // NOI18N
        TEXT_TITLE.setForeground(new java.awt.Color(255, 255, 255));
        TEXT_TITLE.setText("ATUALIZAR NOTA");

        javax.swing.GroupLayout HEADERLayout = new javax.swing.GroupLayout(HEADER);
        HEADER.setLayout(HEADERLayout);
        HEADERLayout.setHorizontalGroup(
            HEADERLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HEADERLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TEXT_TITLE)
                .addGap(263, 263, 263))
        );
        HEADERLayout.setVerticalGroup(
            HEADERLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HEADERLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(TEXT_TITLE, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        BG_INPUT_NNF.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        TEXT_NNF.setBackground(new java.awt.Color(238, 238, 238));
        TEXT_NNF.setFont(new java.awt.Font("Arial", 0, 23)); // NOI18N
        TEXT_NNF.setText("NNF:");

        INPUT_NNF.setBorder(null);
        INPUT_NNF.setFont(new java.awt.Font("Segoe UI", 0, 28)); // NOI18N
        INPUT_NNF.setToolTipText("Quantidade");
        INPUT_NNF.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        javax.swing.GroupLayout BG_INPUT_NNFLayout = new javax.swing.GroupLayout(BG_INPUT_NNF);
        BG_INPUT_NNF.setLayout(BG_INPUT_NNFLayout);
        BG_INPUT_NNFLayout.setHorizontalGroup(
            BG_INPUT_NNFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BG_INPUT_NNFLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TEXT_NNF)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(INPUT_NNF)
                .addContainerGap())
        );
        BG_INPUT_NNFLayout.setVerticalGroup(
            BG_INPUT_NNFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BG_INPUT_NNFLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BG_INPUT_NNFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(INPUT_NNF, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TEXT_NNF, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        BG_INPUT_FORNECEDOR.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        TEXT_FORNECEDOR.setBackground(new java.awt.Color(238, 238, 238));
        TEXT_FORNECEDOR.setFont(new java.awt.Font("Arial", 0, 23)); // NOI18N
        TEXT_FORNECEDOR.setText("Fornecedor:");

        INPUT_FORNECEDOR.setBorder(null);
        INPUT_FORNECEDOR.setFont(new java.awt.Font("Segoe UI", 0, 28)); // NOI18N
        INPUT_FORNECEDOR.setToolTipText("Quantidade");
        INPUT_FORNECEDOR.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        javax.swing.GroupLayout BG_INPUT_FORNECEDORLayout = new javax.swing.GroupLayout(BG_INPUT_FORNECEDOR);
        BG_INPUT_FORNECEDOR.setLayout(BG_INPUT_FORNECEDORLayout);
        BG_INPUT_FORNECEDORLayout.setHorizontalGroup(
            BG_INPUT_FORNECEDORLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BG_INPUT_FORNECEDORLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TEXT_FORNECEDOR)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(INPUT_FORNECEDOR)
                .addContainerGap())
        );
        BG_INPUT_FORNECEDORLayout.setVerticalGroup(
            BG_INPUT_FORNECEDORLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BG_INPUT_FORNECEDORLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BG_INPUT_FORNECEDORLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(INPUT_FORNECEDOR, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TEXT_FORNECEDOR, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        BG_INPUT_DTENTRADA.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        TEXT_DTENTRADA.setBackground(new java.awt.Color(238, 238, 238));
        TEXT_DTENTRADA.setFont(new java.awt.Font("Arial", 0, 23)); // NOI18N
        TEXT_DTENTRADA.setText("Data entrada:");

        javax.swing.GroupLayout BG_INPUT_DTENTRADALayout = new javax.swing.GroupLayout(BG_INPUT_DTENTRADA);
        BG_INPUT_DTENTRADA.setLayout(BG_INPUT_DTENTRADALayout);
        BG_INPUT_DTENTRADALayout.setHorizontalGroup(
            BG_INPUT_DTENTRADALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BG_INPUT_DTENTRADALayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TEXT_DTENTRADA)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(INPUT_DTENTRADA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        BG_INPUT_DTENTRADALayout.setVerticalGroup(
            BG_INPUT_DTENTRADALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BG_INPUT_DTENTRADALayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BG_INPUT_DTENTRADALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(INPUT_DTENTRADA, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TEXT_DTENTRADA, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        BUTTON_ATUALIZAR.setBackground(new java.awt.Color(0, 204, 0));
        BUTTON_ATUALIZAR.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BUTTON_ATUALIZAR.setForeground(new java.awt.Color(255, 255, 255));
        BUTTON_ATUALIZAR.setText("ATUALIZAR");
        BUTTON_ATUALIZAR.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BUTTON_ATUALIZAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BUTTON_ATUALIZARActionPerformed(evt);
            }
        });

        BG_INPUT_DTCOMPRA.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        TEXT_DTCOMPRA.setBackground(new java.awt.Color(238, 238, 238));
        TEXT_DTCOMPRA.setFont(new java.awt.Font("Arial", 0, 23)); // NOI18N
        TEXT_DTCOMPRA.setText("Data compra:");

        javax.swing.GroupLayout BG_INPUT_DTCOMPRALayout = new javax.swing.GroupLayout(BG_INPUT_DTCOMPRA);
        BG_INPUT_DTCOMPRA.setLayout(BG_INPUT_DTCOMPRALayout);
        BG_INPUT_DTCOMPRALayout.setHorizontalGroup(
            BG_INPUT_DTCOMPRALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BG_INPUT_DTCOMPRALayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TEXT_DTCOMPRA)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(INPUT_DTCOMPRA, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                .addContainerGap())
        );
        BG_INPUT_DTCOMPRALayout.setVerticalGroup(
            BG_INPUT_DTCOMPRALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BG_INPUT_DTCOMPRALayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BG_INPUT_DTCOMPRALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(INPUT_DTCOMPRA, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TEXT_DTCOMPRA, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HEADER, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BG_INPUT_FORNECEDOR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(BG_INPUT_NNF, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BG_INPUT_DTCOMPRA, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BG_INPUT_DTENTRADA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BUTTON_ATUALIZAR, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(236, 236, 236))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(HEADER, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(BG_INPUT_FORNECEDOR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BG_INPUT_DTENTRADA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BG_INPUT_DTCOMPRA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(BG_INPUT_NNF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78)
                .addComponent(BUTTON_ATUALIZAR, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BUTTON_ATUALIZARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUTTON_ATUALIZARActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BUTTON_ATUALIZARActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BG_INPUT_DTCOMPRA;
    private javax.swing.JPanel BG_INPUT_DTENTRADA;
    private javax.swing.JPanel BG_INPUT_FORNECEDOR;
    private javax.swing.JPanel BG_INPUT_NNF;
    private javax.swing.JButton BUTTON_ATUALIZAR;
    private javax.swing.JPanel HEADER;
    private com.toedter.calendar.JDateChooser INPUT_DTCOMPRA;
    private com.toedter.calendar.JDateChooser INPUT_DTENTRADA;
    private javax.swing.JTextPane INPUT_FORNECEDOR;
    private javax.swing.JTextPane INPUT_NNF;
    private javax.swing.JLabel TEXT_DTCOMPRA;
    private javax.swing.JLabel TEXT_DTENTRADA;
    private javax.swing.JLabel TEXT_FORNECEDOR;
    private javax.swing.JLabel TEXT_NNF;
    private javax.swing.JLabel TEXT_TITLE;
    // End of variables declaration//GEN-END:variables
}
