
public class Logger {
    public static Logger instance;
    private Logger(){
        System.out.println("Logger initialized");
    }
    public static synchronized Logger getInstance(){
        if(instance==null) instance =new Logger();
        return instance;
    }
    public void log(String message){
        System.out.println("[LOG] "+ message);
    }
}
