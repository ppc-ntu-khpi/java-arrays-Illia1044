
public class Exercise {
  /**
  *У цьому класі створюються випадкові числа для основного масиву
  *де число а - мінімальний поріг
  *число b - максимальний поріг
  *Потім це число вписується у масив
  */
    public static int Calculate(int a, int b){
        return (int) (a + (int) (Math.random() * b));
    }
}
