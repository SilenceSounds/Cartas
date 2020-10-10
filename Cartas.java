package cartas;
import java.util.Scanner;
/**
 *
 * @author Sayad
 */
public class Cartas {
    

    public static void main(String[] args) {
        
       Scanner scanner = new Scanner(System.in);
       Deck NewDeck = new Deck();
       NewDeck.DeckInit(); 
       boolean End = false; 
        
        do{
            System.out.println("Bienvenido a Poker!");
            System.out.println("1 Mezclar deck");
            System.out.println("2 Sacar una carta");
            System.out.println("3 Carta al azar");
            System.out.println("4 Generar una mano de 5 cartas");
            System.out.println("0 Salir \n");
            
            System.out.println("Opcion Elegida: ");
            
            int E = scanner.nextInt();
            
            System.out.println();
            
            switch (E){
                case 1:
                    NewDeck.Shuffle();
                    break;
                    
                case 2:
                    NewDeck.Head();
                    break;
                    
                case 3:
                    NewDeck.Pick();
                    break;
                    
                case 4:
                    NewDeck.Hand();
                    break;
                    
                case 0:
                    End = true;
                    break;
                
                default:
                    System.out.println("Opcion no valida");
                    break;
                    
            }
            
            System.out.println("\n");

        }while(End != true);
         
       
    }
    
    
}
