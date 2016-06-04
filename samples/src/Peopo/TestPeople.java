package Peopo;

public class TestPeople {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		People pep=new People();
		pep.setName("Subramaniam");
		pep.setSurname("Krishnareddy ");
		pep.setAge(52);
		pep.setGender("Male");
		pep.setMobile(9865519);
		pep.setMaritalstatus("Married");		
		
		Address add=new Address();
		add.setDoorno(918);
		add.setStname("pasur");
		add.setDistrict("Coimbatore");
		add.setState("Tamilnadu");
		add.setPincode(641653);
		pep.setAdd(add);
		
		Eduqualification edu=new Eduqualification();
		edu.setLevel("primary");
		edu.setDomain("Social science");
		
			
		
		
		Occupation occ=new Occupation();
		occ.setOccupation("Business");
		occ.setEducation("Educated");
		pep.setOcc(occ);
		
		occ.setQualifi(edu);
		
		
		
		
		System.out.println("########################");
		System.out.println("People Information");
		System.out.println("########################");
		System.out.println(pep.getName());
		System.out.println(pep.getAdd().getStname());
		

	}

}
