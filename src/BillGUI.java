
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class BillGUI extends javax.swing.JFrame {
    
    
    DecimalFormat df = new DecimalFormat(".00");
    /**
     * Creates new form StaffGUI
     */
    private DefaultTableModel tblModel;
    public BillGUI() {
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

        btnGender = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tfBillDate = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tfName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfAddress = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tfCurrentMeter = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tfTotalUnit = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tfCurrentCharge = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        tfTotalBill = new javax.swing.JTextField();
        btnCalculate = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnDisplayAll = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        taDisplay = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        taDisplay = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblDisplay = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblDisplay = new javax.swing.JTable();
        btnExit = new javax.swing.JButton();
        tfPrevious = new javax.swing.JTextField();
        tfArrears = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        tfaccnum = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Electric Bill Management");
        setBackground(new java.awt.Color(51, 51, 51));
        setForeground(new java.awt.Color(204, 204, 204));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Bill Date");

        tfBillDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfBillDateActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Name");

        jLabel3.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Address");

        jLabel4.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Arrears");

        jLabel5.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Previous Meter Reading");

        jLabel6.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Current Meter Reading");

        jLabel7.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Total Unit");

        tfTotalUnit.setEditable(false);

        jLabel8.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Current Charge");

        tfCurrentCharge.setEditable(false);

        jLabel9.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Total Bill");

        tfTotalBill.setEditable(false);

        btnCalculate.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        btnCalculate.setText("Calculate");
        btnCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculateActionPerformed(evt);
            }
        });

        btnSave.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        btnSave.setText("Save Data");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnDisplayAll.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        btnDisplayAll.setText("Display All");
        btnDisplayAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisplayAllActionPerformed(evt);
            }
        });

        btnReset.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnUpdate.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        taDisplay.setEditable(false);
        taDisplay.setColumns(20);
        taDisplay.setRows(5);
        jScrollPane2.setViewportView(taDisplay);

        taDisplay.setEditable(false);
        taDisplay.setColumns(20);
        taDisplay.setRows(5);
        jScrollPane2.setViewportView(taDisplay);

        tblDisplay.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}

            },
            new String [] {
                "Bill Date", "Account Number", "Name", "Address", "Arrears", "Previous Meter", "Current Meter", "Total Unit", "Current Charge","Total Bill"
            }
        ));
        jScrollPane3.setViewportView(tblDisplay);

        tblDisplay.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}

            },
            new String [] {
                "Bill Date", "Account Number", "Name", "Address", "Arrears", "Previous Meter", "Current Meter", "Total Unit", "Current Charge","Total Bill"
            }
        ));
        jScrollPane3.setViewportView(tblDisplay);

        btnExit.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Account Number");

        tfaccnum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfaccnumActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jButton1.setText("BinarySearch");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9))
                                .addGap(27, 27, 27))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(tfPrevious, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfArrears, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfAddress, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfName, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfBillDate, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfaccnum, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tfCurrentMeter, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfTotalUnit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfCurrentCharge, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfTotalBill, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(31, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane3)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnCalculate, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnDisplayAll)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1)
                                .addGap(18, 18, 18)
                                .addComponent(btnUpdate)
                                .addGap(18, 18, 18)
                                .addComponent(btnDelete)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 280, Short.MAX_VALUE)
                                .addComponent(btnExit))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 632, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 16, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(tfBillDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(tfaccnum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfArrears, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(tfPrevious, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(tfCurrentMeter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfTotalUnit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfCurrentCharge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfTotalBill, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCalculate)
                    .addComponent(btnSave)
                    .addComponent(btnDisplayAll)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete)
                    .addComponent(jButton1)
                    .addComponent(btnReset)
                    .addComponent(btnExit))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 362, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfBillDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfBillDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfBillDateActionPerformed

    private void btnCalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculateActionPerformed
        // TODO add your handling code here:
        try{
        BillOperation So=new BillOperation();
        double previousmeter = Double.parseDouble(tfPrevious.getText());  //convert String to double
        double currentmeter = Double.parseDouble(tfCurrentMeter.getText());
     
       double totalunit = currentmeter - previousmeter;  //this is in double 
       tfTotalUnit.setText(String.valueOf(totalunit));   //convert to String
       
       double arrears = Double.parseDouble(tfArrears.getText());
       double currentcharge = So.calctariff(totalunit);
       tfCurrentCharge.setText(String.valueOf(df.format(currentcharge)));
       double totalbill = arrears + currentcharge;
       tfTotalBill.setText(String.valueOf(df.format(totalbill)));
       }catch(NumberFormatException e1){
        JOptionPane.showMessageDialog(null, "Please Enter The Correct Arrears, Previous Meter or Current Meter");
        }
    }//GEN-LAST:event_btnCalculateActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        try{
        Data user;
        BillOperation billoperation = new BillOperation();
        int accnumber=Integer.parseInt(tfaccnum.getText());
        String billdate = tfBillDate.getText(); // get data in String from textfield staff No and convert into integer
        String name = tfName.getText(); // get data in String from textfield name
        
        String address = tfAddress.getText(); 

        double arrears = Double.parseDouble(tfArrears.getText()); // get data in String from textfield salary and convert into double
        double previousmeter = Double.parseDouble(tfPrevious.getText());
        double currentmeter = Double.parseDouble(tfCurrentMeter.getText());
        

        double totalunit = currentmeter - previousmeter;  //this is in double 
       tfTotalUnit.setText(String.valueOf(totalunit));   //convert to String    
        
       double currentcharge = Double.parseDouble(tfCurrentCharge.getText());
       double totalbill = arrears + currentcharge;
       tfTotalBill.setText(String.valueOf(totalbill));
       
        // store a record into an object
        user = new Data(billdate,accnumber, name, address, arrears, previousmeter, currentmeter,totalunit,currentcharge,totalbill);  
        String [] data={tfBillDate.getText(),tfaccnum.getText(),tfName.getText(),tfAddress.getText(),tfArrears.getText(),tfPrevious.getText(),tfCurrentMeter.getText()
                        ,tfTotalUnit.getText(),tfCurrentCharge.getText(),tfTotalBill.getText()};
        tblModel = (DefaultTableModel) tblDisplay.getModel(); 
        tblModel.addRow(data);
        try {
            billoperation.addRecord(user); // add one record into text file
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        JOptionPane.showMessageDialog(null, "The record has been saved successfully in the text file");
        }catch(NumberFormatException e1){
        JOptionPane.showMessageDialog(null, "Please Enter The Correct Information");
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        tfBillDate.setText("");
        tfName.setText("");
  //      btnGender.clearSelection(); // make the two radio buttons to be unselected
        tfAddress.setText("");
//        cbState.setSelectedIndex(0); // make a combobox set to the first item
        tfPrevious.setText("");
        tfCurrentMeter.setText("");
        tfTotalUnit.setText("");
        tfCurrentCharge.setText("");
        tfTotalBill.setText("");
        tfaccnum.setText("");
        tfArrears.setText("");
        taDisplay.setText("");
        
        tblModel.setRowCount(0); // row in the table will be zero
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnDisplayAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisplayAllActionPerformed
        // TODO add your handling code here:
        ArrayList <Data> usrs;
        BillOperation billoperation = new BillOperation();
        
        taDisplay.setText("ACCOUNT DETAILS\n");
        taDisplay.append("\nBILLDATE\tACCNUM \tNAME \tADDRESS \tARREARS \tPREVIOUS \tCURRENT \tTOTALUNIT \tCURRENTCHARGE \tTOTALBILL \n");
        
        tblModel = (DefaultTableModel) tblDisplay.getModel(); 
        tblModel.setRowCount(0);
        try 
        {
            
            usrs = billoperation.displayAllRecord(); //  usrs = users
            for (int i=0; i<usrs.size(); i++)
            {
                String billdate = String.valueOf(usrs.get(i).getbilldate());
                
                String name = usrs.get(i).getname();
                String accnum =String.valueOf(usrs.get(i).getaccnumber());
                String address = usrs.get(i).getaddress();
                String arrears = String.valueOf(usrs.get(i).getarrears());
                String previousmeter = String.valueOf(usrs.get(i).getpreviousmeter());
                String currentmeter = String.valueOf(usrs.get(i).getcurrentmeter());
                String totalunit = String.valueOf(usrs.get(i).gettotalunit());
                String currentcharge = String.valueOf(df.format(usrs.get(i).getcurrentcharge())); 
                String totalbill = String.valueOf(df.format(usrs.get(i).gettotalbill()));
                
                taDisplay.append(billdate+"\t"+accnum+"\t"+name+"\t"+address+"\t"+arrears+"\t"+previousmeter+"\t"+currentmeter+"\t"+totalunit+"\t"+currentcharge+"\t\t"+totalbill+"\n");
                System.out.printf("%-6s %-25s %-10s %-25s %-10s %8.2f %8.2f  %8.2f  %8.2f  %8.2f \n",usrs.get(i).getbilldate(),usrs.get(i).getaccnumber(),usrs.get(i).getname(),usrs.get(i).getaddress(), 
                        usrs.get(i).getarrears(), usrs.get(i).getpreviousmeter(), usrs.get(i).getcurrentmeter(), usrs.get(i).gettotalunit(), usrs.get(i).getcurrentcharge(),usrs.get(i).gettotalbill());
                
                String [] data = {billdate,accnum, name, address, arrears, previousmeter, currentmeter, totalunit, currentcharge,totalbill};
                tblModel.addRow(data); // add data into Jtable name
                
                }
            
        } catch (IOException ex) 
        {
            System.out.println(ex.getMessage());
        }
        
         
        
    }//GEN-LAST:event_btnDisplayAllActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        try{
        BillOperation billoperation = new BillOperation();
        ArrayList <Data> usrs = new ArrayList <Data>();
        Data usr = null;
        
        int accnum1 = Integer.parseInt(JOptionPane.showInputDialog("Input the Account Number to Delete"));
        System.out.println("search accnum1 = "+accnum1);
        
        try
        {
            usrs = billoperation.readAllRecordFromFile(); // read all records in text file and store it in arraylist
            for(int i=0; i<usrs.size(); i++)
            {
                if (accnum1 == usrs.get(i).getaccnumber())
                {
                    usr = usrs.get(i);
                    usrs.remove(i);
                    billoperation.addAllRecordInFile(usrs);
                    JOptionPane.showMessageDialog(null, "The record of \n"+usr.getaccnumber()+"\n"+usr.getname()+"\nhas been deleted successfully");
                    taDisplay.setText("The record of "+usr.getaccnumber()+"\t"+usr.getname()+"has been deleted successfully");
                }
            }
            if (usr == null)
                JOptionPane.showMessageDialog(null, "The record of "+accnum1+" is not found");
        }
        
        catch(IOException ex)
        {
            System.out.println(ex.getMessage());
        }btnDisplayAllActionPerformed(evt);
        }catch(NumberFormatException e1){
        JOptionPane.showMessageDialog(null, "Please Enter The Correct Account Number");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        try{
        Data user;
        
        BillOperation billoperation = new BillOperation();
        
        String billdate = tfBillDate.getText();
        int accnumber = Integer.parseInt(tfaccnum.getText());
        String name = tfName.getText();
        String address = tfAddress.getText(); 
         //double arrears = Double.parseDouble(tfArrears.getText());
        double previousmeter = Double.parseDouble(tfPrevious.getText());
        double currentmeter = Double.parseDouble(tfCurrentMeter.getText());
        
        double totalunit = currentmeter - previousmeter;  //this is in double 
       tfTotalUnit.setText(String.valueOf(totalunit));   //convert to String
       
       double arrears = Double.parseDouble(tfArrears.getText());   //sambung code fauzan
       double currentcharge = billoperation.calctariff(totalunit);
       tfCurrentCharge.setText(String.valueOf(df.format(currentcharge)));
       double totalbill = arrears + currentcharge;
       tfTotalBill.setText(String.valueOf(df.format(totalbill)));
        
       
       
      
        
        user = new Data(billdate,accnumber, name, address, arrears, previousmeter, currentmeter,totalunit,currentcharge,totalbill);
        
        ArrayList <Data> usrs = new ArrayList <Data>();
        try
        {
            usrs = billoperation.readAllRecordFromFile();
        }
        catch (IOException ex)
        {
            System.out.println(ex.getMessage());
        }
        
        for (int i=0; i<usrs.size(); i++)
        {
            if (user.getaccnumber() == usrs.get(i).getaccnumber())
                usrs.set(i, user); // update record dlm arraylist
        }
        
        try
        {
            billoperation.addAllRecordInFile(usrs);
            JOptionPane.showMessageDialog(null, "The record of "+accnumber+" has been updated successfully");
        }
        catch (IOException ex)
        {
            System.out.println(ex.getMessage());
        }
        }catch(NumberFormatException e1){
        JOptionPane.showMessageDialog(null, "Please Enter The Correct Information");
        }
        
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
                                                              
        if(JOptionPane.showConfirmDialog(null, "Are You Sure?", "Exit",
            JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
        System.exit(0);
        }
    }//GEN-LAST:event_btnExitActionPerformed

    private void tfaccnumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfaccnumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfaccnumActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        BillOperation billoperation = new BillOperation();
        try{
        int accnum1=Integer.parseInt(JOptionPane.showInputDialog("Input Account Number"));
        
        //int accnum1 = Integer.parseInt(tfBillDate.getText());
        System.out.println("search accnum = "+accnum1);
        ArrayList<Data> usr=null;
        try {
            usr = billoperation.readAllRecordFromFile();
            
        } catch (IOException ex) {
            Logger.getLogger(BillGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        Data record = null;
        record = billoperation.binarySearch(usr,0,usr.size(),accnum1);
        if (record != null)
        {
            String billdate = record.getbilldate();
            String name = record.getname();
            String accnum = String.valueOf(record.getaccnumber());
            String address = record.getaddress();
            double arrears = record.getarrears();
            double previousmeter = record.getpreviousmeter();
            double currentmeter = record.getcurrentmeter();
            double totalunit = record.gettotalunit();
            double currentcharge = record.getcurrentcharge();
            double totalbill = record.gettotalbill();
       
            tfBillDate.setText(billdate);
            tfaccnum.setText(String.valueOf(accnum));
            tfName.setText(name);
            tfAddress.setText(address);
            tfArrears.setText(String.valueOf(arrears));
            tfCurrentMeter.setText(String.valueOf(currentmeter));
            tfPrevious.setText(String.valueOf(previousmeter));
            tfTotalUnit.setText(String.valueOf(totalunit));
            tfCurrentCharge.setText(String.valueOf(df.format(currentcharge)));
            tfTotalBill.setText(String.valueOf(df.format(totalbill)));
            
     
            
       
            
            taDisplay.setText("RECORD\n");
            taDisplay.append("\nBILLDATE\tACCNUM \tNAME \tADDRESS \tARREARS \tPREVIOUS \tCURRENT \tTOTALUNIT \tCURRENTCHARGE \tTOTALBILL \n");
            taDisplay.append(billdate+"\t"+accnum+"\t"+name+"\t"+address+"\t"+arrears+"\t"+previousmeter+"\t"+currentmeter+"\t"+totalunit+"\t"+currentcharge+"\t\t"+totalbill+"\n");
            JOptionPane.showMessageDialog(null, "The record of "+accnum1+" is found successfully");
        }
        else // if record == null
        {
            JOptionPane.showMessageDialog(null, "The record of "+accnum1+" is not found");
            taDisplay.setText("The record of staff id = "+accnum1+" is not found");
        }
            
         }catch(NumberFormatException e1){
        JOptionPane.showMessageDialog(null, "Please Enter The Correct Account Number");
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(BillGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BillGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BillGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BillGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BillGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalculate;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnDisplayAll;
    private javax.swing.JButton btnExit;
    private javax.swing.ButtonGroup btnGender;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea taDisplay;
    private javax.swing.JTable tblDisplay;
    private javax.swing.JTextField tfAddress;
    private javax.swing.JTextField tfArrears;
    private javax.swing.JTextField tfBillDate;
    private javax.swing.JTextField tfCurrentCharge;
    private javax.swing.JTextField tfCurrentMeter;
    private javax.swing.JTextField tfName;
    private javax.swing.JTextField tfPrevious;
    private javax.swing.JTextField tfTotalBill;
    private javax.swing.JTextField tfTotalUnit;
    private javax.swing.JTextField tfaccnum;
    // End of variables declaration//GEN-END:variables
}
