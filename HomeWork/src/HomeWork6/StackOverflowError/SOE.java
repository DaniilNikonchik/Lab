package Занятие14.StackOverflowError;

public class SOE {
    public static void main(String... args) {
        SOE soe = new SOE();
        soe.testMethod(1);
    }

    public void testMethod(int i) {
        testMethod(i);
        System.out.println(i);
    }
}
