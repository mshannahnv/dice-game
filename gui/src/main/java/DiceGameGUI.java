

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.swing.*;
import java.awt.Dimension;
import java.awt.Font;
import java.util.*;
import dice.*;
import java.awt.Color;
/**
 *
 * @author Nguyen
 */
public class DiceGameGUI extends javax.swing.JFrame {

    /**
     * Creates new form DiceGameGUI
     */
    public DiceGameGUI() {
        initComponents();
        initVar();
    }
    
    private void initVar(){
        thisGame = DiceGame.create();
        listLbl = new ArrayList<>();
        listLbl.add(picDie1);
        listLbl.add(picDie2);
        listLbl.add(picDie3);
        listIcon = new ArrayList<>();
        listIcon.add(new javax.swing.ImageIcon(getClass().getResource("die_face_1.png")));
        listIcon.add(new javax.swing.ImageIcon(getClass().getResource("die_face_2.png")));
        listIcon.add(new javax.swing.ImageIcon(getClass().getResource("die_face_3.png")));
        listIcon.add(new javax.swing.ImageIcon(getClass().getResource("die_face_4.png")));
        listIcon.add(new javax.swing.ImageIcon(getClass().getResource("die_face_5.png")));
        listIcon.add(new javax.swing.ImageIcon(getClass().getResource("die_face_6.png")));
        listIcon.add(new javax.swing.ImageIcon(getClass().getResource("die-a.gif")));
        data = Database.create("mock");
        stat = StatsProcessor.create("mock",data);
}
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        btnRoll = new javax.swing.JButton();
        btnStop = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtDiceNumber = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblRollScore = new javax.swing.JLabel();
        lblTotalScore = new javax.swing.JLabel();
        btnClose = new javax.swing.JButton();
        btnInstr = new javax.swing.JButton();
        lblPlayerName = new javax.swing.JLabel();
        picDie1 = new javax.swing.JLabel();
        picDie2 = new javax.swing.JLabel();
        picDie3 = new javax.swing.JLabel();
        btnReset = new javax.swing.JButton();
        btnPStat = new javax.swing.JButton();
        btnOStat = new javax.swing.JButton();
        btnOStat1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 204));

        btnRoll.setText("ROLL");
        btnRoll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRollActionPerformed(evt);
            }
        });

        btnStop.setText("STOP");
        btnStop.setEnabled(false);
        btnStop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStopActionPerformed(evt);
            }
        });

        jLabel4.setText("Number of Dice:");

        txtDiceNumber.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtDiceNumberMouseClicked(evt);
            }
        });

        jLabel5.setText("Roll Score:");

        jLabel6.setText("Total Score:");

        lblRollScore.setText("0");

        lblTotalScore.setText("0");

        btnClose.setText("Close");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        btnInstr.setText("Instruction");
        btnInstr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInstrActionPerformed(evt);
            }
        });

        lblPlayerName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblPlayerName.setText("Player's Name");

        picDie1.setIcon(new javax.swing.ImageIcon(getClass().getResource("die_face_6.png"))); // NOI18N
        picDie1.setEnabled(false);

        picDie2.setIcon(new javax.swing.ImageIcon(getClass().getResource("die_face_6.png"))); // NOI18N
        picDie2.setEnabled(false);

        picDie3.setIcon(new javax.swing.ImageIcon(getClass().getResource("die_face_6.png"))); // NOI18N
        picDie3.setEnabled(false);

        btnReset.setText("RESET");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnPStat.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        btnPStat.setText("PERSONAL STAT");
        btnPStat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPStatActionPerformed(evt);
            }
        });

        btnOStat.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        btnOStat.setText("OVERALL STAT");
        btnOStat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOStatActionPerformed(evt);
            }
        });

        btnOStat1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        btnOStat1.setText("LEADER BOARD");
        btnOStat1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOStat1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(51, 51, 51)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtDiceNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel5))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(lblRollScore)
                                            .addComponent(lblTotalScore))))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(picDie2)
                                    .addGap(18, 18, 18)
                                    .addComponent(picDie1)))
                            .addGap(18, 18, 18)
                            .addComponent(picDie3))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(304, 304, 304)
                            .addComponent(btnInstr))
                        .addComponent(lblPlayerName)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(8, 8, 8)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(btnPStat, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btnOStat, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnOStat1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(btnRoll, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btnStop, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(btnClose, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPlayerName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnInstr)
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(picDie2)
                    .addComponent(picDie3)
                    .addComponent(picDie1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtDiceNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblRollScore))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(lblTotalScore))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRoll, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnStop, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPStat, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOStat, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOStat1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnClose)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        thisGame = DiceGame.create();
        for (int index = 0; index < listLbl.size(); index++)
        {
            listLbl.get(index).setEnabled(false);
        }
        lblRollScore.setText("0");
        lblTotalScore.setText("0");
        txtDiceNumber.setText("");
        btnRoll.setEnabled(true);
        picDie1.setIcon(new javax.swing.ImageIcon(getClass().getResource("die_face_6.png"))); // NOI18N
        picDie1.setEnabled(false);

        picDie2.setIcon(new javax.swing.ImageIcon(getClass().getResource("die_face_6.png"))); // NOI18N
        picDie2.setEnabled(false);

        picDie3.setIcon(new javax.swing.ImageIcon(getClass().getResource("die_face_6.png"))); // NOI18N
        picDie3.setEnabled(false);
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnStopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStopActionPerformed
// TODO add your handling code here:
        int diceNumber = Integer.parseInt(txtDiceNumber.getText());
        RollResult rScore = new RollResult();
        try{rScore = thisGame.roll(diceNumber);} 
        catch (RollAfterGameOverException ex)
        {ex.getStackTrace();}
        Integer tScore = thisGame.getScore();
        lblRollScore.setText(""+rScore.sum());
        lblTotalScore.setText(tScore.toString());
        txtDiceNumber.setEnabled(true);
        
        for (int index = 0; index < rScore.rollCount(); index++)
        {
            int dieValue = rScore.rollsArray()[index];
            if(dieValue == 0)
                listLbl.get(index).setIcon(listIcon.get(5));
            else
               listLbl.get(index).setIcon(listIcon.get(dieValue-1));
        }
        
        if (thisGame.getCurrentTotal() >= 23){
            JOptionPane.showMessageDialog(null, "Game Over!", "Game Over",
            JOptionPane.OK_OPTION);
            btnRoll.setEnabled(false);
            btnStop.setEnabled(false);
        }
        else
        {
         btnStop.setEnabled(false);
         btnRoll.setEnabled(true);
        }    }//GEN-LAST:event_btnStopActionPerformed

    private void btnRollActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRollActionPerformed
        int diceNumber = Integer.parseInt(txtDiceNumber.getText());
        if (diceNumber > 3 || diceNumber <1 || txtDiceNumber.getText().equals("") )
        {
          JOptionPane.showMessageDialog(null, "Please enter a number from 1-3", "Invalid Input",
          JOptionPane.OK_OPTION);
        } 
        else
        {
         enableDie(diceNumber);
        
         dieAnimation(diceNumber);
        
         txtDiceNumber.setEnabled(false);
         btnStop.setEnabled(true);
         btnRoll.setEnabled(false);
        }
    }//GEN-LAST:event_btnRollActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
      // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnCloseActionPerformed

    private void txtDiceNumberMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDiceNumberMouseClicked
        // TODO add your handling code here:
        txtDiceNumber.setText("");
    }//GEN-LAST:event_txtDiceNumberMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       String name;
       do{
           name = JOptionPane.showInputDialog(null, "What is your name?").toUpperCase();
           if (name == null)
               System.exit(0);
           if (name.length() != 3)
               JOptionPane.showMessageDialog(null, "Invalid Input", "Invalid Input",
               JOptionPane.OK_OPTION);
       } while (name.length() == 0 || name.length() > 3);
       
       try{thisGame = DiceGame.create(name);}
        catch(InvalidUsernameException ex) {ex.printStackTrace();}
       
       lblPlayerName.setText(name);
    }//GEN-LAST:event_formWindowOpened

    private void btnInstrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInstrActionPerformed
        JOptionPane.showMessageDialog(null, 
            "Goal of the game: \n"
            + "The goal of the game is to accumulate a total of exactly 23,"
            + " or get as close as you can without going over, by rolling\n"
            + "1-3 dice an unlimited amount of times. You will have the"
            + "choice to use 1, 2, or 3 dice to increase your\n "
            + "overall total and achieve the goal of 23.\n"
            + "\n"
            + "Rules of the Game:\n"
            + "1.The player must enter three letters, generally "
            + "initials, for their game name.\n" 
            +"2.The player can choose the number of dice to use per roll.\n" 
            +"3.The player must roll the chosen number of dice and add the "
                    + "die faces to get a total.\n" 
            +"    For example, if you roll a 5, 6, and 3, your total will be 14.\n" 
            +"4.The player will have the option to stop there and record "
            + "their score or they can roll again to increase their total.\n" 
            +"5.The player can roll as many times as they want, but as soon "
            + "as their total score equals or exceeds 23, the game is over."
            ,"Instruction",JOptionPane.OK_OPTION,listIcon.get(5));
    }//GEN-LAST:event_btnInstrActionPerformed

    private void btnPStatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPStatActionPerformed
       displayUserStat(thisGame.getUsername());
    }//GEN-LAST:event_btnPStatActionPerformed

    private void btnOStatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOStatActionPerformed
       String[] playerList = stat.getPlayerList();
       String targetUser = (String)JOptionPane.showInputDialog(null, "Choose a player", 
               "Player List",JOptionPane.PLAIN_MESSAGE,null,playerList,playerList[0]);
       displayUserStat(targetUser);
    }//GEN-LAST:event_btnOStatActionPerformed

    private void btnOStat1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOStat1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnOStat1ActionPerformed

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
            java.util.logging.Logger.getLogger(DiceGameGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DiceGameGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DiceGameGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DiceGameGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DiceGameGUI().setVisible(true);
            }
        });           
    }
    
    
    public void enableDie(int diceNumber){
        switch (diceNumber)
        {
            case 1: 
            {
                picDie1.setEnabled(true);
                picDie2.setEnabled(false);
                picDie3.setEnabled(false);
                break;
            }
            case 2:
            {
                picDie1.setEnabled(true);
                picDie2.setEnabled(true);
                picDie3.setEnabled(false);
                break;
            }
            case 3:
            {
                picDie1.setEnabled(true);
                picDie2.setEnabled(true);
                picDie3.setEnabled(true);
                break;
            }   
        }        
    }
    
    public void displayUserStat(String username)
    {
       StatsData thisPlayerStat = stat.getPlayerStats(username);
       JTextArea txaStat = new JTextArea();
       txaStat.setEditable(false);
       txaStat.setFont(new Font("Sans-Serif", Font.PLAIN, 10));
       txaStat.setText(
               "Cumulative score:"+"                "
                       + thisPlayerStat.getCumulativeScore() + "\n"
              +"Average score:"+"                   "
                       + thisPlayerStat.getAvgScore() + "\n"
              +"Average number of dice used:"+"     " 
                       + thisPlayerStat.getAvgNumDiceUsed() +"\n"
              +"Total Roll:"+"                      "
                       + thisPlayerStat.getTotalRolls() + "\n"
              +"Average rolls per game:"+"          "
                       + thisPlayerStat.getAvgRollsPerGame() + "\n");
       txaStat.setBackground(Color.white);
       txaStat.setForeground(Color.black);
       JScrollPane spnStat = new JScrollPane(txaStat);
       spnStat.setPreferredSize(new Dimension(350, 150));
       JOptionPane.showMessageDialog(this, spnStat, "Your Statistic",JOptionPane.PLAIN_MESSAGE,null);
    }
    
    public void dieAnimation(int diceNumber)
    {
        for (int index = 0; index < diceNumber ; index++)
        {
                listLbl.get(index).setIcon(listIcon.get(6));
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnInstr;
    private javax.swing.JButton btnOStat;
    private javax.swing.JButton btnOStat1;
    private javax.swing.JButton btnPStat;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnRoll;
    private javax.swing.JButton btnStop;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblPlayerName;
    private javax.swing.JLabel lblRollScore;
    private javax.swing.JLabel lblTotalScore;
    private javax.swing.JLabel picDie1;
    private javax.swing.JLabel picDie2;
    private javax.swing.JLabel picDie3;
    private javax.swing.JTextField txtDiceNumber;
    // End of variables declaration//GEN-END:variables
    private DiceGame thisGame;
    private List<JLabel> listLbl;
    private List<Icon> listIcon;
    private Database data;
    private StatsProcessor stat;
}
