public class Question31 {
    /*
    //Given 2 arrays of ints, a and b, return true if
        //they have the same first element or they have the same last element.
        //Both arrays will be length 1 or more.
     */
    public static boolean sameFirstOrLastElement(int [] a, int [] b){
        if (a.length==1 || b.length==1){
            if(a[0] == b[0]){
                return true;
            }else {
                return false;
            }
        }
        if (a.length>1 || b.length>1) {
            if (a[0] == b[0] || a[a.length - 1] == b[b.length - 1]) {
                return true;
            }
        }
        return false;

    }

    public static void main(String[] args) {
        int [] a = {3};
        int [] b = {2, 4, 3};
        System.out.println(sameFirstOrLastElement(a, b));
    }
}
