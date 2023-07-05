/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Views;

import Controllers.ControllerCliente;
import Interfaces.FalhaException;
import br.dev.lomm.automecanicapoo.database.Cliente;

/**
 *
 * @author oseas
 */
public class FormAtualizarCliente extends javax.swing.JFrame {

    private Cliente cliente;
    private final ControllerCliente controllerCliente = new ControllerCliente();

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
        controllerCliente.preencherForm(INPUT_NOME, INPUT_CPF, INPUT_DTNASCIMENTO, INPUT_EMAIL, INPUT_LOGRADOURO, INPUT_CEP, INPUT_BAIRRO, INPUT_CIDADE);
    }
    
    /**
     * Creates new form FormAtualizarCliente
     */
    public FormAtualizarCliente() {
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
        BG_INPUT_CEP = new javax.swing.JPanel();
        TEXT_CEP = new javax.swing.JLabel();
        INPUT_CEP = new javax.swing.JTextPane();
        BG_INPUT_LOGRADOURO = new javax.swing.JPanel();
        TEXT_LOGRADOURO = new javax.swing.JLabel();
        INPUT_LOGRADOURO = new javax.swing.JTextPane();
        BG_INPUT_DTNASCIMENTO = new javax.swing.JPanel();
        TEXT_DTNASCIMENTO = new javax.swing.JLabel();
        INPUT_DTNASCIMENTO = new com.toedter.calendar.JDateChooser();
        BG_INPUT_BAIRRO = new javax.swing.JPanel();
        TEXT_BAIRRO = new javax.swing.JLabel();
        INPUT_BAIRRO = new javax.swing.JTextPane();
        BUTTON_ATUALIZAR = new javax.swing.JButton();
        BG_INPUT_NOME = new javax.swing.JPanel();
        TEXT_NOME = new javax.swing.JLabel();
        INPUT_NOME = new javax.swing.JTextPane();
        BG_INPUT_CIDADE = new javax.swing.JPanel();
        TEXT_CIDADE = new javax.swing.JLabel();
        INPUT_CIDADE = new javax.swing.JTextPane();
        BG_INPUT_EMAIL = new javax.swing.JPanel();
        TEXT_EMAIL = new javax.swing.JLabel();
        INPUT_EMAIL = new javax.swing.JTextPane();
        BG_INPUT_CPF = new javax.swing.JPanel();
        TEXT_CPF = new javax.swing.JLabel();
        INPUT_CPF = new javax.swing.JTextPane();

        HEADER.setBackground(new java.awt.Color(159, 172, 172));

        TEXT_TITLE.setFont(new java.awt.Font("Arial", 1, 35)); // NOI18N
        TEXT_TITLE.setForeground(new java.awt.Color(255, 255, 255));
        TEXT_TITLE.setText("ATUALIZAR CLIENTE");

        javax.swing.GroupLayout HEADERLayout = new javax.swing.GroupLayout(HEADER);
        HEADER.setLayout(HEADERLayout);
        HEADERLayout.setHorizontalGroup(
            HEADERLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HEADERLayout.createSequentialGroup()
                .addGap(250, 250, 250)
                .addComponent(TEXT_TITLE)
                .addGap(250, 250, 250))
        );
        HEADERLayout.setVerticalGroup(
            HEADERLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HEADERLayout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(TEXT_TITLE, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        BG_INPUT_CEP.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        TEXT_CEP.setBackground(new java.awt.Color(238, 238, 238));
        TEXT_CEP.setFont(new java.awt.Font("Arial", 0, 23)); // NOI18N
        TEXT_CEP.setText("CEP:");

        INPUT_CEP.setBorder(null);
        INPUT_CEP.setFont(new java.awt.Font("Segoe UI", 0, 28)); // NOI18N
        INPUT_CEP.setToolTipText("Quantidade");
        INPUT_CEP.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        javax.swing.GroupLayout BG_INPUT_CEPLayout = new javax.swing.GroupLayout(BG_INPUT_CEP);
        BG_INPUT_CEP.setLayout(BG_INPUT_CEPLayout);
        BG_INPUT_CEPLayout.setHorizontalGroup(
            BG_INPUT_CEPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BG_INPUT_CEPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TEXT_CEP)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(INPUT_CEP)
                .addContainerGap())
        );
        BG_INPUT_CEPLayout.setVerticalGroup(
            BG_INPUT_CEPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BG_INPUT_CEPLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BG_INPUT_CEPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(INPUT_CEP, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TEXT_CEP, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        BG_INPUT_LOGRADOURO.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        TEXT_LOGRADOURO.setBackground(new java.awt.Color(238, 238, 238));
        TEXT_LOGRADOURO.setFont(new java.awt.Font("Arial", 0, 23)); // NOI18N
        TEXT_LOGRADOURO.setText("Logradouro:");

        INPUT_LOGRADOURO.setBorder(null);
        INPUT_LOGRADOURO.setFont(new java.awt.Font("Segoe UI", 0, 28)); // NOI18N
        INPUT_LOGRADOURO.setToolTipText("Quantidade");
        INPUT_LOGRADOURO.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        javax.swing.GroupLayout BG_INPUT_LOGRADOUROLayout = new javax.swing.GroupLayout(BG_INPUT_LOGRADOURO);
        BG_INPUT_LOGRADOURO.setLayout(BG_INPUT_LOGRADOUROLayout);
        BG_INPUT_LOGRADOUROLayout.setHorizontalGroup(
            BG_INPUT_LOGRADOUROLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BG_INPUT_LOGRADOUROLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TEXT_LOGRADOURO)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(INPUT_LOGRADOURO, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE)
                .addContainerGap())
        );
        BG_INPUT_LOGRADOUROLayout.setVerticalGroup(
            BG_INPUT_LOGRADOUROLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BG_INPUT_LOGRADOUROLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BG_INPUT_LOGRADOUROLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(INPUT_LOGRADOURO, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TEXT_LOGRADOURO, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        BG_INPUT_DTNASCIMENTO.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        TEXT_DTNASCIMENTO.setBackground(new java.awt.Color(238, 238, 238));
        TEXT_DTNASCIMENTO.setFont(new java.awt.Font("Arial", 0, 23)); // NOI18N
        TEXT_DTNASCIMENTO.setText("Data Nascimento:");

        javax.swing.GroupLayout BG_INPUT_DTNASCIMENTOLayout = new javax.swing.GroupLayout(BG_INPUT_DTNASCIMENTO);
        BG_INPUT_DTNASCIMENTO.setLayout(BG_INPUT_DTNASCIMENTOLayout);
        BG_INPUT_DTNASCIMENTOLayout.setHorizontalGroup(
            BG_INPUT_DTNASCIMENTOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BG_INPUT_DTNASCIMENTOLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TEXT_DTNASCIMENTO)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(INPUT_DTNASCIMENTO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        BG_INPUT_DTNASCIMENTOLayout.setVerticalGroup(
            BG_INPUT_DTNASCIMENTOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BG_INPUT_DTNASCIMENTOLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(BG_INPUT_DTNASCIMENTOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TEXT_DTNASCIMENTO, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(INPUT_DTNASCIMENTO, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        BG_INPUT_BAIRRO.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        TEXT_BAIRRO.setBackground(new java.awt.Color(238, 238, 238));
        TEXT_BAIRRO.setFont(new java.awt.Font("Arial", 0, 23)); // NOI18N
        TEXT_BAIRRO.setText("Bairro:");

        INPUT_BAIRRO.setBorder(null);
        INPUT_BAIRRO.setFont(new java.awt.Font("Segoe UI", 0, 28)); // NOI18N
        INPUT_BAIRRO.setToolTipText("Quantidade");
        INPUT_BAIRRO.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        javax.swing.GroupLayout BG_INPUT_BAIRROLayout = new javax.swing.GroupLayout(BG_INPUT_BAIRRO);
        BG_INPUT_BAIRRO.setLayout(BG_INPUT_BAIRROLayout);
        BG_INPUT_BAIRROLayout.setHorizontalGroup(
            BG_INPUT_BAIRROLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BG_INPUT_BAIRROLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TEXT_BAIRRO)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(INPUT_BAIRRO, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                .addContainerGap())
        );
        BG_INPUT_BAIRROLayout.setVerticalGroup(
            BG_INPUT_BAIRROLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BG_INPUT_BAIRROLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BG_INPUT_BAIRROLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(INPUT_BAIRRO, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TEXT_BAIRRO, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        BG_INPUT_NOME.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        TEXT_NOME.setBackground(new java.awt.Color(238, 238, 238));
        TEXT_NOME.setFont(new java.awt.Font("Arial", 0, 23)); // NOI18N
        TEXT_NOME.setText("Nome:");

        INPUT_NOME.setBorder(null);
        INPUT_NOME.setFont(new java.awt.Font("Segoe UI", 0, 28)); // NOI18N
        INPUT_NOME.setToolTipText("Quantidade");
        INPUT_NOME.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        INPUT_NOME.setMaximumSize(new java.awt.Dimension(62, 38));

        javax.swing.GroupLayout BG_INPUT_NOMELayout = new javax.swing.GroupLayout(BG_INPUT_NOME);
        BG_INPUT_NOME.setLayout(BG_INPUT_NOMELayout);
        BG_INPUT_NOMELayout.setHorizontalGroup(
            BG_INPUT_NOMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BG_INPUT_NOMELayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TEXT_NOME)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(INPUT_NOME, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        BG_INPUT_CIDADE.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        TEXT_CIDADE.setBackground(new java.awt.Color(238, 238, 238));
        TEXT_CIDADE.setFont(new java.awt.Font("Arial", 0, 23)); // NOI18N
        TEXT_CIDADE.setText("Cidade:");

        INPUT_CIDADE.setBorder(null);
        INPUT_CIDADE.setFont(new java.awt.Font("Segoe UI", 0, 28)); // NOI18N
        INPUT_CIDADE.setToolTipText("Quantidade");
        INPUT_CIDADE.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        javax.swing.GroupLayout BG_INPUT_CIDADELayout = new javax.swing.GroupLayout(BG_INPUT_CIDADE);
        BG_INPUT_CIDADE.setLayout(BG_INPUT_CIDADELayout);
        BG_INPUT_CIDADELayout.setHorizontalGroup(
            BG_INPUT_CIDADELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BG_INPUT_CIDADELayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TEXT_CIDADE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(INPUT_CIDADE, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                .addContainerGap())
        );
        BG_INPUT_CIDADELayout.setVerticalGroup(
            BG_INPUT_CIDADELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BG_INPUT_CIDADELayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BG_INPUT_CIDADELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TEXT_CIDADE, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(INPUT_CIDADE, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        BG_INPUT_EMAIL.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        TEXT_EMAIL.setBackground(new java.awt.Color(238, 238, 238));
        TEXT_EMAIL.setFont(new java.awt.Font("Arial", 0, 23)); // NOI18N
        TEXT_EMAIL.setText("Email:");

        INPUT_EMAIL.setBorder(null);
        INPUT_EMAIL.setFont(new java.awt.Font("Segoe UI", 0, 28)); // NOI18N
        INPUT_EMAIL.setToolTipText("Quantidade");
        INPUT_EMAIL.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        javax.swing.GroupLayout BG_INPUT_EMAILLayout = new javax.swing.GroupLayout(BG_INPUT_EMAIL);
        BG_INPUT_EMAIL.setLayout(BG_INPUT_EMAILLayout);
        BG_INPUT_EMAILLayout.setHorizontalGroup(
            BG_INPUT_EMAILLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BG_INPUT_EMAILLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TEXT_EMAIL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(INPUT_EMAIL)
                .addContainerGap())
        );
        BG_INPUT_EMAILLayout.setVerticalGroup(
            BG_INPUT_EMAILLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BG_INPUT_EMAILLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BG_INPUT_EMAILLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(INPUT_EMAIL, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TEXT_EMAIL, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        BG_INPUT_CPF.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        TEXT_CPF.setBackground(new java.awt.Color(238, 238, 238));
        TEXT_CPF.setFont(new java.awt.Font("Arial", 0, 23)); // NOI18N
        TEXT_CPF.setText("CPF:");

        INPUT_CPF.setBorder(null);
        INPUT_CPF.setFont(new java.awt.Font("Segoe UI", 0, 28)); // NOI18N
        INPUT_CPF.setToolTipText("Quantidade");
        INPUT_CPF.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        javax.swing.GroupLayout BG_INPUT_CPFLayout = new javax.swing.GroupLayout(BG_INPUT_CPF);
        BG_INPUT_CPF.setLayout(BG_INPUT_CPFLayout);
        BG_INPUT_CPFLayout.setHorizontalGroup(
            BG_INPUT_CPFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BG_INPUT_CPFLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TEXT_CPF)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(INPUT_CPF, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                .addContainerGap())
        );
        BG_INPUT_CPFLayout.setVerticalGroup(
            BG_INPUT_CPFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BG_INPUT_CPFLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BG_INPUT_CPFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(INPUT_CPF, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TEXT_CPF, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HEADER, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(BG_INPUT_LOGRADOURO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BG_INPUT_CEP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(BG_INPUT_CPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BG_INPUT_DTNASCIMENTO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(BG_INPUT_NOME, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BG_INPUT_EMAIL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(BG_INPUT_BAIRRO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BG_INPUT_CIDADE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(69, 69, 69))
            .addGroup(layout.createSequentialGroup()
                .addGap(232, 232, 232)
                .addComponent(BUTTON_ATUALIZAR, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(HEADER, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(BG_INPUT_NOME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BG_INPUT_CPF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BG_INPUT_DTNASCIMENTO, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BG_INPUT_EMAIL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BG_INPUT_LOGRADOURO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BG_INPUT_CEP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BG_INPUT_CIDADE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BG_INPUT_BAIRRO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(126, 126, 126)
                .addComponent(BUTTON_ATUALIZAR, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(97, 97, 97))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BUTTON_ATUALIZARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUTTON_ATUALIZARActionPerformed
        try{
            controllerCliente.setCampos(INPUT_NOME, INPUT_CPF, INPUT_DTNASCIMENTO, INPUT_EMAIL, INPUT_LOGRADOURO, INPUT_CEP, INPUT_BAIRRO, INPUT_CIDADE);
            controllerCliente.validarDados();
            controllerCliente.getCliente().atualizar();
            this.setVisible(false);
        }catch(FalhaException $erro){
            
        }
    }//GEN-LAST:event_BUTTON_ATUALIZARActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BG_INPUT_BAIRRO;
    private javax.swing.JPanel BG_INPUT_CEP;
    private javax.swing.JPanel BG_INPUT_CIDADE;
    private javax.swing.JPanel BG_INPUT_CPF;
    private javax.swing.JPanel BG_INPUT_DTNASCIMENTO;
    private javax.swing.JPanel BG_INPUT_EMAIL;
    private javax.swing.JPanel BG_INPUT_LOGRADOURO;
    private javax.swing.JPanel BG_INPUT_NOME;
    private javax.swing.JButton BUTTON_ATUALIZAR;
    private javax.swing.JPanel HEADER;
    private javax.swing.JTextPane INPUT_BAIRRO;
    private javax.swing.JTextPane INPUT_CEP;
    private javax.swing.JTextPane INPUT_CIDADE;
    private javax.swing.JTextPane INPUT_CPF;
    private com.toedter.calendar.JDateChooser INPUT_DTNASCIMENTO;
    private javax.swing.JTextPane INPUT_EMAIL;
    private javax.swing.JTextPane INPUT_LOGRADOURO;
    private javax.swing.JTextPane INPUT_NOME;
    private javax.swing.JLabel TEXT_BAIRRO;
    private javax.swing.JLabel TEXT_CEP;
    private javax.swing.JLabel TEXT_CIDADE;
    private javax.swing.JLabel TEXT_CPF;
    private javax.swing.JLabel TEXT_DTNASCIMENTO;
    private javax.swing.JLabel TEXT_EMAIL;
    private javax.swing.JLabel TEXT_LOGRADOURO;
    private javax.swing.JLabel TEXT_NOME;
    private javax.swing.JLabel TEXT_TITLE;
    // End of variables declaration//GEN-END:variables
}
