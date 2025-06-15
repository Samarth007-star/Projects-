import java.util.*;
import java.io.*;

public class StudentManagement {
    public void change()throws IOException
    {
        Scanner sc=new Scanner(System.in);
        BufferedReader be=new BufferedReader(new FileReader("Ep.txt"));
        BufferedWriter bww=new BufferedWriter(new FileWriter("ee.txt"));
        System.out.println("Enter Email ID:");
        String dd=sc.next();
        String line=be.readLine();
        while(line!=null)
        {
            String[] hh=line.split(" ");
            if(hh[0].equals(dd))
            {
                System.out.println("Enter new Password:");
                String jj=sc.next();
                bww.write(hh[0]+" "+jj+"\n");
            }
            else
            {
                bww.write(line+"\n");
            }
            line=be.readLine();
        }
        bww.close();
        be.close();
        bww=new BufferedWriter(new FileWriter("Ep.txt"));
        be=new BufferedReader(new FileReader("ee.txt"));
        String ll=be.readLine();
        while(ll!=null)
        {
            bww.write(ll+"\n");
            ll=be.readLine();
        }
        bww.close();
    }
    public static void main(String[] args)throws IOException{
        try{
        Scanner sc=new Scanner(System.in);
        
        BufferedReader br;
        BufferedWriter bw;
        while(true)
        {
            System.out.println("1.Admin Login\t2.Student Login\t3.Student Sign Up\n4.Change Passeord\n5.exit");
            System.out.println("Enter your choice:");
            int ch=sc.nextInt();
            switch (ch) {
                case 1:
                        String e="samarth70@gmail.com";
                        String p="8684";
                        System.out.println("Enter Email ID:");
                        String ee=sc.next();
                        System.out.println("Enter Password :");
                        String pp=sc.next();
                        
                        if(e.equals(ee)&& p.equals(pp))
                        { 
                        
                            System.out.println("******Welcome Admin******");
                            while(true)
                            {
                                System.out.println("1.Change Informaition of Student\n2.Search Student Details\n3.Show All students Details\n4.exit");
                                int c=sc.nextInt();
                                switch (c) {
                                    case 1:
                                                   
                                                   br=new BufferedReader(new FileReader("Data.txt"));
                                                  bw=new BufferedWriter(new FileWriter("dumy.txt"));
                                                System.out.println("Enter Roll No of Student:");
                                                String rt=sc.next();
                                                String po=br.readLine();
                                                while(po!=null)
                                                {
                                                    String[] a12=po.split(" ");
                                                    if(a12[0].equals(rt))
                                                    {
                                                        System.out.println("1.Name\n2.Roll No\n3.Phone No:\n4.Exit");
                                                        System.out.println("Enter choice that have to change:");
                                                        int wq=sc.nextInt();
                                                        switch (wq) {
                                                            case 1:
                                                                    System.out.println("Enter New Name:");
                                                                    String nm=sc.next();
                                                                    bw.write(a12[0]+" "+nm+" "+a12[2]+" "+a12[3]+"\n");
                                                            break;
                                                            case 2:
                                                                System.out.println("Enter New Roll No:");
                                                                nm=sc.next();
                                                                bw.write(nm+" "+a12[1]+" "+a12[2]+" "+a12[3]+"\n");
                                                            break;
                                                            case 3:
                                                                System.out.println("Enter new Phone No:");
                                                                nm=sc.next();
                                                                bw.write(a12[0]+" "+a12[1]+" "+a12[2]+" "+nm+"\n");
                                                            break;
                                                            case 4:
                                                                System.exit(0);
                                                            default:
                                                                break;
                                                        }
                                                        
                                                    
                                                    }
                                                    else
                                                    {
                                                        bw.write(po+"\n");
                                                    }
                                                    
                                                        
                                                    po=br.readLine();
                                                }
                                                bw.close();
                                                br.close();
                                                bw=new BufferedWriter(new FileWriter("Data.txt"));
                                                br=new BufferedReader(new FileReader("dumy.txt"));
                                                String pw=br.readLine();
                                                while (pw!=null) {
                                                     bw.write(pw+"\n");
                                                     pw=br.readLine();
                                                }
                                                bw.close();
                                                

                                                

                                         break;
                                         case 2:
                                                 br=new BufferedReader(new FileReader("Data.txt"));
                                                 System.out.println("Enter Roll No of Student To Search");
                                                 String ty=sc.next();
                                                 pw=br.readLine();
                                                 int flag=0;
                                                 while(pw!=null)
                                                 {
                                                    String[] iu=pw.split(" ");
                                                    if(ty.equals(iu[0]))
                                                    {
                                                        System.out.println("Roll No: "+iu[0]+"\nName: "+iu[1]+"\nPaid fee: "+iu[2]+"\nPhone No: "+iu[3]+"\n");
                                                        flag++;
                                                        break;
                                                    }
                                                    pw=br.readLine();
                                                 }
                                                 if(flag==0)
                                                 {
                                                    System.out.println("Data not Exist..........");
                                                 }
                                         break;
                                         case 3:
                                         br=new BufferedReader(new FileReader("Data.txt"));
                                         String l1=br.readLine();
                                         
                                         while(l1!=null)
                                         {
                                            System.out.println(l1);
                                            l1=br.readLine();
                                         }
                                                 
                                        case 4:
                                                System.exit(0);
                                    default:
                                        break;
                                }
                            }
                        }
                        else
                        {
                            System.out.println("Incorrect Email Or Password....");
                        }

                    break;
                    case 2:
                               BufferedReader br1=new BufferedReader(new FileReader("Ep.txt"));
                                br=new BufferedReader(new FileReader("Data.txt"));
                                bw=new BufferedWriter(new FileWriter("dumy.txt"));
                                System.out.println("Enter Email ID:");
                                String er=sc.next();
                                System.out.println("Enter Password:");
                                String ep=sc.next();
                                String line=br1.readLine();
                                String r;
                                int yu=0;
                                while (line!=null) {
                                    String[] a1=line.split(" ");
                                    if(a1[0].equals(er)&&a1[1].equals(ep))
                                    {
                                        yu++;
                                        System.out.println("LOGIN SUCCESFULL...........");
                                        System.out.println("1.Pay Addmition Fee\n2.Check fee Status:\n3.Exit");
                                        int c2=sc.nextInt();
                                        
                                        switch (c2) {
                                            case 1:
                                                    
                                                    String no=br.readLine();
                                                    System.out.println("Enter Roll No:");
                                                     r=sc.next();
                                                    while(no!=null)
                                                    {
                                                        String[] a2=no.split(" ");
                                                        if(a2[0].equals(r))
                                                        {
                                                            System.out.println("You total paid Ammount is:"+a2[2]);
                                                            int d=34000-Integer.parseInt(a2[2]);
                                                            System.out.println("Pending fee is:"+d);
                                                            System.out.println("Enter Ammount to pay fee:");
                                                             d=Integer.parseInt(a2[2])+sc.nextInt();
                                                            bw.write(a2[0]+" "+a2[1]+" "+d+" "+a2[3]+"\n");
                                                        
                                                        }
                                                        else{
                                                            bw.write(no+"\n");
                                                        }
                                                        no = br.readLine();
                                                    }
                                                    bw.close();
                                                    br1.close();
                                                    bw=new BufferedWriter(new FileWriter("Data.txt"));
                                                    br=new BufferedReader(new FileReader("dumy.txt"));
                                                      String pw=br.readLine();
                                                    while (pw!=null) {
                                                        bw.write(pw+"\n");
                                                        pw=br.readLine();
                                                    }
                                                    bw.close();
                                                    br.close();
                                                    break;
                                                    case 2:
                                                            
                                                            String h=br.readLine();
                                                            System.out.println("enter your Roll No:");
                                                            String r1=sc.next();
                                                            while(h!=null)
                                                            {
                                                                String[] dd=h.split(" ");
                                                                if(dd[0].equals(r1))
                                                                {
                                                                    System.out.println("You total Paided fee is:"+dd[2]);
                                                                }
                                                                h=br.readLine();
                                                            }
                                                            
                                                            
                                                    break;
                                                
                                                    case 3:
                                                                System.exit(0);
                                                    break;
                                                    }                        
                                                
                                        }
                                        line=br.readLine();
                                    }
                                    if(yu==0)
                                    {
                                        System.out.println("Incorrect Email Or Password....");
                                    }
                                br.close();
                    break;
                    case 3:
                            bw=new BufferedWriter(new FileWriter("Data.txt",true));
                            BufferedWriter b1=new BufferedWriter(new FileWriter("Ep.txt",true));  
                            System.out.println("Enter Email ID:");
                            String se=sc.next();
                            System.out.println("Enter Password:");
                            String sp =sc.next();
                            System.out.println("enter Confirm Password:");
                            String p1=sc.next();
                            while(!sp.equals(p1)){
                                System.out.println("****BOTH PIN ARE DIFFRENT**");
                                System.out.println("ENTER Pin:-");
                                sp=sc.next();
                                System.out.println("ENTER A Conform Pin:-");
                                p1=sc.next();
                            }
                            
                            System.out.println("Enter Roll No:");
                            String roll=sc.next();
                            System.out.println("Enter your Name:");
                            String name=sc.next();
                            System.out.println("Enter your Phone Number:");
                            String ph=sc.next();
                            System.out.println("Total Fee is 34000");
                            System.out.println("Enter first Ammount Of Addmition:");
                            String aa=sc.next();
                            bw.write(roll+" "+name+" "+aa+" "+ph+"\n");
                            b1.write(se+" "+sp+"\n");
                            System.out.println("******Account Created Succesfully******");
                            bw.close();
                            b1.close();
                           break;
                           case 4:
                                    StudentManagement s=new StudentManagement();
                                    s.change();
                            break;
                           case 5:
                                System.exit(0);
                           break;

                default:
                    break;
            }
        
        }
        }catch(IOException e)
        {
            System.out.println(e);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
    }        
    
}

