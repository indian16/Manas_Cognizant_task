//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Logger logger1=Logger.getInstance();
    Logger logger2=Logger.getInstance();
    logger1.log("First log message");
    logger2.log("second log message");
    if(logger1==logger2){
        System.out.println("Both logger instances are the same.");
    }
    else System.out.println("Different logger instances exist.");
    }
}