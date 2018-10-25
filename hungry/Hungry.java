package hungry;

public class Hungry<T extends Eater> {
    private T obj;
    private Hungry<? extends Eater> next;
    private int need;
    
    public Hungry(T t, int n) {
        obj = t;
        need = n;
    }
    
    public T getObject() {
        return obj;
    }
    
    public int getNeed() {
        return need;
    }
    
    public void eat(Food f) {
        if(f.getQuality() < need) die();
        else {
            f.decreaseQuality(need);
            obj.eat(f);
            System.out.println("Remains food: " + f.getQuality());
        }  
    }
    
    public void die() {
        System.out.println(obj + " is dead");
    }
     
    public Hungry<? extends Eater> getNext() {
        return this.next;
    }
    
    public void setNext(Hungry<? extends Eater> h) {
        next = h;
    }
}
