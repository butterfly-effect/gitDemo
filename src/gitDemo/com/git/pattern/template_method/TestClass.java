package gitDemo.com.git.pattern.template_method;

/**
 * <pre>
 * Template Method(模板方法模式)详解: 
 * 由基类提供一个模板,将各子类中不变的行为提取到基类中实现,
 * 而各子类中可变的行为由各子类自己重写基类方法实现
 * </pre>
 * 
 * @author <a href="mailto:dzeay.com@gmail.com">dzeay.com</a>
 * @since 2010-11-15
 * @version 1.0
 */
public class TestClass {
    /**
     * 
     * @param args
     */
    public static void main(String[] args) {
        BaseTemplate aClass = new AClass();
        aClass.doSameThing();
        aClass.doOtherThing();

        BaseTemplate bClass = new BClass();
        bClass.doSameThing();
        bClass.doOtherThing();
    }
}
