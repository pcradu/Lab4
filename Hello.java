public class Hello {
    public static void main(String[] args) {
        // Detect o`s in hello world
        String helloWorld = "Hello World...";
        int detected = 0;

        for (int i = 0; i < helloWorld.length(); i++) {
            if (helloWorld.charAt(i) == 'H') {
                detected++;
            }
        }

        System.out.println(detected + " h`s are detected");
    }
}
