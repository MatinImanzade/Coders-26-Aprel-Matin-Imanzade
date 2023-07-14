package az.coders.lesson14.test.crate;

public class Crate<T> {
    Integer id;

    public Crate(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Crate{" +
                "name='" + id + '\'' +
                '}';
    }
}
