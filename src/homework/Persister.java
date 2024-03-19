package homework;

public class Persister implements Saver{
    @Override
    public void save(Object object) {
        System.out.println("Save object: " + object.getClass());
    }
}
