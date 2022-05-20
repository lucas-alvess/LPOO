package ComAbstrata;

class Gato extends Animal {
    
    public Gato(String aNome){
        super(aNome);
    }

    @Override
    public String fazBarulho(){
        return "Miauuu";
    }
}
