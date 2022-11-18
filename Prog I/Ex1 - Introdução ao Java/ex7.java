public class ex7{
    public static void main (String[] args) {
        int i, number, count; 
        System.out.println(" Os números primos entre 100 e 200 são: ");	
		for(number = 100; number <= 200; number++)
		{
			count = 0;
		    for (i = 2; i <= number/2; i++)
		    {
		    	if(number % i == 0)
		    	{
		    		count++;
		    		break;
		    	}
		    }
		    if(count == 0 && number != 1 )
		    {
		    	System.out.print(number + " ");
		    }  
		}
	}
    }
