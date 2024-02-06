package com;
import java.util.*;
public class mobile  extends Electronics{
Electronics shopping (int choise)
{
if (choise==1)
{
	laptop l=new laptop();
	return l;
}
else if (choise==2)
{
	mobile m= new mobile();
	return m;
}
else 
{
	return null;
}
}
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
mobile M=new mobile();
System.out.println("enter choise");
int	choise=s.nextInt();
Electronics obj=M.shopping(choise);
	if (obj instanceof laptop)
	{
		System.out.println("Laptop");
	}
	else if(obj instanceof mobile)
	{
		System.out.println("mobile");
	}
	else
	{
		System.out.println("invalide");
	}
}
}
