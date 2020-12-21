package jihe;
//可以定义多个泛型
public class Zidingyi1<T,E> {
	public static void main(String[] args) {
		Zidingyi<String> gt=new Zidingyi<String>();
		gt.setT("哈哈");
		String t=gt.getT();
	}
}
