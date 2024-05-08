import java.io.FileWriter;
import java.io.IOException;

public class WhyMethod {
    public static void printTwoTimesA(String text, String delimiter) {
        System.out.println(delimiter);
        System.out.println(text);
        System.out.println(text);
    }
    public static void writeFileTwoTimes(String text, String delimier) throws IOException {
        FileWriter fw = new FileWriter("output.txt");
        fw.write(delimier+"\n");
        fw.write(text+"\n");
        fw.write(text+"\n");
        fw.close();
    }
    public static String twoTimes(String text, String delimiter){
        String out = "";
        out = out + delimiter+ "\n";
        out = out + text+ "\n";
        out = out + text+ "\n";
        return out;
    }
    public static void main(String[] args) throws IOException {
        printTwoTimesA("a", "-");
        System.out.println(twoTimes("a","-"));

        writeFileTwoTimes("a","*");
        printTwoTimesA("b", "&");

    }
}
