package toy;

import java.util.ArrayList;

public class ArrayToy {

    private ArrayList<Toy> arrayListToy;

    public ArrayToy() {
        arrayListToy = new ArrayList<Toy>();
    }

    public void SetArrayListToy(ArrayList<Toy> arrayListToy){
        this.arrayListToy = arrayListToy;
    }

    public ArrayList<Toy> GetArrayListToy(){
        return arrayListToy;
    }

    public void AddToy(Toy toy){
        arrayListToy.add(toy);
    }
}
