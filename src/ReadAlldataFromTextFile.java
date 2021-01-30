
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class ReadAlldataFromTextFile 
{
    public void readMethod1() throws FileNotFoundException, IOException
    {
        File fileName = new File("ElectricAcc.txt");
        FileReader fr = new FileReader(fileName);
        BufferedReader br =  new BufferedReader(fr);
        
        String line = br.readLine();
        while (line != null)
        {
            System.out.println(line);
            line = br.readLine();
        }
        br.close();
        fr.close();
    } // readMethod1
    
    public void readMethod2() throws FileNotFoundException, IOException
    {
        File fileName = new File("ElectricAcc.txt");
        FileReader fr = new FileReader(fileName);
        BufferedReader br =  new BufferedReader(fr);
        
        String line = br.readLine();
        while (line != null)
        {
            
            String billdate = br.readLine();
            System.out.println("Bill Date = "+billdate);
            
            int accnum;
            accnum = Integer.parseInt(line);
            System.out.println("Account Number = "+accnum);
            
            String name = br.readLine();
            System.out.println("Name = "+name);
            
        
            
            String address = br.readLine();
            System.out.println("address = "+address);
            
            String txtArrears = br.readLine();
            System.out.println("Arrears = "+txtArrears);
            
            String txtPreviousMeter = br.readLine(); 
            System.out.println("Previous meter reading = "+txtPreviousMeter);
            
            String txtCurrentMeter = br.readLine();
            System.out.println("allowance = "+txtCurrentMeter);
            
            String txtTotalUnit = br.readLine();
            System.out.println("deduction = "+txtTotalUnit);
            
            String txtCurrentCharge = br.readLine();
            System.out.println("netSalary = "+txtCurrentCharge);
            
              String txtTotalBill = br.readLine();
            System.out.println("netSalary = "+txtTotalBill);
            
            line = br.readLine();
            
            
            double arrears = Double.parseDouble(txtArrears);
            double previousmeter = Double.parseDouble(txtPreviousMeter);
            double currentmeter = Double.parseDouble(txtCurrentMeter);
            double totalunit = Double.parseDouble(txtTotalUnit);
            double currentcharge = Double.parseDouble(txtCurrentCharge);
            double totalbill = Double.parseDouble(txtTotalBill);
                    
            System.out.println("\nkaedah 2 ==> "+billdate+"\t"+accnum+"\t"+name+"\t"+address+"\t"+arrears+"\t"+previousmeter+"\t"+currentmeter+"\t"+totalunit+"\t"+currentcharge+"\t"+totalbill);            System.out.println("");
         } // while
        br.close();
        fr.close();
    } // readMethod2
    
   
    public static void main(String[] args) throws FileNotFoundException, IOException 
    {
        ReadAlldataFromTextFile test = new ReadAlldataFromTextFile();
        test.readMethod1();
        System.out.println("\n===KAEDAH KE 2====");
        test.readMethod2();
        
    }
}
