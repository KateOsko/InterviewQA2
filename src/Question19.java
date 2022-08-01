public class Question19 {
    /*
    //19
1. Write a return method that can verify if a password is valid or not.
 1. Password MUST be at least have 6 characters and should not contain space
2. PassWord should at least contain one upper case letter
3. PassWord should at least contain one lowercase letter
4. Password should at least contain one special characters
5. Password should at least contain a digit
     */

    public static boolean strongPassword(String password) {

        boolean criteria1 = password.length() >= 6 && !password.contains(" ");
        boolean criteria2 = false,
                criteria3 = false,
                criteria4 = false,
                criteria5 = false;

        for (char each:password.toCharArray()) {

            if (Character.isUpperCase(each)) {
                criteria2 = true;
            } else if (Character.isLowerCase(each)) {
                criteria3 = true;
            } else if (!Character.isLetterOrDigit(each)) {
                criteria4 = true;
            } else if(Character.isDigit(each)) {
                criteria5 = true;
            }
        }
        return criteria1 && criteria2 && criteria3 && criteria4 && criteria5;
    }

    public static void main(String[] args) {
        System.out.println(strongPassword("tYos^p5pLL"));
    }
}
