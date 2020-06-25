package dtcbus;
import static dtcbus.Dtcbus.root;
import dtcbus.trieData.Node;
import static dtcbus.trieData.insert;
import dtcbus.trieData.op;
import static dtcbus.trieData.search;
import java.io.*;
import java.util.*;
import static dtcbus.graphMaker.*;
import static dtcbus.trieData.*;
public class mainScreen extends javax.swing.JFrame {
   
    public javax.swing.ImageIcon img = new javax.swing.ImageIcon(".\\LOGO.jpg");
    public mainScreen() {
        initComponents();
    }
    static int find1=0;
    static int find2 =0;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        heading = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        fromId = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        toId = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        answerArea = new javax.swing.JTextArea();
        choice = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        routeNo = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        busNoSearch = new javax.swing.JComboBox<>();
        jButton8 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        busNo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        answerBus = new javax.swing.JTextArea();
        from = new javax.swing.JLabel();
        to = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        selectArea = new javax.swing.JComboBox<>();
        jButton7 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        outputBuses = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DTC Bus Guide");
        setIconImage(img.getImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 51, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setBackground(new java.awt.Color(255, 51, 0));
        jPanel8.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jButton1.setBackground(new java.awt.Color(204, 0, 0));
        jButton1.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("    Search Route    ");
        jButton1.setActionCommand("    Search Route ");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.setBorderPainted(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setFocusPainted(false);
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setIconTextGap(15);
        jButton1.setMargin(new java.awt.Insets(20, 14, 2, 14));
        jButton1.setRequestFocusEnabled(false);
        jButton1.setRolloverEnabled(false);
        jButton1.setVerifyInputWhenFocusTarget(false);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(204, 0, 0));
        jButton2.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Bus Details");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.setBorderPainted(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setFocusable(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setIconTextGap(15);
        jButton2.setMargin(new java.awt.Insets(20, 14, 2, 14));
        jButton2.setRequestFocusEnabled(false);
        jButton2.setRolloverEnabled(false);
        jButton2.setVerifyInputWhenFocusTarget(false);
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(204, 0, 0));
        jButton3.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("    Bus From Stand");
        jButton3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.setBorderPainted(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setFocusPainted(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setIconTextGap(20);
        jButton3.setMargin(new java.awt.Insets(20, 14, 2, 14));
        jButton3.setRequestFocusEnabled(false);
        jButton3.setRolloverEnabled(false);
        jButton3.setVerifyInputWhenFocusTarget(false);
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(204, 0, 0));
        jButton4.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Home");
        jButton4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton4.setBorderPainted(false);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.setFocusable(false);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setIconTextGap(6);
        jButton4.setMargin(new java.awt.Insets(20, 14, 2, 14));
        jButton4.setSelected(true);
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LOGO.jpg"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("DTC Bus Guide");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 180, 450));

        jLabel5.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Made by : Jitendra  Saksham");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 200, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 490));

        jPanel7.setBackground(new java.awt.Color(255, 51, 0));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        heading.setFont(new java.awt.Font("Gadugi", 0, 24)); // NOI18N
        heading.setForeground(new java.awt.Color(255, 255, 255));
        heading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        heading.setText("Welcome to DTC bus guide");
        jPanel7.add(heading, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 680, 50));

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 710, 50));

        jTabbedPane1.setBackground(new java.awt.Color(0, 102, 0));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(0, 153, 51));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nd.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 710, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 450));

        jTabbedPane1.addTab("tab1", jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 51, 0));
        jPanel3.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                jPanel3InputMethodTextChanged(evt);
            }
        });
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("From");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        fromId.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        fromId.setBorder(null);
        fromId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fromIdActionPerformed(evt);
            }
        });
        fromId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fromIdKeyReleased(evt);
            }
        });
        jPanel3.add(fromId, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 280, 40));

        jLabel11.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("To");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        toId.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        toId.setBorder(null);
        toId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                toIdKeyReleased(evt);
            }
        });
        jPanel3.add(toId, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 280, 40));

        jButton6.setBackground(new java.awt.Color(204, 0, 0));
        jButton6.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bt.png"))); // NOI18N
        jButton6.setBorder(null);
        jButton6.setFocusPainted(false);
        jButton6.setFocusable(false);
        jButton6.setRequestFocusEnabled(false);
        jButton6.setRolloverEnabled(false);
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });
        jPanel3.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, 40, 40));

        answerArea.setBackground(new java.awt.Color(255, 51, 0));
        answerArea.setColumns(20);
        answerArea.setFont(new java.awt.Font("Gadugi", 3, 14)); // NOI18N
        answerArea.setForeground(new java.awt.Color(255, 255, 255));
        answerArea.setRows(5);
        answerArea.setAlignmentX(1.0F);
        answerArea.setAlignmentY(1.0F);
        answerArea.setBorder(null);
        answerArea.setFocusable(false);
        answerArea.setRequestFocusEnabled(false);
        answerArea.setSelectionColor(new java.awt.Color(0, 0, 0));
        answerArea.setVerifyInputWhenFocusTarget(false);
        jScrollPane3.setViewportView(answerArea);

        jPanel3.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 330, 420));

        choice.setBackground(new java.awt.Color(255, 153, 51));
        choice.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        choice.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Minimum stops", "Minimum change", "All routes" }));
        choice.setBorder(null);
        choice.setFocusable(false);
        choice.setLightWeightPopupEnabled(false);
        choice.setOpaque(false);
        choice.setRequestFocusEnabled(false);
        choice.setVerifyInputWhenFocusTarget(false);
        jPanel3.add(choice, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 210, 40));

        jLabel15.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Route type");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jComboBox1.setBackground(new java.awt.Color(255, 153, 0));
        jComboBox1.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select bus stand" }));
        jComboBox1.setBorder(null);
        jComboBox1.setFocusable(false);
        jComboBox1.setLightWeightPopupEnabled(false);
        jComboBox1.setRequestFocusEnabled(false);
        jComboBox1.setVerifyInputWhenFocusTarget(false);
        jPanel3.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 280, 40));

        jComboBox3.setBackground(new java.awt.Color(255, 204, 0));
        jComboBox3.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select bus stand" }));
        jComboBox3.setBorder(null);
        jComboBox3.setFocusable(false);
        jComboBox3.setLightWeightPopupEnabled(false);
        jComboBox3.setRequestFocusEnabled(false);
        jComboBox3.setVerifyInputWhenFocusTarget(false);
        jPanel3.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 280, 40));

        routeNo.setBackground(new java.awt.Color(255, 204, 0));
        routeNo.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        routeNo.setForeground(new java.awt.Color(51, 0, 51));
        routeNo.setBorder(null);
        routeNo.setFocusable(false);
        routeNo.setRequestFocusEnabled(false);
        routeNo.setVerifyInputWhenFocusTarget(false);
        routeNo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                routeNoItemStateChanged(evt);
            }
        });
        jPanel3.add(routeNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 380, 100, 40));

        jLabel6.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Select Route No");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, -1, -1));

        jTabbedPane1.addTab("tab2", jPanel3);

        jPanel5.setBackground(new java.awt.Color(255, 51, 0));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Select bus no");
        jPanel5.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        busNoSearch.setBackground(new java.awt.Color(255, 204, 0));
        busNoSearch.setEditable(true);
        busNoSearch.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        busNoSearch.setFocusable(false);
        busNoSearch.setLightWeightPopupEnabled(false);
        busNoSearch.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                busNoSearchItemStateChanged(evt);
            }
        });
        busNoSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                busNoSearchActionPerformed(evt);
            }
        });
        jPanel5.add(busNoSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 250, 40));

        jButton8.setBackground(new java.awt.Color(204, 0, 0));
        jButton8.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bt.png"))); // NOI18N
        jButton8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton8.setBorderPainted(false);
        jButton8.setFocusPainted(false);
        jButton8.setFocusable(false);
        jButton8.setRequestFocusEnabled(false);
        jButton8.setRolloverEnabled(false);
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton8MouseClicked(evt);
            }
        });
        jPanel5.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, 40, 40));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/busid.png"))); // NOI18N
        jPanel5.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 360, -1, -1));

        busNo.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        busNo.setForeground(new java.awt.Color(255, 255, 255));
        busNo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        busNo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel5.add(busNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 340, 50));

        answerBus.setBackground(new java.awt.Color(255, 51, 0));
        answerBus.setColumns(20);
        answerBus.setFont(new java.awt.Font("Gadugi", 3, 14)); // NOI18N
        answerBus.setForeground(new java.awt.Color(255, 255, 255));
        answerBus.setRows(5);
        answerBus.setBorder(null);
        answerBus.setFocusable(false);
        answerBus.setRequestFocusEnabled(false);
        jScrollPane1.setViewportView(answerBus);
        answerBus.getAccessibleContext().setAccessibleName("");

        jPanel5.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, 300, 410));

        from.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N
        from.setForeground(new java.awt.Color(255, 255, 255));
        from.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel5.add(from, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 280, 50));

        to.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N
        to.setForeground(new java.awt.Color(255, 255, 255));
        to.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel5.add(to, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 330, 50));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dtclogo.jpg"))); // NOI18N
        jPanel5.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 60, 50));

        jTabbedPane1.addTab("tab4", jPanel5);

        jPanel4.setForeground(new java.awt.Color(153, 255, 0));
        jPanel4.setMaximumSize(new java.awt.Dimension(723, 448));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel9.setBackground(new java.awt.Color(255, 51, 0));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Enter Stop ");
        jPanel9.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, 20));

        jTextField2.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        jTextField2.setBorder(null);
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField2KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2KeyTyped(evt);
            }
        });
        jPanel9.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 190, 40));

        selectArea.setBackground(new java.awt.Color(255, 204, 0));
        selectArea.setFont(new java.awt.Font("Gadugi", 0, 14)); // NOI18N
        selectArea.setBorder(null);
        selectArea.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                selectAreaItemStateChanged(evt);
            }
        });
        jPanel9.add(selectArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 40, 250, 40));

        jButton7.setBackground(new java.awt.Color(204, 0, 0));
        jButton7.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bt.png"))); // NOI18N
        jButton7.setBorder(null);
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton7MouseClicked(evt);
            }
        });
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 40, 40, 40));

        outputBuses.setBackground(new java.awt.Color(255, 51, 0));
        outputBuses.setColumns(20);
        outputBuses.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N
        outputBuses.setForeground(new java.awt.Color(255, 255, 255));
        outputBuses.setRows(5);
        outputBuses.setBorder(null);
        jScrollPane2.setViewportView(outputBuses);

        jPanel9.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 680, 320));

        jPanel4.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 720, 450));

        jTabbedPane1.addTab("tab3", jPanel4);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 710, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked

        jTabbedPane1.setSelectedIndex(1);
        heading.setText("Search bus route");
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        heading.setText("Search bus details");
         jTabbedPane1.setSelectedIndex(2);
          
          for(int i = 0;i<=totalBus;i++){
              busNoSearch.addItem(bName[i]);
          }
         
    }//GEN-LAST:event_jButton2MouseClicked
 static ArrayList<Integer> stopId = new ArrayList<>();static String state ="";
 static ArrayList<Integer> stopIdFrom = new ArrayList<>();
 static ArrayList<Integer> stopIdTo = new ArrayList<>();
static String scBus = "";
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseClicked

        int index = searchDtcBus(scBus);
        busNo.setText(scBus);
        String output = "";
        from.setText(convertString(busDetails.get(index).start));
        to.setText(convertString(busDetails.get(index).end));
        for(int i = 0;i<busDetails.get(index).intermediateStop.size();i++){
            output +="\n  "+(i+1) +". "+convertString(busDetails.get(index).intermediateStop.get(i));
        }
        answerBus.setText(output);
    }//GEN-LAST:event_jButton8MouseClicked

    private void busNoSearchItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_busNoSearchItemStateChanged
       
        scBus = String.valueOf(busNoSearch.getSelectedItem());
    }//GEN-LAST:event_busNoSearchItemStateChanged

    private void jPanel3InputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jPanel3InputMethodTextChanged
      
        state = String.valueOf(choice.getSelectedItem());
    }//GEN-LAST:event_jPanel3InputMethodTextChanged
    static ArrayList<resultPair> result;
    static int x;
    static int y;
    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
        // TODO add your handling code here:
        routeNo.removeAllItems();
        resultPair bestRoute = null;
        minCount = Integer.MAX_VALUE;
        totalMinStop= Integer.MAX_VALUE;
         y = stopIdTo.get(jComboBox3.getSelectedIndex());
         x = stopIdFrom.get(jComboBox1.getSelectedIndex());
         
        if(choice.getSelectedIndex() == 0){
            bestRoute = bfsMinStop(x,y);
        }else if(choice.getSelectedIndex() == 1){
           bestRoute = bfsMinChange(x,y);
        }else {
            result = bfsAllRoute(x,y);
            for(int i = 0;i<result.size();i++){
                int val = i + 1;
                routeNo.addItem(val + "");
            }
        }
        if(choice.getSelectedIndex() == 0 || choice.getSelectedIndex() == 1){
        String rrr = "";
        if(bestRoute.bus.size() != 0){

            rrr += ("\n    From : " + convertString(aName[x])
                + "\n      Destination : " + convertString(aName[y])
                + "\n      Intermediate stops : " + totalMinStop
                + "\n      Total Inetrchange : " + (minCount - 1) + "\n\n");
            bestRoute.stop.add(y);
            for(int i = 0;i<bestRoute.bus.size();i++){
                rrr+=("  " + bName[bestRoute.bus.get(i)] + " --> " + convertString(aName[bestRoute.stop.get(i)]) +"\n");
                rrr+=displayIntermediate(bestRoute.bus.get(i),
                    bestRoute.stop.get(i),
                    bestRoute.stop.get(i+1));

                rrr+=("\n");

            }
            rrr+="  "+convertString((aName[y]));
            answerArea.setText(rrr);
        }else{
            
            answerArea.setText("\tSorry !!!  No route is found");
        }
        }
        
    }//GEN-LAST:event_jButton6MouseClicked
    static int counterForSetValue=0;
    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // TODO add your handling code here:
         jTabbedPane1.setSelectedIndex(3);
         heading.setText("Search buses from a bus stand");
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        // TODO add your handling code here:
         jTabbedPane1.setSelectedIndex(0);
         heading.setText("Welcome to DTC bus guide");
    }//GEN-LAST:event_jButton4MouseClicked
    
    private void selectAreaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_selectAreaItemStateChanged
        // TODO add your handling code here:
      
    }//GEN-LAST:event_selectAreaItemStateChanged

    private void jButton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseClicked
        int getN = stopId.get(selectArea.getSelectedIndex());
       
        int countOne = 0;
        String buses;
        buses="";
        if(getN>0){
        for(int i=0;i<areaDetails.get(getN).busOut.size();i++){
            
             String output = bName[areaDetails.get(getN).busOut.get(i)];
             countOne += output.length();
             if(countOne > 30){
                 buses += "\n";
                 countOne = 0;
             }
             buses += output + "     ";
              
        }
      
        }
        outputBuses.setText(buses);
        
       
    }//GEN-LAST:event_jButton7MouseClicked

    private void jTextField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyTyped
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTextField2KeyTyped

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void fromIdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fromIdKeyReleased
        // TODO add your handling code here:
          // TODO add your handling code here:
        jComboBox1.removeAllItems();
        String sI = fromId.getText();
        stopIdFrom.clear();
         ArrayList<trieData.op> res = search(root, sI,"");
        for(op t : res){
            jComboBox1.addItem(t.g);
            stopIdFrom.add(t.val);
        }
    }//GEN-LAST:event_fromIdKeyReleased

    private void toIdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_toIdKeyReleased
        // TODO add your handling code here:
        jComboBox3.removeAllItems();
        String sI = toId.getText();
        stopIdTo.clear();
        ArrayList<trieData.op> res = search(root, sI,"");
        for(op t : res){
            jComboBox3.addItem(t.g);
            stopIdTo.add(t.val);
        }
    }//GEN-LAST:event_toIdKeyReleased

    private void jTextField2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyReleased
        // TODO add your handling code here:
        selectArea.removeAllItems();
        String sI =(jTextField2.getText());
        stopId.clear();
        ArrayList<trieData.op> res = search(root, sI,"");
 
        for(op t : res){
            selectArea.addItem(t.g);
            stopId.add(t.val);
        }
    }//GEN-LAST:event_jTextField2KeyReleased

    private void busNoSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_busNoSearchActionPerformed

    }//GEN-LAST:event_busNoSearchActionPerformed

    private void routeNoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_routeNoItemStateChanged
        // TODO add your handling code here:
       
        int cc = routeNo.getSelectedIndex() == -1 ? 0 : routeNo.getSelectedIndex();
        System.out.println(cc);
        String rrr = "";
            rrr += ("\n    From : " + convertString(aName[x])
                + "\n      Destination : " + convertString(aName[y])
                + "\n      Intermediate stops : " + result.get(cc).minStop
                + "\n      Total Inetrchange : " + (result.get(cc).totalChange - 1) + "\n\n");
          
            result.get(cc).stop.add(y);
            for(int i = 0;i<result.get(cc).bus.size();i++){
                rrr+=("  " + bName[result.get(cc).bus.get(i)] + " --> " + convertString(aName[result.get(cc).stop.get(i)]) +"\n");
                rrr+=displayIntermediate(result.get(cc).bus.get(i),
                    result.get(cc).stop.get(i),
                    result.get(cc).stop.get(i+1));
      
                rrr+=("\n");
                 
            }
            rrr+="  "+convertString((aName[y]));
            answerArea.setText(rrr);
            
    }//GEN-LAST:event_routeNoItemStateChanged

    private void fromIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fromIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fromIdActionPerformed

    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea answerArea;
    private javax.swing.JTextArea answerBus;
    private javax.swing.JLabel busNo;
    private javax.swing.JComboBox<String> busNoSearch;
    private javax.swing.JComboBox<String> choice;
    private javax.swing.JLabel from;
    private javax.swing.JTextField fromId;
    private javax.swing.JLabel heading;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextArea outputBuses;
    private javax.swing.JComboBox<String> routeNo;
    private javax.swing.JComboBox<String> selectArea;
    private javax.swing.JLabel to;
    private javax.swing.JTextField toId;
    // End of variables declaration//GEN-END:variables
}
