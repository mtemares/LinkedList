public class Runner
{
	public static void main(String[] args)
	{
		LinkedList<String> l = new LinkedList<String>();
		l.add("a");
		l.add(1, "b");
		l.add("c");
		l.add(1,"d");
		System.out.println(l);
		System.out.println(l.get(1));
		l.remove(1);
		l.add("e");
		l.add("f");
		System.out.println(l);
		l.removeFirst();
		System.out.println(l);
		l.add("g");
		System.out.println(l);
		l.removeLast();
		System.out.println(l);
		l.add("h"); 
		System.out.println(l);
		String item = l.get(0);
		System.out.println(item);
		l.remove("h");
		System.out.println(l);
		l.remove("b");
		System.out.println(l);
		l.remove("e");
		System.out.println(l);
		l.add("i");
		l.add("j");
		l.add("k");
		l.add("l");
		l.add("m");
		l.add("n");
		System.out.println(l);
		System.out.println(l.contains("l"));
		System.out.println(l.contains("n"));
		System.out.println(l.contains("h"));
		System.out.println(l.contains("z"));
		//l.clear();
		System.out.println(l);
		System.out.println(l.indexOf("i"));
		
		l.set(2, "o");
		System.out.println(l);
		l.set(0, "p");
		l.set(7, "q");
		System.out.println(l);
		
		for (String i:l)
		{
			System.out.println(i);
		}
		
		LinkedList<String> test = new LinkedList<String>(l);
		System.out.println(test);
		
	}
}
