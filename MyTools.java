package mypack;


import java.util.Random;
import java.util.Scanner;
import java.io.IOException;

public class MyTools {
    public static Scanner scan(){
        return new Scanner(System.in);
    }
    public static void clearPowerShell7() throws IOException {
        Runtime.getRuntime().exec("powershell.exe clear-host");
    }

    public static void clearWindowsOrLinux(){
        //Clears Screen in java
        try {
            if (System.getProperty("os.name").contains("Windows"))
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            else
                Runtime.getRuntime().exec("clear");
        } catch (IOException | InterruptedException ex) {}
    }
    public static int rng(int limitInf, int limitSup) throws Exception {

        class InvalidRangeException extends Exception{
            private String msg;
            public InvalidRangeException(String msg){
                this.msg =  msg;
            }
            public String msg(){
                return msg;
            }
        }

        Random randomNumber = new Random();
        int number = randomNumber.nextInt();

        try{
            if (limitInf > limitSup){
                throw new InvalidRangeException("Inferior limit is greater than Superior limit");
            }

            if(number >= limitInf && number <= limitSup){
                return number;
            }
        }
        catch (InvalidRangeException e){
            System.out.println(e.msg());
        }

        return 0;
    }

}
