package Lesson1.task1;

class Answer {
    public int countNTriangle(int n){
        // ������� ���� ������� ����
        return (n * (n + 1)) / 2;
    }
}

// �� �������� ���� ����� - �� ����� ��� ������ ����������� �� ����� � ��������
public class Printer{
    public static void main(String[] args) {
        int n = 0;

        if (args.length == 0) {
            // ��� �������� ���� �� ����������, �� ������ ����������� ��� ���������
            n = 4;
        }
        else{
            n = Integer.parseInt(args[0]);
        }

        // ����� ���������� �� �����
        Answer ans = new Answer();
        int itresume_res = ans.countNTriangle(n);
        System.out.println(itresume_res);
    }
}
