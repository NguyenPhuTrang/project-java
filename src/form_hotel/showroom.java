/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package form_hotel;

import javax.swing.JOptionPane;
import form_hotel.home;
import java.awt.Container;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTabbedPane;

/**
 *
 * @author Asus
 */
public class showroom extends javax.swing.JFrame {

    public showroom() {
        initComponents();
    }

    String RoomNumber;
    String TypeRoom;
    String Bed;
    String Price;
    String imgUrl;
    String Status;

    showroom(String RoomNumber, String TypeRoom, String Bed, String Price, String imgUrl, String Status) {
        initComponents();
        this.RoomNumber = RoomNumber;
        this.TypeRoom = TypeRoom;
        this.Bed = Bed;
        this.Price = Price;
        this.imgUrl = imgUrl;

        lb_soPhong.setText(RoomNumber);
        lb_kieuPhong.setText(TypeRoom);
        lb_kieuGiuong.setText(Bed);
        lb_GIa.setText(Price + ".000 VND");
        ImageIcon icon = new ImageIcon(imgUrl);
        JLabel label = new JLabel(icon);
        label.setBounds(
                5, 5, 460, 300);
        pn_hinhAnh.add(label);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pn_hinhAnh = new javax.swing.JPanel();
        lb_Thoat = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lb_soPhong = new javax.swing.JLabel();
        lb_kieuPhong = new javax.swing.JLabel();
        lb_kieuGiuong = new javax.swing.JLabel();
        lb_GIa = new javax.swing.JLabel();
        lb_troLai = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btn_datPhong1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(700, 500));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pn_hinhAnh.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pn_hinhAnhLayout = new javax.swing.GroupLayout(pn_hinhAnh);
        pn_hinhAnh.setLayout(pn_hinhAnhLayout);
        pn_hinhAnhLayout.setHorizontalGroup(
            pn_hinhAnhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 470, Short.MAX_VALUE)
        );
        pn_hinhAnhLayout.setVerticalGroup(
            pn_hinhAnhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 310, Short.MAX_VALUE)
        );

        getContentPane().add(pn_hinhAnh, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 470, 310));

        lb_Thoat.setBackground(new java.awt.Color(255, 255, 255));
        lb_Thoat.setFont(new java.awt.Font("Cascadia Mono", 1, 24)); // NOI18N
        lb_Thoat.setText("x");
        lb_Thoat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_ThoatMouseClicked(evt);
            }
        });
        getContentPane().add(lb_Thoat, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 0, 30, 40));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 204, 204));
        jLabel5.setText("Số phòng *");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 120, 80, 30));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 204, 204));
        jLabel7.setText("Loại phòng *");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 180, 90, 30));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 204, 204));
        jLabel8.setText("Kiểu giường *");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 240, 110, 30));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 204, 204));
        jLabel9.setText("Giá / ngày *");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 300, 90, 30));

        lb_soPhong.setText("jLabel1");
        getContentPane().add(lb_soPhong, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 150, 90, 30));

        lb_kieuPhong.setText("jLabel2");
        getContentPane().add(lb_kieuPhong, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 210, 90, 30));

        lb_kieuGiuong.setText("jLabel3");
        getContentPane().add(lb_kieuGiuong, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 270, 90, 30));

        lb_GIa.setText("jLabel4");
        getContentPane().add(lb_GIa, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 330, 110, 30));

        lb_troLai.setBackground(new java.awt.Color(255, 255, 255));
        lb_troLai.setFont(new java.awt.Font("Agency FB", 1, 35)); // NOI18N
        lb_troLai.setText(" <");
        lb_troLai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_troLaiMouseClicked(evt);
            }
        });
        getContentPane().add(lb_troLai, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 30, 40));

        jLabel1.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 204));
        jLabel1.setText("Thông tin phòng tại khách sạn !");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 470, 40));

        btn_datPhong1.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        btn_datPhong1.setForeground(new java.awt.Color(255, 0, 51));
        btn_datPhong1.setText("Đặt phòng");
        btn_datPhong1.setAutoscrolls(true);
        btn_datPhong1.setBorder(null);
        btn_datPhong1.setFocusPainted(false);
        btn_datPhong1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_datPhong1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_datPhong1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 420, 100, 30));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lb_ThoatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_ThoatMouseClicked
        // TODO add your handling code here:
        int a = JOptionPane.showConfirmDialog(null, "Bạn có muốn thoát ứng dụng không ? ", "Thông báo !", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            setVisible(false);
            System.exit(a);
        }
    }//GEN-LAST:event_lb_ThoatMouseClicked

    private void lb_troLaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_troLaiMouseClicked
        // TODO add your handling code here:
        setVisible(false);
        new home().setVisible(true);
    }//GEN-LAST:event_lb_troLaiMouseClicked

    private void btn_datPhong1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_datPhong1ActionPerformed
        // TODO add your handling code here:
        // Khai báo JFrame hiện tại là frame1 và JFrame mới là frame2
        showroom frame1 = new showroom();
        home frame2 = new home();

// Lấy content pane của JFrame mới
        Container contentPane = frame2.getContentPane();

// Lấy JTabbedPane từ content pane
        JTabbedPane tabbedPane = (JTabbedPane) contentPane.getComponent(0);

// Chuyển đổi giữa các tab bằng cách sử dụng setSelectedIndex()
        tabbedPane.setSelectedIndex(1);

// Hiển thị JFrame mới
        frame2.pack();
        frame2.setVisible(true);

// Ẩn JFrame hiện tại
        frame1.setVisible(false);
    }//GEN-LAST:event_btn_datPhong1ActionPerformed

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
            java.util.logging.Logger.getLogger(showroom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(showroom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(showroom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(showroom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new showroom().setVisible(true);
//            }
//        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_datPhong1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lb_GIa;
    private javax.swing.JLabel lb_Thoat;
    private javax.swing.JLabel lb_kieuGiuong;
    private javax.swing.JLabel lb_kieuPhong;
    private javax.swing.JLabel lb_soPhong;
    private javax.swing.JLabel lb_troLai;
    private javax.swing.JPanel pn_hinhAnh;
    // End of variables declaration//GEN-END:variables
}
