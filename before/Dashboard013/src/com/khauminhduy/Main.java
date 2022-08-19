package com.khauminhduy;

import com.formdev.flatlaf.FlatDarculaLaf;
import com.formdev.flatlaf.FlatIntelliJLaf;
import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.extras.FlatAnimatedLafChange;
import com.khauminhduy.form.Form;
import java.awt.Component;
import java.awt.EventQueue;

public class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();
        menu.addEventMenuSelected(new EventMenu() {
            @Override
            public void mainMenuSelected(MainForm mainForm, int index, MenuItem menuItem) {
            }

            @Override
            public void subMenuSelected(MainForm mainForm, int index, int subMenuIndex, Component menuItem) {
                mainForm.displayForm(new Form(String.format("Form %d %d", index, subMenuIndex)));
            }
        });
        menu.setSelectedIndex(0);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menu = new com.khauminhduy.Menu();
        jLabel1 = new javax.swing.JLabel();
        menuItem1 = new com.khauminhduy.MenuItem();
        menuItem2 = new com.khauminhduy.MenuItem();
        menuItem3 = new com.khauminhduy.MenuItem();
        menuItem4 = new com.khauminhduy.MenuItem();
        menuItem5 = new com.khauminhduy.MenuItem();
        subMenuPanel2 = new com.khauminhduy.SubMenuPanel();
        mainForm = new com.khauminhduy.MainForm();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        menuDarkMode = new javax.swing.JCheckBoxMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menu.setMainForm(mainForm);
        menu.setSubMenuPanel(subMenuPanel2);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/khauminhduy/resources/logo.png"))); // NOI18N
        menu.add(jLabel1);

        menuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/khauminhduy/resources/menu1.png"))); // NOI18N
        menuItem1.setText("menuItem1");
        menuItem1.setMenuIcon(new javax.swing.AbstractListModel() {
            String[] strings = { "com/khauminhduy/resources/s1_1.png", "com/khauminhduy/resources/s1_2.png", "com/khauminhduy/resources/s1_3.png", "com/khauminhduy/resources/s1_4.png", "com/khauminhduy/resources/s1_5.png", "com/khauminhduy/resources/s1_6.png", "com/khauminhduy/resources/s1_7.png" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        menuItem1.setMenuModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Typography", "Buttons", "Cards", "Tabs", "Accordions", "Modals", "Lists and Media Objects" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        menu.add(menuItem1);

        menuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/khauminhduy/resources/menu2.png"))); // NOI18N
        menuItem2.setText("menuItem2");
        menuItem2.setMenuIcon(new javax.swing.AbstractListModel() {
            String[] strings = { "com/khauminhduy/resources/s2_1.png", "com/khauminhduy/resources/s2_2.png", "com/khauminhduy/resources/s2_3.png", "com/khauminhduy/resources/s2_4.png", "com/khauminhduy/resources/s2_5.png" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        menuItem2.setMenuModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Grid", "Progress Bars", "Notification & Alerts", "Pagination", "Carousel" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        menu.add(menuItem2);

        menuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/khauminhduy/resources/menu3.png"))); // NOI18N
        menuItem3.setText("menuItem3");
        menuItem3.setMenuIcon(new javax.swing.AbstractListModel() {
            String[] strings = { "com/khauminhduy/resources/s3_1.png", "com/khauminhduy/resources/s3_2.png", "com/khauminhduy/resources/s3_3.png" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        menuItem3.setMenuModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Charts", "Morris", "Flot" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        menu.add(menuItem3);

        menuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/khauminhduy/resources/menu4.png"))); // NOI18N
        menuItem4.setText("menuItem4");
        menuItem4.setMenuIcon(new javax.swing.AbstractListModel() {
            String[] strings = { "com/khauminhduy/resources/s4_1.png", "com/khauminhduy/resources/s4_2.png", "com/khauminhduy/resources/s4_3.png", " " };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        menuItem4.setMenuModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Maps", "Google Maps", "Vector Maps" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        menu.add(menuItem4);

        menuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/khauminhduy/resources/menu5.png"))); // NOI18N
        menuItem5.setText("menuItem5");
        menu.add(menuItem5);

        subMenuPanel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(80, 1, 1, 1));

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Options");

        menuDarkMode.setText("Dark Mode");
        menuDarkMode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuDarkModeActionPerformed(evt);
            }
        });
        jMenu3.add(menuDarkMode);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(subMenuPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(mainForm, javax.swing.GroupLayout.DEFAULT_SIZE, 601, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, 557, Short.MAX_VALUE)
            .addComponent(subMenuPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(mainForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuDarkModeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuDarkModeActionPerformed
        if(menuDarkMode.isSelected()) {
            EventQueue.invokeLater(() -> {
                FlatAnimatedLafChange.showSnapshot();
                FlatDarculaLaf.setup();
                FlatLaf.updateUI();
                FlatAnimatedLafChange.hideSnapshotWithAnimation();
            });
        } else {
            EventQueue.invokeLater(() -> {
                FlatAnimatedLafChange.showSnapshot();
                FlatIntelliJLaf.setup();
                FlatLaf.updateUI();
                FlatAnimatedLafChange.hideSnapshotWithAnimation();
            });
        }
    }//GEN-LAST:event_menuDarkModeActionPerformed

    public static void main(String args[]) {
        FlatIntelliJLaf.setup();
        java.awt.EventQueue.invokeLater(() -> new Main().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private com.khauminhduy.MainForm mainForm;
    private com.khauminhduy.Menu menu;
    private javax.swing.JCheckBoxMenuItem menuDarkMode;
    private com.khauminhduy.MenuItem menuItem1;
    private com.khauminhduy.MenuItem menuItem2;
    private com.khauminhduy.MenuItem menuItem3;
    private com.khauminhduy.MenuItem menuItem4;
    private com.khauminhduy.MenuItem menuItem5;
    private com.khauminhduy.SubMenuPanel subMenuPanel2;
    // End of variables declaration//GEN-END:variables
}
