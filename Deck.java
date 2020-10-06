package cartas;
import java.util.ArrayList;
import java.util.Collections;
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
