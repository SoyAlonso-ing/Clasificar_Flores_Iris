/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package ui;

import back_end.Validator;
import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.extras.FlatSVGIcon;
import com.formdev.flatlaf.themes.FlatMacLightLaf;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Kris
 */
public class SecurityPassword extends javax.swing.JDialog {

    private JFrame parentFrame;
    
    public SecurityPassword(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        this.parentFrame=(JFrame) parent;
        initComponents();
        design();
    }

   
    
    public void Flatlaf()
    {
        SwingUtilities.invokeLater(() -> {
            try {
                UIManager.setLookAndFeel(new FlatMacLightLaf());
                SwingUtilities.updateComponentTreeUI(this);
            } catch (UnsupportedLookAndFeelException ex) {
                //funcion q mamda joption pane con el string como mensaje deljoption pane
                //UIControllers.JOptioncatch(String);
            }
        });
    }
    //funcion para diseño general del jdialog
    private void design()
    {
        UIControllers.setFontFamily("Arial");
        setIconImage(UIControllers.design().getImage());
        this.setSize(386, 270);
        Flatlaf();
        getRootPane().putClientProperty(FlatClientProperties.TITLE_BAR_BACKGROUND, new Color(102, 153, 255));
        getRootPane().putClientProperty(FlatClientProperties.TITLE_BAR_SHOW_MAXIMIZE,false);
        getRootPane().putClientProperty(FlatClientProperties.TITLE_BAR_SHOW_ICON,true);
        getRootPane().putClientProperty(FlatClientProperties.TITLE_BAR_SHOW_ICONIFFY,true);
        this.setLocationRelativeTo(null);
        PasswordField.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "  ********  ");
        PasswordField.putClientProperty(FlatClientProperties.STYLE,"showRevealButton:true;");
        LabelIncorrecto.setVisible(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        LabelSecurity = new javax.swing.JLabel();
        PasswordField = new javax.swing.JPasswordField();
        buttonBack = new javax.swing.JButton();
        ButtonEnter = new javax.swing.JButton();
        LabelIncorrecto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Seguridad");
        setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        setPreferredSize(new java.awt.Dimension(610, 340));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(474, 270));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LabelSecurity.setBackground(new java.awt.Color(255, 255, 255));
        LabelSecurity.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LabelSecurity.setForeground(new java.awt.Color(102, 153, 255));
        LabelSecurity.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelSecurity.setText("Contraseña de seguridad");
        jPanel1.add(LabelSecurity, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 230, 50));

        PasswordField.setBackground(new java.awt.Color(255, 255, 255));
        PasswordField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        PasswordField.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(PasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 200, 30));

        buttonBack.setIcon(new FlatSVGIcon("png/arrow.svg"));
        buttonBack.setBackground(new java.awt.Color(255, 255, 255));
        buttonBack.setForeground(new java.awt.Color(102, 153, 255));
        buttonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBackActionPerformed(evt);
            }
        });
        jPanel1.add(buttonBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(322, 20, 40, 30));

        ButtonEnter.setBackground(new java.awt.Color(255, 255, 255));
        ButtonEnter.setForeground(new java.awt.Color(102, 153, 255));
        ButtonEnter.setText("Entrar");
        ButtonEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonEnterActionPerformed(evt);
            }
        });
        jPanel1.add(ButtonEnter, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 90, 30));

        LabelIncorrecto.setBackground(new java.awt.Color(255, 255, 255));
        LabelIncorrecto.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(LabelIncorrecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 160, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buttonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBackActionPerformed
        this.dispose();
    }//GEN-LAST:event_buttonBackActionPerformed

    private void ButtonEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEnterActionPerformed
        if(!Validator.checkPassword(PasswordField.getText()))
        {
            PasswordField.putClientProperty("JComponent.outline","error");
            LabelIncorrecto.setText("La contraseña es incorrecta");
            LabelIncorrecto.setVisible(true);
        }
        else
        {
            LabelIncorrecto.setVisible(false);
            PasswordField.putClientProperty("JComponent.outline",new Color(102, 153, 255));
            if(UIControllers.Security==1)
            {
                
                parentFrame.setVisible(false);
                this.dispose();
                DataBaseMenu data=new DataBaseMenu();
                data.setVisible(true);
            }
            else if(UIControllers.Security==2)
            {
                parentFrame.setVisible(false);
                new InitMenu().setVisible(false);
                new TrainMenu().setVisible(true);
                this.dispose();
            }
        }
    }//GEN-LAST:event_ButtonEnterActionPerformed

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
            java.util.logging.Logger.getLogger(SecurityPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SecurityPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SecurityPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SecurityPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                SecurityPassword dialog = new SecurityPassword(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonEnter;
    private javax.swing.JLabel LabelIncorrecto;
    private javax.swing.JLabel LabelSecurity;
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JButton buttonBack;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
