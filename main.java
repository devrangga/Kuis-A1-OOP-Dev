package QuizOOP2;
public class Main {
    public static void main(String[] args) {
        Person person = new Person("Aisa","Gentan");
        Student student = new Student("Arel","Palur","TRPL",2022, 4000000);
        Staff staff = new Staff("Ananda","Gentan","UGM", 2000000);

        System.out.println("Class Person");
        System.out.println("Nama : " + person.getName());
        System.out.println("Alamat : " + person.getAddress());
        person.setAddress("Jogja");
        System.out.println("Alamat saat ini: " + person.getAddress());
        System.out.println(person.toString());
        System.out.println();

        System.out.println("Class Student");
        System.out.println("Nama : " + student.getName());
        System.out.println("Alamat : " + student.getAddress());
        student.setAddress("Jogja");
        System.out.println("Alamat saat ini: " + student.getAddress());
        System.out.println("Program : " + student.getProgram());
        student.setProgram("TRI");
        System.out.println("Program saat ini : " + student.getProgram());
        System.out.println("Year : " + student.getYear());
        student.setYear(2021);
        System.out.println("Year saat ini : " + student.getYear());
        System.out.println("Fee: " + student.getFee());
        student.setFee(3000000);
        System.out.println("Fee saat ini: " + student.getFee());
        System.out.println(student.toString());
        System.out.println();

        System.out.println("Class Staff");
        System.out.println("Nama : " + staff.getName());
        System.out.println("Alamat : " + staff.getAddress());
        staff.setAddress("Jogja");
        System.out.println("Alamat saat ini: " + staff.getAddress());
        System.out.println("School : " + staff.getSchool());
        staff.setSchool("TRI");
        System.out.println("Program saat ini : " + staff.getSchool());
        System.out.println("Pay: " + staff.getPay());
        staff.setPay(6000000);
        System.out.println("Fee saat ini: " + staff.getPay());
        System.out.println(staff.toString());
        System.out.println();
    }
}