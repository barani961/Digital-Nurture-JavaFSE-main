public class VirtualThreadSample {

    public static void main(String[] args) {

        // Virtual Threads
        long virtualStart=System.currentTimeMillis();

        for(int i=1;i<=100000;i++) {

            Thread.startVirtualThread(() -> {

            });
        }

        long virtualEnd=System.currentTimeMillis();

        System.out.println(
                "Virtual Threads Time : "
                +(virtualEnd-virtualStart)+" ms");


        // Traditional Threads
        long normalStart=System.currentTimeMillis();

        for(int i=1;i<=100000;i++) {

            new Thread(() -> {

            }).start();
        }

        long normalEnd=System.currentTimeMillis();

        System.out.println(
                "Traditional Threads Time : "
                +(normalEnd-normalStart)+" ms");
    }
}