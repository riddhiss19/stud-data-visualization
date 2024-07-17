
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import jdk.jfr.Percentage;

public class InsertData_OOP extends javax.swing.JFrame {
    String prn_pass;
    String Tabel_name;
    String Table_cgpa;
    public InsertData_OOP(String tabel) 
    {
        Tabel_name=tabel;
        initComponents();
        fetch();
        String postfix ="_cgpa";
        Table_cgpa = tabel + postfix;
        System.err.println(Table_cgpa);
        
    }

    InsertData_OOP() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        prn = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ha = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        gdppt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cp = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        subject = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        oral = new javax.swing.JTextField();
        theory = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelstudent = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        prnpass = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        himde = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(184, 231, 225));

        jPanel3.setBackground(new java.awt.Color(165, 192, 221));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit (1).png"))); // NOI18N
        jLabel1.setText("  Insert Data");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("PRN ");

        prn.setBackground(new java.awt.Color(155, 164, 181));
        prn.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        prn.setForeground(new java.awt.Color(0, 0, 0));
        prn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Subject");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Home Assignment");

        ha.setBackground(new java.awt.Color(155, 164, 181));
        ha.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        ha.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("PPT / GD");

        gdppt.setBackground(new java.awt.Color(155, 164, 181));
        gdppt.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        gdppt.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        gdppt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gdpptActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Course Project");

        cp.setBackground(new java.awt.Color(155, 164, 181));
        cp.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        cp.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Theroy");

        jButton1.setBackground(new java.awt.Color(165, 192, 221));
        jButton1.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/insert.png"))); // NOI18N
        jButton1.setText("  Insert");
        jButton1.setBorder(null);
        jButton1.setContentAreaFilled(false);
        jButton1.setDefaultCapable(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        subject.setBackground(new java.awt.Color(155, 164, 181));
        subject.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        subject.setForeground(new java.awt.Color(0, 0, 0));
        subject.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DMS", "OOP", "IOT", "DS", "EDI" }));
        subject.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        subject.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        subject.setOpaque(false);
        subject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subjectActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Name");

        name.setBackground(new java.awt.Color(155, 164, 181));
        name.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        name.setForeground(new java.awt.Color(0, 0, 0));
        name.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(57, 72, 103));
        jLabel9.setText("Enter details of student");
        jLabel9.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Oral");

        oral.setBackground(new java.awt.Color(155, 164, 181));
        oral.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        oral.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        theory.setBackground(new java.awt.Color(155, 164, 181));
        theory.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        theory.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel9)))
                        .addGap(75, 75, 75))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cp, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(theory, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ha, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(oral, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                                .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(prn, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(subject, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(gdppt, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addGap(59, 59, 59)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(prn, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(subject, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ha, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(gdppt, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cp, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(oral, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(theory, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(31, 31, 31)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/table.png"))); // NOI18N
        jLabel10.setText("  Data Tabel :-");

        tabelstudent.setBackground(new java.awt.Color(232, 243, 214));
        tabelstudent.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tabelstudent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PRN", "Name", "Subject", "HA", "PPT / GD", "CP", "Oral", "Theroy"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelstudent.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tabelstudent.setGridColor(new java.awt.Color(255, 255, 255));
        tabelstudent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelstudentMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelstudent);

        jButton2.setBackground(new java.awt.Color(184, 231, 225));
        jButton2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(184, 231, 225));
        jButton3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 0));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/update.png"))); // NOI18N
        jButton3.setAutoscrolls(true);
        jButton3.setBorderPainted(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/presentation.png"))); // NOI18N
        jLabel11.setText("  Student Analysis");
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("PRN :-");

        prnpass.setBackground(new java.awt.Color(204, 204, 204));
        prnpass.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton4.setBackground(new java.awt.Color(102, 255, 51));
        jButton4.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 0, 0));
        jButton4.setText("Visual Form");
        jButton4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jTextField1.setText("jTextField1");

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/data-analysis.png"))); // NOI18N
        jLabel14.setText("  Class Analysis");
        jLabel14.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jButton5.setBackground(new java.awt.Color(102, 255, 51));
        jButton5.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 0, 0));
        jButton5.setText("Visual Form");
        jButton5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(himde, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 649, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(26, 26, 26)
                                                .addComponent(prnpass, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(68, 68, 68))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel11)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGap(98, 98, 98)
                                                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(142, 142, 142)))
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(272, 272, 272)
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(119, 119, 119)
                                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel14)
                                        .addGap(39, 39, 39)))))
                        .addContainerGap(24, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(himde))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(48, 48, 48)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jTextField1)
                                        .addGap(25, 25, 25))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel11)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(jLabel14)
                                                        .addGap(36, 36, 36)
                                                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGap(58, 58, 58)
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                            .addComponent(prnpass, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(jLabel12))))
                                                .addGap(20, 20, 20)
                                                .addComponent(jButton4)))
                                        .addContainerGap(39, Short.MAX_VALUE))))))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   //static
  
//varaibel
    public static Connection con=null;
    int PRN_std;
        String name_std;
        String subject_std;
        int ha_std;
        int pptgd_std;
        int cp_std;
        int oral_std;
        int theory_std;
        Statement st;
    ArrayList<User> students = new ArrayList<>();
    static int temp=4;
    

//button events
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (LoginValidation()==true)
        {
            try 
            {
                insert();
            } 
            catch (SQLException ex) 
            {
                Logger.getLogger(InsertData_OOP.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tabelstudentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelstudentMouseClicked
        int i = tabelstudent.getSelectedRow();
        TableModel model = tabelstudent.getModel();
        
        prn.setText(model.getValueAt(i, 0).toString());
        name.setText(model.getValueAt(i, 1).toString());
        ha.setText(model.getValueAt(i, 3).toString());
        subject.getItemAt(2);
        gdppt.setText(model.getValueAt(i, 4).toString());
        cp.setText(model.getValueAt(i, 5).toString());
        oral.setText(model.getValueAt(i, 6).toString());
        theory.setText(model.getValueAt(i, 7).toString());
    }//GEN-LAST:event_tabelstudentMouseClicked

    private void subjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subjectActionPerformed
         if(subject.getSelectedItem()=="EDI")
         {
             
             String PRN = prn.getText();
             String name = this.name.getText();
               
               int PRN_int = Integer.parseInt(PRN);
               int count = 0;
           
                 try {
                     con = DriverManager.getConnection("jdbc:mysql://localhost:3306/OOP_CP","root","");
                     String sql3 = "SELECT COUNT(PRN) FROM "+Tabel_name+" WHERE PRN = "+PRN_int+"";
                      PreparedStatement pst1 =con.prepareStatement(sql3);
                      ResultSet rs = pst1.executeQuery();
                      while(rs.next())
                      {
                         count = rs.getInt(1);
                      }
                      
                      if(count >= 4)
                      {
                          String edi_score = JOptionPane.showInputDialog("Enter Final Score");
                          int edi_score_int = Integer.parseInt(edi_score);
                          String edi_subject ="EDI";
                      
                      
                      
                      con = DriverManager.getConnection("jdbc:mysql://localhost:3306/OOP_CP","root","");
                      PreparedStatement pst =con.prepareStatement("  INSERT INTO "+Tabel_name+"(PRN,Name,Subject,Theroy,Total_100) values('"+PRN_int+"','"+name+"','"+edi_subject+"','"+edi_score_int+"','"+edi_score_int+"') ");
                      pst.execute();
                      DefaultTableModel model = (DefaultTableModel) tabelstudent.getModel();
                      model.setRowCount(0);                   
                      fetch();
                      
                     
                      
                      Statement statement = con.createStatement();
                      ResultSet resultSet = statement.executeQuery("SELECT SUM(Total_100) FROM "+Tabel_name+" WHERE PRN = "+PRN+"");
                      
                      float total_marks = 0;
                      float percentage = 0;
                       if (resultSet.next()) 
                       {
                            total_marks = resultSet.getInt(1);
                            percentage = ((total_marks/500)*100);
                       }
                      
                      PreparedStatement pst2 =con.prepareStatement("Insert Into "+Table_cgpa+" (PRN,Total_Marks,Percentage) values('"+PRN+"','"+total_marks+"','"+percentage+"')");
                      pst2.execute();
                      }
                      else
                      {
                           JOptionPane.showMessageDialog(this,"Please Fill All Other Subject Data First");
                      }
                      
                 } catch (SQLException ex) {
                     Logger.getLogger(InsertData_OOP.class.getName()).log(Level.SEVERE, null, ex);
                 }
                      
             
         }
         else{
              String PRN = prn.getText();
              String name = this.name.getText();
              String subject1 = (String) subject.getSelectedItem();
               int PRN_int = Integer.parseInt(PRN);
               int count = 0;
               
               
               
             try {
                 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/OOP_CP","root","");
                 String sql1 = "SELECT * FROM "+Tabel_name+" WHERE PRN="+PRN_int+" AND Subject='"+subject1+"'";
                 PreparedStatement pst =con.prepareStatement(sql1);
                 ResultSet rs = pst.executeQuery();
                 
                 if(rs.next())
                 {
                     JOptionPane.showMessageDialog(this,"Marks For This PRN are previously submitted for this subject");
                 }
                 else
                 {
                     //JOptionPane.showMessageDialog(this,"Marks For This PRN are previously submitted for this subject");
                 }
                 
                    
             } catch (SQLException ex) {
                 Logger.getLogger(InsertData_OOP.class.getName()).log(Level.SEVERE, null, ex);
             }
                      
               
           
         }
    }//GEN-LAST:event_subjectActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        prn_pass = prnpass.getText();
        Validation obj= new Validation(prn_pass,Tabel_name);
        obj.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         PRN_std=Integer.parseInt(prn.getText().trim());
         name_std=name.getText().trim();
         subject_std = (String) subject.getSelectedItem();
         ha_std = Integer.parseInt(ha.getText().trim());
         pptgd_std = Integer.parseInt(gdppt.getText().trim());
         cp_std=Integer.parseInt(cp.getText().trim());
         theory_std=Integer.parseInt(theory.getText().trim());
         oral_std=Integer.parseInt(oral.getText().trim());   
         
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/OOP_CP","root","");
            System.out.println("UPDATE  "+Tabel_name+" SET `Name`='"+name_std+"',`HA`='"+ha_std+"',`GDPPT`='"+ pptgd_std+"',`CP`='"+cp_std+"',`Oral`='"+oral_std+"',`Theroy`='"+ theory_std+"' WHERE 'PRN' = '"+PRN_std+"' && 'Subject' = '"+subject_std+"'");
            
             PreparedStatement pst =con.prepareStatement("UPDATE  "+Tabel_name+" SET `Name`='"+name_std+"',`HA`="+ha_std+",`GDPPT`='"+ pptgd_std+"',`CP`='"+cp_std+"',`Oral`='"+oral_std+"',`Theroy`='"+ theory_std+"' WHERE `PRN` = "+PRN_std+" && `Subject` = '"+subject_std+"'");
             pst.execute();
             
             DefaultTableModel model = (DefaultTableModel) tabelstudent.getModel();
                    model.setRowCount(0);                   
                    fetch();
            
            
        } catch (SQLException ex) {
            Logger.getLogger(InsertData_OOP.class.getName()).log(Level.SEVERE, null, ex);
        }
         
       
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int i = tabelstudent.getSelectedRow();
        if (i >= 0) {
            int option = JOptionPane.showConfirmDialog(rootPane,
                    "Are you sure you want to Delete?", "Delete confirmation", JOptionPane.YES_NO_OPTION);
            if (option == 0) {
                TableModel model = tabelstudent.getModel();

                String id = model.getValueAt(i, 0).toString();
                String sub = model.getValueAt(i, 2).toString();
                if (tabelstudent.getSelectedRows().length == 1) {
                    delete(id,sub);
                    DefaultTableModel model1 = (DefaultTableModel) tabelstudent.getModel();
                    model1.setRowCount(0);
                    fetch();
                    clear();
                }
            }
        } else {
            
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        Class_Analysis obj1;
        try {
            obj1 = new Class_Analysis(Tabel_name,Table_cgpa);
            this.dispose();
            obj1.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(InsertData_OOP.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void gdpptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gdpptActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gdpptActionPerformed

    //methods application
    public boolean LoginValidation()
    {
         PRN_std=Integer.parseInt(prn.getText());
         name_std=name.getText();
         subject_std = (String) subject.getSelectedItem();
         ha_std = Integer.parseInt(ha.getText());
         pptgd_std = Integer.parseInt(gdppt.getText());
         cp_std=Integer.parseInt(cp.getText());
         theory_std=Integer.parseInt(theory.getText());
         oral_std=Integer.parseInt(oral.getText());
        //String Name_std = name.getText();
        
        if(PRN_std == 0)
        {
            JOptionPane.showMessageDialog(this,"Enter PRN");
            return false;
        }
        if(name_std.equals(""))
        {
            JOptionPane.showMessageDialog(this,"Enter Name");
            return false;
        }
          if(subject_std.equals(""))
        {
            JOptionPane.showMessageDialog(this,"Select Subject");
            return false;
        }  if(ha_std == 0)
        {
            JOptionPane.showMessageDialog(this,"Enter Home Assignment Marks");
            return false;
        }  if(pptgd_std == 0)
        {
            JOptionPane.showMessageDialog(this,"Enter Presentation / Group discussion Marks");
            return false;
        }  if(cp_std == 0)
        {
            JOptionPane.showMessageDialog(this,"Enter Course Project Marks");
            return false;
        }
          if(theory_std == 0)
        {
            JOptionPane.showMessageDialog(this,"Enter theroy marks");
            return false;
        }
        
        return true;
        
    }
    
    public void insert() throws SQLException
    {
          con = DriverManager.getConnection("jdbc:mysql://localhost:3306/OOP_CP","root","");
          
          //calculating total 
          int HA_converted = ha_std/5;
          int GDPPT_converted = ha_std/5;
          int CP_converted = cp_std/5;
          int Oral_converted = oral_std/5;
          int Theory_converted = theory_std/5;
          
          int Aggregate_subject = HA_converted+GDPPT_converted+CP_converted+Oral_converted+Theory_converted;
          System.out.println(HA_converted);
          System.out.println(GDPPT_converted);
          System.out.println(CP_converted);
          System.out.println(Oral_converted);
          System.out.println(Theory_converted);
        
          PreparedStatement pst =con.prepareStatement("INSERT INTO "+Tabel_name+"(PRN, Name, Subject, HA, GDPPT, CP, Oral, Theroy, Total_100) VALUES ('"+PRN_std+"','"+name_std+"','"+subject_std+"','"+ha_std+"','"+pptgd_std+"','"+cp_std+"','"+oral_std+"','"+theory_std+"','"+Aggregate_subject+"')");
          if(pst.execute())
          {
              JOptionPane.showMessageDialog(this,"Error");

          }
          else
          {
              JOptionPane.showMessageDialog(this,"Record Inserted Succesfully");
          }
           
          DefaultTableModel model = (DefaultTableModel) tabelstudent.getModel();
          Object[] row = new Object[8];
                row[0] = PRN_std;
                row[1] = name_std;
                row[2] = subject_std;
                row[3] = ha_std;
                row[4] = pptgd_std;
                row[5] = cp_std;
                row[6] = oral_std;
                row[7] = theory_std;

                model.addRow(row);
          
            
    }
    
   public  void fetch() {
        
        try {
            students.clear();
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/OOP_cp", "root", "");
            
            String sql = "select * from "+Tabel_name+"";
            st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while (rs.next()) {
                System.out.println(rs.getString("PRN"));
                User user = new User(rs.getString("PRN"), rs.getString("Name"), rs.getString("subject"),rs.getString("Ha"),rs.getString("gdppt"),rs.getString("cp"),rs.getString("oral"),rs.getString("theroy"));
                students.add(user);
            }
            DefaultTableModel model = (DefaultTableModel) tabelstudent.getModel();
            for (User user : students) {

                Object[] row = new Object[8];
                row[0] = user.getPRN();
                row[1] = user.getNAME();
                row[2] = user.getSubject();
                row[3] = user.getHA();
                row[4] = user.getPPTGD();
                row[5] = user.getCP();
                row[6] = user.getOral();
                row[7] = user.gettheory();

                model.addRow(row);
            }

        } catch (SQLException ex) {
            Logger.getLogger(InsertData_OOP.class.getName()).log(Level.SEVERE, null, ex);
        }
    } 
    
    public void delete(String id,String sub) {
        try {
           
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/OOP_CP", "root", "");
            String sql = "DELETE FROM "+Tabel_name+" WHERE PRN='" + id + "' AND Subject = '"+sub+"'";
            st = con.createStatement();
            st.execute(sql);
        } catch (SQLException ex) {
           
        }

    }
    
    private void clear() {
        name.setText("");
        prn.setText("");
        ha.setText("");;
        gdppt.setText("");;
        cp.setText("");
        oral.setText("");;
        theory.setText("");
        

    }
    //driver class
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               
                new InsertData_OOP("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cp;
    private javax.swing.JTextField gdppt;
    private javax.swing.JTextField ha;
    private javax.swing.JLabel himde;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField name;
    private javax.swing.JTextField oral;
    private javax.swing.JTextField prn;
    private javax.swing.JTextField prnpass;
    private javax.swing.JComboBox<String> subject;
    private javax.swing.JTable tabelstudent;
    private javax.swing.JTextField theory;
    // End of variables declaration//GEN-END:variables
}
