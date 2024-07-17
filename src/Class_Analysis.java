
import java.awt.BorderLayout;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;


public class Class_Analysis extends javax.swing.JFrame {
String Tabel_name_this;
String Tabel_cgpa_this;
    public Class_Analysis() {
       initComponents();
    }

    Class_Analysis(String Tabel_name, String Table_cgpa) throws SQLException {
            Tabel_name_this = Tabel_name;
            Tabel_cgpa_this = Table_cgpa;
           initComponents();
           fetch();
           fetch1();
           showBarChart();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        subjectwise = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        stud_distribution = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        barchartshow = new javax.swing.JPanel();
        pie = new javax.swing.JPanel();
        pi1 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        sub_disto = new javax.swing.JTable();
        pan1 = new javax.swing.JPanel();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        pan2 = new javax.swing.JPanel();
        dropbox = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(184, 231, 225));

        jPanel2.setBackground(new java.awt.Color(184, 231, 225));

        subjectwise.setBackground(new java.awt.Color(165, 192, 221));

        jButton2.setBackground(new java.awt.Color(102, 255, 102));
        jButton2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(51, 51, 51));
        jButton2.setText("Graph");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        stud_distribution.setBackground(new java.awt.Color(153, 153, 153));
        stud_distribution.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        stud_distribution.setForeground(new java.awt.Color(255, 255, 255));
        stud_distribution.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"100-90", null},
                {"90-80", null},
                {"80-70", null},
                {"70-60", null},
                {"60-50", null}
            },
            new String [] {
                "Range", "Count"
            }
        ));
        stud_distribution.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        stud_distribution.setAutoscrolls(false);
        stud_distribution.setRowHeight(30);
        jScrollPane1.setViewportView(stud_distribution);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Overall");

        barchartshow.setLayout(new java.awt.BorderLayout());
        jTabbedPane2.addTab("Bar Chart", barchartshow);

        pi1.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout pieLayout = new javax.swing.GroupLayout(pie);
        pie.setLayout(pieLayout);
        pieLayout.setHorizontalGroup(
            pieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pi1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pieLayout.setVerticalGroup(
            pieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pi1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Pie Chart", pie);

        javax.swing.GroupLayout subjectwiseLayout = new javax.swing.GroupLayout(subjectwise);
        subjectwise.setLayout(subjectwiseLayout);
        subjectwiseLayout.setHorizontalGroup(
            subjectwiseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subjectwiseLayout.createSequentialGroup()
                .addGroup(subjectwiseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(subjectwiseLayout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(jLabel1))
                    .addGroup(subjectwiseLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(subjectwiseLayout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 558, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        subjectwiseLayout.setVerticalGroup(
            subjectwiseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subjectwiseLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(subjectwiseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane2)
                    .addGroup(subjectwiseLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(jButton2)
                        .addGap(0, 140, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Percentage Wise", subjectwise);

        jPanel1.setBackground(new java.awt.Color(165, 192, 221));

        sub_disto.setBackground(new java.awt.Color(204, 204, 204));
        sub_disto.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        sub_disto.setForeground(new java.awt.Color(0, 0, 0));
        sub_disto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"100-90", null},
                {"90-80", null},
                {"80-70", null},
                {"70-60", null},
                {"60-50", null}
            },
            new String [] {
                "Range", "Count"
            }
        ));
        sub_disto.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        sub_disto.setRowHeight(30);
        jScrollPane2.setViewportView(sub_disto);

        pan1.setBackground(new java.awt.Color(165, 192, 221));
        pan1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane3.setBackground(new java.awt.Color(165, 192, 221));

        pan2.setLayout(new java.awt.BorderLayout());
        jTabbedPane3.addTab("tab1", pan2);

        pan1.add(jTabbedPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 420));

        dropbox.setBackground(new java.awt.Color(102, 255, 102));
        dropbox.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        dropbox.setForeground(new java.awt.Color(255, 255, 255));
        dropbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DBMS ", "OOP ", "IOT", "DS", "EDI" }));
        dropbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dropboxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(dropbox, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addComponent(pan1, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(dropbox, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addComponent(pan1, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        jTabbedPane1.addTab("Subject Wise", jPanel1);

        jButton1.setBackground(new java.awt.Color(184, 231, 225));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/previous.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 964, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
         
    }//GEN-LAST:event_jButton2ActionPerformed

    private void dropboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dropboxActionPerformed
        
        
      
       Connection con;
    try {
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/OOP_CP","root","");
//        
        String subject = (String) dropbox.getSelectedItem();
//        
//        String sql1 = "SELECT SUM FROM "+Tabel_name_this+" WHERE SUBJECT = "+subject+"";
//        String sql2 = "SELECT COUNT FROM "+Tabel_name_this+" WHERE SUBJECT = "+subject+"";
//        
//        Statement st = con.createStatement();
//        Statement st1 = con.createStatement();
//        
//        ResultSet rs = st.executeQuery(sql1);
//        ResultSet rs1 = st1.executeQuery(sql2);
//        
//        rs.next();
//        rs1.next();
//        
//        int num1 = rs.getInt(1);
//        int num2 = rs1.getInt(1);
         
            
              String sql1 = "SELECT COUNT(Total_100)  FROM "+Tabel_name_this+" WHERE Total_100 >= 90 && Subject = '"+subject+"'";
              String sql2 = "SELECT COUNT(Total_100)  FROM "+Tabel_name_this+" WHERE Total_100 >= 80 AND Total_100 < 90 && Subject = '"+subject+"'";  
              String sql3 = "SELECT COUNT(Total_100)  FROM "+Tabel_name_this+" WHERE Total_100 >= 70 AND Total_100 < 80 && Subject = '"+subject+"'";
              String sql4 = "SELECT COUNT(Total_100)  FROM "+Tabel_name_this+" WHERE Total_100 >= 60 AND Total_100 < 70 && Subject = '"+subject+"'";
              String sql5 = "SELECT COUNT(Total_100)  FROM "+Tabel_name_this+" WHERE Total_100 >= 50 AND Total_100 < 60 && Subject = '"+subject+"'";
             System.out.println(sql1); 
            Statement st = con.createStatement();
             Statement st1 = con.createStatement();
              Statement st2 = con.createStatement();
               Statement st3 = con.createStatement();
                Statement st4 = con.createStatement();
             
            
            ResultSet rs = st.executeQuery(sql1);
            ResultSet rs1 = st1.executeQuery(sql2);
            ResultSet rs2 = st2.executeQuery(sql3);
            ResultSet rs3 = st3.executeQuery(sql4);
            ResultSet rs4 = st4.executeQuery(sql5);
            
            rs.next();
            rs1.next();
            rs2.next();
            rs3.next();
            rs4.next();
            
            
            int rang = rs.getInt(1);
                       int rang1 = rs1.getInt(1);
                                   int rang2 = rs2.getInt(1);
                                               int rang3 = rs3.getInt(1);
                                                           int rang4 = rs4.getInt(1);
                                                           
             DefaultTableModel model = (DefaultTableModel) sub_disto.getModel();
             
               sub_disto.setValueAt(rang, 0, 1);
                     sub_disto.setValueAt(rang1, 1, 1);
                           sub_disto.setValueAt(rang2, 2, 1);
                                 sub_disto.setValueAt(rang3, 3, 1);
                                       sub_disto.setValueAt(rang4, 4, 1);
                                       
              
         int bar1 = (int) sub_disto.getModel().getValueAt(0, 1);
                int bar2 = (int) sub_disto.getModel().getValueAt(1, 1);
                   int bar3 = (int) sub_disto.getModel().getValueAt(2, 1);
                      int bar4 = (int) sub_disto.getModel().getValueAt(3, 1);
                         int bar5 = (int) sub_disto.getModel().getValueAt(4, 1);
        
        
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.setValue(bar1, "Percentage","100-90");
        dataset.setValue(bar2, "Percentage","90-80");
        dataset.setValue(bar3, "Percentage","70-80");
        dataset.setValue(bar4, "Percentage","60-70");
        dataset.setValue(bar5, "Percentage","50-60");
     
        
        JFreeChart chart = ChartFactory.createBarChart("Percentage Distribution","Sample Space","Number of Student", 
        dataset, PlotOrientation.VERTICAL, false,true,false);
        
        CategoryPlot categoryPlot = chart.getCategoryPlot();
        //categoryPlot.setRangeGridlinePaint(Color.BLUE);
        categoryPlot.setBackgroundPaint(Color.WHITE);
        BarRenderer renderer = (BarRenderer) categoryPlot.getRenderer();
        Color clr3 = new Color(204,0,51);
        renderer.setSeriesPaint(0, clr3);
        
        ChartPanel barpChartPanel = new ChartPanel(chart);
        pan2.removeAll();
        pan2.add(barpChartPanel, BorderLayout.CENTER);
        pan2.validate();
        
    } 
    catch (SQLException ex) {
        Logger.getLogger(Class_Analysis.class.getName()).log(Level.SEVERE, null, ex);
    }
      
    }//GEN-LAST:event_dropboxActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        InsertData_OOP obj = new InsertData_OOP();
        obj.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

     void fetch1()
     {
          System.out.println("Hello");
       
        
        int bar1 = (int) stud_distribution.getModel().getValueAt(0, 1);
                int bar2 = (int) stud_distribution.getModel().getValueAt(1, 1);
                   int bar3 = (int) stud_distribution.getModel().getValueAt(2, 1);
                      int bar4 = (int) stud_distribution.getModel().getValueAt(3, 1);
                         int bar5 = (int) stud_distribution.getModel().getValueAt(4, 1);
                         
                         
      DefaultPieDataset barDataset = new DefaultPieDataset( );
      
      barDataset.setValue("100-90" ,bar1);  
      barDataset.setValue( "90-80" ,bar2  );   
      barDataset.setValue( "80-70" , bar3 );    
      barDataset.setValue( "60-70" , bar4 );  
      barDataset.setValue( "50-60" , bar5 );
      
      JFreeChart piechart = ChartFactory.createPieChart("Percentage Distribution",barDataset, false,true,false);//explain
        PiePlot piePlot =(PiePlot) piechart.getPlot();
        piePlot.setBackgroundPaint(Color.white);
        ChartPanel barChartPanel = new ChartPanel(piechart);
        pi1.removeAll();
        pi1.add(barChartPanel, BorderLayout.CENTER);
        pi1.validate();
        
     }
    
    
    void fetch()
    {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/OOP_cp", "root", "");
         
            
              String sql1 = "SELECT COUNT(Percentage)  FROM "+Tabel_cgpa_this+" WHERE Percentage >= 90";
              String sql2 = "SELECT COUNT(Percentage)  FROM "+Tabel_cgpa_this+" WHERE Percentage >= 80 AND Percentage < 90";  
              String sql3 = "SELECT COUNT(Percentage)  FROM "+Tabel_cgpa_this+" WHERE Percentage >= 70 AND Percentage < 80";
              String sql4 = "SELECT COUNT(Percentage)  FROM "+Tabel_cgpa_this+" WHERE Percentage >= 60 AND Percentage < 70";
              String sql5 = "SELECT COUNT(Percentage)  FROM "+Tabel_cgpa_this+" WHERE Percentage >= 50 AND Percentage < 60";
              
            Statement st = con.createStatement();
             Statement st1 = con.createStatement();
              Statement st2 = con.createStatement();
               Statement st3 = con.createStatement();
                Statement st4 = con.createStatement();
             
            
            ResultSet rs = st.executeQuery(sql1);
            ResultSet rs1 = st1.executeQuery(sql2);
            ResultSet rs2 = st2.executeQuery(sql3);
            ResultSet rs3 = st3.executeQuery(sql4);
            ResultSet rs4 = st4.executeQuery(sql5);
            
            rs.next();
            rs1.next();
            rs2.next();
            rs3.next();
            rs4.next();
            
            
            int rang = rs.getInt(1);
                       int rang1 = rs1.getInt(1);
                                   int rang2 = rs2.getInt(1);
                                               int rang3 = rs3.getInt(1);
                                                           int rang4 = rs4.getInt(1);
                                                           
             DefaultTableModel model = (DefaultTableModel) stud_distribution.getModel();
             
               stud_distribution.setValueAt(rang, 0, 1);
                     stud_distribution.setValueAt(rang1, 1, 1);
                           stud_distribution.setValueAt(rang2, 2, 1);
                                 stud_distribution.setValueAt(rang3, 3, 1);
                                       stud_distribution.setValueAt(rang4, 4, 1);
             
        } catch (SQLException ex) {
            Logger.getLogger(Class_Analysis.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
         public void showBarChart() throws SQLException
         {
            
             int bar1 = (int) stud_distribution.getModel().getValueAt(0, 1);
                int bar2 = (int) stud_distribution.getModel().getValueAt(1, 1);
                   int bar3 = (int) stud_distribution.getModel().getValueAt(2, 1);
                      int bar4 = (int) stud_distribution.getModel().getValueAt(3, 1);
                         int bar5 = (int) stud_distribution.getModel().getValueAt(4, 1);
        
        
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
       dataset.setValue(bar1, "Percentage","100-90");
        dataset.setValue(bar2, "Percentage","90-80");
        dataset.setValue(bar3, "Percentage","70-80");
        dataset.setValue(bar4, "Percentage","60-70");
        dataset.setValue(bar5, "Percentage","50-60");
     
        
        JFreeChart chart = ChartFactory.createBarChart("Percentage Distribution","Sample Space","Number of Student", 
                dataset, PlotOrientation.VERTICAL, false,true,false);
        
        CategoryPlot categoryPlot = chart.getCategoryPlot();
        //categoryPlot.setRangeGridlinePaint(Color.BLUE);
        categoryPlot.setBackgroundPaint(Color.WHITE);
        BarRenderer renderer = (BarRenderer) categoryPlot.getRenderer();
        Color clr3 = new Color(204,0,51);
        renderer.setSeriesPaint(0, clr3);
        
        ChartPanel barpChartPanel = new ChartPanel(chart);
        barchartshow.removeAll();
        barchartshow.add(barpChartPanel, BorderLayout.CENTER);
        barchartshow.validate();
        
        
        
    }
     
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Class_Analysis().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel barchartshow;
    private javax.swing.JComboBox<String> dropbox;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JPanel pan1;
    private javax.swing.JPanel pan2;
    private javax.swing.JPanel pi1;
    private javax.swing.JPanel pie;
    private javax.swing.JTable stud_distribution;
    private javax.swing.JTable sub_disto;
    private javax.swing.JPanel subjectwise;
    // End of variables declaration//GEN-END:variables
}
