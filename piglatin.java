import java.util.*;
public class Program
{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str=sc.nextLine();
    int l=str.length();
    char ch=' ';
    for(int i=0;i<l;i++)
    {
       char c=str.charAt(i);
       if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U'||c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
           ch = c;
           break;
       } 
        
    }
    
    int j=str.indexOf(ch);
    String s1=str.substring(j,l);
    String s2=str.substring(0,j);
    System.out.println(s1+s2+"ay");
    
    

        
    }
  }
