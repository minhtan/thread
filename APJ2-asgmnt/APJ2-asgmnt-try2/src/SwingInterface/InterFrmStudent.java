/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package SwingInterface;

/**
 *
 * @author Tan
 */
public class InterFrmStudent extends javax.swing.JInternalFrame {

    /**
     * Creates new form InterFrmStudent
     */
    public InterFrmStudent() {
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

        toolbarStd = new javax.swing.JToolBar();
        btnNew = new javax.swing.JButton();
        btnUpdateDB = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        panelStdCenter = new javax.swing.JPanel();

        toolbarStd.setFloatable(false);
        toolbarStd.setRollover(true);

        btnNew.setText("New");
        btnNew.setFocusable(false);
        btnNew.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNew.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        toolbarStd.add(btnNew);

        btnUpdateDB.setText("UpdateDB");
        btnUpdateDB.setFocusable(false);
        btnUpdateDB.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnUpdateDB.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        toolbarStd.add(btnUpdateDB);

        btnRefresh.setText("Refresh");
        btnRefresh.setFocusable(false);
        btnRefresh.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRefresh.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        toolbarStd.add(btnRefresh);

        btnDelete.setText("Delete");
        btnDelete.setFocusable(false);
        btnDelete.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDelete.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        toolbarStd.add(btnDelete);

        getContentPane().add(toolbarStd, java.awt.BorderLayout.NORTH);

        javax.swing.GroupLayout panelStdCenterLayout = new javax.swing.GroupLayout(panelStdCenter);
        panelStdCenter.setLayout(panelStdCenterLayout);
        panelStdCenterLayout.setHorizontalGroup(
            panelStdCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 394, Short.MAX_VALUE)
        );
        panelStdCenterLayout.setVerticalGroup(
            panelStdCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 255, Short.MAX_VALUE)
        );

        getContentPane().add(panelStdCenter, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnUpdateDB;
    private javax.swing.JPanel panelStdCenter;
    private javax.swing.JToolBar toolbarStd;
    // End of variables declaration//GEN-END:variables
}