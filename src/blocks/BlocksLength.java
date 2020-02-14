package blocks;

import java.math.BigInteger;
import java.util.*;

public class BlocksLength 
{
	
	
	public static BigInteger patterns(int val)
	{
		BigInteger n=BigInteger.valueOf(1);
		BigInteger m=BigInteger.valueOf(0);
		BigInteger res=BigInteger.valueOf(1);
		
		for(int i=1;i<val;i++)
		{
			res=n.add(m);
			m=n;
			n=res;
		}
		
		return res;
	}
	
	

	public static void main(String[] args) 
	{
		int [] values=new int[200];
		int inp=201;
		int cont=0;
		Scanner leer=new Scanner(System.in);
		
		System.out.println("Por favor ingrese los valores:");

		do
		{
			inp=leer.nextInt();
			values[cont]=inp;
			cont++;
			
		}while(inp!=0);
		
		
	
		for(int i=0;i<values.length;i++)
		{
			if(values[i]==0)
			{
				break;
			}
			
			System.out.println(patterns(values[i]));
		}
		
	}

}
