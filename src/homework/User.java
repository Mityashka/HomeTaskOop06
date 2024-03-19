package homework;

public class User implements Reportable{
    private final String name;

    public User(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public String generateReport() {
        return "Report for user: " + name;
    }
}
