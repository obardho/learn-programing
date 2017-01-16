package ascii.big;

import ascii.AbstractFont;
import font.CaractereInterface;

public class FontBig extends AbstractFont implements FontBigInterface
{
    private char symbolHorizontal;
    private char symbolVertical;
    private char symbolItr;
    private char symbolLtr;
    private char symbolBracketR;
    private char symbolVogel;
    
    public FontBig()
    {
        super();
        this.symbolHorizontal = '_';
        this.symbolVertical   = '|';
        this.symbolItr         = '/';
        this.symbolLtr        = '\\';
        this.symbolBracketR   = ')';
        this.symbolVogel      = '<';
           
    }
    
    protected void initLineHeight()
    {
        this.lineHeight = 6;
    }
    
    protected CaractereInterface createCaractere(char caractere)
    {

      if('O' == caractere || 'o' == caractere) {
            return new CaractereO(this); 
        } else {
            return new CaractereB(this);
        }
 
 //         return new CaractereO(this);                
    }
    
    protected void initSymbolDefault()
    {
        this.symbolDefault = ' ';
    }

    public char getsymbolHorizontal()
    {
        return this.symbolHorizontal;
    }
    
    public char getsymbolVertical()
    {
        return this.symbolVertical;
    }
    
    public char getsymbolItr()
    {
        return this.symbolItr;
    }
    
    public char getsymbolLtr()
    {
        return this.symbolLtr;
    }
    
    public char getsymbolBracketR()
    {
        return this.symbolBracketR;
    }
    
    public char getsymbolVogel()
    {
        return this.symbolVogel;
    }
}
