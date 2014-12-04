package gitDemo.com.git;

public class SingleTon {
	
	private static SingleTon s = new SingleTon();
	
	private SingleTon(){
		
	}
	
	public static SingleTon getInstance(){
		return s;
	}
}

class SingleTon2{
	private static SingleTon2 s;
	
	private SingleTon2(){
		
	}
	
	// 第一次初始化时，多个线程同时执行"if (s == null)",判断结果都为真，所以都会执行下面的操作:"s = new Singleton()"，由此引发多个实例的出现。  
	public static SingleTon2 getInstance(){
		if(null == s){
			s = new SingleTon2();
		}
		return s;
	}
	
	// 将该方法加上synchronized关键字。这种方法确实能解决问题，但效率不是很高。因为每次调用该方法的时候，都需要阻塞该方法，但事实上只有第一次初始化的时候才会出现这种情况，所以......  
	public static synchronized SingleTon2 getInstance2(){
		if(null == s){
			s = new SingleTon2();
		}
		return s;
	}
	
	public static SingleTon2 getInstance3(){
		if(null == s){
			synchronized (SingleTon2.class) {
				s = new SingleTon2();
			}
		}
		return s;
	}
}
