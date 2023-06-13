package HospitalAssignment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

class Doctor
{
  
  int dId;
  String dName, specilist, appoint, doc_qual;
  int dRoom;
  
  public Doctor(int dId, String dName, String specilist, String appoint, String doc_qual, int dRoom)
  {
	  this.dId=dId;
	  this.dName=dName;
	  this.specilist=specilist;
	  this.appoint=appoint;
	  this.doc_qual=doc_qual;
	  this.dRoom=dRoom;
  }

  void doctorInfo()
  {
      System.out.println(dId + "\t" + dName + "  \t" + specilist + "     \t" + appoint + "    \t" + doc_qual + "       \t" + dRoom);
  }
  
}
class Patient
{
    int pId,age;
    String pName, disease, sex ,admit_status;

    public Patient(int pId, String pName, String disease, String sex, String admit_status, int age) 
    {
        this.pId = pId;
        this.pName = pName;
        this.disease = disease;
        this.sex = sex;
        this.admit_status = admit_status;
        this.age = age;
    }

    public void patientInfo() 
    {
    	System.out.println(pId + "\t" + pName + " \t" + disease + "     \t" + sex + "      \t" + admit_status + "\t" + age);
    }
}

class Medical
{
  String medName, medComp, expDate;
  int medCost;
  public Medical(String medName, String medComp, String expDate, int medCost) 
  {
	  this.medName=medName;
	  this.medComp=medComp;
	  this.expDate=expDate;
	  this.medCost=medCost;
  }
  public void medicalInfo()
  {
     System.out.println(medName + "  \t" + medComp + "    \t" + expDate + "     \t" + medCost);
  }
}

class Lab
{
   String fecility;
   int labCost;
   
   public Lab(String facility, int labCost) 
   {
	   this.fecility=facility;
	   this.labCost=labCost;
   }
   
   void labInfo()
   {
      System.out.println(fecility+ "\t\t\t"+ labCost);
   }
}

class Facility 
{
  String fecName;

  public Facility(String fecName)
  {
	  this.fecName=fecName;
  }

  void FacilityInfo()
  {
      System.out.println(fecName);
  }
}

class Staff
{
  String sName, desg, sex;
  int sId,salary;
  public Staff(int sId, String sName, String desg, String sex, int salary)
  {
	  this.sId=sId;
	  this.sName=sName;
	  this.desg=desg;
	  this.sex=sex;
	  this.salary=salary;
  }
  
  void staffInfo()
  {
      System.out.println(sId + "\t" + sName + "\t" + sex + "\t\t" + salary);
  }
  
}
public class HospitalManagement {
    public static void main(String[] args) {
        List<Patient> patients = new ArrayList<>();
        List<Doctor> doctors = new ArrayList<>();
        List<Medical> medicals = new ArrayList<>();
        List<Lab> labs = new ArrayList<>();
        List<Facility> facilities = new ArrayList<>();
        List<Staff> staffs = new ArrayList<>();
        System.out.println("\n--------------------------------------------------------------------------------");
        System.out.println("\t*** Welcome to Hospital Management System Project in Java ***");
        System.out.println("--------------------------------------------------------------------------------");
      // Add Doctors to the list
        doctors.add(new Doctor(109, "Dr. Hyder", "Physician","5-11AM","MBBS,MD",01));
        doctors.add(new Doctor(209, "Dr. Navin", "ENT","10-3AM","MBBS,MD",02));
        doctors.add(new Doctor(309, "Dr. Priya", "Artho","8-2AM","BDM",03));
        doctors.add(new Doctor(409, "Dr Rizwan", "Surgeon","10-4PM","MBBS,MS",04));
        
     // Add patients to the list   
        patients.add(new Patient(101, "Kamal", "Cancer", "Male", "y", 30));
        patients.add(new Patient(102, "Zishan", "Cold",  "Male", "y", 23));
        patients.add(new Patient(103, "Sidd", "Maleriya", "Male", "y", 45));
        patients.add(new Patient(104, "Faiyaj", "Diabetes", "Male", "y", 25));
        
     // Add Medical to the list   
        medicals.add(new Medical("Losartan", "Devis", "9-5-24", 3000));
        medicals.add(new Medical("Celphalexin", "Alkem","2-12-23",2300));
        medicals.add(new Medical("Metorolo", "Glenmark", "9-5-16", 4500));
        medicals.add(new Medical("Top drug", "Cadila","3-4-26", 2500));
        
     // Add laboratory to the list   
        labs.add(new Lab("X-ray", 300));
        labs.add(new Lab("CT-Scan", 1300));
        labs.add(new Lab("OR-Scan", 700));
        labs.add(new Lab("Blood", 100));
      
     // Add Facility to the list   
        facilities.add(new Facility("Ambulence"));
        facilities.add(new Facility("Admit facility"));
        facilities.add(new Facility("Canteen"));
        facilities.add(new Facility("Emergency"));
        
     // Add Staff to the list   
        staffs.add(new Staff(01, "kamal", "Worker", "male",15000));
        staffs.add(new Staff(02, "Anjli", "Nurse", "Female",12000));
        staffs.add(new Staff(03, "Sidd", "Worker", "male",8000));
        staffs.add(new Staff(04, "Sohana", "Nurse", "Female",25000));
        
        Scanner inputInt = new Scanner(System.in);
        Scanner inputStr = new Scanner(System.in);
        
        int choice, j, c1, status = 1, s1 = 1, s2 = 1, s3 = 1, s4 = 1, s5 = 1, s6 = 1;
      while (status == 1)
      {
          System.out.println("\n                                    MAIN MENU");
          System.out.println("-----------------------------------------------------------------------------------");
          System.out.println("1.Doctos  2. Patients  3.Medicines  4.Laboratories  5. Facilities  6. Staff ");
          System.out.println("-----------------------------------------------------------------------------------");
          choice = inputInt.nextInt();
          switch(choice) 
          {
              case 1:
              {
            	  System.out.println("--------------------------------------------------------------------------------");
                  System.out.println("                      **DOCTOR SECTION**");
                  System.out.println("--------------------------------------------------------------------------------");
                  s1 = 1;
                  while (s1 == 1)
                  {
                     System.out.println("1.Add New Entry\n2.Existing Doctors List");
                     c1 = inputInt.nextInt();
                     switch(c1) 
                     {
                         case 1:
                         {
                        	 System.out.print("id:-");
                             int dId = inputInt.nextInt();
                             System.out.print("name:-");
                             String dName = inputStr.nextLine();
                             System.out.print("specilization:-");
                             String specilist = inputStr.nextLine();
                             System.out.print("work time:-");
                             String appoint = inputStr.nextLine();
                             System.out.print("qualification:-");
                             String doc_qual = inputStr.nextLine();
                             System.out.print("room no.:-");
                             int dRoom = inputInt.nextInt();
                             
                             doctors.add(new Doctor(dId, dName, specilist, appoint, doc_qual, dRoom));
                    	     break;
                         }
                         case 2:
                         {
                        	 System.out.println("--------------------------------------------------------------------------------");
                             System.out.println("id \t Name   \t Specilist  \tTiming  \tQualification \t Room No.");
                             System.out.println("--------------------------------------------------------------------------------");
                    	     Iterator<Doctor> itr1 = doctors.iterator();
                    	     while(itr1.hasNext())
                    	     {
                    	    	 Doctor dc = itr1.next();
                    	    	 dc.doctorInfo();
                    	     }
                    	     System.out.println("--------------------------------------------------------------------------------");
                             break;
                         }

                     }
                     System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                     s1 = inputInt.nextInt();         	     
                  }
                  break;
              }
              case 2:
              {
                  System.out.println("--------------------------------------------------------------------------------");
                  System.out.println("                     **PATIENT SECTION**");
                  System.out.println("--------------------------------------------------------------------------------");
      
                  while (s2 == 1)
                  {
                      System.out.println("1.Add New Entry\n2.Existing Patients List");
                      c1 = inputInt.nextInt();
                      switch (c1)
                      {
                              case 1:
                              {         
                                  System.out.print("id:-");
                                  int pId = inputInt.nextInt();
                                  System.out.print("name:-");
                                  String pName = inputStr.nextLine();
                                  System.out.print("disease:-");
                                  String disease = inputStr.nextLine();
                                  System.out.print("sex:-");
                                  String sex = inputStr.nextLine();
                                  System.out.print("admit_status:-");
                                  String admit_status = inputStr.nextLine();
                                  System.out.print("age:-");
                                  int age = inputInt.nextInt();
                                  
                                  patients.add(new Patient(pId,pName,disease,sex,admit_status,age));
                                  break;
                              }
                              case 2:
                              {
                                  System.out.println("--------------------------------------------------------------------------------");
                                  System.out.println("id \t Name  \t Disease \t Gender \t Admit Status \t Age");
                                  System.out.println("--------------------------------------------------------------------------------");
                                  Iterator<Patient> itr2= patients.iterator();
                                  while (itr2.hasNext()) {
        							Patient piP= itr2.next();
        							piP.patientInfo();
        						  }
                                  System.out.println("--------------------------------------------------------------------------------");
                                  break;
                              }
                      }
                      System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                      s2 = inputInt.nextInt();
                  }
                  break;
              }
              case 3:
              {
            	s3 = 1;
                System.out.println("--------------------------------------------------------------------------------");
                System.out.println("                     **MEDICINE SECTION**");
                System.out.println("--------------------------------------------------------------------------------");
                while (s3 == 1)
                {
                    System.out.println("1.Add New Entry\n2. Existing Medicines List");
                    c1 = inputInt.nextInt();
                    switch (c1)
                    {
                        case 1:
                        {
                        	System.out.print("name:-");
                            String medName = inputStr.nextLine();
                            System.out.print("comp:-");
                            String medComp = inputStr.nextLine();
                            System.out.print("exp_date:-");
                            String expDate = inputStr.nextLine();
                            System.out.print("cost:-");
                            int medCost = inputInt.nextInt();
                            medicals.add(new Medical(medName,medComp,expDate, medCost));
                            break;
                        }
                        case 2:
                        {
                            System.out.println("--------------------------------------------------------------------------------");
                            System.out.println("Name \t Company \t Expiry Date \t Cost");
                            System.out.println("--------------------------------------------------------------------------------");
                            Iterator<Medical> itr3 = medicals.iterator();
                            while (itr3.hasNext()) {
								Medical med=itr3.next();
					            med.medicalInfo();					
							}
                            System.out.println("--------------------------------------------------------------------------------");
                            break;
                        }
                    }
                    System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                    s3 = inputInt.nextInt();
                  } 
            	  break;
              }
              case 4:
              {
            	s4 = 1;
                System.out.println("--------------------------------------------------------------------------------");
                System.out.println("                    **LABORATORY SECTION**");
                System.out.println("--------------------------------------------------------------------------------");
                while (s4 == 1)
                {
                    System.out.println("1.Add New Entry \n2.Existing Laboratories List");
                    c1 = inputInt.nextInt();
                    switch (c1)
                    {
                        case 1:
                             {
                               System.out.print("fecility:-");
                               String fecility = inputStr.nextLine();
                               System.out.print("cost:-");
                               int labCost = inputInt.nextInt();
                               labs.add(new Lab(fecility,labCost));
                             break;
                             }
                        case 2:
                             {
                                System.out.println("----------------------------------------------------");
                                System.out.println("Fecilities\t\t Cost");
                                System.out.println("----------------------------------------------------");
                                Iterator<Lab> itr4 = labs.iterator();
                                while(itr4.hasNext())
                                {
                                	Lab lb = itr4.next();
                                	lb.labInfo();
                                }
                                System.out.println("----------------------------------------------------");
                                
                             break;
                             }
                    }
                    System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                    s4 = inputInt.nextInt();
                  }
            	  break;
              }
              case 5:
              {
            	  s5 = 1;
                System.out.println("--------------------------------------------------------------------------------");
                System.out.println("          **HOSPITAL FACILITY SECTION**");
                System.out.println("--------------------------------------------------------------------------------");
                while (s5 == 1)
                {
                    System.out.println("1.Add New Facility\n2.Existing Fecilities List");
                    c1 = inputInt.nextInt();
                    switch (c1)
                    {
                        case 1:
                             {
                                System.out.println("Facility :- ");
                                String fecility = inputStr.nextLine();
                                facilities.add(new Facility(fecility));
                             break;
                             }
                        case 2:
                             {
                                System.out.println("-----------------------------------");
                                System.out.println("Hospital Facility are:");
                                System.out.println("-----------------------------------");
                                Iterator<Facility> itr5 = facilities.iterator();
                                while (itr5.hasNext()) {
									Facility fc = itr5.next();
									fc.FacilityInfo();
								}
                                System.out.println("-----------------------------------");
                             break;
                             }
                    }
                    System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                    s5 = inputInt.nextInt();
                }
                break;
              }
              case 6:
              {
            	s6 = 1;
                System.out.println("--------------------------------------------------------------------------------");
                System.out.println("                       **STAFF SECTION**");
                System.out.println("--------------------------------------------------------------------------------");
                while (s6 == 1)
                {
                    System.out.println("1.Add New Entry \n2.Existing List");
                    c1 = inputInt.nextInt();
                    switch (c1)
                    {
                                            case 1:
                            {
                               System.out.print("id:-");
                               int sId = inputInt.nextInt();
                               System.out.print("name:-");
                               String sName = inputStr.nextLine();
                               System.out.print("desigination:-");
                               String desg = inputStr.nextLine();
                               System.out.print("sex:-");
                               String sex = inputStr.nextLine();
                               System.out.print("salary:-");
                               int salary = inputInt.nextInt();
                               staffs.add(new Staff(sId, sName, desg, sex, salary));
                               break;
                            }
                        case 2:
                            {
                              System.out.println("----------------------------------------- ----");
                              System.out.println("id \t Name \t Gender \t Salary");
                              System.out.println("----------------------------------------------");
                              Iterator<Staff> itr6 = staffs.iterator();
                              while (itr6.hasNext()) 
                              {
								Staff stf = itr6.next();
								stf.staffInfo();
							  }
                              System.out.println("----------------------------------------------");
                            break;
                            }
               
                    }
                    System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                    s6 = inputInt.nextInt();
                }
            	break;
              }
              default:
              {
                  System.out.println(" You Have Enter Wrong Choice!!!");
              }
        }
        System.out.println("\nReturn to MAIN MENU Press 1");
        status = inputInt.nextInt();
     }
    
  }
       
}