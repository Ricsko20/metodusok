public class AppendAFunc {
    public static void main(String[] args) {
        String[] array = {"koal", "pand", "zebr", "anacond", "bo", "chinchill", "cobr", "gorill", "hyen", "hydr", "iguan", "impal", "pum", "tarantul", "piranh"};
        array = appendA(array);
        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static String[] appendA(String[] array) {
        for(int i = 0; i < array.length; i++) {
            array[i] += "a";
        }
        return array;
    }
}
