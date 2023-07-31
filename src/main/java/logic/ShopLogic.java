package logic;


import interf.Interf;
import interf.IntrfRu;
import toy.ArrayToy;
import toy.Toy;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ShopLogic {

    public static void main(String[] args) {
        ArrayToy ArrayToy = new ArrayToy();
        Map<String, Integer> result = new HashMap<>();
        LocalLogic Roulette = new LocalLogic();
        Toy winer;
        Interf Lang = new IntrfRu();
        Scanner in = new Scanner(System.in);


        ArrayToy.AddToy(new Toy(1, "sg", 120, 1));
        ArrayToy.AddToy(new Toy(2, "sdfsgg", 120, 1));
        ArrayToy.AddToy(new Toy(3, "adggsg", 120, 1));
        /*
        for(int i = 0; i < 3; i++) {
            try {
                Lang.AddToy();
                String[] strForAdd = in.nextLine().split(" ");
                ArrayToy.AddToy(new Toy(Integer.parseInt(strForAdd[0]), strForAdd[1], Integer.parseInt(strForAdd[2]), Integer.parseInt(strForAdd[3])));
            } catch (Exception e) {
                Lang.NoCorrectInput();
            }
        }*/

        Roulette.PrintAllList(ArrayToy);

        for (int k = 0; k < 100; k++) {
            winer = Roulette.returnWinerToy(ArrayToy);
            result =  Roulette.ResultCount(winer, result);
        }

        /*
        System.out.println(result);
        Roulette.PrintAllList(ArrayToy);
        */

        Roulette.SaveInFile(result);

    }
}
