package lab74.pkg;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Squares {
	@SuppressWarnings("rawtypes")
	public static HashMap getSquares(int[] arr)
	{
		Map<Integer, Integer>  map=new HashMap<Integer,Integer>();
		for(int n:arr)
		{
			map.put(n,n*n);
		}
		return (HashMap) map;
	}
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args)
	{
		int array[] =new int[] {1,2,3,4,5,6,7,8,9};
		
		HashMap<Integer,Integer> hmap=getSquares(array);
		Iterator<Integer> it=hmap.keySet().iterator();
		while(it.hasNext())
		{
			Integer key=it.next();
			System.out.println(key + ":" +hmap.get(key));
		}
	}

}
