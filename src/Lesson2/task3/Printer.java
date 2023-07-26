package Lesson2.task3;

class Answer {
    public static StringBuilder answer(String JSON, String ELEMENT1, String ELEMENT2, String ELEMENT3){
        // �������� ���� ������� ����
        String[] params = JSON.replace("{", "")
                .replace("}", "")
                .replace("]", "")
                .replace("[", "")
                .replaceAll("\"", "")
                .split(",");
        StringBuilder stringBuilder = new StringBuilder();
        for (String entry : params) {
            switch (entry.split(":")[0]) {
                case "�������" :
                    stringBuilder.append(ELEMENT1).append(entry.split(":")[1]);
                    break;
                case "������" :
                    stringBuilder.append(ELEMENT2).append(entry.split(":")[1]);
                    break;
                case "�������" :
                    stringBuilder.append(ELEMENT3).append(entry.split(":")[1]);
                    stringBuilder.append("\n");
                    break;
            }
        }

        return stringBuilder;
    }
}


// �� �������� ���� ����� - �� ����� ��� ������ ����������� �� ����� � ��������
public class Printer{
    public static void main(String[] args) {
        String JSON = "";
        String ELEMENT1 = "";
        String ELEMENT2 = "";
        String ELEMENT3 = "";

        if (args.length == 0) {
            // ��� �������� ���� �� ����������, �� ������ ����������� ��� ���������
            JSON = "[{\"�������\":\"������\",\"������\":\"5\",\"�������\":\"����������\"}," +
                    "{\"�������\":\"�������\",\"������\":\"4\",\"�������\":\"�����������\"}," +
                    "{\"�������\":\"�������\",\"������\":\"5\",\"�������\":\"������\"}]";
            ELEMENT1 = "������� ";
            ELEMENT2 = " ������� ";
            ELEMENT3 = " �� �������� ";
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