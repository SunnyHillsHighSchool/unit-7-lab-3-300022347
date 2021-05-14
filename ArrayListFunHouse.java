//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ArrayListFunHouse
{
 public static ArrayList<Integer> getListOfFactors(int number)
 {
  ArrayList<Integer> factorList = new ArrayList<Integer>();
  for(int i=1; i<=number;i++)
  {
    if(number%i==0 && i!=number && i!=1)
    {
      factorList.add(i);
    }
    else
    {}
  }
  return factorList;
 }
 
 public static void keepOnlyCompositeNumbers( List<Integer> nums )
 {
  for(int i=1; i<nums.size();i++)
  {
    int numOfFactors = 0;
    int num = nums.get(i);
    for(int n = 1; n<=num;i++)
    {
      if(num%n==0)
      {
        numOfFactors++;
      }
      else{}
    }

    if(numOfFactors==2)
    {
      nums.remove(i);
    }
    if(numOfFactors>=3){}
    
 }
}
}