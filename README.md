# Java: знакомство и как пользоваться базовым API (семинары)

## Урок 1. Знакомство с языком программирования Java

**[Задание 1](https://github.com/ivvi04/JavaAPI/blob/master/src/Lesson1/task1/Printer.java)**

Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n).
Внутри класса Answer напишите метод countNTriangle, который принимает число n и возвращает его n-ое треугольное число.

**[Задание 2](https://github.com/ivvi04/JavaAPI/blob/master/src/Lesson1/task2/Printer.java)**

Напишите функцию printPrimeNums, которая выведет на экран все простые числа от 1 до 1000, каждое на новой строке.
Напишите свой код в методе printPrimeNums класса Answer.

**[Задание 3](https://github.com/ivvi04/JavaAPI/blob/master/src/Lesson1/task3/Printer.java)**

Напишите класс Calculator, который будет выполнять математические операции (+, -, *, /) над двумя числами и возвращать результат. В классе должен быть метод calculate, который принимает оператор и значения аргументов и возвращает результат вычислений.

При неверно переданном операторе, программа должна вывести сообщение об ошибке "Некорректный оператор: 'оператор'".

**[Задание 4*](https://github.com/ivvi04/JavaAPI/blob/master/src/Lesson1/task4/Printer.java)**

В файле задано уравнение вида q + w = e (q, w, e >= 0). Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69.
Восстановите выражение до верного равенства.
Предложите хотя бы одно решение или сообщите, что его нет.
Напишите класс Equation, содержащий метод getSolution, который будет считывать уравнение из файла и восстановит его до верного равенства.
Выведите сначала строку формата "Given the equation: {выражение из файла}".
А затем верните строку формата "Result: {цельное выражение}".
Если выражение не имеет решений - верните строку "No solution".

## Урок 2. Почему вы не можете не использовать API

**[Задание 1](https://github.com/ivvi04/JavaAPI/blob/master/src/Lesson2/task1/Printer.java)**

Дана строка sql-запроса:

select * from students where

Сформируйте часть WHERE этого запроса, используя StringBuilder. Пример данных для фильтрации приведены ниже в виде json-строки. Если значение null, то параметр не должен попадать в запрос.

Пример:

{"name": "Ivanov", "country": "Russia", "city": "Moscow", "age": "null"}

Напишите свой код в методе answer класса Answer. Метод answer принимает на вход два параметра:

String QUERY - начало SQL-запроса

String PARAMS - JSON с параметрами

**[Задание 2](https://github.com/ivvi04/JavaAPI/blob/master/src/Lesson2/task2/Printer.java)**

Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.

Напишите свой код в методе sort класса BubbleSort. Метод sort принимает на вход один параметр:

int[] arr - числовой массив

После каждой итерации, ваш код должен делать запись в лог-файл 'log.txt' в формате год-месяц-день час:минуты {массив на данной итерации}.

**[Задание 3](https://github.com/ivvi04/JavaAPI/blob/master/src/Lesson2/task3/Printer.java)**

Внутри класса Answer напишите метод answer, который распарсит json и, используя StringBuilder, создаст строки вида:

Студент [фамилия] получил [оценка] по предмету [предмет].
На вход метода answer подаются аргументы:

* String JSON
* String ELEMENT1
* String ELEMENT2
* String ELEMENT3

**[Задание 4](https://github.com/ivvi04/JavaAPI/blob/master/src/Lesson2/task4/Printer.java)**

Возьмите код от калькулятора с прошлого урока. К этому калькулятору нужно добавить логирование.

Логи запишите в файл log.txtв формате:

* "гггг-мм-дд чч:мм User entered the first operand = {первое число}"
* "гггг-мм-дд чч:мм User entered the operation = {оператор}"
* "гггг-мм-дд чч:мм User entered the second operand = {второе число}"
* "гггг-мм-дд чч:мм Result is {результат}"

## Урок 3. Коллекции JAVA: Введение

**[Задание 1](https://github.com/ivvi04/JavaAPI/blob/master/src/Lesson3/task1/Printer.java)**

Внутри класса MergeSort напишите метод mergeSort, который принимает массив целых чисел a и реализует алгоритм сортировки слиянием. Метод должен возвращать отсортированный массив.

**[Задание 2](https://github.com/ivvi04/JavaAPI/blob/master/src/Lesson3/task2/Printer.java)**

Напишите функцию removeEvenNumbers, которая принимала бы произвольный список целых чисел, удаляла бы из него четные числа и выводила список без четных чисел.

Напишите свой код в методе removeEvenNumbers класса Answer. Метод removeEvenNumbers принимает на вход один параметр:

Integer[] arr - список целых чисел

**[Задание 3](https://github.com/ivvi04/JavaAPI/blob/master/src/Lesson3/task3/Printer.java)**

Напишите функцию analyzeNumbers, которая принимает на вход целочисленный список arr и:

* Сортирует его по возрастанию и выводит на экран
* Находит минимальное значение в списке и выводит на экран - Minimum is {число}
* Находит максимальное значение в списке и выводит на экран - Maximum is {число}
* Находит среднее арифметическое значений списка и выводит на экран - Average is =  {число}

Напишите свой код в методе analyzeNumbers класса Answer. Метод analyzeNumbers принимает на вход один параметр:

Integer[] arr - список целых чисел

## Урок 4. Хранение и обработка данных ч1: приоритетные коллекции

**[Задание 1](https://github.com/ivvi04/JavaAPI/blob/master/src/Lesson4/task1/Printer.java)**

Пусть дан LinkedList с несколькими элементами. Напишите класс LLTasks с методом revert, который принимал бы на вход LinkedList и возвращает “перевернутый” список.

**[Задание 2](https://github.com/ivvi04/JavaAPI/blob/master/src/Lesson4/task2/Printer.java)**

В классе MyQueue реализуйте очередь с помощью LinkedList со следующими методами:
* enqueue() - помещает элемент в конец очереди
* dequeue() - возвращает первый элемент из очереди и удаляет его
* first() - возвращает первый элемент из очереди, не удаляя
* getElements() - возвращает все элементы в очереди

**[Задание 3](https://github.com/ivvi04/JavaAPI/blob/master/src/Lesson4/task3/Printer.java)**

В обычный калькулятор без логирования добавьте возможность отменить последнюю операцию.

Отмена последней операции должна быть реализована следующим образом: если передан оператор '<' калькулятор должен вывести результат предпоследней операции.

## Урок 5. Хранение и обработка данных ч2: множество коллекций Map

Формат сдачи: ссылка на подписанный git-проект.

**[Задание](https://github.com/ivvi04/JavaAPI/blob/master/src/Lesson5/Main.java)**

Реализуйте структуру телефонной книги с помощью HashMap.
Программа также должна учитывать, что во входной структуре будут повторяющиеся имена с разными телефонами, их необходимо считать, как одного человека с разными телефонами. Вывод должен быть отсортирован по убыванию числа телефонов.

## Урок 6. Хранение и обработка данных ч3: множество коллекций Set

**[Задание](https://github.com/ivvi04/JavaAPI/blob/master/src/Lesson6/)**

Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java. 
Создать множество ноутбуков.
Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру. 
Критерии фильтрации можно хранить в Map. Например: “Введите цифру, соответствующую необходимому критерию:

1 - ОЗУ

2 - Объем ЖД

3 - Операционная система

4 - Цвет …

Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
