public class Main {

    public static void changeValue(int value) {
        value = value * 2;
    }

    public static void changeSize(Box box) { // Метод-изменение размера (увеличение
        box.depth *= 2;                      // всех размеров в 2 раза)
        box.width *= 2;
        box.height *= 2;
    }

    public static void main(String[] args) {

        int i = 5;
        System.out.println("число до вызова метода: " + i);
        changeValue(i);
        System.out.println("число после вызова метода: " + i);
        System.out.println();

        Box box55 = new Box(4, 3, 6);
        System.out.println("объём box до вызова метода: " + box55.getVolume());
        changeSize(box55);
        System.out.println("объём box после вызова метода: " + box55.getVolume());
        System.out.println();

        Box box1; // Создаём ссылку на Класс BOX и объект в памяти
        box1 = new Box(5, 7, 3); // Создаёт объект в памяти
        Box box2 = new Box(7, 9, 5); // Оптимизированный код
        Box cube = new Box(10);


        Box box01 = new Box(4, 6, 7); // Параметры box01
        Box box02 = new Box(4, 6, 7); // Параметры box02
        Box box03 = new Box(3, 4, 6); // Параметры box03
        Box box04 = new Box(6, 4, 7); // Параметры box04

        Box box75 = new Box(5, 1, 5);
        // box75.GRANI = 7; // Нельзя модифицировать Final переменные!!!

// Значения параметров ящика
        // box1.height = 5;
        // box1.width = 3;
        // box1.depth = 1;
        // box2.height = 7;
        // box2.width = 5;
        // box2.depth = 3;

// Код перенесён в класс Box
//     int vol1 = box1.height * box1.width * box1.depth;
//     System.out.println("Объём 1-й коробки равен: " + vol1);

//     int vol2 = box2.height * box2.width * box2.depth;
//     System.out.println("Объём 2-й коробки равен: " + vol2);

// Расчитывает объём коробки
        // int volume1 = box1.getVolume(); передаём значение на консоль без объявления переменной
        // int volume2 = box2.getVolume(); передаём значение на консоль без объявления переменной
        // int volume3 = cube.getVolume(); передаём значение на консоль без объявления переменной

        // Вывод на консоль
//      System.out.println("Объём 1-й коробки равен: " + box1.getVolume());
//      System.out.println("Объём 2-й коробки равен: " + box2.getVolume());
        //     System.out.println("Объём куба: " + cube.getVolume());

        boolean isBox01EqualsBox02 = box01.equals(box02); // Сравнение по размеру 01 и 02
        boolean isBox01EqualsBox03 = box01.equals(box03); // Сравнение по размеру 01 и 03

        System.out.println("box01 и box02 равны по сторонам " + isBox01EqualsBox02);
        System.out.println("box01 и box03 равны по сторонам " + isBox01EqualsBox03);
        System.out.println(); // Пустая строка

        boolean isBox01EqualsByVolumeBox02 = box01.equalsByVolume(box02);
        boolean isBox01EqualsByVolumeBox03 = box01.equalsByVolume(box03);
        boolean isBox01EqualsByVolumeBox04 = box01.equalsByVolume(box04);

        System.out.println("box01 и box02 равны по объёму " + isBox01EqualsByVolumeBox02);
        System.out.println("box01 и box03 равны по объёму " + isBox01EqualsByVolumeBox03);
        System.out.println("box01 и box04 равны по объёму " + isBox01EqualsByVolumeBox04);
        System.out.println();
        System.out.println("Количество созданных коробок: " + Box.count);
        System.out.println();


        int f7 = Factorial.fact(7);
        System.out.println("Факториал " + f7);

        Box box = new Box();
        box.setBoxID(55566);
        System.out.println(box.getBoxID());
    }
}
