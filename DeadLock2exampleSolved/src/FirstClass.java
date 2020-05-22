public class FirstClass {

    public void firstFunc (SecondClass second) throws InterruptedException {
        Thread.sleep(1000);
        second.secondPrint();
    }

    public void firstPrint () {
        System.out.println("1");
    }
}
