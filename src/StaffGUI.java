
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
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
public class StaffGUI extends javax.swing.JFrame {
    
    
    DecimalFormat df = new DecimalFormat(".00");
    /**
     * Creates new form StaffGUI
     */
    private DefaultTableModel tblModel;
    public StaffGUI() {
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
        btnSearch = new javax.swing.JButton();
        btnDisplayAll = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        taDisplay = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblDisplay = new javax.swing.JTable();
        btnExit = new javax.swing.JButton();
        tfPrevious = new javax.swing.JTextField();
        tfArrears = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        tfaccnum = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Bill Date");

        tfBillDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfBillDateActionPerformed(evt);
            }
        });

        jLabel2.setText("Name");

        jLabel3.setText("Address");

        jLabel4.setText("Arrears");

        jLabel5.setText("Previous Meter Reading");

        jLabel6.setText("Current Meter Reading");

        jLabel7.setText("Total Unit");

        jLabel8.setText("Current Charge");

        jLabel9.setText("Total Bill");

        tfTotalBill.setEditable(false);

        btnCalculate.setText("Calculate");
        btnCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculateActionPerformed(evt);
            }
        });

        btnSave.setText("Save Data");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnDisplayAll.setText("Display All");
        btnDisplayAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisplayAllActionPerformed(evt);
            }
        });

        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

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

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        jLabel10.setText("Account Number");

        tfaccnum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfaccnumActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9))
                                .addGap(51, 51, 51)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfCurrentCharge, javax.swing.GroupLayout.DEFAULT_SIZE, 777, Short.MAX_VALUE)
                                    .addComponent(tfTotalBill)
                                    .addComponent(tfTotalUnit)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfCurrentMeter)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tfPrevious, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tfArrears, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3))
                                        .addGap(111, 111, 111)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tfAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel10)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(tfaccnum, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel1)
                                            .addGap(111, 111, 111)
                                            .addComponent(tfBillDate, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(98, 98, 98))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1060, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnExit)
                        .addGap(28, 28, 28)
                        .addComponent(btnCalculate)
                        .addGap(26, 26, 26)
                        .addComponent(btnSave)
                        .addGap(18, 18, 18)
                        .addComponent(btnReset)
                        .addGap(18, 18, 18)
                        .addComponent(btnDisplayAll)
                        .addGap(26, 26, 26)
                        .addComponent(btnSearch)
                        .addGap(32, 32, 32)
                        .addComponent(btnUpdate)
                        .addGap(35, 35, 35)
                        .addComponent(btnDelete)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 1060, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfBillDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(tfaccnum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(tfAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel4))
                    .addComponent(tfArrears, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tfPrevious, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tfCurrentMeter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tfTotalUnit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tfCurrentCharge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(tfTotalBill, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExit)
                    .addComponent(btnCalculate)
                    .addComponent(btnSave)
                    .addComponent(btnReset)
                    .addComponent(btnDisplayAll)
                    .addComponent(btnSearch)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfBillDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfBillDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfBillDateActionPerformed

    private void btnCalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculateActionPerformed
        // TODO add your handling code here:
        StaffOperation So=new StaffOperation();
        double previousmeter = Double.parseDouble(tfPrevious.getText());  //convert String to double
        double currentmeter = Double.parseDouble(tfCurrentMeter.getText());
     
       double totalunit = currentmeter - previousmeter;  //this is in double 
       tfTotalUnit.setText(String.valueOf(totalunit));   //convert to String
       
       double arrears = Double.parseDouble(tfArrears.getText());
       double currentcharge = So.calctariff(totalunit);
       tfCurrentCharge.setText(String.valueOf(df.format(currentcharge)));
       double totalbill = arrears + currentcharge;
       tfTotalBill.setText(String.valueOf(df.format(totalbill)));
    }//GEN-LAST:event_btnCalculateActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        Staff employee;
        StaffOperation staffOperation = new StaffOperation();
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
        employee = new Staff(billdate,accnumber, name, address, arrears, previousmeter, currentmeter,totalunit,currentcharge,totalbill);    
        try {
            staffOperation.addRecord(employee); // add one record into text file
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        JOptionPane.showMessageDialog(null, "The record has been saved successfully in the text file");
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
        taDisplay.setText("");
        tblModel.setRowCount(0); // row in the table will be zero
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnDisplayAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisplayAllActionPerformed
        // TODO add your handling code here:
        ArrayList <Staff> emps;
        StaffOperation staffOperation = new StaffOperation();
        
        taDisplay.setText("CUSTOMER DETAILS\n");
        taDisplay.append("\nBILLDATE\tACCNUM \tNAME \tADDRESS \tARREARS \tPREVIOUS \tCURRENT \tTOTALUNIT \tCURRENTCHARGE \tTOTALBILL \n");
        
        tblModel = (DefaultTableModel) tblDisplay.getModel(); 
        tblModel.setRowCount(0);
        try 
        {
            
            emps = staffOperation.displayAllRecord(); //  emps = employees
            for (int i=0; i<emps.size(); i++)
            {
                String billdate = String.valueOf(emps.get(i).getbilldate());
                
                String name = emps.get(i).getname();
                String accnum =String.valueOf(emps.get(i).getaccnumber());
                String address = emps.get(i).getaddress();
                String arrears = String.valueOf(emps.get(i).getarrears());
                String previousmeter = String.valueOf(emps.get(i).getpreviousmeter());
                String currentmeter = String.valueOf(emps.get(i).getcurrentmeter());
                String totalunit = String.valueOf(emps.get(i).gettotalunit());
                String currentcharge = String.valueOf(emps.get(i).getcurrentcharge()); 
                String totalbill = String.valueOf(emps.get(i).gettotalbill());
                
                taDisplay.append(billdate+"\t"+accnum+"\t"+name+"\t"+address+"\t"+arrears+"\t"+previousmeter+"\t"+currentmeter+"\t"+totalunit+"\t"+currentcharge+"\t\t"+totalbill+"\n");
                System.out.printf("%-6s %-25s %-10s %-25s %-10s %8.2f %8.2f  %8.2f  %8.2f  %8.2f \n",emps.get(i).getbilldate(),emps.get(i).getaccnumber(),emps.get(i).getname(),emps.get(i).getaddress(), 
                        emps.get(i).getarrears(), emps.get(i).getpreviousmeter(), emps.get(i).getcurrentmeter(), emps.get(i).gettotalunit(), emps.get(i).getcurrentcharge(),emps.get(i).gettotalbill());
                
                String [] data = {billdate,accnum, name, address, arrears, previousmeter, currentmeter, totalunit, currentcharge,totalbill};
                tblModel.addRow(data); // add data into Jtable name
                
                }
            
        } catch (IOException ex) 
        {
            System.out.println(ex.getMessage());
        }
        
         
        
    }//GEN-LAST:event_btnDisplayAllActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        StaffOperation staffOperation = new StaffOperation();
        int accnum1=Integer.parseInt(JOptionPane.showInputDialog("Input Account Number"));
        //int staffNo = Integer.parseInt(tfBillDate.getText());
        System.out.println("search accnum = "+accnum1);
        
        Staff record = null;
        try
        {    
            record = staffOperation.findRecord(accnum1);
        }catch (IOException ex)
        {
            System.out.println(ex.getMessage());
        }
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
            tfCurrentCharge.setText(String.valueOf(currentcharge));
            tfTotalBill.setText(String.valueOf(totalbill));
            
     
            
       
            
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
            
            
        
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        StaffOperation staffOperation = new StaffOperation();
        ArrayList <Staff> emps = new ArrayList <Staff>();
        Staff emp = null;
        
        int staffNo = Integer.parseInt(tfaccnum.getText());
        System.out.println("search staffno = "+staffNo);
        
        try
        {
            emps = staffOperation.readAllRecordFromFile(); // read all records in text file and store it in arraylist
            for(int i=0; i<emps.size(); i++)
            {
                if (staffNo == emps.get(i).getaccnumber())
                {
                    emp = emps.get(i);
                    emps.remove(i);
                    staffOperation.addAllRecordInFile(emps);
                    JOptionPane.showMessageDialog(null, "The record of \n"+emp.getaccnumber()+"\n"+emp.getname()+"\nhas been deleted successfully");
                    taDisplay.setText("The record of "+emp.getaccnumber()+"\t"+emp.getname()+"has been deleted successfully");
                }
            }
            if (emp == null)
                JOptionPane.showMessageDialog(null, "The record of "+staffNo+" is not found");
        }
        catch(IOException ex)
        {
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        Staff employee;
        
        StaffOperation staffOperation = new StaffOperation();
        
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
       double currentcharge = staffOperation.calctariff(totalunit);
       tfCurrentCharge.setText(String.valueOf(df.format(currentcharge)));
       double totalbill = arrears + currentcharge;
       tfTotalBill.setText(String.valueOf(df.format(totalbill)));
        
       
       
       
        //String state = String.valueOf(cbState.getSelectedItem());
        double salary = Double.parseDouble(tfCurrentMeter.getText());
        double allowance = Double.parseDouble(tfTotalUnit.getText());
        double deduction = Double.parseDouble(tfCurrentCharge.getText());
        double netSalary = salary + allowance - deduction;
        
        employee = new Staff(billdate,accnumber, name, address, arrears, previousmeter, currentmeter,totalunit,currentcharge,totalbill);
        
        ArrayList <Staff> emps = new ArrayList <Staff>();
        try
        {
            emps = staffOperation.readAllRecordFromFile();
        }
        catch (IOException ex)
        {
            System.out.println(ex.getMessage());
        }
        
        for (int i=0; i<emps.size(); i++)
        {
            if (employee.getaccnumber() == emps.get(i).getaccnumber())
                emps.set(i, employee); // update record dlm arraylist
        }
        
        try
        {
            staffOperation.addAllRecordInFile(emps);
            JOptionPane.showMessageDialog(null, "The record of "+accnumber+" has been updated successfully");
        }
        catch (IOException ex)
        {
            System.out.println(ex.getMessage());
        }
        
        
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void tfaccnumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfaccnumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfaccnumActionPerformed

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
            java.util.logging.Logger.getLogger(StaffGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StaffGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StaffGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StaffGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StaffGUI().setVisible(true);
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
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
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
