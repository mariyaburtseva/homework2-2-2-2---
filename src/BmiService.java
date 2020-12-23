public class BmiService { // автоматически прописалось название соответствующее названию при создании

    public double calculate(int weight, double height){
    /*
    метод calculate;
    возвращает значение типа double;
    принимает параметры: weight типа int и height типа double
    */
        return weight / (height * height); // возвращаем рассчитанный индекс массы тела
    }
}
