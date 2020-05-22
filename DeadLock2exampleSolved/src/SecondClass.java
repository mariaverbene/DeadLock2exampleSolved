public class SecondClass {

    public void secondFunc (FirstClass first) throws InterruptedException {
        Thread.sleep(1000);
        first.firstPrint();
    }

    public void secondPrint () {
        System.out.println("2");
    }
}
