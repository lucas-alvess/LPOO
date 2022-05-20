package ComAbstrata;

class Pato extends Animal {
    
    public Pato(String aNome){
        super(aNome);
    }

    @Override
    public String fazBarulho(){
        return "Quaaaack";
    }
}
