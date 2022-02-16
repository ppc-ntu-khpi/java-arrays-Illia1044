
public class Exercise {
  /**
  *У цьому класі створюються випадкові числа для основного масиву
  *де число а - мінімальний поріг
  *число b - максимальний поріг
  *Потім це число вписується у масив
  */
    public static String Calculate(){
      int a = 0;
      int b = 20;
      int[] Arr = new int[20]; 
      System.out.println("Random Massive:");
      for (int i=0; i<20;i++)
      {
        Arr[i]=(a + (int) (Math.random() * b));
        System.out.println(Arr[i]);
      }
      int[] Check = new int[20]; 
      int c = 0;
      for(int i = 0; i<20; i++)
      {
        c = Arr[i];
        Check[c]++;
        c=0;
      }
      int f=0;
      System.out.println("Counts of number in Massive:" );
      for(int i = 0; i<20;i++)
      {
        System.out.println("Count of number "+i+" in Arr = " +Check[i]);
        if(Check[i]>f)f=Check[i];
      }
      
      
      
      String maxnum="";
      for (int i =0; i<20; i++)
      {
        if(Check[i]==f)
        maxnum += Integer.toString(i) + ", ";
      }
      return maxnum;
    }
}
