/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ozen;

/**
 *
 * @author bruno
 */
public class TelaUEC extends javax.swing.JFrame {

    /**
     * Creates new form TelaUEC
     */
    Lutador[] l = new Lutador[6];
    static int selecionado1, selecionado2;
    Luta luta;
    public TelaUEC() {
        initComponents();
        lblVenceu1.setVisible(false);
        lblVenceu2.setVisible(false);
        lblEmpatou.setVisible(false);
        luta = new Luta();
        l[0] = new Lutador("Pretty Boy", "França", 31, 1.75, 68.9, 11, 3, 1);
        l[1] = new Lutador("Putscript", "Brasil", 29, 1.68, 57.8, 14, 2, 3);
        l[2] = new Lutador("Snapshadow", "EUA", 35, 1.65, 80.9, 12, 2, 1);
        l[3] = new Lutador("Dead Code", "Austrália", 28, 1.93, 81.6, 13, 0, 2);
        l[4] = new Lutador("UFOCobol", "Brasil", 37, 1.70, 119.3, 5, 4, 3);
        l[5] = new Lutador("Nerdaart", "EUA", 30, 1.81, 105.7, 12, 2, 4);
        for(int i = 0; i<l.length; i++){
            comboLutador1.addItem(l[i].getNome());
            comboLutador2.addItem(l[i].getNome());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        comboLutador1 = new javax.swing.JComboBox<>();
        lblCategoria1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblDerrotas2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblNome1 = new javax.swing.JLabel();
        lblIdade1 = new javax.swing.JLabel();
        lblNacionalidade1 = new javax.swing.JLabel();
        lblAltura1 = new javax.swing.JLabel();
        lblPeso1 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        comboLutador2 = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        lblNome2 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        lblIdade2 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        lblNacionalidade2 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        lblAltura2 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        lblPeso2 = new javax.swing.JLabel();
        lblCategoria2 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        btnLutar = new javax.swing.JButton();
        btnMarcar = new javax.swing.JButton();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        lblVenceu2 = new javax.swing.JLabel();
        lblVitorias1 = new javax.swing.JLabel();
        lblVitorias2 = new javax.swing.JLabel();
        lblEmpates1 = new javax.swing.JLabel();
        lblEmpates2 = new javax.swing.JLabel();
        lblDerrotas1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lblVenceu1 = new javax.swing.JLabel();
        lblEmpatou = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        comboLutador1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboLutador1ItemStateChanged(evt);
            }
        });
        getContentPane().add(comboLutador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 70, -1));

        lblCategoria1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblCategoria1.setText("[  ]");
        getContentPane().add(lblCategoria1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, -1, 20));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 0));
        jLabel2.setText("Derrotas:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, -1));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel3.setText("Idade:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel4.setText("Nacionalidade:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel5.setText("Altura:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel6.setText("Peso:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel7.setText("Categoria:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        lblDerrotas2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblDerrotas2.setForeground(new java.awt.Color(102, 0, 0));
        lblDerrotas2.setText("[   ] ");
        getContentPane().add(lblDerrotas2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 260, -1, -1));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 153));
        jLabel9.setText("Empates:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, -1));

        jLabel10.setFont(new java.awt.Font("Century Gothic", 3, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 0, 51));
        jLabel10.setText("VS");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, -1, -1));

        lblNome1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblNome1.setText("[  ]");
        getContentPane().add(lblNome1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, -1, 20));

        lblIdade1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblIdade1.setText("[  ]");
        getContentPane().add(lblIdade1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, -1, 20));

        lblNacionalidade1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblNacionalidade1.setText("[  ]");
        getContentPane().add(lblNacionalidade1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, -1, 20));

        lblAltura1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblAltura1.setText("[  ]");
        getContentPane().add(lblAltura1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, -1, 20));

        lblPeso1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblPeso1.setText("[  ]");
        getContentPane().add(lblPeso1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, -1, 20));

        jLabel16.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel16.setText("LUTADOR 2:");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, -1, -1));

        comboLutador2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboLutador2ItemStateChanged(evt);
            }
        });
        getContentPane().add(comboLutador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, 70, -1));

        jLabel17.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel17.setText("OPÇÕES");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 200, -1, -1));

        lblNome2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblNome2.setText("[  ]");
        getContentPane().add(lblNome2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, -1, 20));

        jLabel19.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel19.setText("Idade:");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, -1, -1));

        lblIdade2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblIdade2.setText("[  ]");
        getContentPane().add(lblIdade2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, -1, 20));

        jLabel21.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel21.setText("Nacionalidade:");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, -1, -1));

        lblNacionalidade2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblNacionalidade2.setText("[  ]");
        getContentPane().add(lblNacionalidade2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, -1, 20));

        jLabel23.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel23.setText("Altura:");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, -1, -1));

        lblAltura2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblAltura2.setText("[  ]");
        getContentPane().add(lblAltura2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, -1, 20));

        jLabel25.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel25.setText("Peso:");
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, -1, -1));

        lblPeso2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblPeso2.setText("[  ]");
        getContentPane().add(lblPeso2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, -1, 20));

        lblCategoria2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblCategoria2.setText("[  ]");
        getContentPane().add(lblCategoria2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 180, -1, 20));

        jLabel28.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel28.setText("Categoria:");
        getContentPane().add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, -1, -1));

        jLabel29.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(51, 204, 0));
        jLabel29.setText("Vitórias:");
        getContentPane().add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, -1, -1));

        jLabel30.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(0, 102, 153));
        jLabel30.setText("Empates:");
        getContentPane().add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, -1, -1));

        jLabel31.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(153, 0, 0));
        jLabel31.setText("Derrotas:");
        getContentPane().add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 260, -1, -1));

        jLabel32.setFont(new java.awt.Font("Tarzan", 1, 24)); // NOI18N
        jLabel32.setText("ULTRA EMOJI COMBAT");
        getContentPane().add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, -1));

        btnLutar.setText("Lutar");
        btnLutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLutarActionPerformed(evt);
            }
        });
        getContentPane().add(btnLutar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 260, 90, -1));

        btnMarcar.setText("Marcar luta");
        btnMarcar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMarcarActionPerformed(evt);
            }
        });
        getContentPane().add(btnMarcar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 230, 90, -1));

        jLabel33.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel33.setText("Nome:");
        getContentPane().add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, -1, -1));

        jLabel34.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel34.setText("Nome:");
        getContentPane().add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 82, -1, -1));

        jLabel35.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel35.setText("LUTADOR 1:");
        getContentPane().add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

        lblVenceu2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lblVenceu2.setForeground(new java.awt.Color(51, 255, 0));
        lblVenceu2.setText("--- VENCEU!! ---");
        getContentPane().add(lblVenceu2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, -1, -1));

        lblVitorias1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblVitorias1.setForeground(new java.awt.Color(0, 102, 51));
        lblVitorias1.setText("[   ] ");
        getContentPane().add(lblVitorias1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, -1, -1));

        lblVitorias2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblVitorias2.setForeground(new java.awt.Color(0, 102, 51));
        lblVitorias2.setText("[   ] ");
        getContentPane().add(lblVitorias2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 220, -1, -1));

        lblEmpates1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblEmpates1.setForeground(new java.awt.Color(0, 51, 102));
        lblEmpates1.setText("[   ] ");
        getContentPane().add(lblEmpates1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, -1, -1));

        lblEmpates2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblEmpates2.setForeground(new java.awt.Color(0, 51, 102));
        lblEmpates2.setText("[   ] ");
        getContentPane().add(lblEmpates2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 240, -1, -1));

        lblDerrotas1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lblDerrotas1.setForeground(new java.awt.Color(102, 0, 0));
        lblDerrotas1.setText("[   ] ");
        getContentPane().add(lblDerrotas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, -1, -1));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI", 2, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("By Bruno Özen");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, -1));

        jLabel12.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 204, 0));
        jLabel12.setText("Vitórias:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        lblVenceu1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lblVenceu1.setForeground(new java.awt.Color(102, 255, 0));
        lblVenceu1.setText("--- VENCEU!! ---");
        getContentPane().add(lblVenceu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        lblEmpatou.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lblEmpatou.setForeground(new java.awt.Color(153, 153, 0));
        lblEmpatou.setText("--- EMPATOU ---");
        getContentPane().add(lblEmpatou, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboLutador1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboLutador1ItemStateChanged

        selecionado1 = comboLutador1.getSelectedIndex();
        lblNome1.setText(l[selecionado1].getNome());
        lblNacionalidade1.setText(l[selecionado1].getNacionalidade());
        lblIdade1.setText(Integer.toString(l[selecionado1].getIdade()));
        lblAltura1.setText(Double.toString(l[selecionado1].getAltura()));
        lblPeso1.setText(Double.toString(l[selecionado1].getPeso()));
        lblCategoria1.setText(l[selecionado1].getCategoria());
        lblVitorias1.setText(Integer.toString(l[selecionado1].getVitorias()));
        lblEmpates1.setText(Integer.toString(l[selecionado1].getEmpates()));
        lblDerrotas1.setText(Integer.toString(l[selecionado1].getDerrotas()));
    }//GEN-LAST:event_comboLutador1ItemStateChanged

    private void comboLutador2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboLutador2ItemStateChanged
        // TODO add your handling code here:
        selecionado2 = comboLutador2.getSelectedIndex();
        lblNome2.setText(l[selecionado2].getNome());
        lblNacionalidade2.setText(l[selecionado2].getNacionalidade());
        lblIdade2.setText(Integer.toString(l[selecionado2].getIdade()));
        lblAltura2.setText(Double.toString(l[selecionado2].getAltura()));
        lblPeso2.setText(Double.toString(l[selecionado2].getPeso()));
        lblCategoria2.setText(l[selecionado2].getCategoria());
        lblVitorias2.setText(Integer.toString(l[selecionado2].getVitorias()));
        lblEmpates2.setText(Integer.toString(l[selecionado2].getEmpates()));
        lblDerrotas2.setText(Integer.toString(l[selecionado2].getDerrotas()));
    }//GEN-LAST:event_comboLutador2ItemStateChanged

    private void btnMarcarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMarcarActionPerformed
        // TODO add your handling code here:
        luta.marcarLuta(l[selecionado1], l[selecionado2]);
    }//GEN-LAST:event_btnMarcarActionPerformed

    private void btnLutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLutarActionPerformed
        // TODO add your handling code here:
        luta.lutar();
        switch(luta.getVencedor()){
            case 0:
                lblEmpatou.setVisible(false);
                lblVenceu1.setVisible(true);
                lblVenceu2.setVisible(false);
                break;
            case 1:
                lblEmpatou.setVisible(false);
                lblVenceu1.setVisible(false);
                lblVenceu2.setVisible(true);
                break;
            case 2:
                lblEmpatou.setVisible(true);
                lblVenceu1.setVisible(false);
                lblVenceu2.setVisible(false);
                break;
        }
        lblVitorias1.setText(Integer.toString(l[selecionado1].getVitorias()));
        lblEmpates1.setText(Integer.toString(l[selecionado1].getEmpates()));
        lblDerrotas1.setText(Integer.toString(l[selecionado1].getDerrotas()));
        lblVitorias2.setText(Integer.toString(l[selecionado2].getVitorias()));
        lblEmpates2.setText(Integer.toString(l[selecionado2].getEmpates()));
        lblDerrotas2.setText(Integer.toString(l[selecionado2].getDerrotas()));
    }//GEN-LAST:event_btnLutarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaUEC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaUEC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaUEC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaUEC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaUEC().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLutar;
    private javax.swing.JButton btnMarcar;
    private javax.swing.JComboBox<String> comboLutador1;
    private javax.swing.JComboBox<String> comboLutador2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblAltura1;
    private javax.swing.JLabel lblAltura2;
    private javax.swing.JLabel lblCategoria1;
    private javax.swing.JLabel lblCategoria2;
    private javax.swing.JLabel lblDerrotas1;
    private javax.swing.JLabel lblDerrotas2;
    private javax.swing.JLabel lblEmpates1;
    private javax.swing.JLabel lblEmpates2;
    private javax.swing.JLabel lblEmpatou;
    private javax.swing.JLabel lblIdade1;
    private javax.swing.JLabel lblIdade2;
    private javax.swing.JLabel lblNacionalidade1;
    private javax.swing.JLabel lblNacionalidade2;
    private javax.swing.JLabel lblNome1;
    private javax.swing.JLabel lblNome2;
    private javax.swing.JLabel lblPeso1;
    private javax.swing.JLabel lblPeso2;
    private javax.swing.JLabel lblVenceu1;
    private javax.swing.JLabel lblVenceu2;
    private javax.swing.JLabel lblVitorias1;
    private javax.swing.JLabel lblVitorias2;
    // End of variables declaration//GEN-END:variables
}