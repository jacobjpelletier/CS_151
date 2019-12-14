// The StringTokenizer class example (from Lewis & Loftus, first ed.)

import java.util.StringTokenizer;

public class URL_Tokens {

   public static void main (String[] args) {

     URL_Tokenizer url = new URL_Tokenizer ("http://www.wpllabs.com/vision.html");

     System.out.println ("Protocol: " + url.get_protocol());
     System.out.println ("Address: " + url.get_address("-"));
     System.out.println ("Resourse: " + url.get_resource());
   }
}

class URL_Tokenizer {
   private String protocol;
   private String address;
   private String resource;

   public URL_Tokenizer (String URL_Text) {

     StringTokenizer URL = new StringTokenizer (URL_Text, ":");
     protocol = URL.nextToken(":/");
     address = URL.nextToken();
     resource = URL.nextToken();
   }

   public String get_protocol () {
     return protocol;
   }

   public String get_address () {
     return address;
   }
  
   public String get_resource () {
     return resource;
   }
}