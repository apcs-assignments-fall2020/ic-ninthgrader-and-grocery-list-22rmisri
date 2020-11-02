public class NinthGrader extends Student{

    public NinthGrader(String a, String b) {
        super(a, b, 2024);
    }

    public NinthGrader() {
        super("Rasika", "Misri", 2024);
    }
    @Override
    public void doSomething() {
        System.out.println("I am preparing for a Harkness discussion");
    }
    @Override
    public String toString() {
        String str = super.toString();
        str += " (Ninth Grader)";
        return str;
    }
    
}