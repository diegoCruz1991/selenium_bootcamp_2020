package ejercicios;

import javax.crypto.spec.PSource;

public class utils {
    public static void main(String[] args){
        int longest =28;
        int resLen = 11;
        int rounded = 0;
        String tabs[] ={"","\t","\t\t","\t\t\t","\t\t\t\t","\t\t\t\t\t","\t\t\t\t\t\t","\t\t\t\t\t\t"};
        for(resLen =7;resLen<100;resLen+=3){
            rounded = (resLen-resLen%4)+4;
            if(rounded > longest){
                rounded = longest;
            }
            System.out.println("Reslen: "+resLen+"  - mod: "+resLen%4+" rounded: "+rounded);
            System.out.println(tabs[(longest-rounded)/4]+">");
        }


    }


}
