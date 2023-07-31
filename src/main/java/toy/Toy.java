package toy;

public class Toy {
    private Integer id;
    private String name;
    private Integer quant;
    private Integer change;


    public Toy(Integer id, String name, Integer quant, Integer change){
        this.id = id;
        this.name = name;
        this.quant = quant;
        this.change = change;
    }

    public Integer GetId(){
        return id;
    }

    public void SetId(Integer id){
        this.id = id;
    }

    public String GetName(){
        return name;
    }

    public void SetName(String name){
        this.name = name;
    }
    public Integer GetQuant(){
        return quant;
    }
    public void SetQuant(Integer quant){
        this.quant = quant;
    }

    public void ToyPlayedOut(){
        quant--;
    }

    public Integer GetChange(){
        return change;
    }
    public void SetChange(Integer change){
        this.change = change;
    }

    @Override
    public String toString() {
        return "id = " + id + "\tname = " + name + "\tquant = " + quant + "\tchange = " + change;
    }
}
