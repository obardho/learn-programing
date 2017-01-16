package ascii.big;

import ascii.AbstractCaractere;
import font.CaractereInterface;

public class CaractereO extends AbstractCaractere implements CaractereInterface
{

    public CaractereO(FontBig font) // font possede la methode getMineHeight()
    {
        // affeceter des valeurs a definition
//        this.definition = new char[font.getLineHeight()][7]; // 1. methode Font.getLineHeight, 2. Largeur
//        this definition[0][7] = symbolHorinzontal;
        
       char[][] fooo = {
               {font.getSymbolDefault(), font.getSymbolDefault(), font.getsymbolHorizontal(), 
                   font.getsymbolHorizontal(), font.getsymbolHorizontal(), font.getsymbolHorizontal(), 
                   font.getSymbolDefault(), font.getSymbolDefault()},
               {font.getSymbolDefault(), font.getsymbolItr(), font.getSymbolDefault(), 
                       font.getsymbolHorizontal(), font.getsymbolHorizontal(), font.getSymbolDefault(),
                       font.getsymbolLtr(), font.getsymbolVertical()},
               {font.getsymbolVertical(), font.getSymbolDefault(), font.getsymbolVertical(), 
                           font.getSymbolDefault(), font.getSymbolDefault(), font.getsymbolVertical(), 
                           font.getSymbolDefault(), font.getsymbolVertical()},
               {font.getsymbolVertical(), font.getSymbolDefault(), font.getsymbolVertical(),
                               font.getSymbolDefault(), font.getSymbolDefault(), 
                               font.getsymbolVertical(), font.getSymbolDefault(), 
                               font.getsymbolVertical()},
               {font.getsymbolVertical(), font.getSymbolDefault(), font.getsymbolVertical(), 
                                   font.getsymbolHorizontal(), font.getsymbolHorizontal(), 
                                   font.getsymbolVertical(), font.getSymbolDefault(), 
                                   font.getsymbolVertical()},
               {font.getSymbolDefault(), font.getsymbolLtr(), font.getsymbolHorizontal(), 
                                       font.getsymbolHorizontal(), font.getsymbolHorizontal(), 
                                       font.getsymbolHorizontal(), font.getsymbolItr(), 
                                       font.getsymbolVertical()}
       
               
               
               
       };
        
      this.definition = fooo;  
        
    }
    
    public String toString()
    {
        return "O";
    }    
    
}