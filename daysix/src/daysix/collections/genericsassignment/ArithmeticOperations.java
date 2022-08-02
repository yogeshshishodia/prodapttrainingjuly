package daysix.collections.genericsassignment;

import java.util.List;
import java.util.Vector;

public class ArithmeticOperations {
	/**
	 * Generic method to add 2 numbers.
	 * 
	 * @param t1
	 * @param t2
	 * @return
	 */
	public static <T extends Number> Number add(T t1, T t2) {
		return (t1.doubleValue() + t2.doubleValue());
	}

	/**
	* Demostrates Upper Bounded Wildcards.
	* Generic method to add numbers from a list.
	* @param t1
	* @param t2
	* @return
	*/
	public static <T extends Number> Number add(List<? extends Number> list)
	{
	double d = 0;;
	for (int i = 0; i < list.size(); i++)
	d += list.get(i).doubleValue();
	return new Double(d);
	}
	/**
	* Demostrates Unbounded Wildcards.
	* Generic method to dump list data to console.
	* @param t1
	* @param t2
	* @return
	*/
	public static void dumpList(List<?> list)
	{
	System.out.println("List dump with unbounded wildcard:");
	for (int i = 0; i < list.size(); i++)
	System.out.println(list.get(i));
	}
	public static void main(String[] args)
	{
	// Adding 2 integers
	//Integer i1 = new Integer(34), i2 = new Integer(43);
	System.out.println("Add with generic method: " +
	ArithmeticOperations.add(34, 43));
	//Float f1 = new Float(12.56), f2 = new Float(3.6778);
	System.out.println("Add with generic method: " +
	ArithmeticOperations.add(12.56, 3.6778));
	// Adding 2 integers through a list
	Vector<Number> l = new Vector<Number>();
	l.add(34);
	l.add(43);
	System.out.println("Add with upper bounded wildcard: " +
	ArithmeticOperations.add(l));
	// Dumping the list to the console.
	ArithmeticOperations.dumpList(l);
	}
	}