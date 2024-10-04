/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package conexao;

/**
 *
 * @author laboratorio
 */
public class MenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
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

        jMenuBar1 = new javax.swing.JMenuBar();
        menuArquivo = new javax.swing.JMenu();
        menuItemSair = new javax.swing.JMenuItem();
        CadastraPessoa = new javax.swing.JMenu();
        menuCadPessoa = new javax.swing.JMenuItem();
        menuItemEditar = new javax.swing.JMenuItem();
        menuRelatorio = new javax.swing.JMenu();
        menuItemRelatorio = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menuArquivo.setText("Arquivo");

        menuItemSair.setText("Sair");
        menuItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemSairActionPerformed(evt);
            }
        });
        menuArquivo.add(menuItemSair);

        jMenuBar1.add(menuArquivo);

        CadastraPessoa.setText("Cadastro");
        CadastraPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastraPessoaActionPerformed(evt);
            }
        });

        menuCadPessoa.setText("Cadastro de Pessoas");
        menuCadPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadPessoaActionPerformed(evt);
            }
        });
        CadastraPessoa.add(menuCadPessoa);

        menuItemEditar.setText("Editar e Excluir Pessoas");
        menuItemEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemEditarActionPerformed(evt);
            }
        });
        CadastraPessoa.add(menuItemEditar);

        jMenuBar1.add(CadastraPessoa);

        menuRelatorio.setText("Relatório");

        menuItemRelatorio.setText("Relatório de Pessoas");
        menuItemRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemRelatorioActionPerformed(evt);
            }
        });
        menuRelatorio.add(menuItemRelatorio);

        jMenuBar1.add(menuRelatorio);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 584, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 379, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuCadPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadPessoaActionPerformed
        Interface cadPessoa = new Interface();
        cadPessoa.setVisible(true);
    }//GEN-LAST:event_menuCadPessoaActionPerformed

    private void CadastraPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastraPessoaActionPerformed

    }//GEN-LAST:event_CadastraPessoaActionPerformed

    private void menuItemEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemEditarActionPerformed
        InterfaceConsulta consulta = new InterfaceConsulta();
        consulta.setVisible(true);
    }//GEN-LAST:event_menuItemEditarActionPerformed

    private void menuItemRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemRelatorioActionPerformed
        RelatorioPessoas relatorio = new RelatorioPessoas();
        relatorio.setVisible(true);
    }//GEN-LAST:event_menuItemRelatorioActionPerformed

    private void menuItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemSairActionPerformed
        // this.dispose(); - fecha a tela
        System.exit(0);
    }//GEN-LAST:event_menuItemSairActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu CadastraPessoa;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu menuArquivo;
    private javax.swing.JMenuItem menuCadPessoa;
    private javax.swing.JMenuItem menuItemEditar;
    private javax.swing.JMenuItem menuItemRelatorio;
    private javax.swing.JMenuItem menuItemSair;
    private javax.swing.JMenu menuRelatorio;
    // End of variables declaration//GEN-END:variables
}