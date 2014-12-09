package gitDemo.com.git.pattern.strategy;

public class Context {
    private IStrategy strategy;

    public Context() {

    }

    public Context(IStrategy strategy) {
        this.strategy = strategy;
    }

    public void doOtherThing() {
        this.strategy.doOtherThing();
    }

    public void setStrategy(IStrategy strategy) {
        this.strategy = strategy;
    }
}

