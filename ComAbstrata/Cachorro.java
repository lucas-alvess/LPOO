package ComAbstrata;

class Cachorro extends Animal {
    
    public Cachorro(String aNome){
        super(aNome);
    }

    @Override
    public String fazBarulho(){
        return "AU AU";
    }
}
