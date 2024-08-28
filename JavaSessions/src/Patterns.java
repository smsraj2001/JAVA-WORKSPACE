
public class Patterns {
	public static void main(String[] args) {
		for(int i = 0; i < 3; ++i)
		{
			for(int j = 0; j <= i; ++j)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i = 1; i <= 3; ++i)
		{
			for(int j = 1; j <= i; ++j)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		int n = 1;
		for(int i = 1; i <= 3; ++i)
		{
				for(int j = 1; j <= i; ++j)
				{
					System.out.print(n+" ");
					n++;
				}
				System.out.println();
		}
		char c = 'A';
		for(int i = 1; i <= 3; ++i)
		{
				for(int j = 1; j <= i; ++j)
				{
					System.out.print(c+" ");
					c++;
				}
				System.out.println();
		}
		for(int i = 0; i < 5; i++)
		{
			for(int j = 0; j < 5; j++)
			{
				if(i == 0 || i == 4)
				{
					System.out.print("*" +" ");
				}
				else
				{
					if(j == 0 || j == 4)
					{
						System.out.print("*" + " ");
					}
					else
					{
						System.out.print("  ");
					}
				}
			}
			System.out.println();
		}
				
	}

}
