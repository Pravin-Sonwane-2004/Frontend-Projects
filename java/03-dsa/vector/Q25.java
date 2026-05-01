package vector;

// Q25.Problem Statement
// Develop a patient management system using Vector and POJO class Patient.
// Fields
// int patientId
// String name
// int age
// String disease
// Operations
// Add patients
// Display patients
// Find oldest patient
// Search by disease
// Count patients above age 50
// Input
// 3 patients

// 101 Ravi 65 Diabetes
// 102 Anil 45 Fever
// 103 Sunil 72 BP

// Disease search:
// BP
// Output
// Patient List:
// 101 Ravi 65 Diabetes
// 102 Anil 45 Fever
// 103 Sunil 72 BP

// Oldest Patient:
// Sunil

// BP Patients:
// Sunil

// Patients above 50:
// 2

import java.util.*;
class Patient {   
 
	int patientId;
    String name;
    int age;
    String disease;   
	
		
	Patient() {
	}
	Patient(int patientId,String name,int age,String disease) {
			this.patientId = patientId;
			this.name = name;
			this.age = age;
			this.disease = disease;
	}
	public int getId() {
        return patientId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDisease() {
        return disease;
    }

    // --- SETTERS ---
    // Updates the field value using the 'this' keyword to avoid ambiguity
    
    public void setId(int patientId) {
        this.patientId = patientId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        // Optional: Add validation logic, e.g., checking if age > 0
        this.age = age;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }
}

// Add patients
// Display patients
// Find oldest patient
// Search by disease
// Count patients above age 50

public class Q25 {
	void main() {
	Scanner sc = new Scanner(System.in);
	
	Vector<Patient> vector = new Vector<>();
	do {
		
		IO.println("Enter The Choice");
		
		IO.println();
		 IO.println("1 . Add Patient");
		 IO.println("2 . Display All");
		 IO.println("3 . Display Oldest Patient");
		 IO.println("4 . Count Patient Above Age");
		 IO.println();
		 
		int choice = sc.nextInt();
		
		switch(choice) {
		case 1 :
			IO.println("Enter How Many No Of Patient You Are Going To Add : ");
			int noOfPatient = sc.nextInt(); 
			
			for(int i=0;i<noOfPatient;i++) {
				IO.println("Enter The PatientsId");
				int id = sc.nextInt();
				 sc.nextLine();
				IO.println("Enter The Name");
				String name = sc.nextLine();
				IO.println("Enter The Age");
				int age = sc.nextInt();
				sc.nextLine();
				IO.println("Enter The Disease");
				String dis = sc.nextLine();
				Patient p = new Patient(id,name,age,dis);
				vector.add(p);
			}
			break;		
		case 2: 
		
			for(Patient p : vector) {
				IO.println("patients id is :  " + p.getId());
				IO.println("patients id is :  " + p.getName());
				IO.println("patients id is :  " + p.getAge());
				IO.println("patients id is :  " + p.getDisease());
				IO.println();
			}
		break;
		// Find oldest patient
		case 3 :
			  int max = 0;
			  int age = 0;
			  for(Patient p : vector) {
				 age =(int) p.getAge();
				  if(max<age) {
					  max = age;
				  }
			  }
			  IO.println("The Oldest Patient is : "+ p.getName());  

		break;
		  //above age 
		case 4: 
		
		IO.println("Enter The Patient Age to see  Above age : ");
		int age1 = sc.nextInt();
		int e = 0;
		for(Patient p : vector) {
			e = p.getAge();
			if(age1>e) {
				IO.println("patients id is :  " + p.getId());
				IO.println("patients id is :  " + p.getName());
				IO.println("patients id is :  " + p.getAge());
				IO.println("patients id is :  " + p.getDisease());
				IO.println();
			}
		}
		break;
		}
	}
	 while(true);
	}
}
