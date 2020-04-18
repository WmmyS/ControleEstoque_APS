/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import DAO.DAO;

/**
 *
 * @author wesle
 */
public class TelaPrincipal extends javax.swing.JFrame {

    DAO conecta = new DAO();
    public TelaPrincipal() {
        initComponents();
        conecta.conexao();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        cadClientes = new javax.swing.JMenuItem();
        cadFornecedores = new javax.swing.JMenuItem();
        cadProdutos = new javax.swing.JMenuItem();
        cadUsuarios = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        consClientes = new javax.swing.JMenuItem();
        consFornecedores = new javax.swing.JMenuItem();
        consProdutos = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        ferramBemVindo = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        sair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("Cadastro");

        cadClientes.setText("Clientes");
        cadClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadClientesActionPerformed(evt);
            }
        });
        jMenu1.add(cadClientes);

        cadFornecedores.setText("Fornecedores");
        jMenu1.add(cadFornecedores);

        cadProdutos.setText("Produtos");
        cadProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadProdutosActionPerformed(evt);
            }
        });
        jMenu1.add(cadProdutos);

        cadUsuarios.setText("Usuários");
        jMenu1.add(cadUsuarios);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Consulta");

        consClientes.setText("Clientes");
        jMenu2.add(consClientes);

        consFornecedores.setText("Fornecedores");
        jMenu2.add(consFornecedores);

        consProdutos.setText("Produtos");
        jMenu2.add(consProdutos);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Ferramentas");

        ferramBemVindo.setText("Bem-Vindo");
        jMenu3.add(ferramBemVindo);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Sair");

        sair.setText("Sair");
        sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairActionPerformed(evt);
            }
        });
        jMenu4.add(sair);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 781, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 444, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cadClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadClientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cadClientesActionPerformed

    private void sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairActionPerformed
        
        System.exit(0);
    }//GEN-LAST:event_sairActionPerformed

    private void cadProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadProdutosActionPerformed
        TelaCadastroProduto regProdScr = new TelaCadastroProduto();
        regProdScr.setVisible(true);
        regProdScr.isFocused();
    }//GEN-LAST:event_cadProdutosActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem cadClientes;
    private javax.swing.JMenuItem cadFornecedores;
    private javax.swing.JMenuItem cadProdutos;
    private javax.swing.JMenuItem cadUsuarios;
    private javax.swing.JMenuItem consClientes;
    private javax.swing.JMenuItem consFornecedores;
    private javax.swing.JMenuItem consProdutos;
    private javax.swing.JMenuItem ferramBemVindo;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem sair;
    // End of variables declaration//GEN-END:variables
}
