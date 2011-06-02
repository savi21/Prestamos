/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Application.java
 *
 * Created on May 20, 2011, 10:35:40 PM
 */
package com.wiled.ubicame.prestamos.forms;

import com.wiled.ubicame.prestamos.entidades.CriterioBusqueda;

/**
 *
 * @author edgar
 */
public class Application extends javax.swing.JFrame {

    /** Creates new form Application */
    public Application() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        criterioBusquedaCombo = new javax.swing.JComboBox();
        criterioTxt = new javax.swing.JTextField();
        buscarBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        resultTable = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        crearPrestamo = new javax.swing.JMenuItem();
        realizarPago = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        crearCliente = new javax.swing.JMenuItem();
        actualizarCliente = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        amortizarPrestamo = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Presamos");
        setResizable(false);

        jLabel1.setText("Criterio de Busqueda:");

        criterioBusquedaCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        buscarBtn.setBackground(java.awt.Color.green);
        buscarBtn.setText("Buscar");
        buscarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarBtnActionPerformed(evt);
            }
        });

        resultTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nombre", "Telefono", "Cedula"
            }
        ));
        resultTable.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(resultTable);
        resultTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        jMenu1.setText("Operaciones");
        jMenu1.setToolTipText("Opciones Generales");

        jMenuItem1.setText("Realizar Backup");
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Salir");
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Prestamos");

        crearPrestamo.setText("Crear");
        crearPrestamo.setToolTipText("Crear Prestamos");
        crearPrestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearPrestamoActionPerformed(evt);
            }
        });
        jMenu2.add(crearPrestamo);

        realizarPago.setText("Pagos y Abonos");
        realizarPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                realizarPagoActionPerformed(evt);
            }
        });
        jMenu2.add(realizarPago);

        jMenuBar1.add(jMenu2);

        jMenu4.setText("Clientes");

        crearCliente.setText("Crear");
        crearCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearClienteActionPerformed(evt);
            }
        });
        jMenu4.add(crearCliente);

        actualizarCliente.setText("Actualizar o Eliminar");
        actualizarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarClienteActionPerformed(evt);
            }
        });
        jMenu4.add(actualizarCliente);

        jMenuBar1.add(jMenu4);

        jMenu3.setText("Utilidades");

        amortizarPrestamo.setText("Amortizar Prestamo");
        amortizarPrestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amortizarPrestamoActionPerformed(evt);
            }
        });
        jMenu3.add(amortizarPrestamo);

        jMenuBar1.add(jMenu3);

        jMenu5.setText("Reportes");
        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(criterioBusquedaCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(criterioTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buscarBtn)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(criterioBusquedaCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(criterioTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscarBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(108, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void crearPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearPrestamoActionPerformed
        // TODO add your handling code here:
        CrearPrestamo form = new CrearPrestamo(this, true);
        form.setLocationRelativeTo(null);
        form.setVisible(true);
    }//GEN-LAST:event_crearPrestamoActionPerformed

    private void realizarPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_realizarPagoActionPerformed
        // TODO add your handling code here:
        PagoForm form = new PagoForm(this, true);
        form.setLocationRelativeTo(null);
        form.setVisible(true);
    }//GEN-LAST:event_realizarPagoActionPerformed

    private void crearClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearClienteActionPerformed
        // TODO add your handling code here:
        CrearClientes form = new CrearClientes(this, true);
        form.setLocationRelativeTo(null);
        form.setVisible(true);
    }//GEN-LAST:event_crearClienteActionPerformed

    private void actualizarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarClienteActionPerformed
        // TODO add your handling code here:
        AdministrarCliente form = new AdministrarCliente(this, true);
        form.setLocationRelativeTo(null);
        form.setVisible(true);
    }//GEN-LAST:event_actualizarClienteActionPerformed

    private void amortizarPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amortizarPrestamoActionPerformed
        // TODO add your handling code here:
        AmortizarPrestamo form = new AmortizarPrestamo(this, true);
        form.setLocationRelativeTo(null);
        form.setVisible(true);
    }//GEN-LAST:event_amortizarPrestamoActionPerformed

    private void buscarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarBtnActionPerformed
        //Obtener criterio de busqueda
        CriterioBusqueda criterioBusqueda = (CriterioBusqueda) criterioBusquedaCombo.getSelectedItem();
        switch(criterioBusqueda) {
            case APELLIDO:
                break;
            case CEDULA:
                break;
            case NOMBRE:
                break;
            case TELEFONO:
                break;
                
        }
    }//GEN-LAST:event_buscarBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                Application a = new Application();
                a.setLocationRelativeTo(null);
                a.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem actualizarCliente;
    private javax.swing.JMenuItem amortizarPrestamo;
    private javax.swing.JButton buscarBtn;
    private javax.swing.JMenuItem crearCliente;
    private javax.swing.JMenuItem crearPrestamo;
    private javax.swing.JComboBox criterioBusquedaCombo;
    private javax.swing.JTextField criterioTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem realizarPago;
    private javax.swing.JTable resultTable;
    // End of variables declaration//GEN-END:variables
}