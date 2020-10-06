package cartas;
/**
 *
 * @author Sayad
 */
public class Card {
    
    String Palo;
    String Color;
    String Valor;
    
    public Card(String Palo, String Color, int Valor){
        
        switch (Valor){
            case 1:
                this.Valor = "A";
                break;
            
            case 11:
                this.Valor = "J";
                break;
            
            case 12:
                this.Valor = "Q";
                break;
            
            case 13:
                this.Valor = "K";
                break;
            
            default:
                this.Valor = String.valueOf(Valor);
                break;
        }
        
        this.Palo = Palo;
        this.Color = Color;
    }
    
    public Card(){
    }
    
    public void ShowCard(){
        System.out.println(this.Palo + ", " + this.Color + ", " + this.Valor);
    }
    
    
    
    
}
