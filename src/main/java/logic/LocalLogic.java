package logic;

import toy.ArrayToy;
import toy.Toy;

import java.io.FileWriter;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.Date;
import java.util.Map;

public class LocalLogic {
    public Toy returnWinerToy (ArrayToy ArrayToy){

        Integer sumChange;
        Integer sumChangeForFindWin;


        sumChange = 0;
        for (int i = 0; i < ArrayToy.GetArrayListToy().toArray().length; i++) {
            sumChange += ArrayToy.GetArrayListToy().get(i).GetChange();
        }

        if (sumChange != 0) {
            int number = new SecureRandom().nextInt(sumChange) + 1;
            sumChangeForFindWin = 0;
            for (int i = 0; i < ArrayToy.GetArrayListToy().toArray().length; i++) {
                sumChangeForFindWin += ArrayToy.GetArrayListToy().get(i).GetChange();
                if (number <= sumChangeForFindWin) {
                    if (0 < ArrayToy.GetArrayListToy().get(i).GetQuant()) {
                        ArrayToy.GetArrayListToy().get(i).ToyPlayedOut();
                        return ArrayToy.GetArrayListToy().get(i);
                    }
                    break;
                }
            }
        }
        return null;
    }

    public void PrintAllList(ArrayToy ArrayToy){
        for (int i = 0; i < ArrayToy.GetArrayListToy().toArray().length; i++) {
            System.out.println(ArrayToy.GetArrayListToy().get(i));
        }
    }

    public Map<String, Integer> ResultCount(Toy winer, Map<String, Integer> result){
        if (winer != null) {
            if (result.containsKey(winer.GetName())) {
                result.put(winer.GetName(), result.get(winer.GetName()) + 1);
            } else {
                result.put(winer.GetName(), 1);
            }
        }
        return result;
    }

    //запись в файл
    public void SaveInFile(Map<String, Integer> result){
        try(FileWriter writer = new FileWriter("result.txt", true))
        {
            Date date = new Date();
            writer.write(date.toString()+ "\n");
            writer.write(result.toString()
                    .replace("{", "name: ")
                    .replace("}", "")
                    .replace("=", " = ")
                    .replace(", ", "\nname: ") + "\n\n");
            writer.flush();
        }
        catch(IOException ex){

        }
    }
}
