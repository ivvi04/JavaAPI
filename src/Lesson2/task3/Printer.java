package Lesson2.task3;

class Answer {
    public static StringBuilder answer(String JSON, String ELEMENT1, String ELEMENT2, String ELEMENT3){
        // Напишите свое решение ниже
        String[] params = JSON.replace("{", "")
                .replace("}", "")
                .replace("]", "")
                .replace("[", "")
                .replaceAll("\"", "")
                .split(",");
        StringBuilder stringBuilder = new StringBuilder();
        for (String entry : params) {
            switch (entry.split(":")[0]) {
                case "фамилия" :
                    stringBuilder.append(ELEMENT1).append(entry.split(":")[1]);
                    break;
                case "оценка" :
                    stringBuilder.append(ELEMENT2).append(entry.split(":")[1]);
                    break;
                case "предмет" :
                    stringBuilder.append(ELEMENT3).append(entry.split(":")[1]);
                    stringBuilder.append("\n");
                    break;
            }
        }

        return stringBuilder;
    }
}


// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer{
    public static void main(String[] args) {
        String JSON = "";
        String ELEMENT1 = "";
        String ELEMENT2 = "";
        String ELEMENT3 = "";

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            JSON = "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"}," +
                    "{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"}," +
                    "{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";
            ELEMENT1 = "Студент ";
            ELEMENT2 = " получил ";
            ELEMENT3 = " по предмету ";
        }
        else{
            JSON = args[0];
            ELEMENT1 = args[1];
            ELEMENT2 = args[2];
            ELEMENT3 = args[3];
        }

        Answer ans = new Answer();
        System.out.println(ans.answer(JSON, ELEMENT1, ELEMENT2, ELEMENT3));
    }
}