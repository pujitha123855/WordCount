import java.util.*;
public class WordFreq {
    public static void main(String[] args) {
        HashMap<String,Integer> h=new HashMap<>();
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String str[]=s.split(" ");
        for(int i=0;i<str.length;i++){
            int c=0;
            for(int j=0;j<str.length;j++){
                if(str[i].equals(str[j])){
                    c=c+1;
                }
            }
            h.put(str[i],c);
        }
        System.out.println(h);
    }
}
