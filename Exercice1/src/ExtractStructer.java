import java.io.File;

public class ExtractStructer {



    public  void getFiles(File[] files, int length, int niveau){

        if(length==files.length){

        return ;}

        // organiser les niveaux
        for(int i=0;i<niveau;i++){
            System.out.print("\t");
        }
        String temp=null;
        if(files[length].canRead()){
            temp=String.valueOf('r');
        }
        if(files[length].canWrite()){
            temp+='w';
        }
        if(files[length].isFile()){
//            System.out.println(files[length].getName());


            System.out.println(files[length].getAbsoluteFile()+"<FICH> - "+temp);
        } else if (files[length].isDirectory()) {

            System.out.println(files[length].getAbsoluteFile()+"<DIR> - "+temp);

        getFiles(files[length].listFiles(),0,niveau+1);
        }


        getFiles(files,length+1,niveau);



    }















}
