import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadEOF{
    public static void main(String[] args) throws IOException{
        BufferedReader bIn=new BufferedReader( new InputStreamReader(System.in));
        String eachLine= "";
        int LNo=1;
        while (!(eachLine=bIn.readLine()).equals("EOF")) {
            System.out.println(LNo+" "+eachLine);
            LNo++;
        }
        bIn.close();
    
    }
}