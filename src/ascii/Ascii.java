package ascii;

import ascii.big.FontBig;
import ascii.big.FontBigInterface;
import font.CaractereInterface;

public class Ascii
{

    public static void main(String[] args)
    {
        
        FontBigInterface font                     = new FontBig();
//        CaractereInterface caractere              = font.getCaractere('d'); only for one letter
//        char[][] definition                       = caractere.toAscii();
        CaractereInterface[] caractereCollection  = new CaractereInterface[2]; 
        // caractereCollection is just a name as it is a collections of characters; 
        //but we can put a name what we want
//        caractereCollection[0]                    = caractere; for one letter
        caractereCollection[0] =                    font.getCaractere('O');
        caractereCollection[1] =                    font.getCaractere('B');
  
// Character.MIN_Value != definition[i][k]
        
     // Afficher les lignes
        for (int i = 0; i < font.getLineHeight(); i++) {
             
             // Afficher les caracteres 
            for (int j = 0; j < caractereCollection.length; j++) {
                
                char[][] definition =  caractereCollection[j].toAscii();
                
                // Afficher les symboles par caractere
                for (int k = 0; k < definition[i].length; k++) {
//                    if (caractere.MIN_VALUE != definition[i][k]) {
//                    currentSymbol = letters[j][i][k];

                    System.out.print(definition[i][k]);
//                    }   
//            output += currentSymbol;
                
                }
            }
            System.out.println(" ");
                
        }    
        
        
        
//        System.out.println(caractere);
        // ou         System.out.println(caractere: toString());
        


    }
}
