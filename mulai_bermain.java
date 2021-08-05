import static java.awt.Frame.MAXIMIZED_BOTH;

public class mulai_bermain extends javax.swing.JFrame {

   
    public mulai_bermain() {
        initComponents();
         this.setExtendedState(MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jButton6.setBackground(new java.awt.Color(255, 0, 255));
        jButton6.setFont(new java.awt.Font("Nueva Std", 1, 12)); // NOI18N
        jButton6.setText("keluar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(70, 630, 90, 30);

        jLabel1.setFont(new java.awt.Font("Nueva Std", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 255));
        jLabel1.setText("EDUKASI PENGENALAN KOMPUTER");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(320, 30, 750, 60);

        jTextField1.setBackground(new java.awt.Color(255, 51, 255));
        jTextField1.setFont(new java.awt.Font("Nueva Std", 0, 18)); // NOI18N
        jTextField1.setText("Di bawah ini manakah yang disebut monitor?");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(200, 120, 410, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\Pictures\\oop\\Monitor.jpg")); // NOI18N
        jLabel2.setText("jLabel2");
        jLabel2.setPreferredSize(new java.awt.Dimension(150, 50));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(340, 180, 210, 130);

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\Pictures\\oop\\Memory-RAM.jpg")); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(910, 190, 210, 130);

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\Pictures\\oop\\Motherboard.jpg")); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(340, 460, 210, 130);

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\Pictures\\oop\\Hard-Disk.jpg")); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(920, 470, 210, 130);

        jButton1.setBackground(new java.awt.Color(255, 51, 255));
        jButton1.setFont(new java.awt.Font("Nueva Std", 1, 14)); // NOI18N
        jButton1.setText("A");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(270, 180, 50, 23);

        jButton7.setBackground(new java.awt.Color(255, 0, 255));
        jButton7.setFont(new java.awt.Font("Nueva Std", 1, 14)); // NOI18N
        jButton7.setText("C");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(270, 460, 50, 23);

        jButton8.setBackground(new java.awt.Color(204, 0, 204));
        jButton8.setFont(new java.awt.Font("Nueva Std", 1, 14)); // NOI18N
        jButton8.setText("B");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8);
        jButton8.setBounds(840, 190, 50, 23);

        jButton9.setBackground(new java.awt.Color(255, 0, 255));
        jButton9.setFont(new java.awt.Font("Nueva Std", 1, 14)); // NOI18N
        jButton9.setText("D");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9);
        jButton9.setBounds(850, 470, 50, 23);

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\Pictures\\oop\\OIP58.jpg")); // NOI18N
        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 0, 1380, 700);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new level_2 ().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        javax.swing.JOptionPane.showMessageDialog(null, "JAWABAN ANDA SALAH, SKOR 0!!! ");
       dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
         javax.swing.JOptionPane.showMessageDialog(null, "JAWABAN ANDA SALAH, SKOR 0!!! ");
       dispose();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        javax.swing.JOptionPane.showMessageDialog(null, "JAWABAN ANDA SALAH, SKOR 0!!! ");
       dispose();
    }//GEN-LAST:event_jButton9ActionPerformed
  public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mulai_bermain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
