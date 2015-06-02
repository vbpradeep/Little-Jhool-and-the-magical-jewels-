import java.io.BufferedReader;
import java.io.InputStreamReader;
class magicaljewels {
    public static void main(String args[] ) throws Exception {
    	
         int r=0,u=0,b=0,y=0,strcount1=0;
 
        String st1="";
        String str1[]=new String[80];int i=0;
          
        
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
        
        int no=Integer.parseInt(in.readLine());  
        //System.out.println(no);
        for(i=0;i<no;i++)
               {
                 char ch[]=in.readLine().trim().toCharArray();
 
                for(int j=0;j<ch.length;j++)
               {   
switch(ch[j])
    {
        case 'r':
           r++;
     
           break;
        case 'u':
           u++;
           break;
        case 'b':
           b++;
           break;
        case 'y':
           y++;
           break;
            
}
if(r!=0 && u!=0 && b!=0 && y!=0)
    {
        strcount1++;
        r--;u--;b--;y--;
    }
 str1[i]=""+strcount1;
               }
                 strcount1=r=u=b=y=0;
}
               for(i=0;i<no;i++)
               {
           System.out.println(str1[i]);
               }
        }
}
