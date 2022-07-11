package methodoverloading;

public class StaticExtendMethodLoadingParent extends StaticExtendMethodLoading{

	public static void main(String []args) {
		StaticExtendMethodLoading ml=new StaticExtendMethodLoadingParent();
		ml.dd();
		ml.ddd();
		int d=(int) ml.load(10, 20);
		System.out.println("called main method"+d);  //https://app.coolfreecv.com/?lang=en&file=2
	}

}
