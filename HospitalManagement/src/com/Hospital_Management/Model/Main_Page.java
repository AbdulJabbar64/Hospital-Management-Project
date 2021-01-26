
package com.Hospital_Management.Model;

import com.Hospital_Management.DAO.Hospital_DAO;
import java.sql.ResultSet;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.function.Supplier;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import net.proteanit.sql.DbUtils;

public class Main_Page extends javax.swing.JFrame {
    Hospital_DAO hpd=new Hospital_DAO();
    
    public Main_Page() {
        initComponents();
        buttonGroup1.add(male);
        buttonGroup1.add(female);
        //dateTime();
        this.setLocationRelativeTo(this);
    }
    ResultSet rs;
    static String gender=null;
    static String dateTime;
    static String button=null;
    public void dateTime(){
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd-MMM-yy hh:mm:s a");
        DateTimeFormatter dtf1=DateTimeFormatter.ofPattern("hh:mm:s a");
        Supplier<String> dateTime1=() -> dtf.format(LocalDateTime.now());
        Supplier<String> time=() -> dtf1.format(LocalTime.now());
        //dateTime=time.get();
        //System.out.println(dateTime);
        
        //System.out.println(date.toLocalDate());
        dateTime=dateTime1.get();
        jTextField32.setText(dateTime);
        //System.out.println(dateTime);
        dateTime=time.get();
        //System.out.println(dateTime);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        main_panel = new javax.swing.JPanel();
        muen_panel = new javax.swing.JPanel();
        doctor = new javax.swing.JButton();
        patient = new javax.swing.JButton();
        staff = new javax.swing.JButton();
        room = new javax.swing.JButton();
        block = new javax.swing.JButton();
        stay = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        anomalies = new javax.swing.JPanel();
        add = new javax.swing.JButton();
        Update = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        refresh = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        card = new javax.swing.JPanel();
        patient_panel = new javax.swing.JPanel();
        data_Panel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        male = new javax.swing.JRadioButton();
        female = new javax.swing.JRadioButton();
        jLabel17 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        table_Panel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        patient_Table1 = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        searchBar1 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        doctor_panel = new javax.swing.JPanel();
        data_Panel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        table_Panel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        doctor_Table = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        searchBar = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        room_panel = new javax.swing.JPanel();
        data_Panel3 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jTextField19 = new javax.swing.JTextField();
        jTextField20 = new javax.swing.JTextField();
        jTextField22 = new javax.swing.JTextField();
        jTextField23 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        table_Panel3 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        room_Table3 = new javax.swing.JTable();
        jLabel31 = new javax.swing.JLabel();
        searchBar3 = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        block_panel = new javax.swing.JPanel();
        data_Panel4 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jTextField24 = new javax.swing.JTextField();
        jTextField25 = new javax.swing.JTextField();
        table_Panel4 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        block_Table4 = new javax.swing.JTable();
        jLabel38 = new javax.swing.JLabel();
        searchBar4 = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        stay_panel = new javax.swing.JPanel();
        data_Panel5 = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jTextField29 = new javax.swing.JTextField();
        jTextField30 = new javax.swing.JTextField();
        jTextField31 = new javax.swing.JTextField();
        jTextField32 = new javax.swing.JTextField();
        jTextField33 = new javax.swing.JTextField();
        table_Panel5 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        stay_Table5 = new javax.swing.JTable();
        jLabel45 = new javax.swing.JLabel();
        searchBar5 = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        staff_panel = new javax.swing.JPanel();
        data_Panel2 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jTextField34 = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        table_Panel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        staff_Table2 = new javax.swing.JTable();
        jLabel24 = new javax.swing.JLabel();
        searchBar2 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Main Page");

        main_panel.setBackground(new java.awt.Color(51, 255, 51));

        muen_panel.setBackground(new java.awt.Color(51, 0, 255));
        muen_panel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 10, 18));

        doctor.setFont(new java.awt.Font("Times New Roman", 0, 28)); // NOI18N
        doctor.setText("Doctor");
        doctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doctorActionPerformed(evt);
            }
        });
        muen_panel.add(doctor);

        patient.setFont(new java.awt.Font("Times New Roman", 0, 28)); // NOI18N
        patient.setText("Patient");
        patient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientActionPerformed(evt);
            }
        });
        muen_panel.add(patient);

        staff.setFont(new java.awt.Font("Times New Roman", 0, 28)); // NOI18N
        staff.setText("Staff");
        staff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staffActionPerformed(evt);
            }
        });
        muen_panel.add(staff);

        room.setFont(new java.awt.Font("Times New Roman", 0, 28)); // NOI18N
        room.setText("Room");
        room.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roomActionPerformed(evt);
            }
        });
        muen_panel.add(room);

        block.setFont(new java.awt.Font("Times New Roman", 0, 28)); // NOI18N
        block.setText("Block");
        block.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blockActionPerformed(evt);
            }
        });
        muen_panel.add(block);

        stay.setFont(new java.awt.Font("Times New Roman", 0, 28)); // NOI18N
        stay.setText("Stay");
        stay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stayActionPerformed(evt);
            }
        });
        muen_panel.add(stay);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 60)); // NOI18N
        jLabel1.setText("Hospital Management System");

        anomalies.setBackground(new java.awt.Color(255, 153, 0));

        add.setFont(new java.awt.Font("Times New Roman", 0, 30)); // NOI18N
        add.setText("Add");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        Update.setFont(new java.awt.Font("Times New Roman", 0, 30)); // NOI18N
        Update.setText("Update");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });

        delete.setFont(new java.awt.Font("Times New Roman", 0, 30)); // NOI18N
        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        refresh.setFont(new java.awt.Font("Times New Roman", 0, 30)); // NOI18N
        refresh.setText("Refresh");
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });

        clear.setFont(new java.awt.Font("Times New Roman", 0, 30)); // NOI18N
        clear.setText("Clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        logout.setFont(new java.awt.Font("Times New Roman", 0, 30)); // NOI18N
        logout.setText("Log Out");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout anomaliesLayout = new javax.swing.GroupLayout(anomalies);
        anomalies.setLayout(anomaliesLayout);
        anomaliesLayout.setHorizontalGroup(
            anomaliesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(anomaliesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(anomaliesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(anomaliesLayout.createSequentialGroup()
                        .addGroup(anomaliesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(refresh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Update, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(add, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(clear, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(logout, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        anomaliesLayout.setVerticalGroup(
            anomaliesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(anomaliesLayout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(add)
                .addGap(18, 18, 18)
                .addComponent(Update)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(delete)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(refresh)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(clear)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(logout)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        card.setLayout(new java.awt.CardLayout());

        patient_panel.setBackground(new java.awt.Color(240, 114, 229));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel9.setText("Patient ID");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel10.setText("Patient Age");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel11.setText("Patient Name");

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel12.setText("Patient Address");

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel13.setText("Room No");

        jTextField7.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N

        jTextField8.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N

        jTextField9.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N

        jTextField10.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N

        jLabel16.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel16.setText("Gender");

        male.setText("Male");

        female.setText("Female");

        jLabel17.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel17.setText("ContactNo");

        jTextField12.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N

        jTextField11.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N

        jLabel18.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel18.setText("Patient Disease");

        jTextField13.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N

        javax.swing.GroupLayout data_Panel1Layout = new javax.swing.GroupLayout(data_Panel1);
        data_Panel1.setLayout(data_Panel1Layout);
        data_Panel1Layout.setHorizontalGroup(
            data_Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(data_Panel1Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(data_Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addComponent(jLabel17)
                    .addComponent(jLabel13)
                    .addComponent(jLabel16)
                    .addComponent(jLabel12)
                    .addComponent(jLabel11)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(data_Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(data_Panel1Layout.createSequentialGroup()
                        .addComponent(male)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(female)))
                .addGap(57, 57, 57))
        );
        data_Panel1Layout.setVerticalGroup(
            data_Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(data_Panel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(data_Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(data_Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(data_Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField9)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(data_Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(data_Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(data_Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(male)
                    .addComponent(female))
                .addGap(18, 18, 18)
                .addGroup(data_Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField12)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(data_Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(63, Short.MAX_VALUE))
        );

        patient_Table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(patient_Table1);
        if (patient_Table1.getColumnModel().getColumnCount() > 0) {
            patient_Table1.getColumnModel().getColumn(0).setResizable(false);
            patient_Table1.getColumnModel().getColumn(1).setResizable(false);
            patient_Table1.getColumnModel().getColumn(2).setResizable(false);
            patient_Table1.getColumnModel().getColumn(3).setResizable(false);
            patient_Table1.getColumnModel().getColumn(4).setResizable(false);
            patient_Table1.getColumnModel().getColumn(5).setResizable(false);
            patient_Table1.getColumnModel().getColumn(6).setResizable(false);
            patient_Table1.getColumnModel().getColumn(7).setResizable(false);
        }

        javax.swing.GroupLayout table_Panel1Layout = new javax.swing.GroupLayout(table_Panel1);
        table_Panel1.setLayout(table_Panel1Layout);
        table_Panel1Layout.setHorizontalGroup(
            table_Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        table_Panel1Layout.setVerticalGroup(
            table_Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
        );

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel14.setText("Patient");

        searchBar1.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        searchBar1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchBar1KeyReleased(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel15.setText("Search");

        javax.swing.GroupLayout patient_panelLayout = new javax.swing.GroupLayout(patient_panel);
        patient_panel.setLayout(patient_panelLayout);
        patient_panelLayout.setHorizontalGroup(
            patient_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(patient_panelLayout.createSequentialGroup()
                .addComponent(data_Panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(table_Panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(patient_panelLayout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addComponent(jLabel14)
                .addGap(159, 159, 159)
                .addComponent(searchBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addContainerGap(551, Short.MAX_VALUE))
        );
        patient_panelLayout.setVerticalGroup(
            patient_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, patient_panelLayout.createSequentialGroup()
                .addGroup(patient_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(searchBar1)
                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(patient_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(data_Panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(table_Panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        card.add(patient_panel, "card4");

        doctor_panel.setBackground(new java.awt.Color(36, 184, 123));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel3.setText("Doctor ID");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel4.setText("Doctor address");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel5.setText("Doctor Name");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel6.setText("Doctor cnic");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel8.setText("Doctor Timing");

        jTextField2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N

        jTextField3.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N

        jTextField4.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N

        jTextField5.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N

        jTextField6.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N

        javax.swing.GroupLayout data_PanelLayout = new javax.swing.GroupLayout(data_Panel);
        data_Panel.setLayout(data_PanelLayout);
        data_PanelLayout.setHorizontalGroup(
            data_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(data_PanelLayout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(data_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel8)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jTextField2)
                    .addComponent(jTextField3)
                    .addComponent(jTextField4)
                    .addComponent(jTextField5)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        data_PanelLayout.setVerticalGroup(
            data_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(data_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        doctor_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(doctor_Table);
        if (doctor_Table.getColumnModel().getColumnCount() > 0) {
            doctor_Table.getColumnModel().getColumn(0).setResizable(false);
            doctor_Table.getColumnModel().getColumn(1).setResizable(false);
            doctor_Table.getColumnModel().getColumn(2).setResizable(false);
            doctor_Table.getColumnModel().getColumn(3).setResizable(false);
            doctor_Table.getColumnModel().getColumn(4).setResizable(false);
        }

        javax.swing.GroupLayout table_PanelLayout = new javax.swing.GroupLayout(table_Panel);
        table_Panel.setLayout(table_PanelLayout);
        table_PanelLayout.setHorizontalGroup(
            table_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        table_PanelLayout.setVerticalGroup(
            table_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel2.setText("Doctor");

        searchBar.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        searchBar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchBarKeyReleased(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel7.setText("Search");

        javax.swing.GroupLayout doctor_panelLayout = new javax.swing.GroupLayout(doctor_panel);
        doctor_panel.setLayout(doctor_panelLayout);
        doctor_panelLayout.setHorizontalGroup(
            doctor_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(doctor_panelLayout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addComponent(jLabel2)
                .addGap(159, 159, 159)
                .addComponent(searchBar, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addContainerGap(548, Short.MAX_VALUE))
            .addGroup(doctor_panelLayout.createSequentialGroup()
                .addComponent(data_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(table_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        doctor_panelLayout.setVerticalGroup(
            doctor_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(doctor_panelLayout.createSequentialGroup()
                .addGroup(doctor_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(doctor_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                        .addComponent(searchBar, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(doctor_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(data_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(table_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        card.add(doctor_panel, "card4");

        room_panel.setBackground(new java.awt.Color(240, 148, 148));

        jLabel26.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel26.setText("Room Number");

        jLabel27.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel27.setText("Room Available");

        jLabel28.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel28.setText("Room Type");

        jLabel29.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel29.setText("Block code");

        jLabel30.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel30.setText("Block floor");

        jTextField19.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N

        jTextField20.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N

        jTextField22.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N

        jTextField23.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N

        jComboBox1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "YES", "NO" }));

        javax.swing.GroupLayout data_Panel3Layout = new javax.swing.GroupLayout(data_Panel3);
        data_Panel3.setLayout(data_Panel3Layout);
        data_Panel3Layout.setHorizontalGroup(
            data_Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(data_Panel3Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(data_Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel26)
                    .addComponent(jLabel27)
                    .addComponent(jLabel30)
                    .addComponent(jLabel28)
                    .addComponent(jLabel29)
                    .addComponent(jTextField19)
                    .addComponent(jTextField20)
                    .addComponent(jTextField22)
                    .addComponent(jTextField23, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        data_Panel3Layout.setVerticalGroup(
            data_Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(data_Panel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jLabel27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel29)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jLabel30)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        room_Table3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(room_Table3);
        if (room_Table3.getColumnModel().getColumnCount() > 0) {
            room_Table3.getColumnModel().getColumn(0).setResizable(false);
            room_Table3.getColumnModel().getColumn(1).setResizable(false);
            room_Table3.getColumnModel().getColumn(2).setResizable(false);
            room_Table3.getColumnModel().getColumn(3).setResizable(false);
            room_Table3.getColumnModel().getColumn(4).setResizable(false);
        }

        javax.swing.GroupLayout table_Panel3Layout = new javax.swing.GroupLayout(table_Panel3);
        table_Panel3.setLayout(table_Panel3Layout);
        table_Panel3Layout.setHorizontalGroup(
            table_Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 866, Short.MAX_VALUE)
        );
        table_Panel3Layout.setVerticalGroup(
            table_Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        jLabel31.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel31.setText("ROOM");

        searchBar3.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        searchBar3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchBar3KeyReleased(evt);
            }
        });

        jLabel32.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel32.setText("Search");

        javax.swing.GroupLayout room_panelLayout = new javax.swing.GroupLayout(room_panel);
        room_panel.setLayout(room_panelLayout);
        room_panelLayout.setHorizontalGroup(
            room_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(room_panelLayout.createSequentialGroup()
                .addGroup(room_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(data_Panel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(room_panelLayout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(jLabel31)))
                .addGroup(room_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(room_panelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(searchBar3, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel32)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, room_panelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(table_Panel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        room_panelLayout.setVerticalGroup(
            room_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(room_panelLayout.createSequentialGroup()
                .addGroup(room_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(room_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel32)
                        .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(searchBar3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(room_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(table_Panel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(data_Panel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        card.add(room_panel, "card4");

        block_panel.setBackground(new java.awt.Color(121, 117, 95));

        jLabel33.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel33.setText("block Code");

        jLabel35.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel35.setText("block floor");

        jTextField24.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N

        jTextField25.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N

        javax.swing.GroupLayout data_Panel4Layout = new javax.swing.GroupLayout(data_Panel4);
        data_Panel4.setLayout(data_Panel4Layout);
        data_Panel4Layout.setHorizontalGroup(
            data_Panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(data_Panel4Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(data_Panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel33)
                    .addComponent(jLabel35)
                    .addComponent(jTextField24, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                    .addComponent(jTextField25))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        data_Panel4Layout.setVerticalGroup(
            data_Panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(data_Panel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(152, 152, 152))
        );

        block_Table4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(block_Table4);
        if (block_Table4.getColumnModel().getColumnCount() > 0) {
            block_Table4.getColumnModel().getColumn(0).setResizable(false);
            block_Table4.getColumnModel().getColumn(1).setResizable(false);
        }

        javax.swing.GroupLayout table_Panel4Layout = new javax.swing.GroupLayout(table_Panel4);
        table_Panel4.setLayout(table_Panel4Layout);
        table_Panel4Layout.setHorizontalGroup(
            table_Panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        table_Panel4Layout.setVerticalGroup(
            table_Panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 505, Short.MAX_VALUE)
        );

        jLabel38.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel38.setText("BLOCK");

        searchBar4.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        searchBar4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchBar4KeyReleased(evt);
            }
        });

        jLabel39.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel39.setText("Search");

        javax.swing.GroupLayout block_panelLayout = new javax.swing.GroupLayout(block_panel);
        block_panel.setLayout(block_panelLayout);
        block_panelLayout.setHorizontalGroup(
            block_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(block_panelLayout.createSequentialGroup()
                .addGroup(block_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(block_panelLayout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(jLabel38))
                    .addComponent(data_Panel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(block_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(block_panelLayout.createSequentialGroup()
                        .addComponent(searchBar4, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel39)
                        .addContainerGap(527, Short.MAX_VALUE))
                    .addComponent(table_Panel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        block_panelLayout.setVerticalGroup(
            block_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(block_panelLayout.createSequentialGroup()
                .addGroup(block_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(block_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel38, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                        .addComponent(searchBar4, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(block_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(table_Panel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(data_Panel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        card.add(block_panel, "card4");

        stay_panel.setBackground(new java.awt.Color(0, 139, 135));

        jLabel40.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel40.setText("Stay ID");

        jLabel41.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel41.setText("Room Number");

        jLabel42.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel42.setText("Patient ID");

        jLabel43.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel43.setText("Current Time");

        jLabel44.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel44.setText("Discharge Time");

        jTextField29.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N

        jTextField30.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N

        jTextField31.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N

        jTextField32.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N

        jTextField33.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jTextField33.setToolTipText("i-e(31-mar-15)");

        javax.swing.GroupLayout data_Panel5Layout = new javax.swing.GroupLayout(data_Panel5);
        data_Panel5.setLayout(data_Panel5Layout);
        data_Panel5Layout.setHorizontalGroup(
            data_Panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(data_Panel5Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(data_Panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel40)
                    .addComponent(jLabel41)
                    .addComponent(jLabel44)
                    .addComponent(jLabel42)
                    .addComponent(jLabel43)
                    .addComponent(jTextField29)
                    .addComponent(jTextField30)
                    .addComponent(jTextField31)
                    .addComponent(jTextField32)
                    .addComponent(jTextField33, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        data_Panel5Layout.setVerticalGroup(
            data_Panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(data_Panel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel40)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField29, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel42)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField30, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jLabel41)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField31, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jLabel43)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField32, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel44)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField33, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        stay_Table5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane6.setViewportView(stay_Table5);
        if (stay_Table5.getColumnModel().getColumnCount() > 0) {
            stay_Table5.getColumnModel().getColumn(0).setResizable(false);
            stay_Table5.getColumnModel().getColumn(1).setResizable(false);
            stay_Table5.getColumnModel().getColumn(2).setResizable(false);
            stay_Table5.getColumnModel().getColumn(3).setResizable(false);
            stay_Table5.getColumnModel().getColumn(4).setResizable(false);
        }

        javax.swing.GroupLayout table_Panel5Layout = new javax.swing.GroupLayout(table_Panel5);
        table_Panel5.setLayout(table_Panel5Layout);
        table_Panel5Layout.setHorizontalGroup(
            table_Panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 877, Short.MAX_VALUE)
        );
        table_Panel5Layout.setVerticalGroup(
            table_Panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane6)
        );

        jLabel45.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel45.setText("STAY");

        searchBar5.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        searchBar5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchBar5KeyReleased(evt);
            }
        });

        jLabel46.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel46.setText("Search");

        javax.swing.GroupLayout stay_panelLayout = new javax.swing.GroupLayout(stay_panel);
        stay_panel.setLayout(stay_panelLayout);
        stay_panelLayout.setHorizontalGroup(
            stay_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(stay_panelLayout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addComponent(jLabel45)
                .addGap(140, 140, 140)
                .addComponent(searchBar5, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jLabel46))
            .addGroup(stay_panelLayout.createSequentialGroup()
                .addComponent(data_Panel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(table_Panel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        stay_panelLayout.setVerticalGroup(
            stay_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(stay_panelLayout.createSequentialGroup()
                .addGroup(stay_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchBar5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(stay_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(data_Panel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(table_Panel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        card.add(stay_panel, "card4");

        staff_panel.setBackground(new java.awt.Color(99, 197, 195));

        jLabel19.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel19.setText("Staff ID");

        jLabel20.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel20.setText("Staff Designation");

        jLabel21.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel21.setText("Staff Name");

        jLabel22.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel22.setText("Staff Address");

        jLabel23.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel23.setText("Staff CNIC");

        jTextField14.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N

        jTextField15.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N

        jTextField16.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N

        jTextField17.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N

        jTextField18.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N

        jTextField34.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jTextField34.setToolTipText("i-e(dd-mm-yy or 31-mar-22)");

        jLabel47.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jLabel47.setText("Staff Regist: Date");

        javax.swing.GroupLayout data_Panel2Layout = new javax.swing.GroupLayout(data_Panel2);
        data_Panel2.setLayout(data_Panel2Layout);
        data_Panel2Layout.setHorizontalGroup(
            data_Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(data_Panel2Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(data_Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel47)
                    .addComponent(jTextField34, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(data_Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel19)
                        .addComponent(jLabel20)
                        .addComponent(jLabel23)
                        .addComponent(jLabel21)
                        .addComponent(jLabel22)
                        .addComponent(jTextField14)
                        .addComponent(jTextField15)
                        .addComponent(jTextField16)
                        .addComponent(jTextField17)
                        .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        data_Panel2Layout.setVerticalGroup(
            data_Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(data_Panel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel47)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField34, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        staff_Table2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(staff_Table2);
        if (staff_Table2.getColumnModel().getColumnCount() > 0) {
            staff_Table2.getColumnModel().getColumn(0).setResizable(false);
            staff_Table2.getColumnModel().getColumn(1).setResizable(false);
            staff_Table2.getColumnModel().getColumn(2).setResizable(false);
            staff_Table2.getColumnModel().getColumn(3).setResizable(false);
            staff_Table2.getColumnModel().getColumn(4).setResizable(false);
            staff_Table2.getColumnModel().getColumn(5).setResizable(false);
        }

        javax.swing.GroupLayout table_Panel2Layout = new javax.swing.GroupLayout(table_Panel2);
        table_Panel2.setLayout(table_Panel2Layout);
        table_Panel2Layout.setHorizontalGroup(
            table_Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 874, Short.MAX_VALUE)
        );
        table_Panel2Layout.setVerticalGroup(
            table_Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 517, Short.MAX_VALUE)
        );

        jLabel24.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel24.setText("STAFF");

        searchBar2.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        searchBar2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchBar2KeyReleased(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel25.setText("Search");

        javax.swing.GroupLayout staff_panelLayout = new javax.swing.GroupLayout(staff_panel);
        staff_panel.setLayout(staff_panelLayout);
        staff_panelLayout.setHorizontalGroup(
            staff_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(staff_panelLayout.createSequentialGroup()
                .addGroup(staff_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(staff_panelLayout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(jLabel24))
                    .addComponent(data_Panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(staff_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(staff_panelLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(searchBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel25)
                        .addContainerGap())
                    .addGroup(staff_panelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(table_Panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        staff_panelLayout.setVerticalGroup(
            staff_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(staff_panelLayout.createSequentialGroup()
                .addGroup(staff_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, staff_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(searchBar2, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(staff_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(table_Panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(data_Panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        card.add(staff_panel, "card4");

        javax.swing.GroupLayout main_panelLayout = new javax.swing.GroupLayout(main_panel);
        main_panel.setLayout(main_panelLayout);
        main_panelLayout.setHorizontalGroup(
            main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(main_panelLayout.createSequentialGroup()
                .addComponent(muen_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(main_panelLayout.createSequentialGroup()
                .addComponent(anomalies, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(card, javax.swing.GroupLayout.PREFERRED_SIZE, 1280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        main_panelLayout.setVerticalGroup(
            main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(main_panelLayout.createSequentialGroup()
                .addGroup(main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(muen_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(main_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(anomalies, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(card, javax.swing.GroupLayout.DEFAULT_SIZE, 569, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(main_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void doctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doctorActionPerformed
        //hpd.getAll();
        getDoctorPanel();
        button="doctor";
    }//GEN-LAST:event_doctorActionPerformed

    private void patientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientActionPerformed
        // TODO add your handling code here:
        getPatientPanel();
        button="patient";
        
        //System.out.println(gender);
    }//GEN-LAST:event_patientActionPerformed

    private void staffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staffActionPerformed
        // TODO add your handling code here:
        getStaffPanel();
        button="staff";
    }//GEN-LAST:event_staffActionPerformed

    private void searchBarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchBarKeyReleased
        // TODO add your handling code here:
        //doctor
        {
            DefaultTableModel t=(DefaultTableModel)doctor_Table.getModel();
            String search=searchBar.getText();
            TableRowSorter<DefaultTableModel> tr=new TableRowSorter<DefaultTableModel>(t);
            doctor_Table.setRowSorter(tr);
            tr.setRowFilter(RowFilter.regexFilter(search.trim()));
        }
        
    }//GEN-LAST:event_searchBarKeyReleased

    private void searchBar1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchBar1KeyReleased
        // TODO add your handling code here:
        {
            DefaultTableModel t=(DefaultTableModel)doctor_Table.getModel();
            String search=searchBar1.getText();
            TableRowSorter<DefaultTableModel> tr=new TableRowSorter<DefaultTableModel>(t);
            patient_Table1.setRowSorter(tr);
            tr.setRowFilter(RowFilter.regexFilter(search.trim()));
        }
    }//GEN-LAST:event_searchBar1KeyReleased

    private void roomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roomActionPerformed
        // TODO add your handling code here:
        getRoomPanel();
        button="room";
    }//GEN-LAST:event_roomActionPerformed

    private void blockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blockActionPerformed
        // TODO add your handling code here:
        getBlockPanel();
        button="block";
    }//GEN-LAST:event_blockActionPerformed

    private void stayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stayActionPerformed
        // TODO add your handling code here:
        getStayPanel();
        dateTime();
        button="stay";
    }//GEN-LAST:event_stayActionPerformed

    private void searchBar2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchBar2KeyReleased
        // TODO add your handling code here:
        {
            DefaultTableModel t=(DefaultTableModel)doctor_Table.getModel();
            String search=searchBar2.getText();
            TableRowSorter<DefaultTableModel> tr=new TableRowSorter<DefaultTableModel>(t);
            staff_Table2.setRowSorter(tr);
            tr.setRowFilter(RowFilter.regexFilter(search.trim()));
        }
    }//GEN-LAST:event_searchBar2KeyReleased

    private void searchBar3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchBar3KeyReleased
        // TODO add your handling code here:
        {
            DefaultTableModel t=(DefaultTableModel)doctor_Table.getModel();
            String search=searchBar3.getText();
            TableRowSorter<DefaultTableModel> tr=new TableRowSorter<DefaultTableModel>(t);
            room_Table3.setRowSorter(tr);
            tr.setRowFilter(RowFilter.regexFilter(search.trim()));
        }
    }//GEN-LAST:event_searchBar3KeyReleased

    private void searchBar4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchBar4KeyReleased
        // TODO add your handling code here:
        {
            DefaultTableModel t=(DefaultTableModel)doctor_Table.getModel();
            String search=searchBar4.getText();
            TableRowSorter<DefaultTableModel> tr=new TableRowSorter<DefaultTableModel>(t);
            block_Table4.setRowSorter(tr);
            tr.setRowFilter(RowFilter.regexFilter(search.trim()));
        }
    }//GEN-LAST:event_searchBar4KeyReleased

    private void searchBar5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchBar5KeyReleased
        // TODO add your handling code here:
        {
            DefaultTableModel t=(DefaultTableModel)doctor_Table.getModel();
            String search=searchBar5.getText();
            TableRowSorter<DefaultTableModel> tr=new TableRowSorter<DefaultTableModel>(t);
            stay_Table5.setRowSorter(tr);
            tr.setRowFilter(RowFilter.regexFilter(search.trim()));
        }
    }//GEN-LAST:event_searchBar5KeyReleased

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // TODO add your handling code here:
        if(button.equalsIgnoreCase("patient")){
            if(male.isSelected())
                gender="male";
            else if(female.isSelected())
                gender="female";
            //System.out.println("patient");
            hpd.addPatient(Integer.parseInt(jTextField7.getText()),jTextField8.getText(),Integer.parseInt(jTextField9.getText()),jTextField10.getText(),Integer.parseInt(jTextField11.getText()),gender,Integer.parseInt(jTextField12.getText()),jTextField13.getText());
        }
        
        else if(button.equalsIgnoreCase("doctor")){
            //System.out.println("doctor");
            hpd.addDoctor(Integer.parseInt(jTextField2.getText()),jTextField3.getText(),jTextField4.getText(),Long.parseLong(jTextField5.getText()),jTextField6.getText());
        }
        
        else if(button.equalsIgnoreCase("staff")){
            //System.out.println("staff");
            hpd.addStaff(Integer.parseInt(jTextField14.getText()),jTextField15.getText(),Long.parseLong(jTextField18.getText()),jTextField16.getText(),jTextField17.getText(),jTextField34.getText());
        }
        
        else if(button.equalsIgnoreCase("room")){
            //System.out.println("room");
            hpd.addRoom(Integer.parseInt(jTextField19.getText()),jTextField20.getText(),jComboBox1.getSelectedItem().toString(), Integer.parseInt(jTextField22.getText()),Integer.parseInt(jTextField23.getText()));
        }
        
        else if(button.equalsIgnoreCase("block")){
            hpd.addBlock(Integer.parseInt(jTextField25.getText()),Integer.parseInt(jTextField24.getText()));
            //System.out.println("block");
        }
        
        else if(button.equalsIgnoreCase("stay")){
            //System.out.println("stay");
            hpd.addStay(Integer.parseInt(jTextField29.getText()),Integer.parseInt(jTextField30.getText()),Integer.parseInt(jTextField31.getText()),jTextField32.getText(),jTextField33.getText()+" "+dateTime);
        }
    }//GEN-LAST:event_addActionPerformed

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
        // TODO add your handling code here:
        //Doctor
        {
            rs=hpd.getDoctor();
            doctor_Table.setModel(DbUtils.resultSetToTableModel(rs));
        }
        //patient
        {
            rs=hpd.getPatient();
            patient_Table1.setModel(DbUtils.resultSetToTableModel(rs));
        }
        //block
        {
            rs=hpd.getBlock();
            block_Table4.setModel(DbUtils.resultSetToTableModel(rs));
        }
        //stay
        {
            rs=hpd.getStay();
            stay_Table5.setModel(DbUtils.resultSetToTableModel(rs));
        }
        //staff
        {
            rs=hpd.getStaff();
            staff_Table2.setModel(DbUtils.resultSetToTableModel(rs));
        }
        //room
        {
            rs=hpd.getRoom();
            room_Table3.setModel(DbUtils.resultSetToTableModel(rs));
        }
    }//GEN-LAST:event_refreshActionPerformed

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
        // TODO add your handling code here:
        if(button.equalsIgnoreCase("patient")){
            if(male.isSelected())
                gender="male";
            else if(female.isSelected())
                gender="female";
            //System.out.println("patient");
            hpd.updatePatient(Integer.parseInt(jTextField7.getText()),jTextField8.getText(),Integer.parseInt(jTextField9.getText()),jTextField10.getText(),Integer.parseInt(jTextField11.getText()),gender,Integer.parseInt(jTextField12.getText()),jTextField13.getText());
        }
        else if(button.equalsIgnoreCase("doctor")){
            //System.out.println("doctor");
            hpd.updateDoctor(Integer.parseInt(jTextField2.getText()),jTextField3.getText(),jTextField4.getText(),Long.parseLong(jTextField5.getText()),jTextField6.getText());
        }
        else if(button.equalsIgnoreCase("staff")){
            //System.out.println("staff");
            hpd.updateStaff(Integer.parseInt(jTextField14.getText()),jTextField15.getText(),Long.parseLong(jTextField18.getText()),jTextField16.getText(),jTextField17.getText(),jTextField34.getText());
        }
        else if(button.equalsIgnoreCase("room")){
            //System.out.println("room");
            hpd.updateRoom(Integer.parseInt(jTextField19.getText()),jTextField20.getText(),jComboBox1.getSelectedItem().toString(), Integer.parseInt(jTextField22.getText()),Integer.parseInt(jTextField23.getText()));
        }
        else if(button.equalsIgnoreCase("block")){
            //System.out.println("block");
            hpd.updateBlock(Integer.parseInt(jTextField25.getText()),Integer.parseInt(jTextField24.getText()));
        }
        else if(button.equalsIgnoreCase("stay")){
            //System.out.println("stay");
            hpd.updateStay(Integer.parseInt(jTextField29.getText()),Integer.parseInt(jTextField30.getText()),Integer.parseInt(jTextField31.getText()),jTextField32.getText(),jTextField33.getText()+" "+dateTime);
        }
    }//GEN-LAST:event_UpdateActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
        if(button.equalsIgnoreCase("patient")){
            //System.out.println("patient");
            hpd.deletePatient(Integer.parseInt(jTextField7.getText()));
        }
        
        else if(button.equalsIgnoreCase("doctor")){
            //System.out.println("doctor");
            hpd.deleteDoctor(Integer.parseInt(jTextField2.getText()));
        }
        
        else if(button.equalsIgnoreCase("staff")){
            //System.out.println("staff");
            hpd.deleteStaff(Integer.parseInt(jTextField14.getText()));
        }
        
        else if(button.equalsIgnoreCase("room")){
            //System.out.println("room");
            hpd.deleteRoom(Integer.parseInt(jTextField19.getText()));
        }
        
        else if(button.equalsIgnoreCase("block")){
            //System.out.println("block");
            if(jTextField25.getText().equals(""))
                hpd.deleteBlock(Integer.parseInt(jTextField24.getText()));
            else
                hpd.deleteBlock(Integer.parseInt(jTextField25.getText()));
        }
        
        else if(button.equalsIgnoreCase("stay")){
            //System.out.println("stay");
            hpd.deleteStay(Integer.parseInt(jTextField29.getText()));
        }
    }//GEN-LAST:event_deleteActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        // TODO add your handling code here:
        jTextField7.setText("");
        jTextField8.setText("");
        jTextField9.setText("");
        jTextField10.setText("");
        jTextField11.setText("");
        jTextField12.setText("");
        jTextField13.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
        jTextField14.setText("");
        jTextField15.setText("");
        jTextField18.setText("");
        jTextField16.setText("");
        jTextField17.setText("");
        jTextField34.setText("");
        jTextField19.setText("");
        jTextField20.setText("");
        jComboBox1.setSelectedItem("Select");
        jTextField22.setText("");
        jTextField23.setText("");
        jTextField25.setText("");
        jTextField24.setText("");
        jTextField29.setText("");
        jTextField30.setText("");
        jTextField31.setText("");
        jTextField32.setText("");
        jTextField33.setText("");
        searchBar.setText("");
        searchBar1.setText("");
        searchBar2.setText("");
        searchBar3.setText("");
        searchBar4.setText("");
        searchBar5.setText("");
    }//GEN-LAST:event_clearActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TODO add your handling code here:
        Login_Page lo=new Login_Page();
        this.setVisible(false);
        lo.setVisible(true);
    }//GEN-LAST:event_logoutActionPerformed
    
    public void getDoctorPanel(){
        //this.setTitle("Login Page");
        card.removeAll();
        card.add(doctor_panel);
        card.repaint();
        card.revalidate();
    }
    public void getPatientPanel(){
        //this.setTitle("Login Page");
        card.removeAll();
        card.add(patient_panel);
        card.repaint();
        card.revalidate();
    }
    public void getStaffPanel(){
        //this.setTitle("Login Page");
        card.removeAll();
        card.add(staff_panel);
        card.repaint();
        card.revalidate();
    }
    public void getRoomPanel(){
        //this.setTitle("Login Page");
        card.removeAll();
        card.add(room_panel);
        card.repaint();
        card.revalidate();
    }
    public void getBlockPanel(){
        //this.setTitle("Login Page");
        card.removeAll();
        card.add(block_panel);
        card.repaint();
        card.revalidate();
    }
    public void getStayPanel(){
        //this.setTitle("Login Page");
        card.removeAll();
        card.add(stay_panel);
        card.repaint();
        card.revalidate();
    }
//    public static void main(String args[]) {
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//                
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Login_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Login_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Login_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Login_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Main_Page().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Update;
    private javax.swing.JButton add;
    private javax.swing.JPanel anomalies;
    private javax.swing.JButton block;
    private javax.swing.JTable block_Table4;
    private javax.swing.JPanel block_panel;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel card;
    private javax.swing.JButton clear;
    private javax.swing.JPanel data_Panel;
    private javax.swing.JPanel data_Panel1;
    private javax.swing.JPanel data_Panel2;
    private javax.swing.JPanel data_Panel3;
    private javax.swing.JPanel data_Panel4;
    private javax.swing.JPanel data_Panel5;
    private javax.swing.JButton delete;
    private javax.swing.JButton doctor;
    private javax.swing.JTable doctor_Table;
    private javax.swing.JPanel doctor_panel;
    private javax.swing.JRadioButton female;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField29;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField30;
    private javax.swing.JTextField jTextField31;
    private javax.swing.JTextField jTextField32;
    private javax.swing.JTextField jTextField33;
    private javax.swing.JTextField jTextField34;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JButton logout;
    private javax.swing.JPanel main_panel;
    private javax.swing.JRadioButton male;
    private javax.swing.JPanel muen_panel;
    private javax.swing.JButton patient;
    private javax.swing.JTable patient_Table1;
    private javax.swing.JPanel patient_panel;
    private javax.swing.JButton refresh;
    private javax.swing.JButton room;
    private javax.swing.JTable room_Table3;
    private javax.swing.JPanel room_panel;
    private javax.swing.JTextField searchBar;
    private javax.swing.JTextField searchBar1;
    private javax.swing.JTextField searchBar2;
    private javax.swing.JTextField searchBar3;
    private javax.swing.JTextField searchBar4;
    private javax.swing.JTextField searchBar5;
    private javax.swing.JButton staff;
    private javax.swing.JTable staff_Table2;
    private javax.swing.JPanel staff_panel;
    private javax.swing.JButton stay;
    private javax.swing.JTable stay_Table5;
    private javax.swing.JPanel stay_panel;
    private javax.swing.JPanel table_Panel;
    private javax.swing.JPanel table_Panel1;
    private javax.swing.JPanel table_Panel2;
    private javax.swing.JPanel table_Panel3;
    private javax.swing.JPanel table_Panel4;
    private javax.swing.JPanel table_Panel5;
    // End of variables declaration//GEN-END:variables
}