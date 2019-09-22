import java.io.*;
import java.lang.Math;
public class log
{
public double calcLog(double num)
{
log = Math.log(num)/Math.log(10);
return(log);
}

public static void main(String[] args) throws Exception
{
double val = calcLog(100);
System.out.println(val);
}
}
