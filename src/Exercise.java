
public class Exercise {
    public static String Calculate(){
      /**змінні для мінімального та максимального порогу випадкових чисел*/
      int a = 0;
      int b = 20;
      int[] Arr = new int[20]; 
      System.out.println("Random Massive:");
      /**тут я заповнюю масив випадковими числами
      *та вивожу його
      */
      for (int i=0; i<20;i++)
      {
        Arr[i]=(a + (int) (Math.random() * b));
        System.out.println(Arr[i]);
      }
      /**створюю новий масив-перевіряльник
      *в ньому зберігаються кількості появлянь чисел масиву Arr
      */
      int[] Check = new int[20]; 
      int c = 0;
      /**
      *якщо число зустрілось, то взяти індекс, та вписати за цим індексом
      *у цикл Check додаткову одиницю
      */
      for(int i = 0; i<20; i++)
      {
        c = Arr[i];
        Check[c]++;
        c=0;
      }
      /**
      *тепер число f визначить найбільшу кількість появлень певного числа
      */
      int f=0;
      System.out.println("Counts of number in Massive:" );
      for(int i = 0; i<20;i++)
      {
        System.out.println("Count of number "+i+" in Arr = " +Check[i]);
        if(Check[i]>f)f=Check[i];
      }
      
      /**
      *ми виявили кількість найбільшого появляння
      * а тепер ми виведемо ті індекси масиву Check, де значення дорівнює f
      */
      
      String maxnum="";
      for (int i =0; i<20; i++)
      {
        if(Check[i]==f)
        maxnum += Integer.toString(i) + ", ";
      }
      /**повертаю цей рядок з індексами, що відповіддю на завдання*/
      return maxnum;
    }
}
