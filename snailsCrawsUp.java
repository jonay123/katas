public class Kata {
    public static int snail(int column, int day, int night) {
     int altura = 0;
      int contador = 0;
      while (altura<column){
        altura = altura + day;
        if (altura<column){
          altura -= night ;
        }
        contador++;
      } 
        return (contador);
    }
}
