import mypack.MyTools.*;

import java.io.*;

public class Main {

     public static void main(String[] args) throws NenechiCopypasta.NameException, IOException {
         BufferedWriter test  = new BufferedWriter(new FileWriter("test.txt"));
         BufferedReader read = new BufferedReader(new FileReader("test.txt"));

         String[] nene = new String[999];


         try {
             NenechiCopypasta neneName = new NenechiCopypasta();

             neneName.configureVersion("short");
             for (int i = 0; i < nene.length; i++) {
                 nene[i] = neneName.getNeneName();
                 System.out.println();
             }
             String auxName;
             for (int i = 0; i < nene.length; i++) {
                 auxName = nene[i];
                 test.write("\n"+auxName);
             }
             test.close();

             while (read.readLine() != null) {
                 System.out.println(read.readLine());
             }

             read.close();

         } catch (NenechiCopypasta.NameException e) {
             throw new NenechiCopypasta.NameException(e.getMessage());
         }
     }
}