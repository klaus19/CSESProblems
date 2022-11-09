public class RepitionString {

    public int getRepition(String str){
        char[]ch = str.toCharArray();
        int i=0;
        int max_length = 1;
        int longest;
        while (i+1!=ch.length){
            if (ch[i]==ch[i+1]){
                int k=i;
                while (ch[i]==ch[i+1]){
                    i++;
                }
                longest=i-k+1;
                max_length = Math.max(longest,max_length);
            }
        }
        return max_length;
    }

    public static void main(String[] args) {
        RepitionString rps = new RepitionString();
        String st = "ATTCGGGA";
        String s = "ATT";
        System.out.println(rps.getRepition(st));
    }
}
