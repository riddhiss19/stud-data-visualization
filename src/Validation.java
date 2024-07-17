
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Properties;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;
import org.jfree.data.category.DefaultCategoryDataset;
import javax.mail.*;
import javax.mail.Session;

import java.util.Properties;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

public class Validation extends javax.swing.JFrame {

    String PRN;
    String table_final;
    int PRN_std;
    String name_std;
    String subject_std;
    int ha_std;
    int pptgd_std;
    int cp_std;
    int oral_std;
    int theory_std;

    public Validation(String refvar, String table) {
        initComponents();
        PRN = refvar;
        table_final = table;

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        op = new javax.swing.JPanel();
        op2 = new javax.swing.JPanel();
        op3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        tosend = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        subjectsend = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        bodysend = new javax.swing.JTextArea();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        dropbox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 225));

        jPanel2.setBackground(new java.awt.Color(184, 231, 225));

        jTabbedPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
        });

        op.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        op.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                opMouseClicked(evt);
            }
        });
        op.setLayout(new java.awt.BorderLayout());
        jTabbedPane1.addTab("Pie Chart", op);

        op2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        op2.setLayout(new java.awt.BorderLayout());
        jTabbedPane1.addTab("Bar Graph", op2);

        op3.setLayout(new java.awt.BorderLayout());
        jTabbedPane1.addTab("Overall Subjects Score", op3);

        jPanel1.setBackground(new java.awt.Color(165, 192, 221));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText(" To :-");

        tosend.setBackground(new java.awt.Color(204, 204, 204));
        tosend.setForeground(new java.awt.Color(0, 0, 0));
        tosend.setBorder(null);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Subject :-");

        subjectsend.setBackground(new java.awt.Color(204, 204, 204));
        subjectsend.setForeground(new java.awt.Color(0, 0, 0));
        subjectsend.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Body :-");

        bodysend.setBackground(new java.awt.Color(204, 204, 204));
        bodysend.setColumns(20);
        bodysend.setForeground(new java.awt.Color(0, 0, 0));
        bodysend.setRows(5);
        bodysend.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane1.setViewportView(bodysend);

        jButton3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton3.setText("Send");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Report Mail");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(337, 337, 337)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                        .addComponent(subjectsend, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tosend, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(366, 366, 366))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(488, 488, 488)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(421, 421, 421))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel5)
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tosend, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(subjectsend, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(70, 70, 70)
                .addComponent(jButton3)
                .addGap(75, 75, 75))
        );

        jTabbedPane1.addTab("Review / Mail", jPanel1);

        jButton2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/previous.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        dropbox.setBackground(new java.awt.Color(155, 164, 181));
        dropbox.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        dropbox.setForeground(new java.awt.Color(51, 51, 51));
        dropbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "OOP", "DMS", "IOT", "DS" }));
        dropbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dropboxActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Subject :- ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dropbox, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(501, 501, 501))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1086, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 592, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(dropbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 692, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        InsertData_OOP obj = new InsertData_OOP(table_final);
        obj.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String to = tosend.getText();
        String subject = subjectsend.getText();
        String body = bodysend.getText();

        sendmail(to, subject, body);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked
        int temp = jTabbedPane1.getSelectedIndex();

        System.out.println(temp);

        if (temp == 2 || temp == 3) {
            jLabel1.hide();
            dropbox.hide();

        } else {
            jLabel1.validate();
            dropbox.validate();
        }

    }//GEN-LAST:event_jTabbedPane1MouseClicked

    private void opMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_opMouseClicked
    System.out.println("");
    }//GEN-LAST:event_opMouseClicked


    private void dropboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dropboxActionPerformed
        try {
            showPieChart();
            //
            showBarChart();
            showPieChart1();

        } catch (SQLException ex) {
            Logger.getLogger(Validation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_dropboxActionPerformed

    public void showPieChart() throws SQLException {

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/OOP_CP", "root", "");
        PreparedStatement pst = con.prepareStatement("SELECT * FROM " + table_final + " WHERE PRN=? AND Subject=?");

        pst.setInt(1, Integer.parseInt(PRN));
        pst.setString(2, dropbox.getItemAt(dropbox.getSelectedIndex()));

        ResultSet rs = pst.executeQuery();

        while (rs.next()) {
            PRN_std = rs.getInt("PRN");
            name_std = rs.getString("Name");
            subject_std = rs.getString("Subject");
            ha_std = rs.getInt("HA");
            pptgd_std = rs.getInt("GDPPT");
            cp_std = rs.getInt("CP");
            oral_std = rs.getInt("Oral");
            theory_std = rs.getInt("Theroy");
        }
        System.out.print(ha_std);
        //create dataset
        DefaultPieDataset barDataset = new DefaultPieDataset();

        barDataset.setValue("Home Assignment  ( " + ha_std + " ),(" + ((ha_std * 100 / 500) + 2) + "%)", ha_std);
        barDataset.setValue("Group Discussion/PPT  ( " + pptgd_std + " ) ,(" + ((pptgd_std * 100 / 500) + 2) + "%)", pptgd_std);
        barDataset.setValue("Course Project  ( " + cp_std + " ) ,(" + ((cp_std * 100) / 500 + 2) + "%)", cp_std);
        barDataset.setValue("Oral   ( " + oral_std + " ) ,(" + ((oral_std * 100 / 500) + 2) + "%)", oral_std);
        barDataset.setValue("Theroy  ( " + theory_std + " ) ,(" + ((theory_std * 100 / 500) + 2) + "%)", theory_std);
        System.err.println(ha_std * 100 / 500);
//        System.err.println((pptgd_std*100/500);
//         System.err.println(((ha_std*100)/500));
//          System.err.println(((ha_std*100)/500));
//        System.err.println(((ha_std*100)/500));

        String Title = dropbox.getItemAt(dropbox.getSelectedIndex());
        //create chart
        JFreeChart piechart = ChartFactory.createPieChart("" + Title + "", barDataset, true, true, true);//explain
        PiePlot piePlot = (PiePlot) piechart.getPlot();
        piePlot.setBackgroundPaint(Color.white);
        ChartPanel barChartPanel = new ChartPanel(piechart);
        op.removeAll();
        op.add(barChartPanel, BorderLayout.CENTER);
        op.validate();

    }

    public void showPieChart1() throws SQLException {

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/OOP_CP", "root", "");
        PreparedStatement pst = con.prepareStatement("SELECT Total_100 FROM " + table_final + " WHERE PRN=?");

        pst.setInt(1, Integer.parseInt(PRN));

        ResultSet rs = pst.executeQuery();
        ArrayList<Integer> totals_arraylist = new ArrayList<>();
        while (rs.next()) {
            int Toatal = rs.getInt("Total_100");
            totals_arraylist.add(Toatal);
            System.out.println(totals_arraylist);
        }

        Integer[] final_total = totals_arraylist.toArray(new Integer[totals_arraylist.size()]);
        System.out.println(final_total[0]);

        //percentage
        int DMS_per = ((final_total[0] / 600) * 100);
        //create dataset
        DefaultPieDataset barDataset = new DefaultPieDataset();
        barDataset.setValue("DMS  (" + final_total[0] + ")", final_total[0]);
        barDataset.setValue("OOP (" + final_total[1] + ")", final_total[1]);
        barDataset.setValue("IOT (" + final_total[2] + ")", final_total[2]);
        barDataset.setValue("DS (" + final_total[3] + ")", final_total[3]);
        barDataset.setValue("EDI (" + final_total[4] + ")", final_total[4]);

        String Title = dropbox.getItemAt(dropbox.getSelectedIndex());
        //create chart
        JFreeChart piechart = ChartFactory.createPieChart("Subject Wise Weight", barDataset, true, true, true);//explain
        PiePlot piePlot = (PiePlot) piechart.getPlot();
        piePlot.setBackgroundPaint(Color.white);
        ChartPanel barChartPanel = new ChartPanel(piechart);
        op3.removeAll();
        op3.add(barChartPanel, BorderLayout.CENTER);
        op3.validate();

    }

    public void showBarChart() throws SQLException {

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/OOP_CP", "root", "");
        PreparedStatement pst = con.prepareStatement("SELECT * FROM " + table_final + " WHERE PRN=? AND Subject=?");

        pst.setInt(1, Integer.parseInt(PRN));
        pst.setString(2, dropbox.getItemAt(dropbox.getSelectedIndex()));

        ResultSet rs = pst.executeQuery();

        while (rs.next()) {
            PRN_std = rs.getInt("PRN");
            name_std = rs.getString("Name");
            subject_std = rs.getString("Subject");
            ha_std = rs.getInt("HA");
            pptgd_std = rs.getInt("GDPPT");
            cp_std = rs.getInt("CP");
            oral_std = rs.getInt("Oral");
            theory_std = rs.getInt("Theroy");
        }

        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.setValue(ha_std, "Score", "HA(" + ha_std + ")");
        dataset.setValue(pptgd_std, "Score", "GD/PPT(" + pptgd_std + ")");
        dataset.setValue(cp_std, "Score", "CP(" + cp_std + ")");
        dataset.setValue(oral_std, "Score", "Oral(" + oral_std + ")");
        dataset.setValue(theory_std, "Score", "Theory(" + theory_std + ")");

        JFreeChart chart = ChartFactory.createBarChart("Marks Distribution", "Subject", "Score",
                dataset, PlotOrientation.VERTICAL, false, true, false);

        CategoryPlot categoryPlot = chart.getCategoryPlot();
        //categoryPlot.setRangeGridlinePaint(Color.BLUE);
        categoryPlot.setBackgroundPaint(Color.WHITE);
        BarRenderer renderer = (BarRenderer) categoryPlot.getRenderer();
        Color clr3 = new Color(51, 153, 255);
        renderer.setSeriesPaint(0, clr3);

        ChartPanel barpChartPanel = new ChartPanel(chart);
        op2.removeAll();
        op2.add(barpChartPanel, BorderLayout.CENTER);
        op2.validate();

    }

    void sendmail(String to, String subject, String body) {
        boolean flag = false;

        //setting smptp property
        Properties properties = new Properties();
        properties.put("mail.smtp.auth", true);
        properties.put("mail.smtp.starttls.enable", true);
        properties.put("mail.smtp.port", "587");
        properties.put("mail.smtp.host", "smtp.gmail.com");

        //session get
        Session session = Session.getDefaultInstance(properties, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("vidya.patil1206@gmail.com", "yewzgrwcwdtakctz");
            }
        });

        try {
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress("vidya.patil1206@gmail.com"));
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(to));
            message.setSubject(subject);
            message.setText(bodysend.getText());
            Transport.send(message);
            JOptionPane.showMessageDialog(this, "Mail Sended Sucessfully");
        } catch (Exception ex) {
            System.out.println("" + ex);
        }

    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new Validation("", "").setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea bodysend;
    private javax.swing.JComboBox<String> dropbox;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel op;
    private javax.swing.JPanel op2;
    private javax.swing.JPanel op3;
    private javax.swing.JTextField subjectsend;
    private javax.swing.JTextField tosend;
    // End of variables declaration//GEN-END:variables
}
