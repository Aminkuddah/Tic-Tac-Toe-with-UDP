package tictactoe;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Random;
import javax.swing.JOptionPane;

public class Display extends javax.swing.JFrame {
    int nilai, nilaiX, nilaiO, pemainAcak, pionAcak;
    String pionA, pionB;
    boolean playerA, playerB;
    public Display() {
        initComponents();
        nilai = 1;
        nilaiX = 0;
        nilaiO = 0;
        
        btn1.setEnabled(false);
        btn2.setEnabled(false);
        btn3.setEnabled(false);
        btn4.setEnabled(false);
        btn5.setEnabled(false);
        btn6.setEnabled(false);
        btn7.setEnabled(false);
        btn8.setEnabled(false);
        btn9.setEnabled(false);
        
        btnReset.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn9 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnAcak = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        textPlayer = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 0, 0));
        setPreferredSize(new java.awt.Dimension(1000, 800));
        getContentPane().setLayout(null);

        btn9.setBackground(new java.awt.Color(255, 255, 255));
        btn9.setFont(new java.awt.Font("Tahoma", 1, 60)); // NOI18N
        btn9.setForeground(new java.awt.Color(255, 255, 255));
        btn9.setContentAreaFilled(false);
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });
        getContentPane().add(btn9);
        btn9.setBounds(390, 490, 160, 160);

        btn8.setBackground(new java.awt.Color(255, 255, 255));
        btn8.setFont(new java.awt.Font("Tahoma", 1, 60)); // NOI18N
        btn8.setForeground(new java.awt.Color(255, 255, 255));
        btn8.setContentAreaFilled(false);
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        getContentPane().add(btn8);
        btn8.setBounds(200, 490, 170, 160);

        btn7.setBackground(new java.awt.Color(255, 255, 255));
        btn7.setFont(new java.awt.Font("Tahoma", 1, 60)); // NOI18N
        btn7.setForeground(new java.awt.Color(255, 255, 255));
        btn7.setContentAreaFilled(false);
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        getContentPane().add(btn7);
        btn7.setBounds(20, 490, 160, 160);

        btn6.setBackground(new java.awt.Color(255, 255, 255));
        btn6.setFont(new java.awt.Font("Tahoma", 1, 60)); // NOI18N
        btn6.setForeground(new java.awt.Color(255, 255, 255));
        btn6.setContentAreaFilled(false);
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        getContentPane().add(btn6);
        btn6.setBounds(390, 310, 160, 160);

        btn5.setBackground(new java.awt.Color(255, 255, 255));
        btn5.setFont(new java.awt.Font("Tahoma", 1, 60)); // NOI18N
        btn5.setForeground(new java.awt.Color(255, 255, 255));
        btn5.setContentAreaFilled(false);
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        getContentPane().add(btn5);
        btn5.setBounds(200, 310, 170, 160);

        btn4.setBackground(new java.awt.Color(255, 255, 255));
        btn4.setFont(new java.awt.Font("Tahoma", 1, 60)); // NOI18N
        btn4.setForeground(new java.awt.Color(255, 255, 255));
        btn4.setContentAreaFilled(false);
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        getContentPane().add(btn4);
        btn4.setBounds(20, 310, 160, 160);

        btn3.setBackground(new java.awt.Color(255, 255, 255));
        btn3.setFont(new java.awt.Font("Tahoma", 1, 60)); // NOI18N
        btn3.setForeground(new java.awt.Color(255, 255, 255));
        btn3.setContentAreaFilled(false);
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        getContentPane().add(btn3);
        btn3.setBounds(390, 120, 160, 170);

        btn2.setBackground(new java.awt.Color(255, 255, 255));
        btn2.setFont(new java.awt.Font("Tahoma", 1, 60)); // NOI18N
        btn2.setForeground(new java.awt.Color(255, 255, 255));
        btn2.setContentAreaFilled(false);
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        getContentPane().add(btn2);
        btn2.setBounds(200, 120, 170, 170);

        btn1.setBackground(new java.awt.Color(255, 255, 255));
        btn1.setFont(new java.awt.Font("Tahoma", 1, 60)); // NOI18N
        btn1.setForeground(new java.awt.Color(255, 255, 255));
        btn1.setContentAreaFilled(false);
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn1);
        btn1.setBounds(20, 120, 160, 170);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Untitled.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 110, 552, 551);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel2.setText("Tic Tac Toe");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(146, 23, 300, 57);

        btnAcak.setBackground(new java.awt.Color(171, 53, 53));
        btnAcak.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnAcak.setForeground(new java.awt.Color(255, 255, 255));
        btnAcak.setText("Acak");
        btnAcak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcakActionPerformed(evt);
            }
        });
        getContentPane().add(btnAcak);
        btnAcak.setBounds(800, 120, 160, 40);

        btnReset.setBackground(new java.awt.Color(171, 53, 53));
        btnReset.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnReset.setForeground(new java.awt.Color(255, 255, 255));
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        getContentPane().add(btnReset);
        btnReset.setBounds(610, 120, 160, 40);

        textPlayer.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        textPlayer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(textPlayer);
        textPlayer.setBounds(610, 170, 350, 50);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    void setDisabled(){
        btn1.setEnabled(false);
        btn2.setEnabled(false);
        btn3.setEnabled(false);
        btn4.setEnabled(false);
        btn5.setEnabled(false);
        btn6.setEnabled(false);
        btn7.setEnabled(false);
        btn8.setEnabled(false);
        btn9.setEnabled(false);
    }
    
    void pemenang(){
        if(btn1.getText() == "O" && btn2.getText() == "O" && btn3.getText() == "O"){
            if(playerA){
                playerA = true;
                playerB = false;
                textPlayer.setText("Pemenangnya Player A! ");
            }
            else{
                playerA = false;
                playerB = true;
                textPlayer.setText("Pemenangnya Player B!");
            }
            setDisabled();
        }
        else if(btn4.getText() == "O" && btn5.getText() == "O" && btn6.getText() == "O"){
            if(playerA){
                playerA = true;
                playerB = false;
                textPlayer.setText("Pemenangnya Player A!");
            }
            else{
                playerA = false;
                playerB = true;
                textPlayer.setText("Pemenangnya Player B!");
            }   
            setDisabled();
        }
        else if(btn7.getText() == "O" && btn8.getText() == "O" && btn9.getText() == "O"){
            if(playerA){
                playerA = true;
                playerB = false;
                textPlayer.setText("Pemenangnya Player A!");
            }
            else{
                playerA = false;
                playerB = true;
                textPlayer.setText("Pemenangnya Player B!");
            }   
        }
        else if(btn1.getText() == "O" && btn4.getText() == "O" && btn7.getText() == "O"){
            if(playerA){
                playerA = true;
                playerB = false;
                textPlayer.setText("Pemenangnya Player A!");
            }
            else{
                playerA = false;
                playerB = true;
                textPlayer.setText("Pemenangnya Player B!");
            }
            setDisabled();
        }
        else if(btn2.getText() == "O" && btn5.getText() == "O" && btn8.getText() == "O"){
            if(playerA){
                playerA = true;
                playerB = false;
                textPlayer.setText("Pemenangnya Player A!");
            }
            else{
                playerA = false;
                playerB = true;
                textPlayer.setText("Pemenangnya Player B!");
            }
            setDisabled();
        }
        else if(btn3.getText() == "O" && btn6.getText() == "O" && btn9.getText() == "O"){
            if(playerA){
                playerA = true;
                playerB = false;
                textPlayer.setText("Pemenangnya Player A!");
            }
            else{
                playerA = false;
                playerB = true;
                textPlayer.setText("Pemenangnya Player B!");
            }
            setDisabled();
        }
        else if(btn1.getText() == "O" && btn5.getText() == "O" && btn9.getText() == "O"){
            if(playerA){
                playerA = true;
                playerB = false;
                textPlayer.setText("Pemenangnya Player A!");
            }
            else{
                playerA = false;
                playerB = true;
                textPlayer.setText("Pemenangnya Player B!");
            }
            setDisabled();
        }
        else if(btn3.getText() == "O" && btn5.getText() == "O" && btn7.getText() == "O"){
            if(playerA){
                playerA = true;
                playerB = false;
                textPlayer.setText("Pemenangnya Player A!");
            }
            else{
                playerA = false;
                playerB = true;
                textPlayer.setText("Pemenangnya Player B!");
            }
            setDisabled();
        }
        
        if(btn1.getText() == "X" && btn2.getText() == "X" && btn3.getText() == "X"){
            if(playerA){
                playerA = true;
                playerB = false;
                textPlayer.setText("Pemenangnya Player A!");
            }
            else{
                playerA = false;
                playerB = true;
                textPlayer.setText("Pemenangnya Player B!");
            }   
        }
        else if(btn4.getText() == "X" && btn5.getText() == "X" && btn6.getText() == "X"){
            if(playerA){
                playerA = true;
                playerB = false;
                textPlayer.setText("Pemenangnya Player A!");
            }
            else{
                playerA = false;
                playerB = true;
                textPlayer.setText("Pemenangnya Player B!");
            }
            setDisabled();
        }
        else if(btn7.getText() == "X" && btn8.getText() == "X" && btn9.getText() == "X"){
            if(playerA){
                playerA = true;
                playerB = false;
                textPlayer.setText("Pemenangnya Player A!");
            }
            else{
                playerA = false;
                playerB = true;
                textPlayer.setText("Pemenangnya Player B!");
            }
            setDisabled();
        }
        else if(btn1.getText() == "X" && btn4.getText() == "X" && btn7.getText() == "X"){
            if(playerA){
                playerA = true;
                playerB = false;
                textPlayer.setText("Pemenangnya Player A!");
            }
            else{
                playerA = false;
                playerB = true;
                textPlayer.setText("Pemenangnya Player B!");
            }
            setDisabled();
        }
        else if(btn2.getText() == "X" && btn5.getText() == "X" && btn8.getText() == "X"){
            if(playerA){
                playerA = true;
                playerB = false;
                textPlayer.setText("Pemenangnya Player A!");
            }
            else{
                playerA = false;
                playerB = true;
                textPlayer.setText("Pemenangnya Player B!");
            }
            setDisabled();
        }
        else if(btn3.getText() == "X" && btn6.getText() == "X" && btn9.getText() == "X"){
            if(playerA){
                playerA = true;
                playerB = false;
                textPlayer.setText("Pemenangnya Player A!");
            }
            else{
                playerA = false;
                playerB = true;
                textPlayer.setText("Pemenangnya Player B!");
            }
            setDisabled();
        }
        else if(btn1.getText() == "X" && btn5.getText() == "X" && btn9.getText() == "X"){
            if(playerA){
                playerA = true;
                playerB = false;
                textPlayer.setText("Pemenangnya Player A!");
            }
            else{
                playerA = false;
                playerB = true;
                textPlayer.setText("Pemenangnya Player B!");
            }
            setDisabled();
        }
        else if(btn3.getText() == "X" && btn5.getText() == "X" && btn7.getText() == "X"){
            if(playerA){
                playerA = true;
                playerB = false;
                textPlayer.setText("Pemenangnya Player A!");
            }
            else{
                playerA = false;
                playerB = true;
                textPlayer.setText("Pemenangnya Player B!");
            }
            setDisabled();
        }
    }
    
    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed

        if(playerA)
        {
            btn1.setText(pionA);
            playerA = false;
            playerB = true;
            
            textPlayer.setText("Giliran Player B!");
        }
        else
        {
            btn1.setText(pionB); 
            playerA = true;
            playerB = false;
            
            textPlayer.setText("Giliran Player A!");
        }
        pemenang();
        btn1.setEnabled(false);
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed

        if(playerA)
        {
            btn2.setText(pionA);
            playerA = false;
            playerB = true;
            
            textPlayer.setText("Giliran Player B!");
        }
        else
        {
            btn2.setText(pionB); 
            playerA = true;
            playerB = false;
            
            textPlayer.setText("Giliran Player A!");
        }
        pemenang();
        btn2.setEnabled(false);
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed

        if(playerA)
        {
            btn3.setText(pionA);
            playerA = false;
            playerB = true;
            
            textPlayer.setText("Giliran Player B!");
        }
        else
        {
            btn3.setText(pionB); 
            playerA = true;
            playerB = false;
            
            textPlayer.setText("Giliran Player A!");
        }
        pemenang();
        btn3.setEnabled(false);
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed

        if(playerA)
        {
            btn4.setText(pionA);
            playerA = false;
            playerB = true;
            
            textPlayer.setText("Giliran Player B!");
        }
        else
        {
            btn4.setText(pionB); 
            playerA = true;
            playerB = false;
            
            textPlayer.setText("Giliran Player A!");
        }
        pemenang();
        btn4.setEnabled(false);
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed

        if(playerA)
        {
            btn5.setText(pionA);
            playerA = false;
            playerB = true;
            
            textPlayer.setText("Giliran Player B!");
        }
        else
        {
            btn5.setText(pionB); 
            playerA = true;
            playerB = false;
            
            textPlayer.setText("Giliran Player A!");
        }
        pemenang();
        btn5.setEnabled(false);
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed

        if(playerA)
        {
            btn6.setText(pionA);
            playerA = false;
            playerB = true;
            
            textPlayer.setText("Giliran Player B!");
        }
        else
        {
            btn6.setText(pionB); 
            playerA = true;
            playerB = false;
            
            textPlayer.setText("Giliran Player A!");
        }
        pemenang();
        btn6.setEnabled(false);
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed

        if(playerA)
        {
            btn7.setText(pionA);
            playerA = false;
            playerB = true;
            
            textPlayer.setText("Giliran Player B!");
        }
        else
        {
            btn7.setText(pionB); 
            playerA = true;
            playerB = false;
            
            textPlayer.setText("Giliran Player A!");
        }
        pemenang();
        btn7.setEnabled(false);
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed

        if(playerA)
        {
            btn8.setText(pionA);
            playerA = false;
            playerB = true;
            
            textPlayer.setText("Giliran Player B!");
        }
        else
        {
            btn8.setText(pionB); 
            playerA = true;
            playerB = false;
            
            textPlayer.setText("Giliran Player A!");
        }
        pemenang();
        btn8.setEnabled(false);
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed

        if(playerA)
        {
            btn9.setText(pionA);
            playerA = false;
            playerB = true;
            
            textPlayer.setText("Giliran Player B!");
        }
        else
        {
            btn9.setText(pionB); 
            playerA = true;
            playerB = false;
            
            textPlayer.setText("Giliran Player A!");
        }
        pemenang();
        btn9.setEnabled(false);
    }//GEN-LAST:event_btn9ActionPerformed

    private void btnAcakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcakActionPerformed
        Random random = new Random();
        pemainAcak = random.nextInt(2);
        pionAcak = random.nextInt(2);

        if (pemainAcak == 0) {
            textPlayer.setText("Giliran Player A!");
            playerA = true;

        } else {
            textPlayer.setText("Giliran Player B!");
            playerB = true;
        }
        
        if(pionAcak == 0)
        {
            pionA = "X";
            pionB = "O";
        }
        else
        {
            pionA = "O";
            pionB = "X";
        }
        
        btn1.setEnabled(true);
        btn2.setEnabled(true);
        btn3.setEnabled(true);
        btn4.setEnabled(true);
        btn5.setEnabled(true);
        btn6.setEnabled(true);
        btn7.setEnabled(true);
        btn8.setEnabled(true);
        btn9.setEnabled(true);
        
        btnAcak.setEnabled(false);
        btnReset.setEnabled(true);
    }//GEN-LAST:event_btnAcakActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        btn1.setText(""); btn1.setEnabled(false);
        btn2.setText(""); btn2.setEnabled(false);
        btn3.setText(""); btn3.setEnabled(false);
        btn4.setText(""); btn4.setEnabled(false);
        btn5.setText(""); btn5.setEnabled(false);
        btn6.setText(""); btn6.setEnabled(false);
        btn7.setText(""); btn7.setEnabled(false);
        btn8.setText(""); btn8.setEnabled(false);
        btn9.setText(""); btn9.setEnabled(false);
        
        textPlayer.setText("");
        btnAcak.setEnabled(true);
        btnReset.setEnabled(false);
    }//GEN-LAST:event_btnResetActionPerformed

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
            java.util.logging.Logger.getLogger(Display.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Display.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Display.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Display.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and Display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Display().setVisible(true);
            }
        });
        
         try {
            InetAddress ia = InetAddress.getByName("localhost");
            int Port = 2134;
            String s = "Pesan ini dari Vian";
            byte[] b = s.getBytes();
            DatagramPacket dp = new DatagramPacket(b, b.length, ia, Port);
            DatagramSocket sender = new DatagramSocket();
            sender.send(dp);
        } catch (Exception e) {
        }
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnAcak;
    private javax.swing.JButton btnReset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel textPlayer;
    // End of variables declaration//GEN-END:variables
}
