package hungry;

public class Queue {
    private Hungry first;
    private Hungry last;
        
    public Hungry<Eater> makeHungry(Eater f, int need) {
        return new Hungry<>(f, need);
    }
    
    public Queue add(Eater f, int need) {
        Hungry<Eater> h = makeHungry(f, need);
        if(first == null)
            first = h;
        else if(last == null) {
            first.setNext(h);
            last = h;
        }
        else {
            last.setNext(h);
            last = h;
        }
        return this;
    }
    
    public void giveFoodToFirst() {
        Food food = new Food();
        Hungry current = first;
        do {
            current.eat(food);
            current = current.getNext();
        } while(current != null);
    }
}



