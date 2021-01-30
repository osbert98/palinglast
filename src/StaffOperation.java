
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import java.io.PrintWriter;
import java.util.ArrayList;

public class StaffOperation 
{
    
    public void addRecord(Staff emp) throws IOException 
    {  // emp = employee
        File fileName = new File("ElectricAcc.txt");
        FileWriter fw = new FileWriter(fileName, true);
        PrintWriter pw = new PrintWriter(fw);
        
        pw.println(emp.getbilldate());
        pw.println(emp.getaccnumber());
        pw.println(emp.getname());
        pw.println(emp.getaddress());
        pw.println(emp.getarrears());
        pw.println(emp.getpreviousmeter());
        pw.println(emp.getcurrentmeter());
        pw.println(emp.gettotalunit());
        pw.println(emp.getcurrentcharge());
        pw.println(emp.gettotalbill());
          
        pw.close();
        fw.close();
        
    } // addRecord
    
    public ArrayList <Staff>  displayAllRecord() throws FileNotFoundException, IOException
    {
        ArrayList <Staff> employees = new ArrayList<Staff>();
        Staff emp;
        
        File fileName = new File("ElectricAcc.txt");
        FileReader fr = new FileReader(fileName);
        BufferedReader br =  new BufferedReader(fr);
        
        String line = br.readLine(); // 1st baris
        while (line != null)
        {
            //System.out.println(line);
            String billdate = line;
            
            int accnum = Integer.parseInt(br.readLine()); 
            
            String name = br.readLine(); // 2nd baris
            
            String address = br.readLine(); // baris ke-4
            double arrears = Double.parseDouble(br.readLine()); // baris ke-5
            double previousmeter = Double.parseDouble(br.readLine()); // baris ke-6
            double currentmeter = Double.parseDouble(br.readLine()); // baris ke-7
            double totalunit = Double.parseDouble(br.readLine()); // baris ke-8
            double currentcharge = Double.parseDouble(br.readLine()); // baris ke-9
            double totalbill = Double.parseDouble(br.readLine()); // baris ke-10
            
            emp = new Staff(billdate,accnum,  name, address, arrears,previousmeter,currentmeter, totalunit, currentcharge,totalbill);
            employees.add(emp);  // store into arraylist
            line = br.readLine();
        } // while (line != null)
        br.close();
        fr.close();
        return employees;
        
    } // displayAllRecord
    
    public ArrayList <Staff>  readAllRecordFromFile() throws FileNotFoundException, IOException
    {
        ArrayList <Staff> employees = new ArrayList<Staff>();
        Staff emp;
        
        File fileName = new File("ElectricAcc.txt");
        FileReader fr = new FileReader(fileName);
        BufferedReader br =  new BufferedReader(fr);
        
        String line = br.readLine();
        while (line != null)
        {
            //System.out.println(line);
            String billdate = line;
            
            int accnum = Integer.parseInt(br.readLine()); 
            
            String name = br.readLine(); // 2nd baris
            
            String address = br.readLine(); // baris ke-4
            double arrears = Double.parseDouble(br.readLine()); // baris ke-5
            double previousmeter = Double.parseDouble(br.readLine()); // baris ke-6
            double currentmeter = Double.parseDouble(br.readLine()); // baris ke-7
            double totalunit = Double.parseDouble(br.readLine()); // baris ke-8
            double currentcharge = Double.parseDouble(br.readLine()); // baris ke-9
            double totalbill = Double.parseDouble(br.readLine()); // baris ke-10
            
             emp = new Staff(billdate,accnum,  name, address, arrears,previousmeter,currentmeter, totalunit, currentcharge,totalbill);
            employees.add(emp);
            line = br.readLine();
        } // while (line != null)
        br.close();
        fr.close();
        return employees;
    } // readAllRecordFromFile
    
    public Staff findRecord(int Accnum) throws FileNotFoundException, IOException
    {
        Staff emp = null;
        ArrayList <Staff> employeeList = readAllRecordFromFile();
        
        for (int i=0; i < employeeList.size(); i++)
        {
            if(Accnum == employeeList.get(i).getaccnumber())
            {
                emp = employeeList.get(i);
                System.out.println("Record is found");
            }
                
        }
        return emp;
    } //findRecord
    
    public void addAllRecordInFile(ArrayList <Staff> employees) throws IOException
    {
        File fileName = new File("ElectricAcc.txt");
        FileWriter fw = new FileWriter(fileName);
        PrintWriter pw = new PrintWriter(fw);
        
        for (int i=0; i < employees.size(); i++)
        {
            pw.println(employees.get(i).getbilldate());
            pw.println(employees.get(i).getaccnumber());
            pw.println(employees.get(i).getname());
            pw.println(employees.get(i).getaddress());
            pw.println(employees.get(i).getarrears());
            pw.println(employees.get(i).getpreviousmeter());
            pw.println(employees.get(i).getcurrentmeter());
            pw.println(employees.get(i).gettotalunit());
            pw.println(employees.get(i).getcurrentcharge());
            pw.println(employees.get(i).gettotalbill());

        }
        pw.close();
        fw.close();
    } //addAllRecordInFile
    
    public double calctariff(double x){
       double sum=0;
       double[] a=new double[5];
       a[0]=200*0.218;
       a[1]=100*0.334;
       a[2]=300*0.516;
       a[3]=300*0.546;
       
      if(x<=200){
      sum=x*0.218;
      }else if(x>200&&x<=300){
      sum=a[0]+((x-200)*0.334);
      }else if(x>300&&x<=600){
      sum=a[0]+a[1]+((x-300)*0.516);
      }
      else if(x>600&&x<=900){
      sum=a[0]+a[1]+a[2]+((x-600)*0.546);
      } 
      else if(x>=901){
      sum=a[0]+a[1]+a[2]+a[3]+((x-900)*0.571);
      }
       
        return sum;
    }
    
} // class StaffOperation
