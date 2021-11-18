package interfaces.sayHello;

public class PersonImpl implements Person {

        private final String name;
        private final String sayHello;

    public PersonImpl(String name) {
        this.name = name;
        this.sayHello = null;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String sayHello() {
        return this.sayHello;
    }
}
