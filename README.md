# Завдання 3: Знайти в масиві число, яке повторюється найбільшу кількість разів

Для виконання цього Завдання було створено 2 масиви:

1) Arr (Звичайний масив, куди будемо вписувати числа)

2) Check (Потрібен для підрахунку та перевірки кількості чисел)

Схема роботи така:
1) Вписуються випадкові числа у масив Arr

2)Реалізовується алгоритм: Береться значення масиву Arr, яке вписується як індекс у масив Check, кожного разу, як у масиві Arr зустрічається певне число, то за цим індксом масиву Check додається одиниця.


Нехай першим числом Arr є число 15
![1](https://user-images.githubusercontent.com/92012282/153719214-3150728d-b864-48c3-b7b2-adb0684dbda7.png)

Після перевірки усіх 20 чисел масиву Arr, починається цикл, що визначає у якого індексу масиву Check найбільше значення (змінна f).
![2](https://user-images.githubusercontent.com/92012282/153719225-41ef0d05-985f-4c43-8988-358ca78742ec.png)

Як тільки найбільше число визначено, то у рядок записуються усі індекси масиву Check, які мають значення f.
![3](https://user-images.githubusercontent.com/92012282/153719233-1f192465-d125-4336-9f58-86336fcd7a0c.png)
