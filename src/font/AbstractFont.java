package font;

public abstract class AbstractFont 
{

	protected byte lineHeight;
	
	protected CaractereInterface[] caractere;
	
    protected abstract void initLineHeight();
	
	protected abstract CaractereInterface createCaractere(char caractere);
	
	protected AbstractFont()	
	{
		this.initLineHeight();
		this.caractere = new CaractereInterface[255];
	}
	
	public byte getLineHeight()
	{
		return this.lineHeight;
	}
	
	public CaractereInterface getCaractere(char caractere)
	{
		if (null == this.caractere[caractere]) 
		{
			this.caractere[caractere] = this.createCaractere(caractere);
		}
		return this.caractere[caractere];
	}
}
