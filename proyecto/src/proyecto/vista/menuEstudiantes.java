/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.vista;

import ec.edu.espe.controller.ScheduleMaker;
import ec.edu.espe.controller.SubjectsCSD;
import ec.edu.espe.model.Subject;
import java.util.ArrayList;

/**
 *
 * @author COMPUTRONCEIBOS
 */
public class menuEstudiantes extends javax.swing.JFrame {

    /**
     * Creates new form menuEstudiantes
     */
    public menuEstudiantes() {
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

        jScrollPane3 = new javax.swing.JScrollPane();
        txtDTest = new javax.swing.JTextArea();
        btnShow = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtSemester = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        lblLvls = new javax.swing.JLabel();
        txtSemester1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(799, 599));
        setPreferredSize(new java.awt.Dimension(900, 650));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtDTest.setEditable(false);
        txtDTest.setColumns(20);
        txtDTest.setRows(5);
        jScrollPane3.setViewportView(txtDTest);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 213, 670, 320));

        btnShow.setText("Mostrar");
        btnShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowActionPerformed(evt);
            }
        });
        getContentPane().add(btnShow, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 90, 135, 60));

        jLabel2.setFont(new java.awt.Font("Century Schoolbook", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ESTUDIANTES");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 300, 40));

        txtSemester.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSemesterActionPerformed(evt);
            }
        });
        txtSemester.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSemesterKeyTyped(evt);
            }
        });
        getContentPane().add(txtSemester, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, 240, 44));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondoazul3.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        lblLvls.setText("jLabel3");
        getContentPane().add(lblLvls, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, -1, -1));

        txtSemester1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSemester1KeyTyped(evt);
            }
        });
        getContentPane().add(txtSemester1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, 240, 44));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowActionPerformed
        ArrayList<Subject> schedule = new ArrayList<>();
        ScheduleMaker scheduleMaker = new ScheduleMaker();
        schedule = scheduleMaker.StudentsSchedule(Integer.parseInt(txtSemester.getText()));
        String f = "";
        for (Subject subject : schedule) {
            char flag[];
            flag = subject.getScheduleFlag();
            subject.setDays("");
            for (int i = 0; i < flag.length; i++) {
                
                switch (flag[i]) {
                    case 97:
                        subject.setDays(subject.getDays() + "Lunes 7:15-9:15; ");
                        break;
                    case 98:
                        subject.setDays(subject.getDays() + "Martes 7:15-9:15; ");
                        break;
                    case 99:
                        subject.setDays(subject.getDays() + "Miercoles 7:15-9:15; ");
                        break;
                    case 100:
                        subject.setDays(subject.getDays() + "Jueves 7:15-9:15; ");
                        break;
                    case 101:
                        subject.setDays(subject.getDays() + "Viernes 7:15-9:15; ");
                        break;
                    case 102:
                        subject.setDays(subject.getDays() + "Lunes 9:30-11:30; ");
                        break;
                    case 103:
                        subject.setDays(subject.getDays() + "Martes 9:30-11:30; ");
                        break;
                    case 104:
                        subject.setDays(subject.getDays() + "Miercoles 9:30-11:30; ");
                        break;
                    case 105:
                        subject.setDays(subject.getDays() + "Jueves 9:30-11:30; ");
                        break;
                    case 106:
                        subject.setDays(subject.getDays() + "Viernes 9:30-11:30; ");
                        break;
                    case 107:
                        subject.setDays(subject.getDays() + "Lunes 12:00-2:00; ");
                        break;
                    case 108:
                        subject.setDays(subject.getDays() + "Martes 12:00-2:00; ");
                        break;
                    case 109:
                        subject.setDays(subject.getDays() + "Miercoles 12:00-2:00; ");
                        break;
                    case 110:
                        subject.setDays(subject.getDays() + "Jueves 12:00-2:00; ");
                        break;
                    case 111:
                        subject.setDays(subject.getDays() + "Viernes12:00-2:00; ");
                        break;
                    default:
                        subject.setDays(subject.getDays() + "No se pudo asignar ");
                        break;

                }

            }

            f = f + subject.toString() + "\n";
        }
        txtDTest.setText(f);

    }//GEN-LAST:event_btnShowActionPerformed

    private void txtSemesterKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSemesterKeyTyped
        char c=evt.getKeyChar();
        if(c<'0'||c>'9')evt.consume();
    }//GEN-LAST:event_txtSemesterKeyTyped

    private void txtSemester1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSemester1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSemester1KeyTyped

    private void txtSemesterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSemesterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSemesterActionPerformed

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
            java.util.logging.Logger.getLogger(menuEstudiantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuEstudiantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuEstudiantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuEstudiantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menuEstudiantes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnShow;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblLvls;
    private javax.swing.JTextArea txtDTest;
    private javax.swing.JTextField txtSemester;
    private javax.swing.JTextField txtSemester1;
    // End of variables declaration//GEN-END:variables
}
