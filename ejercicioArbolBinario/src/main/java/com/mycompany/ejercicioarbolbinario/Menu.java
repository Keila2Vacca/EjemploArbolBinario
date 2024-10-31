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
        preOrder = new javax.swing.JButton();
        inOrder = new javax.swing.JButton();
        postOrder = new javax.swing.JButton();

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

        preOrder.setText("PreOrden");
        preOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                preOrderActionPerformed(evt);
            }
        });

        inOrder.setText("InOrder");
        inOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inOrderActionPerformed(evt);
            }
        });

        postOrder.setText("PostOrder");
        postOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                postOrderActionPerformed(evt);
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
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(preOrder)
                            .addComponent(add))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(83, 83, 83)
                                .addComponent(search))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(postOrder)
                                .addGap(43, 43, 43))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(inOrder)))
                .addContainerGap(23, Short.MAX_VALUE))
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
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(preOrder)
                    .addComponent(postOrder))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(inOrder)
                .addGap(79, 79, 79))
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

        if (caracteristica != null) {
            ListaProductos productosSimilares = arbol.buscarProductosSimilares(caracteristica);
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

    private void preOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_preOrderActionPerformed
        arbol.recorrerPreOrden();
    }//GEN-LAST:event_preOrderActionPerformed

    private void inOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inOrderActionPerformed
        arbol.recorrerInOrden();
    }//GEN-LAST:event_inOrderActionPerformed

    private void postOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_postOrderActionPerformed
        arbol.recorrerPostOrden();
    }//GEN-LAST:event_postOrderActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JButton inOrder;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton postOrder;
    private javax.swing.JButton preOrder;
    private javax.swing.JButton search;
    // End of variables declaration//GEN-END:variables
}
