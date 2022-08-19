package com.khauminhduy;

public class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();
        jButton1.setIcon(fontAwesomeIcon1.toIcon());
        jButton2.setIcon(googleMaterialIcon1.toIcon());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fontAwesomeIcon1 = new javaswingdev.FontAwesomeIcon();
        googleMaterialIcon1 = new javaswingdev.GoogleMaterialIcon();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        fontAwesomeIcon1.setGradientType(javaswingdev.GradientType.VERTICAL);
        fontAwesomeIcon1.setIcon(javaswingdev.FontAwesome.BOOK);
        fontAwesomeIcon1.setSize(20);

        googleMaterialIcon1.setColor1(new java.awt.Color(8, 160, 23));
        googleMaterialIcon1.setColor2(new java.awt.Color(184, 168, 25));
        googleMaterialIcon1.setSize(20);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Button");

        jButton2.setText("Button2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(238, 238, 238)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addContainerGap(450, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(312, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> new Main().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javaswingdev.FontAwesomeIcon fontAwesomeIcon1;
    private javaswingdev.GoogleMaterialIcon googleMaterialIcon1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    // End of variables declaration//GEN-END:variables
}
