// permutation example
// the input string is "abc"
// print all the permutations of the given string
// ans will be :-
// abc
// acb
// bac
// bca
// cab
// cba

    public class Permutation {
        public static void ans(String inp, String ans)
        {
            // base condition

            if(inp.length() ==0 )
            {
                System.out.println(ans);
                return;
            }
            for(int i =0;i<inp.length();i++)
            {
                String remainingString= inp.substring(0,i)+ inp.substring(i+1) ;
                char extract = inp.charAt(i);
                ans(remainingString, ans +extract);
            }
        }
        public static void main(String[] args) {
            ans("abc"," ");
        }
}

