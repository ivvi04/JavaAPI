package Lesson1.task2;

class Answer {
    public void printPrimeNums(){
        // �������� ���� ������� ����
        for (int i = 1; i <= 1000; i++) {
            boolean isPrimeNumber = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrimeNumber = false;
                    break;
                }
            }

            if (isPrimeNumber) System.out.println(i);
        }

    }
}

// �� �������� ���� ����� - �� ����� ��� ������ ����������� �� ����� � ��������
public class Printer{
    public static void main(String[] args) {

        Answer ans = new Answer();
        ans.printPrimeNums();
    }
}
