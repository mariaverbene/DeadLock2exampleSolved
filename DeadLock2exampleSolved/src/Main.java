public class Main {

    public static void main(String[] args) throws InterruptedException {

        FirstClass first = new FirstClass();
        SecondClass second = new SecondClass();

        for(int i=1;i<10;i++) {

            new Thread(new Runnable() {
                @Override
                public void run() {

                    try {

                        synchronized (first) {
                            synchronized (second) {
                                second.secondFunc(first);
                            }
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            }).start();

            synchronized (first) {
                synchronized (second) {
                    first.firstFunc(second);
                }
            }
        }

    }

}
