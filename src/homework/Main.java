package homework;

public class Main{
    public static void main(String[] args){
        Reportable user = new User("Bob");
        Saver persister = new Persister();

        String report = user.generateReport();
        System.out.println(report);

        persister.save(user);
    }
}