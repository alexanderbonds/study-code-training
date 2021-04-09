package ru.happyshark.training.random.named_loop;

/*
Задача - 3: создать именованный цикл
Ещё один представитель серии «практические задачи по программированию,
Java в сферическом вакууме». В том смысле, что непонятно, зачем это нужно,
вряд ли цикл чувствует обиду от того, что он обезличен. Ну да ладно, важно другое: язык позволяет дать циклу имя.
Решение
Примечание: кому-то такие "имена" известны как "метки", которые не рекомендуется использовать на практике.

Код решения задачи по джава, демонстрирующий именованный цикл
 */

public class NamedLoop {
    public static void main(String[] args) {
        loop1:
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == 3)
                    break loop1;
                System.out.println("i = " + i + " j = " + j);
            }
        }
    }
}

/*
Вот что будет на выходе, если запустить программу:

i = 0 j = 0
i = 0 j = 1
i = 0 j = 2
i = 0 j = 3
i = 0 j = 4
i = 1 j = 0
i = 1 j = 1
i = 1 j = 2
i = 1 j = 3
i = 1 j = 4
i = 2 j = 0
i = 2 j = 1
i = 2 j = 2
i = 2 j = 3
i = 2 j = 4

Тут также можно использовать continue для перехода к началу именованного цикла.

А ещё при надобности получится использовать break (или continue) во вложенном if-else с for-циклом,
чтобы разбить несколько циклов с помощью if-else.
Это поможет избежать установки большого количества флагов и тестирования их в if-else чтобы понять,
продолжать или выходить из внутреннего цикла.
 */