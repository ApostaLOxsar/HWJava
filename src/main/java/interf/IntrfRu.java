package interf;

public class IntrfRu implements Interf {
    @Override
    public void YouWin() {
        System.out.println("Вы выйграли :");
    }

    @Override
    public void NoToy() {
        System.out.println("Выиграной игрушки нет(");
    }

    @Override
    public void AddToy() {
        System.out.println("Введите id(число), name, количество(число) и относительный шанс выпадения(число) через пробел");
    }

    @Override
    public void PrintListToy() {
        System.out.println("Вот актуальный список:");
    }

    @Override
    public void NoCorrectInput() {
        System.out.println("Введенные данные некорректны, попробуйте повторить");
    }
}
