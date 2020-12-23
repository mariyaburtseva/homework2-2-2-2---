public class Main { // автоматически прописалось название соответствующее названию при создании
    public static void main(String[] args) {
        // создание объекта из класса
        BmiService service = new BmiService();
        // инициализация экземпляра класса

        double height = 1.74; // инициализация переменной height типа double
        int weight = 60; // инициализация переменной weight типа int
        double iMB = service.calculate(weight, height); // вызов функции класса, которую инициализировали ранее

        System.out.println("Вес " + weight); // Вывод в консоль значения weight
        System.out.println("Рост " + height); // Вывод в консоль значения height
        System.out.println("ИМТ " + iMB); // Вывод в консоль значения полученного в результате этой функции
    }
}