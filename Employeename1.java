public class Employeename1 {
    static long id = 1234;
    static String name = "wer";
    static String company = "wert";

    public void Employeename1(long id, String name, String company) {
        id = id;
        name = this.name;
        company = this.company;
    }

    public static void main(String[] args) {
        Employeename1 s1 = new Employeename1();
        s1.Employeename1(id, name, company);
        System.out.println(s1);
    }
}