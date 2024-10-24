
package com.mycompany.arbolbinario;

import javax.swing.JOptionPane;

public class Menu extends javax.swing.JFrame {

    Arbol arbol = new Arbol();
    
    public Menu() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tittle = new javax.swing.JLabel();
        add = new javax.swing.JButton();
        preOrder = new javax.swing.JButton();
        inOrder = new javax.swing.JButton();
        postOrder = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tittle.setText("Ejemplo");

        add.setText("Agregar");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        preOrder.setText("Preorden");
        preOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                preOrderActionPerformed(evt);
            }
        });

        inOrder.setText("Inorden");
        inOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inOrderActionPerformed(evt);
            }
        });

        postOrder.setText("Postorden");
        postOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                postOrderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(tittle))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(add)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(postOrder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(inOrder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(preOrder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(93, 93, 93))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(tittle)
                .addGap(16, 16, 16)
                .addComponent(preOrder)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inOrder)
                    .addComponent(add))
                .addGap(51, 51, 51)
                .addComponent(postOrder)
                .addContainerGap(84, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        arbol.insertar();
    }//GEN-LAST:event_addActionPerformed

    private void preOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_preOrderActionPerformed
        String resultado = arbol.dispararPreorden();
        JOptionPane.showMessageDialog(null, resultado);
    }//GEN-LAST:event_preOrderActionPerformed

    private void inOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inOrderActionPerformed
        String resultado = arbol.dispararInorden();
        JOptionPane.showMessageDialog(null, resultado);
    }//GEN-LAST:event_inOrderActionPerformed

    private void postOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_postOrderActionPerformed
        String resultado = arbol.dispararPostorden();
        JOptionPane.showMessageDialog(null, resultado);
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
    private javax.swing.JButton postOrder;
    private javax.swing.JButton preOrder;
    private javax.swing.JLabel tittle;
    // End of variables declaration//GEN-END:variables
}
