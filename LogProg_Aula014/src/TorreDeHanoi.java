
public class TorreDeHanoi {
    public static void main(String[] args) {
       int discos= 3;
       hanoi (discos, 'A', 'B', 'C');     
    }
    private static void hanoi(int discos, char inicio, char auxiliar, char destino){
        if(discos > 0) {
        hanoi(discos -1, inicio, destino, auxiliar);
        System.out.println("mover de " + inicio + " para " + destino);
        hanoi(discos -1, auxiliar, inicio, destino);
    }
 }   
}

//Cara, que código maluco, espero algum dia enteder... (nem o professor entedeu por completo o funcionamento desse código)