package gr.aueb.cf.ch7;

public class StrBuilderApp {

    public static void main(String[] args) {
        String concatStr = "";
        StringBuilder sb = new StringBuilder();

        long timeStart = 0L;
        long timeEnd = 0L;
        double stringElapsedTime = 0.0;
        double sbElapsedTime = 0.0;

        timeStart = System.currentTimeMillis();
        for (int i =1; i <=100_000; i++) {
            concatStr = concatStr + i;
        }

        timeStart = System.currentTimeMillis();
        for (int i =1; i <=100_000; i++) {
            sb.append(i);
        }

        timeEnd = System.currentTimeMillis();
        stringElapsedTime = (timeEnd - timeStart) / 1000.0;


        System.out.println("String Elapse Time  : " + stringElapsedTime + " seconds");
        System.out.println("sb Elapsed time : "  + sbElapsedTime + " seconds");
    }
}
