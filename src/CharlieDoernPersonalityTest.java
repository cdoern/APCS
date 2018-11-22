import java.io.*;
import java.util.*;
public class CharlieDoernPersonalityTest {
    public static void main(String[] args)throws FileNotFoundException, IOException{

        String file = "";
        Scanner in = new Scanner(System.in);
        System.out.print("File name: ");
        file = in.next();
       File fi = new File(file);
      //  File fi = new File("");
        while(fi.exists() ==false) {
            System.out.print("File not found. Try again: ");
            file = in.next();
             fi = new File(file);
       }
        System.out.print("Output file name: ");
        String output = in.next();
        PrintStream document = new PrintStream(output);
        Scanner doc = new Scanner(new File(file));
        int counter = 0;
        while(doc.hasNextLine()){
            String line = doc.nextLine();
            Scanner tokenizer = new Scanner(line);
            if(counter%2 == 0){
                String name = line;
                document.println(name+":");
                System.out.println(name);
            }
            else {
                int[] total = new int[4];
                line = line.toLowerCase();
                char[] ans = line.toCharArray();
               int counter2=1;
                for(int i = 0; i <ans.length; i++){
                    if(counter2 > 7){
                        counter2 = 1;
                    }
                    if(ans[i] == 'b'){
                        if(counter2 == 1){
                            total[0]++;
                        }
                        if(counter2 == 2 || counter2 ==3){
                            total[1]++;
                        }
                        if(counter2 == 4 || counter2 ==5){
                            total[2]++;
                        }
                        if(counter2 == 6 || counter2 ==7){
                            total[3]++;
                        }
                    }
                    counter2++;
                }
                System.out.println(Arrays.toString(total));
                String id = "";
                int[] pers = new int[4];
                for(int i = 0; i < total.length; i ++){
                    if(i == 0){
                        int a = 10 - total[i];
                        document.print(a+"A-"+total[i]+"B ");
                        double first = (total[i]/10.0)*100.0;
                        int per = (int)(first);
                        pers[i] = per;
                        if(a<total[i]){
                            id+="I";
                        }
                        else{
                            id+="E";
                        }
                    }
                   else if(i == 1){
                        int a = 10 - total[i];
                        document.print(a+"A-"+total[i]+"B ");
                        double first = (total[i]/20.0)*100.0;
                        int per = (int)(first);
                        pers[i] = per;
                        if(a<total[i]){
                            id+="N";
                        }
                        else{
                            id+="S";
                        }
                    }
                    else if(i == 2){
                        int a = 10 - total[i];
                        document.print(a+"A-"+total[i]+"B ");
                        double first = (total[i]/20.0)*100.0;
                        int per = (int)(first);
                        pers[i] = per;
                        if(a<total[i]){
                            id+="F";
                        }
                        else{
                            id+="T";
                        }
                    }
                    else if(i == 3){
                        int a = 10 - total[i];
                        document.println(a+"A-"+total[i]+"B ");
                       double first = (total[i]/20.0)*100.0;
                        int per = (int)(first);
                        pers[i] = per;
                        if(a<total[i]){
                            id+="P";
                        }
                        else{
                            id+="J";
                        }
                    }
                }
                document.print(Arrays.toString(pers));
                document.println(" = "+id);
                document.println("");
                System.out.println(id);
            }
            counter++;
        }
    }
}

