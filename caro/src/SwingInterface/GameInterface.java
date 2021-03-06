/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package SwingInterface;

import Game.TheGame;
import GameCore.Player;
import java.awt.CardLayout;

/**
 *
 * @author Administrator
 */
public class GameInterface extends javax.swing.JFrame {
    private Runnable theGame;
    private Thread gameThread;
    private Player player;
    private javax.swing.JPanel playField;
    /**
     * Creates new form GameInterface
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
            java.util.logging.Logger.getLogger(GameInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GameInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GameInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GameInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        GameInterface gameInterface = new GameInterface();
        gameInterface.setVisible(true);
    }
    
    public GameInterface() {
        initComponents();
        this.lblHostInputMsg.setVisible(false);
        this.lblHostError.setVisible(false);
        this.lblJoinError.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlWrapper = new javax.swing.JPanel();
        pnlStart = new javax.swing.JPanel();
        btnQuit = new javax.swing.JButton();
        btnHost = new javax.swing.JButton();
        btnJoin = new javax.swing.JButton();
        pnlHost = new javax.swing.JPanel();
        lblHost = new javax.swing.JLabel();
        btnCreateHost = new javax.swing.JButton();
        inputSideSize = new javax.swing.JTextField();
        btnBackToStart = new javax.swing.JButton();
        lblHostInputMsg = new javax.swing.JLabel();
        lblHostError = new javax.swing.JLabel();
        pnlJoin = new javax.swing.JPanel();
        lblJoin = new javax.swing.JLabel();
        btnJoinHost = new javax.swing.JButton();
        inputHostIP = new javax.swing.JTextField();
        btnBackToStart1 = new javax.swing.JButton();
        lblJoinError = new javax.swing.JLabel();
        pnlHostWaiting = new javax.swing.JPanel();
        btnBackToHost = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        pnlPlay = new javax.swing.JPanel();
        buttonWrap = new javax.swing.JPanel();
        btnBackToStart2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Caro game by M.Tan");
        setResizable(false);

        pnlWrapper.setLayout(new java.awt.CardLayout());

        btnQuit.setText("Quit");
        btnQuit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitActionPerformed(evt);
            }
        });

        btnHost.setText("Host a game");
        btnHost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHostActionPerformed(evt);
            }
        });

        btnJoin.setText("Join a game");
        btnJoin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJoinActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlStartLayout = new javax.swing.GroupLayout(pnlStart);
        pnlStart.setLayout(pnlStartLayout);
        pnlStartLayout.setHorizontalGroup(
            pnlStartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlStartLayout.createSequentialGroup()
                .addComponent(btnQuit, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(368, 368, 368))
            .addGroup(pnlStartLayout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addGroup(pnlStartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnHost, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnJoin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(165, 165, 165))
        );
        pnlStartLayout.setVerticalGroup(
            pnlStartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlStartLayout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(btnHost, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(48, 48, 48)
                .addComponent(btnJoin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(118, 118, 118)
                .addComponent(btnQuit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlWrapper.add(pnlStart, "pnlStart");

        lblHost.setText("Enter size of one side of the board");

        btnCreateHost.setText("Create");
        btnCreateHost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateHostActionPerformed(evt);
            }
        });

        btnBackToStart.setText("Back");
        btnBackToStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackToStartActionPerformed(evt);
            }
        });

        lblHostInputMsg.setText("Invalid input - need a number");

        lblHostError.setText("Error occured");

        javax.swing.GroupLayout pnlHostLayout = new javax.swing.GroupLayout(pnlHost);
        pnlHost.setLayout(pnlHostLayout);
        pnlHostLayout.setHorizontalGroup(
            pnlHostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHostLayout.createSequentialGroup()
                .addComponent(btnBackToStart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(348, 348, 348))
            .addGroup(pnlHostLayout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addComponent(btnCreateHost, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(172, 172, 172))
            .addGroup(pnlHostLayout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addComponent(inputSideSize)
                .addGap(153, 153, 153))
            .addGroup(pnlHostLayout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(lblHost, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(127, 127, 127))
            .addGroup(pnlHostLayout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addComponent(lblHostInputMsg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(141, 141, 141))
            .addGroup(pnlHostLayout.createSequentialGroup()
                .addGap(174, 174, 174)
                .addComponent(lblHostError)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlHostLayout.setVerticalGroup(
            pnlHostLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHostLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(lblHost, javax.swing.GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(inputSideSize, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnCreateHost, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(lblHostError)
                .addGap(2, 2, 2)
                .addComponent(lblHostInputMsg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(90, 90, 90)
                .addComponent(btnBackToStart, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
        );

        pnlWrapper.add(pnlHost, "pnlHost");

        lblJoin.setText("Enter the host IP");

        btnJoinHost.setText("Connect");
        btnJoinHost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJoinHostActionPerformed(evt);
            }
        });

        btnBackToStart1.setText("Back");
        btnBackToStart1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackToStart1ActionPerformed(evt);
            }
        });

        lblJoinError.setText("Unable to connect");

        javax.swing.GroupLayout pnlJoinLayout = new javax.swing.GroupLayout(pnlJoin);
        pnlJoin.setLayout(pnlJoinLayout);
        pnlJoinLayout.setHorizontalGroup(
            pnlJoinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlJoinLayout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addComponent(inputHostIP)
                .addGap(153, 153, 153))
            .addGroup(pnlJoinLayout.createSequentialGroup()
                .addComponent(btnBackToStart1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(348, 348, 348))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlJoinLayout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addComponent(btnJoinHost, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(184, 184, 184))
            .addGroup(pnlJoinLayout.createSequentialGroup()
                .addGroup(pnlJoinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlJoinLayout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(lblJoin))
                    .addGroup(pnlJoinLayout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(lblJoinError, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlJoinLayout.setVerticalGroup(
            pnlJoinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlJoinLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(lblJoin, javax.swing.GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(inputHostIP, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnJoinHost, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                .addGap(29, 29, 29)
                .addComponent(lblJoinError)
                .addGap(95, 95, 95)
                .addComponent(btnBackToStart1, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
        );

        pnlWrapper.add(pnlJoin, "pnlJoin");

        btnBackToHost.setText("back");
        btnBackToHost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackToHostActionPerformed(evt);
            }
        });

        jLabel1.setText("Waiting for 2nd player to connect");

        javax.swing.GroupLayout pnlHostWaitingLayout = new javax.swing.GroupLayout(pnlHostWaiting);
        pnlHostWaiting.setLayout(pnlHostWaitingLayout);
        pnlHostWaitingLayout.setHorizontalGroup(
            pnlHostWaitingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHostWaitingLayout.createSequentialGroup()
                .addComponent(btnBackToHost, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(366, 366, 366))
            .addGroup(pnlHostWaitingLayout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(131, 131, 131))
        );
        pnlHostWaitingLayout.setVerticalGroup(
            pnlHostWaitingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlHostWaitingLayout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(164, 164, 164)
                .addComponent(btnBackToHost, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlWrapper.add(pnlHostWaiting, "pnlHostWaiting");

        pnlPlay.setLayout(new java.awt.BorderLayout());

        buttonWrap.setPreferredSize(new java.awt.Dimension(421, 25));

        btnBackToStart2.setText("Quit playing");
        btnBackToStart2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackToStart2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout buttonWrapLayout = new javax.swing.GroupLayout(buttonWrap);
        buttonWrap.setLayout(buttonWrapLayout);
        buttonWrapLayout.setHorizontalGroup(
            buttonWrapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonWrapLayout.createSequentialGroup()
                .addComponent(btnBackToStart2)
                .addGap(0, 332, Short.MAX_VALUE))
        );
        buttonWrapLayout.setVerticalGroup(
            buttonWrapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonWrapLayout.createSequentialGroup()
                .addComponent(btnBackToStart2)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pnlPlay.add(buttonWrap, java.awt.BorderLayout.PAGE_END);

        pnlWrapper.add(pnlPlay, "pnlPlay");

        getContentPane().add(pnlWrapper, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnQuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnQuitActionPerformed

    private void btnCreateHostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateHostActionPerformed
        // TODO add your handling code here:
        this.player = new Player(1);
        this.theGame = new TheGame(this.player, this.inputSideSize.getText());
        this.gameThread = new Thread(this.theGame);
        try{
            this.showPanel("pnlPlay");
            this.gameThread.start();
            this.playField = new PlayPanel(Integer.parseInt(this.inputSideSize.getText()), this.player.getPlayer());
            this.pnlPlay.add(this.playField);
        }catch(NumberFormatException e){
            this.lblHostInputMsg.setVisible(true);
            this.showPanel("pnlHost");
        }catch(Exception e){
            this.lblHostError.setVisible(true);
            this.showPanel("pnlHost");
        }
    }//GEN-LAST:event_btnCreateHostActionPerformed

    private void btnJoinHostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJoinHostActionPerformed
        // TODO add your handling code here:
        this.player = new Player(2);
        this.theGame = new TheGame(this.player, this.inputHostIP.getText());
        this.gameThread = new Thread(this.theGame);
        try{
            this.showPanel("pnlPlay");
            this.gameThread.start(); 
            
        }catch(Exception e){
            this.lblJoinError.setVisible(true);
            this.showPanel("pnlJoin");
        }

    }//GEN-LAST:event_btnJoinHostActionPerformed

    private void btnHostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHostActionPerformed
        // TODO add your handling code here:
        this.showPanel("pnlHost");
    }//GEN-LAST:event_btnHostActionPerformed

    private void btnJoinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJoinActionPerformed
        // TODO add your handling code here:
        this.showPanel("pnlJoin");
    }//GEN-LAST:event_btnJoinActionPerformed

    private void btnBackToStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackToStartActionPerformed
        // TODO add your handling code here:
        this.showPanel("pnlStart");
    }//GEN-LAST:event_btnBackToStartActionPerformed

    private void btnBackToStart1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackToStart1ActionPerformed
        // TODO add your handling code here:
        this.showPanel("pnlStart");
    }//GEN-LAST:event_btnBackToStart1ActionPerformed

    private void btnBackToHostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackToHostActionPerformed
        // TODO add your handling code here:
        this.showPanel("pnlHost");
    }//GEN-LAST:event_btnBackToHostActionPerformed

    private void btnBackToStart2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackToStart2ActionPerformed
        // TODO add your handling code here:
        this.showPanel("pnlStart");
    }//GEN-LAST:event_btnBackToStart2ActionPerformed
    
    private void showPanel(String panelToShow){
        CardLayout layout = (CardLayout) this.pnlWrapper.getLayout();
        layout.show(this.pnlWrapper, panelToShow);
    }
    
    /**
     * @param args the command line arguments
     */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBackToHost;
    private javax.swing.JButton btnBackToStart;
    private javax.swing.JButton btnBackToStart1;
    private javax.swing.JButton btnBackToStart2;
    private javax.swing.JButton btnCreateHost;
    private javax.swing.JButton btnHost;
    private javax.swing.JButton btnJoin;
    private javax.swing.JButton btnJoinHost;
    private javax.swing.JButton btnQuit;
    private javax.swing.JPanel buttonWrap;
    private javax.swing.JTextField inputHostIP;
    private javax.swing.JTextField inputSideSize;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblHost;
    private javax.swing.JLabel lblHostError;
    private javax.swing.JLabel lblHostInputMsg;
    private javax.swing.JLabel lblJoin;
    private javax.swing.JLabel lblJoinError;
    private javax.swing.JPanel pnlHost;
    private javax.swing.JPanel pnlHostWaiting;
    private javax.swing.JPanel pnlJoin;
    private javax.swing.JPanel pnlPlay;
    private javax.swing.JPanel pnlStart;
    private javax.swing.JPanel pnlWrapper;
    // End of variables declaration//GEN-END:variables
}
