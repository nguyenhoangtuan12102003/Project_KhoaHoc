/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI;

import DAL.StudentGradeDAL;
import DTO.StudentGradeDTO;
import BUS.StudentGradeBUS;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS
 */
public class PanelResultCourse extends javax.swing.JPanel {

    DefaultTableModel dtResultGraden;
    private StudentGradeBUS SGBUS;
    /**
     * Creates new form PanelPhanCOng
     */
    public PanelResultCourse() {
        initComponents();
        SGBUS = new StudentGradeBUS();
        dtResultGraden = (DefaultTableModel) tbResult.getModel();
        SGBUS.HienDL(dtResultGraden);
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnPhanCong = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbResult = new javax.swing.JTable();
        jTextField5 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();

        tbResult.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "EnrollmentID", "CourseID", "StudentID", "Grade"
            }
        ));
        tbResult.setToolTipText("");
        tbResult.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                editValue(evt);
            }
        });
        jScrollPane1.setViewportView(tbResult);

        jButton6.setText("Tìm Kiếm");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Không Sắp Xếp", "Giảm", "Tăng" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                swap(evt);
            }
        });

        jLabel1.setText("Sắp Xếp Theo Grade:");

        jButton1.setText("Reset");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Reset(evt);
            }
        });

        jButton2.setText("<");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrePage(evt);
            }
        });

        jButton3.setText(">");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextPage(evt);
            }
        });

        jLabel2.setText("1/2");

        jButton4.setText("Xoá");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                del(evt);
            }
        });

        javax.swing.GroupLayout pnPhanCongLayout = new javax.swing.GroupLayout(pnPhanCong);
        pnPhanCong.setLayout(pnPhanCongLayout);
        pnPhanCongLayout.setHorizontalGroup(
            pnPhanCongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPhanCongLayout.createSequentialGroup()
                .addGroup(pnPhanCongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnPhanCongLayout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(pnPhanCongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(pnPhanCongLayout.createSequentialGroup()
                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 854, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnPhanCongLayout.createSequentialGroup()
                        .addGap(390, 390, 390)
                        .addComponent(jButton2)
                        .addGap(29, 29, 29)
                        .addComponent(jLabel2)
                        .addGap(37, 37, 37)
                        .addComponent(jButton3)))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        pnPhanCongLayout.setVerticalGroup(
            pnPhanCongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnPhanCongLayout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(pnPhanCongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(pnPhanCongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jLabel2))
                .addGap(55, 55, 55))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnPhanCong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnPhanCong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    //load data table 

    private void swap(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_swap
        if(evt.getSource() == jComboBox1) {
            int idx = jComboBox1.getSelectedIndex();
            if(idx == 0) {
                SGBUS.Reset(dtResultGraden, jLabel2);
            } else if(idx == 1) {
                SGBUS.GradeGiam(dtResultGraden, jLabel2);
            } else {
                SGBUS.GradeTang(dtResultGraden, jLabel2);
            }
        }
    }//GEN-LAST:event_swap

    private void NextPage(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextPage
        SGBUS.NextPage(dtResultGraden, jLabel2);
    }//GEN-LAST:event_NextPage

    private void PrePage(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrePage
        SGBUS.PevPage(dtResultGraden, jLabel2);
    }//GEN-LAST:event_PrePage

    private void Reset(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Reset
       SGBUS.Reset(dtResultGraden, jLabel2);
    }//GEN-LAST:event_Reset

    private void del(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_del
        System.out.println(tbResult.getSelectedRow());
        if(tbResult.getSelectedRow() != -1) {
            int dialogResult = JOptionPane.showConfirmDialog(null, "bạn có muốn xoá dòng đã chọn không?", "Xác nhận", JOptionPane.YES_NO_OPTION);
            if (dialogResult == JOptionPane.YES_OPTION) {
                SGBUS.delete(dtResultGraden, jLabel2, tbResult.getSelectedRow());
               JOptionPane.showMessageDialog(null, "Xoá thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Đã huỷ hành động", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn dòng muốn xoá", "Thông báo", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_del

    private void editValue(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_editValue
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String[] rowData = new String[tbResult.getColumnCount()];
            for (int i = 0; i < tbResult.getColumnCount(); i++) {
                rowData[i] = String.valueOf(tbResult.getValueAt(tbResult.getSelectedRow(), i));
            }
            SGBUS.edit(Integer.parseInt(rowData[0]), Integer.parseInt(rowData[1]), Integer.parseInt(rowData[2]),  Float.parseFloat(rowData[3]));
            JOptionPane.showMessageDialog(null, "Đã lưu", "Thông báo", JOptionPane.INFORMATION_MESSAGE);  
        }
    }//GEN-LAST:event_editValue


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JPanel pnPhanCong;
    private javax.swing.JTable tbResult;
    // End of variables declaration//GEN-END:variables
}
