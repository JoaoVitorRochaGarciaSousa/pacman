public class GameObject {

    private int posicaohorizontal;
    private int posicaovertical;
    private int TamanhodaTela;
    private boolean visivel=true;
    private int direcao;
    
    public boolean isVisivel() {
        return visivel;
    }



    public void setVisivel(boolean visivel) {
        this.visivel = visivel;
    }

    public GameObject(int TamanhodaTela, int posicaovertical, int posicaohorizontal) {
        this.TamanhodaTela = TamanhodaTela;
        this.posicaovertical = posicaovertical;
        this.posicaohorizontal = posicaohorizontal;   
    }

    public int getX() {
        return posicaohorizontal;
    }

    public void setX(int posicaohorizontal) {
        if (posicaohorizontal<0) {
            System.out.println("Posicao horizontal fora da tela");
            this.posicaohorizontal = 0;
        }
        else
        this.posicaohorizontal = posicaohorizontal;
    }

    public int getY() {
        return posicaovertical;
    }

    public void setY(int posicaovertical) {
        if (posicaovertical<0) {
            System.out.println("Posicao vertical fora da tela");
            this.posicaovertical = 0;
        }
        else
        this.posicaovertical = posicaovertical;
        
    }

    // Define tamanho da tela
    public int getScreenSize() {
        return TamanhodaTela;
    }

    public void setScreenSize(int TamanhodaTela) {
        this.TamanhodaTela = TamanhodaTela;
    }

    public GameObject(int posicaohorizontal, int posicaovertical){
        this.posicaohorizontal = posicaohorizontal;
        this.posicaovertical = posicaovertical;

    }

    //Define a colisão dos obj pelos eixos x e y
    public boolean colisao(GameObject obj){
        if(getX() >= obj.getX() && getX() <= obj.getX() + 50 && getY() >= obj.getY() && getY() <= obj.getY() + 50){
            return true;
        }
        return false;
    }

    
    public int getDirecao() {
        return direcao;
    }

    //Direção não pode ter valor abaixo de zero
    public void setDirection(int direcao) {
        if (direcao<0) {
            System.out.println("Essa direcao nao eh valida");
        }
        
        this.direcao = direcao;
    }
    
    public boolean mover(){

    int x=getX(), y=getY();

        if(direcao == 0){
           y -= 10;
        }
        if(direcao == 90){
            x += 10;
        }
        if(direcao == 180){
            y += 10;
        }
        if(direcao == 270){
            x -= 10;
        }

        // Se os valores de x ou y forem menor que o tamanho da tela e maiores que zero então jogador podera se mover
        if(x < getScreenSize() && x > 0){
            if(y < getScreenSize() && y > 0){
                setX(x);
                setY(y); 
                return true;
            }
        }
       
       return false;

      
            
    }


}
