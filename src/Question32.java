public class Question32 {
    /*
    Create a function that counts the number of syllables a word has. Each syllable is
separated with a dash "-" Examples
numberSyllables("buf-fet") ➞ 2

     */
    public static void main(String[] args) {
        String str = "buf-dt-rr";
        System.out.println(countSyllables2(str));
    }

    public static int countSyllables(String str) {
        String[] split = str.split("-");
        return split.length;
    }

    public static int countSyllables2(String str){
        int count = 1;
        for (int i=0; i< str.length(); i++){
            if(str.charAt(i)=='-'){
                count++;
            }
        }
        return count;
    }
}
