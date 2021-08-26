package dat.tdd.koans;

public class Main {
    public static void main(String[] args) {
        
    }

    public static String greet(String[] name) {
        
        
        
        if   (name!= null )  {
            if(name[0].equals(name[0].toUpperCase()))
            {
                return "HELLO " + name[0] + "!";
            }
            
            else if (name.length==2)
            {
                
                return "Hello, " + name[0]+ " and " + name[1];
               
            }
            
            else if (name.length>2)
            {
            String lastnum = name[name.length-1];
            String sep = "";
                    
             StringBuilder sb = new StringBuilder();
             for(int i=0; i < name.length-1; i++)
             {
                 sb.append(sep);
                 sb.append(name[i]);
                 sep =", ";
             }
             
             String str = sb.toString();
             
             return "Hello, " + str + " and " + lastnum;   
            }
            {
                
            }
            
            
        return "Hello, " + name[0];
        }
            
            else {
            return "Hello, my friend";
            }
        
        }
       
    }
        
 
