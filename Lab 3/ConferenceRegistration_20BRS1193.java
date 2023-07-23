import java.util.Date;
public class ConferenceRegistration_20BRS1193{

	int paper_id;
	String author_name;
	int reg_amnt;
	Date reg_date;
	boolean isMemberOfXYZ;

	public ConferenceRegistration_20BRS1193(int paper_id, String author_name, Date reg_date, String society){
		this.paper_id = paper_id;
		this.author_name = author_name;
		this.reg_amnt = 7000;
		this.reg_date = reg_date;
		this.isMemberOfXYZ = false;
		if(society == "XYZ Computer Society"){
			this.isMemberOfXYZ = true;
			this.reg_amnt = 3500;
		}
	}
	
	public void print(){
		System.out.println("Paper ID: " + this.paper_id);
		System.out.println("Author Name: " + this.author_name);
		System.out.println("Registration Date: " + this.reg_date.toString());
		System.out.println("Registration Amount: " + this.reg_amnt);
		System.out.println("Is member of XYZ Computer Society: " + this.isMemberOfXYZ);
		System.out.println("");
	}
	public static void main(String [] args){
		Date date = new Date();
		ConferenceRegistration_20BRS1193 person_1 = new ConferenceRegistration_20BRS1193(2473, "John Doe", date, "ABC Computer Soceity");
		date = new Date();
		ConferenceRegistration_20BRS1193 person_2 = new ConferenceRegistration_20BRS1193(2474, "Jane Miller", date, "XYZ Computer Society");
		date = new Date();
		ConferenceRegistration_20BRS1193 person_3 = new ConferenceRegistration_20BRS1193(2475, "Lois Lane", date, "QWE Computer Soceity");
		
		person_1.print();
		person_2.print();
		person_3.print();
	}
}