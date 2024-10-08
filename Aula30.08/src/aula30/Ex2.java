/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package aula30;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author laboratorio
 */
public class Ex2 extends javax.swing.JFrame {

    char sexo;
    boolean tecnologia, esportes, astronomia;

    /**
     * Creates new form Ex2
     */
    public Ex2() {
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

        btnGrp_Sexo = new javax.swing.ButtonGroup();
        rdoMasculino = new javax.swing.JRadioButton();
        rdoFeminino = new javax.swing.JRadioButton();
        lblNome = new javax.swing.JLabel();
        lblSexo = new javax.swing.JLabel();
        txaTexto = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        rdoBoyceta = new javax.swing.JRadioButton();
        lblInteresses = new javax.swing.JLabel();
        chkTecnologia = new javax.swing.JCheckBox();
        chkEsportes = new javax.swing.JCheckBox();
        chkAstronomia = new javax.swing.JCheckBox();
        cmbIdioma = new javax.swing.JComboBox<>();
        lblIdioma = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPessoas = new javax.swing.JTable();
        btnLimpar = new javax.swing.JButton();
        btnLimparTabela = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnGrp_Sexo.add(rdoMasculino);
        rdoMasculino.setText("Masculino");
        rdoMasculino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoMasculinoActionPerformed(evt);
            }
        });

        btnGrp_Sexo.add(rdoFeminino);
        rdoFeminino.setText("Feminino");
        rdoFeminino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoFemininoActionPerformed(evt);
            }
        });

        lblNome.setText("Nome:");

        lblSexo.setText("Sexo:");

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnGrp_Sexo.add(rdoBoyceta);
        rdoBoyceta.setText("Boyceta");
        rdoBoyceta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoBoycetaActionPerformed(evt);
            }
        });

        lblInteresses.setText("Interesses:");

        chkTecnologia.setText("Tecnologia");

        chkEsportes.setText("Esportes");

        chkAstronomia.setText("Astronomia");

        cmbIdioma.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Espanhol", "Inglês", "Português" }));

        lblIdioma.setText("Idioma:");

        tblPessoas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Sexo", "Idioma"
            }
        ));
        jScrollPane1.setViewportView(tblPessoas);

        btnLimpar.setBackground(new java.awt.Color(51, 51, 51));
        btnLimpar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnLimpar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        btnLimparTabela.setBackground(new java.awt.Color(51, 51, 51));
        btnLimparTabela.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnLimparTabela.setForeground(new java.awt.Color(255, 255, 255));
        btnLimparTabela.setText("Limpar Tabela");
        btnLimparTabela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparTabelaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNome)
                            .addComponent(lblSexo)
                            .addComponent(lblInteresses)
                            .addComponent(lblIdioma))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(rdoMasculino)
                                        .addComponent(chkTecnologia))
                                    .addGap(29, 29, 29)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(chkAstronomia)
                                        .addComponent(rdoFeminino)
                                        .addComponent(btnSalvar))
                                    .addGap(24, 24, 24)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(rdoBoyceta, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(chkEsportes)))
                                .addComponent(txaTexto))
                            .addComponent(cmbIdioma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnLimpar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnLimparTabela))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(txaTexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSexo)
                    .addComponent(rdoMasculino)
                    .addComponent(rdoFeminino)
                    .addComponent(rdoBoyceta))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblInteresses)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(chkTecnologia)
                        .addComponent(chkEsportes)
                        .addComponent(chkAstronomia)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbIdioma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIdioma))
                .addGap(17, 17, 17)
                .addComponent(btnSalvar)
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpar)
                    .addComponent(btnLimparTabela))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rdoMasculinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoMasculinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdoMasculinoActionPerformed

    private void rdoFemininoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoFemininoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdoFemininoActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if(rdoMasculino.isSelected()) {
            sexo = 'M';
           //  JOptionPane.showMessageDialog(null, "Sexo selecionado: "+sexo, "Alerta!", JOptionPane.OK_OPTION);
        }
        else if(rdoFeminino.isSelected()) {
            sexo = 'F';
            // JOptionPane.showMessageDialog(null, "Sexo selecionado: "+sexo, "Alerta!", JOptionPane.OK_OPTION);
        }
        else if(rdoBoyceta.isSelected()) {
            sexo = 'B';
           //  JOptionPane.showMessageDialog(null, "Sexo selecionado: "+sexo, "Alerta!", JOptionPane.OK_OPTION);
        }
        else {
            JOptionPane.showMessageDialog(null, "Selecione um sexo", "Erro!", JOptionPane.ERROR_MESSAGE);
        }
        if(chkTecnologia.isSelected()) {
            tecnologia = true;
        }
        
        else {
            tecnologia = false;
        }
        if(chkAstronomia.isSelected()) {
            astronomia = true;
        }
        else {
            astronomia = false;
        }
        if(chkEsportes.isSelected()) {
            esportes = true;
        }
        else {
            esportes = false;
        }
        
        tecnologia = chkTecnologia.isSelected();
        astronomia = chkAstronomia.isSelected();
        esportes = chkEsportes.isSelected();
        
        // JOptionPane.showMessageDialog(null, "Tecnlogia: "+tecnologia+"\nAstronomia: "+astronomia+"\nEsportes: "+esportes, "Alerta!", JOptionPane.INFORMATION_MESSAGE);
        
        // JOptionPane.showMessageDialog(null, "Idioma selecionado: "+cmbIdioma.getSelectedItem(), "Alerta!", JOptionPane.INFORMATION_MESSAGE);
        
        Pessoa p = new Pessoa (txaTexto.getText(), sexo, (String) cmbIdioma.getSelectedItem());
        
        DefaultTableModel tabela = (DefaultTableModel) tblPessoas.getModel();
        tabela.addRow(p.obterDados());
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void rdoBoycetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoBoycetaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdoBoycetaActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        txaTexto.setText("");
        btnGrp_Sexo.clearSelection();
        chkTecnologia.setSelected(false);
        chkAstronomia.setSelected(false);
        chkEsportes.setSelected(false);
        cmbIdioma.setSelectedIndex(0);
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnLimparTabelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparTabelaActionPerformed
        tblPessoas.clearSelection();
        DefaultTableModel tabela = (DefaultTableModel) tblPessoas.getModel();
        tabela.setRowCount(0);
    }//GEN-LAST:event_btnLimparTabelaActionPerformed

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
            java.util.logging.Logger.getLogger(Ex2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ex2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ex2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ex2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ex2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btnGrp_Sexo;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnLimparTabela;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JCheckBox chkAstronomia;
    private javax.swing.JCheckBox chkEsportes;
    private javax.swing.JCheckBox chkTecnologia;
    private javax.swing.JComboBox<String> cmbIdioma;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblIdioma;
    private javax.swing.JLabel lblInteresses;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblSexo;
    private javax.swing.JRadioButton rdoBoyceta;
    private javax.swing.JRadioButton rdoFeminino;
    private javax.swing.JRadioButton rdoMasculino;
    private javax.swing.JTable tblPessoas;
    private javax.swing.JTextField txaTexto;
    // End of variables declaration//GEN-END:variables
}
