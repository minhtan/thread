/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SwingInterface;

import DatabaseLayer.DbAccess;
import DatabaseLayer.DbQuery;
import Manager.StudentManager;
import Model.Student;
import Model.StudentTableModel;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.*;
import javax.swing.JScrollPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author Tan
 */
public class MainFrame extends javax.swing.JFrame {

    private StudentManager stdMng;
    private JScrollPane stdScrlPane;
    private StudentTable stdTbl;
    private StudentTableModel stdTblMdl;
    private DbAccess dbAccess;

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
        this.dbAccess = null;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        paneCenter = new javax.swing.JPanel();
        desktopPane = new javax.swing.JDesktopPane();
        interFrmStudent = new javax.swing.JInternalFrame();
        toolbarStd = new javax.swing.JToolBar();
        btnNew = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        panelStdCenter = new javax.swing.JPanel();
        panelStdBottom = new javax.swing.JPanel();
        panelStdBottomTop = new javax.swing.JPanel();
        lblStdInfo = new javax.swing.JLabel();
        panelStdInfo1 = new javax.swing.JPanel();
        lblStdInfoId = new javax.swing.JLabel();
        txtStdInfoId = new javax.swing.JTextField();
        lblStdInfoName = new javax.swing.JLabel();
        txtStdInfoName = new javax.swing.JTextField();
        lblStdAddress = new javax.swing.JLabel();
        txtStdInfoAddress = new javax.swing.JTextField();
        lblStdInfoTel = new javax.swing.JLabel();
        txtStdInfoTel = new javax.swing.JTextField();
        lblStdInfoDoB = new javax.swing.JLabel();
        ftxtStdInfoDoB = new javax.swing.JFormattedTextField();
        lblStdInfoSex = new javax.swing.JLabel();
        cbbStdInfoSex = new javax.swing.JComboBox();
        panelStdInfo2 = new javax.swing.JPanel();
        panelStdBtn = new javax.swing.JPanel();
        btnSave = new javax.swing.JButton();
        btnDiscard = new javax.swing.JButton();
        mainBar = new javax.swing.JMenuBar();
        menuOption = new javax.swing.JMenu();
        menuOptionConnect = new javax.swing.JMenuItem();
        menuOptionExit = new javax.swing.JMenuItem();
        menuManage = new javax.swing.JMenu();
        menuManageStd = new javax.swing.JMenuItem();
        menuManageCrs = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        paneCenter.setLayout(new java.awt.BorderLayout());

        interFrmStudent.setClosable(true);
        interFrmStudent.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        interFrmStudent.setIconifiable(true);
        interFrmStudent.setMaximizable(true);
        interFrmStudent.setVisible(true);

        toolbarStd.setFloatable(false);
        toolbarStd.setRollover(true);

        btnNew.setText("New");
        btnNew.setFocusable(false);
        btnNew.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNew.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });
        toolbarStd.add(btnNew);

        btnRefresh.setText("Refresh");
        btnRefresh.setFocusable(false);
        btnRefresh.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRefresh.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });
        toolbarStd.add(btnRefresh);

        btnDelete.setText("Delete");
        btnDelete.setFocusable(false);
        btnDelete.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDelete.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        toolbarStd.add(btnDelete);

        interFrmStudent.getContentPane().add(toolbarStd, java.awt.BorderLayout.NORTH);

        panelStdCenter.setLayout(new java.awt.BorderLayout());
        interFrmStudent.getContentPane().add(panelStdCenter, java.awt.BorderLayout.CENTER);

        panelStdBottom.setLayout(new java.awt.BorderLayout());

        panelStdBottomTop.setLayout(new java.awt.BorderLayout());

        lblStdInfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblStdInfo.setText("Student Infomation");
        panelStdBottomTop.add(lblStdInfo, java.awt.BorderLayout.NORTH);

        panelStdInfo1.setMinimumSize(new java.awt.Dimension(732, 30));
        panelStdInfo1.setPreferredSize(new java.awt.Dimension(384, 30));
        panelStdInfo1.setLayout(new java.awt.GridLayout(1, 6));

        lblStdInfoId.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblStdInfoId.setText("ID");
        panelStdInfo1.add(lblStdInfoId);

        txtStdInfoId.setEditable(false);
        panelStdInfo1.add(txtStdInfoId);

        lblStdInfoName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblStdInfoName.setText("Name");
        panelStdInfo1.add(lblStdInfoName);
        panelStdInfo1.add(txtStdInfoName);

        lblStdAddress.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblStdAddress.setText("Address");
        panelStdInfo1.add(lblStdAddress);
        panelStdInfo1.add(txtStdInfoAddress);

        lblStdInfoTel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblStdInfoTel.setText("Tel");
        panelStdInfo1.add(lblStdInfoTel);
        panelStdInfo1.add(txtStdInfoTel);

        lblStdInfoDoB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblStdInfoDoB.setText("Date of birth");
        panelStdInfo1.add(lblStdInfoDoB);

        ftxtStdInfoDoB.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("YYYY-MM-dd"))));
        ftxtStdInfoDoB.setToolTipText("this input must be in YYYY-MM-DDDD format");
        ftxtStdInfoDoB.setFocusLostBehavior(javax.swing.JFormattedTextField.COMMIT);
        panelStdInfo1.add(ftxtStdInfoDoB);

        lblStdInfoSex.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblStdInfoSex.setText("Sex");
        panelStdInfo1.add(lblStdInfoSex);

        cbbStdInfoSex.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "---", "Male", "Female" }));
        panelStdInfo1.add(cbbStdInfoSex);

        panelStdBottomTop.add(panelStdInfo1, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout panelStdInfo2Layout = new javax.swing.GroupLayout(panelStdInfo2);
        panelStdInfo2.setLayout(panelStdInfo2Layout);
        panelStdInfo2Layout.setHorizontalGroup(
            panelStdInfo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1057, Short.MAX_VALUE)
        );
        panelStdInfo2Layout.setVerticalGroup(
            panelStdInfo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 143, Short.MAX_VALUE)
        );

        panelStdBottomTop.add(panelStdInfo2, java.awt.BorderLayout.SOUTH);

        panelStdBottom.add(panelStdBottomTop, java.awt.BorderLayout.NORTH);

        btnSave.setText("Save");
        btnSave.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        panelStdBtn.add(btnSave);

        btnDiscard.setText("Discard");
        btnDiscard.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDiscard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiscardActionPerformed(evt);
            }
        });
        panelStdBtn.add(btnDiscard);

        panelStdBottom.add(panelStdBtn, java.awt.BorderLayout.SOUTH);

        interFrmStudent.getContentPane().add(panelStdBottom, java.awt.BorderLayout.SOUTH);

        desktopPane.add(interFrmStudent);
        interFrmStudent.setBounds(0, 0, 400, 300);
        try {
            interFrmStudent.setMaximum(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }

        paneCenter.add(desktopPane, java.awt.BorderLayout.CENTER);

        getContentPane().add(paneCenter, java.awt.BorderLayout.CENTER);

        menuOption.setText("Option");

        menuOptionConnect.setText("Connect");
        menuOptionConnect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuOptionConnectActionPerformed(evt);
            }
        });
        menuOption.add(menuOptionConnect);

        menuOptionExit.setText("Exit");
        menuOptionExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuOptionExitActionPerformed(evt);
            }
        });
        menuOption.add(menuOptionExit);

        mainBar.add(menuOption);

        menuManage.setText("Manage");

        menuManageStd.setText("Student");
        menuManageStd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuManageStdActionPerformed(evt);
            }
        });
        menuManage.add(menuManageStd);

        menuManageCrs.setText("Course");
        menuManage.add(menuManageCrs);

        mainBar.add(menuManage);

        setJMenuBar(mainBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuOptionConnectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuOptionConnectActionPerformed
        // TODO add your handling code here:
        DBInfoForm dialog = new DBInfoForm(this, true);
        if (dialog.getSignal()) {
            try {
                this.dbAccess = new DbAccess(
                        dialog.getTxtUserName(),
                        dialog.getTxtPsw(),
                        dialog.getTxtServer()
                );
                Connection conn = this.dbAccess.getConnection();
                conn.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(this, "Unable to connect to database.");
            }
        }
    }//GEN-LAST:event_menuOptionConnectActionPerformed

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        // TODO add your handling code here:
        int newID = this.stdMng.getLastId()+1;
        Student std = new Student(newID, "New student", null, null, null, 0);

        this.updateStudentInfo(std);
        this.txtStdInfoName.requestFocus();
    }//GEN-LAST:event_btnNewActionPerformed

    private void menuOptionExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuOptionExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_menuOptionExitActionPerformed

    private void studentTableRowChange(ListSelectionEvent event) {
        try{
            int selectedRow = this.stdTbl.getSelectedRow();
            Student std = this.stdMng.getStudent(selectedRow);

            this.updateStudentInfo(std);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("selected row: " + this.stdTbl.getSelectedRow());
//            e.printStackTrace();
        }
    }
    
    private void updateStudentInfo(Student std){
        this.txtStdInfoId.setText(String.valueOf(std.getId()));
        this.txtStdInfoName.setText(std.getName());
        this.txtStdInfoAddress.setText(std.getAddress());
        this.txtStdInfoTel.setText(std.getTelNo());

        if (std.getDob() != null) {
            this.ftxtStdInfoDoB.setText(std.getDob());
        } else {
            this.ftxtStdInfoDoB.setText("");
        }
        
        this.cbbStdInfoSex.setSelectedIndex(std.getSex());

    }
    
    private void menuManageStdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuManageStdActionPerformed
        if (this.dbAccess != null) {
            if (this.interFrmStudent.isVisible() == false && this.stdMng == null) {
                try {
                    // TODO add your handling code here:
                    DbQuery dbQuery = new DbQuery(this.dbAccess);
                    ResultSet rs = dbQuery.selectFrom("Students");

                    this.stdMng = new StudentManager(rs);
                    this.stdTblMdl = new StudentTableModel(
                            this.stdMng.listStudent(),
                            this.stdMng.getStudentProperties()
                    );
                    this.stdTbl = new StudentTable(this.stdTblMdl);
                    this.stdTbl.getTableHeader().setReorderingAllowed(false);
                    this.stdTbl.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
                        @Override
                        public void valueChanged(ListSelectionEvent event) {
                            studentTableRowChange(event);
                        }
                    });
                    
                    this.stdScrlPane = new JScrollPane();
                    this.stdScrlPane.setViewportView(this.stdTbl);
                    this.panelStdCenter.add(this.stdScrlPane, java.awt.BorderLayout.CENTER);

                    this.interFrmStudent.setVisible(true);
                    this.interFrmStudent.moveToFront();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(this, "Select from table 'students' failed");
                }
            } else {
                this.interFrmStudent.setVisible(true);
                this.interFrmStudent.moveToFront();
            }
        } else {
            this.menuOptionConnectActionPerformed(evt);
            this.menuManageStdActionPerformed(evt);
        }
    }//GEN-LAST:event_menuManageStdActionPerformed

    private boolean checkDateFormat(String date){
        if(date == null){
            return true;
        }else{
            String pattern = "[0-9][0-9][0-9][0-9]-[0-1][1-9]-[0-3][0-9]";
            return date.matches(pattern);
        }
    }
    
    private String[] getSelectedStudentInfo(){
        String[] data = new String[5];

        data[0] = checkNullString(this.txtStdInfoName.getText());
        data[1] = checkNullString(this.txtStdInfoAddress.getText());
        data[2] = checkNullString(this.txtStdInfoTel.getText());
        data[3] = checkNullString(this.ftxtStdInfoDoB.getText());
        switch (this.cbbStdInfoSex.getSelectedIndex()) {
            case 1:
                data[4] = "M";
                break;
            case 2:
                data[4] = "F";
                break;
            default:
                data[4] = null;
                break;
        }
        
        return data;
    }
    
    private void updateStudent(){
        int selectedRow = this.stdTbl.getSelectedRow();
        if(selectedRow > 0 && selectedRow <= this.stdMng.getLastIndex()){
//            if(JOptionPane.showConfirmDialog(this, new String("Confirm update student?")) == YES_OPTION){   
                try {
                    int id;
                    String[] data = getSelectedStudentInfo();
                    id = Integer.parseInt(this.txtStdInfoId.getText());
                    
                    DbQuery dbQuery = new DbQuery(this.dbAccess);
                    dbQuery.updateStudent(data[0], data[1], data[2], data[3], data[4], id);
                    
                    Student std = new Student(id, data[0], data[1], data[2], data[3], this.cbbStdInfoSex.getSelectedIndex());
                    this.stdMng.updateStudentAt(selectedRow, std);
                    this.stdTblMdl.updateRowAt(selectedRow, std);
                    
                    this.stdTblMdl.fireTableDataChanged();
                    this.stdTbl.setRowSelectionInterval(selectedRow, selectedRow);
                } catch (SQLException ex) {
                    System.out.println("Update table Students failed");
                    Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
//            }
        }
    }
    
    private void addNewStudent(){
        int id;
        String[] data = getSelectedStudentInfo();
        id = Integer.parseInt(this.txtStdInfoId.getText());

        Student std = new Student(id, data[0], data[1], data[2], data[3], this.cbbStdInfoSex.getSelectedIndex());
        this.stdMng.addStudent(std);
        this.stdTblMdl.addRow(std);

        DbQuery dbQuery = new DbQuery(dbAccess);
        try {
            dbQuery.insertToStudent(data[0], data[1], data[2], data[3], data[4]);
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Insert to table 'student' failed");
        }
    }
    
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        if(checkNullString(this.txtStdInfoId.getText()) != null){
            if (checkDateFormat(checkNullString(this.ftxtStdInfoDoB.getText()))){
                if (Integer.parseInt(this.txtStdInfoId.getText()) > this.stdMng.getLastId()){
                    if(JOptionPane.showConfirmDialog(this, new String("Confirm insert new student?")) == YES_OPTION)
                        this.stdTbl.clearSelection();
                        addNewStudent();                       
                        this.stdTblMdl.fireTableDataChanged();
                        this.stdTbl.setRowSelectionInterval(this.stdMng.getLastIndex(), this.stdMng.getLastIndex());
                }else {
                    this.updateStudent();
                }
            }else{
                JOptionPane.showMessageDialog(this, new String("Date must be in format: YYYY-MM-DD"));
                this.ftxtStdInfoDoB.setText("");
                this.ftxtStdInfoDoB.requestFocus();
            }
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        if (this.stdTbl.getSelectedRow() != -1 && this.stdTbl.getSelectedRow() < this.stdMng.getLastId()+1){
            int selectedRow = this.stdTbl.getSelectedRow();
            if(JOptionPane.showConfirmDialog(this, new String("Confirm delete student?")) == YES_OPTION){
                try {
                    DbQuery dbQuery = new DbQuery(this.dbAccess);
                    dbQuery.deleteRow("Students", "Student_ID", this.txtStdInfoId.getText());
                    this.stdMng.removeStudent(selectedRow);
                    if(selectedRow > 1)
                        this.stdTbl.setRowSelectionInterval(selectedRow-1, selectedRow-1);
                    else
                        this.stdTbl.setRowSelectionInterval(1, 1);
                    this.stdTblMdl.removeRow(selectedRow);
                } catch (SQLException ex) {
                    System.out.println("Delete from table Students failed");
                    Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                }               
            }
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        this.stdTblMdl.fireTableDataChanged();
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnDiscardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiscardActionPerformed
        // TODO add your handling code here:
        this.txtStdInfoId.setText("");
        this.txtStdInfoName.setText("");
        this.txtStdInfoAddress.setText("");
        this.txtStdInfoTel.setText("");
        this.ftxtStdInfoDoB.setText("");
        this.cbbStdInfoSex.setSelectedIndex(0);
        this.stdTbl.clearSelection();
    }//GEN-LAST:event_btnDiscardActionPerformed
    
    private String checkNullString(String string){
        if ("".equals(string) || " ".equals(string) || string == null){
            return null;
        } else
            return string;
    }
    
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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                MainFrame mainFrame = new MainFrame();
                mainFrame.setVisible(true);
                mainFrame.interFrmStudent.setVisible(false);
                mainFrame.setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnDiscard;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox cbbStdInfoSex;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JFormattedTextField ftxtStdInfoDoB;
    private javax.swing.JInternalFrame interFrmStudent;
    private javax.swing.JLabel lblStdAddress;
    private javax.swing.JLabel lblStdInfo;
    private javax.swing.JLabel lblStdInfoDoB;
    private javax.swing.JLabel lblStdInfoId;
    private javax.swing.JLabel lblStdInfoName;
    private javax.swing.JLabel lblStdInfoSex;
    private javax.swing.JLabel lblStdInfoTel;
    private javax.swing.JMenuBar mainBar;
    private javax.swing.JMenu menuManage;
    private javax.swing.JMenuItem menuManageCrs;
    private javax.swing.JMenuItem menuManageStd;
    private javax.swing.JMenu menuOption;
    private javax.swing.JMenuItem menuOptionConnect;
    private javax.swing.JMenuItem menuOptionExit;
    private javax.swing.JPanel paneCenter;
    private javax.swing.JPanel panelStdBottom;
    private javax.swing.JPanel panelStdBottomTop;
    private javax.swing.JPanel panelStdBtn;
    private javax.swing.JPanel panelStdCenter;
    private javax.swing.JPanel panelStdInfo1;
    private javax.swing.JPanel panelStdInfo2;
    private javax.swing.JToolBar toolbarStd;
    private javax.swing.JTextField txtStdInfoAddress;
    private javax.swing.JTextField txtStdInfoId;
    private javax.swing.JTextField txtStdInfoName;
    private javax.swing.JTextField txtStdInfoTel;
    // End of variables declaration//GEN-END:variables
}
