public class Runner
{
	public static void main(String[] args)
	{
		LinkedList<String> l = new LinkedList<String>();
		l.add("a");
		l.add("b", 1);
		l.add("c");
		l.add("new", 1);
		System.out.println(l);
	}
}
