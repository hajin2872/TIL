package lang.string.test;

public class TestString6 {

    public static void main(String[] args) {
        String str = "start hello java, hello spring, hello jpa";
        String key = "hello";

        int count = 0;
        int index = str.indexOf(key);
        while (index >= 0) {
            index = str.indexOf(key, index + 1);
            count++;
        }
        System.out.println("count = " + count);

        /*
        String[] arr = str.split(",");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i].trim();
        }

        int count = 0;
        for (String s : arr) {
            if (s.contains(key)) {
                count++;
            }
        }

        System.out.println("count = " + count);
        */

    }
}
