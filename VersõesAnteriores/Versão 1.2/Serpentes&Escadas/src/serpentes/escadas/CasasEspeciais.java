
package serpentes.escadas;

public abstract class CasasEspeciais extends Casa{
    
    public CasasEspeciais(){
        super();
    }
    
    public CasasEspeciais(Posicao p){
        super(p);
    }
    public CasasEspeciais(int numCasa){
        super(numCasa);
    }
    
    public CasasEspeciais(Posicao p, int num){
        super( p,  num);
    }
    
}
