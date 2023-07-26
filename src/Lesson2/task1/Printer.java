package Lesson2.task1;

class Answer {
    public static StringBuilder answer(String QUERY, String PARAMS){
        // Напишите свое решение ниже
        String[] params = PARAMS.replace("{", "")
                .replace("}", "")
                .replaceAll("\"", "")
                .replace(" ", "")
                .split(",");

        StringBuilder stringBuilder = new StringBuilder();
        for (String entry : params) {
            if (!entry.split(":")[1].equals("null")) {
                if (stringBuilder.toString().equals("")) {
                    stringBuilder.append(entry.split(":")[0]).append("='")
                            .append(entry.split(":")[1]).append("'");
                } else {
                    stringBuilder.append(" and ")
                            .append(entry.split(":")[0]).append("='")
                            .append(entry.split(":")[1]).append("'");
                }
            }
        }
        return new StringBuilder(QUERY).append(stringBuilder.toString());
    }
}


// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer{
    public static void main(String[] args) {
        String QUERY = "";
        String PARAMS = "";

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            QUERY = "select * from students where ";
            PARAMS = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"} ";
        }
        else{
            QUERY = args[0];
            PARAMS = args[1];
        }

        Answer ans = new Answer();
        System.out.println(ans.answer(QUERY, PARAMS));
    }
}
