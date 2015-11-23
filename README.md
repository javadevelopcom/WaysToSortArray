# WaysToSortArray
В примере Сортировка Массива использован рефакторинг IntelliJ IDEA: 
методы bubbleSortAscendingOrder() и bubbleSortDescendingOrder() вынесены из класса Main во внешние классы (Refactor => Move ... или нажатие F6); 
методы for (int i : X) вынесены в отдельный метод printArrayX() (Refactor => Extract => Method ... или нажатие Ctrl+Alt+M) и перемещен во внешний класс PrintArray (Refactor => Move ... или нажатие F6); 
массив int[] X = new int[]{3, 9, 1, 6, 2, 7, 4, 5, 8} вынесен  из класса Main в отдельный класс MyArray (Refactor => Extract => Constant ... или нажатие Ctrl+Alt+C). 
#code 
#refactoring 
#java 
#intellij 
#idea
