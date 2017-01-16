package ascii.big;

import ascii.AbstractCaractere;
import font.CaractereInterface;

public class CaractereB extends AbstractCaractere implements CaractereInterface
{

    public CaractereB(FontBig font) // font possede la methode getMineHeight()
    {
        // affeceter des valeurs a definition
//        this.definition = new char[font.getLineHeight()][7]; // 1. methode Font.getLineHeight, 2. Largeur
//        this definition[0][7] = symbolHorinzontal;
   
        
        char[][] foo = {
                       {font.getSymbolDefault(), font.getsymbolHorizontal(), font.getsymbolHorizontal(), font.getsymbolHorizontal(), 
                    font.getsymbolHorizontal(), font.getSymbolDefault(), font.getSymbolDefault(), font.getSymbolDefault()},
                {font.getSymbolDefault(), font.getSymbolDefault(), font.getsymbolHorizontal(), font.getSymbolDefault(),
                        font.getsymbolLtr(), font.getSymbolDefault(), font.getSymbolDefault()},
                {font.getSymbolDefault(), font.getsymbolVertical(), font.getsymbolHorizontal(), font.getsymbolBracketR(),
                            font.getSymbolDefault(), font.getsymbolVertical(), font.getSymbolDefault()},
                { font.getSymbolDefault(), font.getSymbolDefault(), font.getsymbolHorizontal(), font.getSymbolDefault(),
                                font.getsymbolVogel(), font.getSymbolDefault(), font.getSymbolDefault()},
                {font.getSymbolDefault(), font.getsymbolVertical(), font.getsymbolHorizontal(), font.getsymbolBracketR(),
                                    font.getSymbolDefault(), font.getsymbolVertical(), font.getSymbolDefault()},
                {font.getsymbolHorizontal(), font.getsymbolHorizontal(), font.getsymbolHorizontal(), font.getsymbolHorizontal(), 
                                        font.getsymbolItr(), font.getSymbolDefault(), font.getSymbolDefault()}
        };
        
        
        
this.definition = foo;  
        
    }
    
    public String toString()
    {
        return "B";
    }    
    
}