/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author mono-
 */
public class FormularioSalida extends javax.swing.JInternalFrame {

    /**
     * Creates new form FormularioSalida
     */
    public FormularioSalida() {
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

        lblConfirmacion = new javax.swing.JLabel();
        lblLabel = new javax.swing.JLabel();
        lblLabel1 = new javax.swing.JLabel();
        lblid = new javax.swing.JLabel();
        lblHSalida = new javax.swing.JLabel();
        txtHSalida = new javax.swing.JTextField();
        txtIdentificacion = new javax.swing.JTextField();
        lblPrecio = new javax.swing.JLabel();
        lblPCancelar = new javax.swing.JLabel();
        btnSalida = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        lblConfirmacion1 = new javax.swing.JLabel();
        lblPlaca = new javax.swing.JLabel();
        txtPlaca = new javax.swing.JTextField();

        lblConfirmacion.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblConfirmacion.setForeground(new java.awt.Color(255, 0, 0));

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setPreferredSize(new java.awt.Dimension(371, 319));

        lblLabel.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        lblLabel.setText("Salida de vehiculos");

        lblLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblLabel1.setText("Información");

        lblid.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblid.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblid.setText("Identificación:");

        lblHSalida.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblHSalida.setText("Hora de salida (24H):");

        txtHSalida.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        txtIdentificacion.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtIdentificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdentificacionActionPerformed(evt);
            }
        });

        lblPrecio.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblPrecio.setText("Precio a cancelar:");

        lblPCancelar.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblPCancelar.setPreferredSize(new java.awt.Dimension(6, 20));

        btnSalida.setBackground(new java.awt.Color(153, 153, 153));
        btnSalida.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnSalida.setText("Salida");
        btnSalida.setMaximumSize(new java.awt.Dimension(91, 25));
        btnSalida.setMinimumSize(new java.awt.Dimension(91, 25));
        btnSalida.setPreferredSize(new java.awt.Dimension(91, 25));
        btnSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalidaActionPerformed(evt);
            }
        });

        btnCancelar.setBackground(new java.awt.Color(153, 153, 153));
        btnCancelar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setToolTipText("");
        btnCancelar.setMaximumSize(new java.awt.Dimension(91, 25));
        btnCancelar.setMinimumSize(new java.awt.Dimension(91, 25));
        btnCancelar.setPreferredSize(new java.awt.Dimension(91, 25));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        lblConfirmacion1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblConfirmacion1.setForeground(new java.awt.Color(255, 0, 0));
        lblConfirmacion1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblPlaca.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblPlaca.setText("Placa:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblConfirmacion1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPrecio)
                    .addComponent(lblPlaca)
                    .addComponent(lblHSalida)
                    .addComponent(lblid))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtIdentificacion)
                    .addComponent(txtHSalida)
                    .addComponent(txtPlaca)
                    .addComponent(lblPCancelar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(lblLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(btnSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(68, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblLabel)
                .addGap(113, 113, 113))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblConfirmacion1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(lblLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblid)
                    .addComponent(txtIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHSalida))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPlaca)
                    .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdentificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdentificacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdentificacionActionPerformed

    private void btnSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalidaActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelarActionPerformed

    public JButton getBtnCancelar() {
        return btnCancelar;
    }

    public void setBtnCancelar(JButton btnCancelar) {
        this.btnCancelar = btnCancelar;
    }

    public JButton getBtnSalida() {
        return btnSalida;
    }

    public void setBtnSalida(JButton btnSalida) {
        this.btnSalida = btnSalida;
    }

    public JLabel getLblConfirmacion() {
        return lblConfirmacion;
    }

    public void setLblConfirmacion(JLabel lblConfirmacion) {
        this.lblConfirmacion = lblConfirmacion;
    }

    public JLabel getLblConfirmacion1() {
        return lblConfirmacion1;
    }

    public void setLblConfirmacion1(JLabel lblConfirmacion1) {
        this.lblConfirmacion1 = lblConfirmacion1;
    }

    public JLabel getLblHSalida() {
        return lblHSalida;
    }

    public void setLblHSalida(JLabel lblHSalida) {
        this.lblHSalida = lblHSalida;
    }

    public JLabel getLblLabel() {
        return lblLabel;
    }

    public void setLblLabel(JLabel lblLabel) {
        this.lblLabel = lblLabel;
    }

    public JLabel getLblLabel1() {
        return lblLabel1;
    }

    public void setLblLabel1(JLabel lblLabel1) {
        this.lblLabel1 = lblLabel1;
    }

    public JLabel getLblPCancelar() {
        return lblPCancelar;
    }

    public void setLblPCancelar(JLabel lblPCancelar) {
        this.lblPCancelar = lblPCancelar;
    }

    public JLabel getLblPlaca() {
        return lblPlaca;
    }

    public void setLblPlaca(JLabel lblPlaca) {
        this.lblPlaca = lblPlaca;
    }

    public JLabel getLblPrecio() {
        return lblPrecio;
    }

    public void setLblPrecio(JLabel lblPrecio) {
        this.lblPrecio = lblPrecio;
    }

    public JLabel getLblid() {
        return lblid;
    }

    public void setLblid(JLabel lblid) {
        this.lblid = lblid;
    }

    public JTextField getTxtHSalida() {
        return txtHSalida;
    }

    public void setTxtHSalida(JTextField txtHSalida) {
        this.txtHSalida = txtHSalida;
    }

    public JTextField getTxtIdentificacion() {
        return txtIdentificacion;
    }

    public void setTxtIdentificacion(JTextField txtIdentificacion) {
        this.txtIdentificacion = txtIdentificacion;
    }

    public JTextField getTxtPlaca() {
        return txtPlaca;
    }

    public void setTxtPlaca(JTextField txtPlaca) {
        this.txtPlaca = txtPlaca;
    }

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnSalida;
    private javax.swing.JLabel lblConfirmacion;
    private javax.swing.JLabel lblConfirmacion1;
    private javax.swing.JLabel lblHSalida;
    private javax.swing.JLabel lblLabel;
    private javax.swing.JLabel lblLabel1;
    private javax.swing.JLabel lblPCancelar;
    private javax.swing.JLabel lblPlaca;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblid;
    private javax.swing.JTextField txtHSalida;
    private javax.swing.JTextField txtIdentificacion;
    private javax.swing.JTextField txtPlaca;
    // End of variables declaration//GEN-END:variables
}