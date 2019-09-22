import java.io.*;
import java.lang.Math;
public class log
{
public static double calcLog(double num)
{
num = Math.log(num)/Math.log(10);
return(num);
}

public static void main(String[] args) throws Exception
{
double val = calcLog(100);
System.out.println(val);
}
}
