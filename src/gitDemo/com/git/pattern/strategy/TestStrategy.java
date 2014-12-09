package gitDemo.com.git.pattern.strategy;

/**
 * <pre>
 * Strategy(策略模式)详解:
 * 在使用策略模式的应用实例内部维护一个strategy实例,针对不同的子类用不同的策略实现
 * </pre>
 * 
 * @author <a href="mailto:dzeay.com@gmail.com">dzeay.com</a>
 * @since 2010-11-15
 * @version 1.0
 */
public class TestStrategy {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Context context = new Context();

		context.setStrategy(new AStrategy());
		context.doOtherThing();

		context.setStrategy(new BStrategy());
		context.doOtherThing();

		context.setStrategy(new IStrategy() {
			@Override
			public void doOtherThing() {
				System.out.println("doOtherThing");
			}
		});
		context.doOtherThing();
	}
}
