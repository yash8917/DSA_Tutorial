package Linear_Search;

public class Element_Exist_InString {
    static boolean linearSearch(String str, char target) {
        if (str.length() == 0) {
            return false;
        }
        for (int index = 0; index < str.length(); index++) {
            if (target == str.charAt(index)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String str="Welcome";
        char target='o';
        System.out.println(linearSearch(str,target));


    }
}
