package cartas;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Sayad
 */
public class Deck {
    String[] Color = {"Rojo","Negro", "Rojo", "Negro"};
    String[] Palo = {"Corazones","Treboles","Diamantes","Picas"};
    ArrayList<Object> Deck = new ArrayList<>();
    ArrayList<Object> Descarte = new ArrayList<>();
    Card Aux = new Card();
    
    public void DeckInit(){
        for(int i = 0; i<4; i++){
            for (int j = 0; j<13; j++){
                Card NewCard = new Card(Palo[i], Color[i], (j+1));
                Deck.add(NewCard);
                
            }
        }        
    }
    
    public void showMenu(Deck NewDeck) throws Exception{
        
        Scanner scanner = new Scanner(System.in);
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
                    this.Shuffle();
                    break;
                    
                case 2:
                    this.Head();
                    if (Deck.isEmpty()){
                        throw new Exception("El deck se ha quedado sin cartas");
                    }
                    break;
                    
                case 3:
                    this.Pick();
                        if (Deck.isEmpty()){
                        throw new Exception("El deck se ha quedado sin cartas");
                    }
                    break;
                    
                case 4:
                    if (Deck.size() < 5){
                        throw new Exception("No hay suficiente cartas");
                    }
                    this.Hand();
                        if (Deck.isEmpty()){
                        throw new Exception("El deck se ha quedado sin cartas");
                    }
                    break;
                    
                case 0:
                    End = true;
                    break;
                
                default:
                    throw new Exception("Opcion no valida");
                    
            }
            
            System.out.println("\n");

        }while(End != true);
         
    }
    
    public void Shuffle(){
        Collections.shuffle(Deck);
    }
    
    public void Head(){
        Aux = (Card) Deck.get(0);
        Descarte.add(Aux);
        Deck.remove(0);
        Aux.ShowCard();
        System.out.println("Quedan " + Deck.size() + " cartas en el deck");
    }
    
    public void Pick(){
        int NumeroR = (int) (Math.random()*(Deck.size() - 1));
        Aux = (Card) Deck.get(NumeroR);
        Descarte.add(Aux);
        Deck.remove(NumeroR);
        Aux.ShowCard(); 
        System.out.println("Quedan " + Deck.size() + " cartas en el deck");

    }
    
    public void Hand(){
        
        int NumeroR;
        
        for(int i = 0; i<5; i++){
            Aux = (Card) Deck.get(0);
            Descarte.add(Aux);
            Deck.remove(0);
            Aux.ShowCard();
        }
            System.out.println("Quedan " + Deck.size() + " cartas en el deck");
        
    }
    
}
