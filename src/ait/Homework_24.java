package ait;

public class Homework_24 {
    public static void main(String[] args) {
        /*Задача 1

Написать приложение для печати минимальных/максимальных значений заданных примитивных типов.
 Типы как объекты String следует брать из аргументов метода main.

Если в аргументах нет никакого типа, приложение должно вывести максимальный/минимальный значения
 7 типов (byte, int, short, long, char, float, double).

Если аргументы содержат неправильный тип, приложение должно вывести сообщение: Wrong type
        * */
        for (int i = 0; i < args.length; i++) {
            if (args.length == 0) {
                System.out.println("char max/min:" + Character.MAX_VALUE + "/" + Character.MIN_VALUE + "\n" +
                        "long max/min:" + Long.MAX_VALUE + "/" + Long.MIN_VALUE + "\n" +
                        "short max/min:" + Short.MAX_VALUE + "/" + Short.MIN_VALUE + "\n" +
                        "int max/min:" + Integer.MAX_VALUE + "/" + Integer.MIN_VALUE + "\n" +
                        "byte max/min:" + Byte.MAX_VALUE + "/" + Byte.MIN_VALUE + "\n" +
                        "double max/min:" + Double.MAX_VALUE + "/" + Double.MIN_VALUE + "\n" +
                        "float max/min:" + Float.MAX_VALUE + "/" + Float.MIN_VALUE + "\n");

            }
            else {

                double maxSize = 0;
                double minSize = 0;

                switch (args[i]) {
                    case "char": {
                        maxSize = Character.MAX_VALUE;
                        minSize = Character.MIN_VALUE;
                        System.out.println("char max/min:" + maxSize + " / " + minSize);
                        break;
                    }

                    case "long": {
                        maxSize = Long.MAX_VALUE;
                        minSize = Long.MIN_VALUE;
                        System.out.println("long max/min:" + maxSize + " / " + minSize);
                        break;
                    }
                    case "short": {
                        maxSize = Short.MAX_VALUE;
                        minSize = Short.MIN_VALUE;
                        System.out.println("short max/min:" + maxSize + " / " + minSize);
                        break;
                    }

                    case "int": {
                        maxSize = Integer.MAX_VALUE;
                        minSize = Integer.MIN_VALUE;
                        System.out.println("int max/min:" + maxSize + " / " + minSize);
                        break;
                    }

                    case "byte": {
                        maxSize = Byte.MAX_VALUE;
                        minSize = Byte.MIN_VALUE;
                        System.out.println("byte max/min:" + maxSize + " / " + minSize);
                        break;
                    }
                    case "double": {
                        maxSize = Double.MAX_VALUE;
                        minSize = Double.MIN_VALUE;
                        System.out.println("double max/min:" + maxSize + " / " + minSize);
                        break;
                    }
                    case "float": {
                        maxSize = Float.MAX_VALUE;
                        minSize = Float.MIN_VALUE;
                        System.out.println("float max/min:" + maxSize + " / " + minSize);
                        break;
                    }
                    default:
                        System.out.println("Wrong type");
                }
            }

        }
    }
}
