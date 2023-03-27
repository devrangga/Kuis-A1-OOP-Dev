package QuizOOP1;
public class Main {
    public static void main(String[] args) {
        Cylinder cylinder1 = new Cylinder(8);
        Cylinder cylinder2 = new Cylinder(8,10);
        Cylinder cylinder3 = new Cylinder(8,10,"red");

        System.out.println("Cylinder 1");
        System.out.println("Radius awal : " + cylinder1.getRadius());
        cylinder1.setRadius(7);
        System.out.println("Radius saat ini: " + cylinder1.getRadius());
        System.out.println("Volume : " +cylinder1.getVolume());
        System.out.println(cylinder1.toString());
        System.out.println();

        System.out.println("Cylinder 2");
        System.out.println("Radius awal : " + cylinder2.getRadius());
        cylinder2.setRadius(7);
        System.out.println("Radius saat ini: " + cylinder2.getRadius());
        System.out.println("Height awal: " + cylinder2.getHeight());
        cylinder1.setHeight(12);
        System.out.println("Height saat ini: " + cylinder2.getHeight());
        System.out.println("Volume : " +cylinder2.getVolume());
        System.out.println(cylinder2.toString());
        System.out.println();

        System.out.println("Cylinder 3");
        System.out.println("Radius awal : " + cylinder3.getRadius());
        cylinder3.setRadius(7);
        System.out.println("Radius saat ini: " + cylinder3.getRadius());
        System.out.println("Height awal: " + cylinder3.getHeight());
        cylinder3.setHeight(12);
        System.out.println("Height saat ini: " + cylinder3.getHeight());
        System.out.println("Warna awal: " + cylinder3.getColor());
        cylinder3.setColor("blue");
        System.out.println("Warna saat ini: " + cylinder3.getColor());
        System.out.println("Volume : " +cylinder3.getVolume());
        System.out.println(cylinder3.toString());
        System.out.println();
    }
}
