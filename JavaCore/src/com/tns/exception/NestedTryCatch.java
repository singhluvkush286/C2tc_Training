package com.tns.exception;

public class NestedTryCatch {
	public static void check()
	{
		String str = "TNS";
		int slength = str.length();
		System.out.println("String Lenght"+slength);
		String anotherString=null;
		int y=6;
		try {
			try {
				System.out.println(str.charAt(y));
			}
			catch(StringIndexOutOfBoundsException ex)
			{
				System.out.println("indexoutofbound"+ex.getMessage());
			}
			System.out.println("String length"+anotherString.length());
		}
		catch(NullPointerException npe)
		{
			System.out.println("ExceptionFounnd"+npe.getMessage());
		}

	}
}
