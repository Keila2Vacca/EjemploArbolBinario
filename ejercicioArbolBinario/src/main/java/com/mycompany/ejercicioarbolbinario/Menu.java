package com.mycompany.ejercicioarbolbinario;

import javax.swing.JOptionPane;

public class Menu extends javax.swing.JFrame {

    EjercicioArbolBinario arbol = new EjercicioArbolBinario();

    public Menu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        add = new javax.swing.JButton();
        search = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Empresa de comercio electrónico");

        add.setText("Agregar");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        search.setText("Buscar productos similares");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(add)
                        .addGap(83, 83, 83)
                        .addComponent(search)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add)
                    .addComponent(search))
                .addContainerGap(198, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        String caracteristica = JOptionPane.showInputDialog(this, "Ingrese la característica:");
        String valor = JOptionPane.showInputDialog(this, "Ingrese el valor:");
        String nombreProducto = JOptionPane.showInputDialog(this, "Ingrese el nombre del producto:");
        String descripcionProducto = JOptionPane.showInputDialog(this, "Ingrese la descripción del producto:");

        if (caracteristica != null && valor != null && nombreProducto != null && descripcionProducto != null) {
            NodoProducto producto = new NodoProducto(nombreProducto, descripcionProducto);
            arbol.insertar(caracteristica, valor, producto);
            JOptionPane.showMessageDialog(this, "Producto insertado: " + nombreProducto);
        } else {
            JOptionPane.showMessageDialog(this, "Inserción cancelada.");
        }
    }//GEN-LAST:event_addActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        String caracteristica = JOptionPane.showInputDialog(this, "Ingrese la característica para buscar:");
        String valor = JOptionPane.showInputDialog(this, "Ingrese el valor para buscar:");

        if (caracteristica != null && valor != null) {
            ListaProductos productosSimilares = arbol.buscarProductosSimilares(caracteristica, valor);
            if (productosSimilares != null && productosSimilares.getTamaño() > 0) {
                StringBuilder resultado = new StringBuilder("Productos encontrados:\n");
                for (NodoProducto producto : productosSimilares.getProductos()) {
                    if (producto != null) {
                        resultado.append(producto.getNombre()).append(": ").append(producto.getDescripcion()).append("\n");
                    }
                }
                JOptionPane.showMessageDialog(this, resultado.toString());
            } else {
                JOptionPane.showMessageDialog(this, "No se encontraron productos.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Búsqueda cancelada.");
        }
    }//GEN-LAST:event_searchActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton search;
    // End of variables declaration//GEN-END:variables
}
