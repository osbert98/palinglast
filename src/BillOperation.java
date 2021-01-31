
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import java.io.PrintWriter;
import java.util.ArrayList;

public class BillOperation 
{
    
    public void addRecord(Data user) throws IOException 
    {  // user = user
        File fileName = new File("ElectricAcc.txt");
        FileWriter fw = new FileWriter(fileName, true);
        PrintWriter pw = new PrintWriter(fw);
        
        pw.println(user.getbilldate());
        pw.println(user.getaccnumber());
        pw.println(user.getname());
        pw.println(user.getaddress());
        pw.println(user.getarrears());
        pw.println(user.getpreviousmeter());
        pw.println(user.getcurrentmeter());
        pw.println(user.gettotalunit());
        pw.println(user.getcurrentcharge());
        pw.println(user.gettotalbill());
          
        pw.close();
        fw.close();
        
    } // addRecord
    
    public ArrayList <Data>  displayAllRecord() throws FileNotFoundException, IOException
    {
        ArrayList <Data> users = new ArrayList<Data>();
        Data user;
        
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
            
            user = new Data(billdate,accnum,  name, address, arrears,previousmeter,currentmeter, totalunit, currentcharge,totalbill);
            users.add(user);  // store into arraylist
            line = br.readLine();
        } // while (line != null)
        br.close();
        fr.close();
        ArrayList<Data> temp;
        temp=doSelectionSort(users);
        return temp;
        
    } // displayAllRecord
    
    public ArrayList <Data>  readAllRecordFromFile() throws FileNotFoundException, IOException
    {
        ArrayList <Data> users = new ArrayList<Data>();
        Data user;
        
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
            
             user = new Data(billdate,accnum,  name, address, arrears,previousmeter,currentmeter, totalunit, currentcharge,totalbill);
            users.add(user);
            line = br.readLine();
        } // while (line != null)
        br.close();
        fr.close();
        return users;
    } // readAllRecordFromFile
    /*
    public Data findRecord(int Accnum) throws FileNotFoundException, IOException
    {
        Data user = null;
        ArrayList <Data> usersList = readAllRecordFromFile();
        
        for (int i=0; i < usersList.size(); i++)
        {
            if(Accnum == usersList.get(i).getaccnumber())
            {
                user = usersList.get(i);
                System.out.println("Record is found");
            }
                
        }
        return user;
    } //findRecord*/
    
    public void addAllRecordInFile(ArrayList <Data> temp) throws IOException
    {
        File fileName = new File("ElectricAcc.txt");
        FileWriter fw = new FileWriter(fileName);
        PrintWriter pw = new PrintWriter(fw);
        ArrayList<Data> users;
        users=doSelectionSort(temp);
        
        for (int i=0; i < users.size(); i++)
        {
            pw.println(users.get(i).getbilldate());
            pw.println(users.get(i).getaccnumber());
            pw.println(users.get(i).getname());
            pw.println(users.get(i).getaddress());
            pw.println(users.get(i).getarrears());
            pw.println(users.get(i).getpreviousmeter());
            pw.println(users.get(i).getcurrentmeter());
            pw.println(users.get(i).gettotalunit());
            pw.println(users.get(i).getcurrentcharge());
            pw.println(users.get(i).gettotalbill());

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
    
    public ArrayList<Data> doSelectionSort(ArrayList<Data> arr) {
        for (int i = 0; i < arr.size(); i++) {
            // find position of smallest num between (i + 1)th element and last element
            int pos = i;
            for (int j = i; j < arr.size(); j++) {
                if (arr.get(j).getaccnumber() < arr.get(pos).getaccnumber())
                    pos = j;
            }
            // Swap min (smallest num) to current position on array
            Data min = arr.get(pos);
            arr.set(pos, arr.get(i));
            arr.set(i, min);
            //printOut(i + 1, arr);
        }
        return arr;
    }
    
    public Data binarySearch(ArrayList<Data> usr, int first, int last, int key){  
   int mid = (first + last)/2;  
   Data temp=null;
   while( first <= last ){  
      if ( usr.get(mid).getaccnumber() < key ){  
        first = mid + 1;     
      }else if ( usr.get(mid).getaccnumber() == key ){  
        temp=usr.get(mid);
        System.out.println("Element is found at index: " + mid);  
        return temp;
        //break;  
      }else{  
         last = mid - 1;  
      }  
      mid = (first + last)/2;  
   }  
   if ( first > last ){  
      System.out.println("Element is not found!");  
   }  
   return temp;
 }  
 
    
} // class billoperation
