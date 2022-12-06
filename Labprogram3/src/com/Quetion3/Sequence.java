package com.Quetion3;

public class Sequence {

	public static void main(String[] args) {
		String s="piyush@kadam";
		boolean b=false;
		for(int i=0;i<s.length();i++)       //logic for checking sequence of letters
		{
			if(s.charAt(i)=='@')
			{
				if(Character.isLowerCase(0));
				b=true;
				break;
			}
		}
		if(b)
			System.out.println("matched");
		else
			System.out.println("not matched");
	}

}
