package ru.job4j.condition;

public class DummyBot {
    public static String bot(String question) {
        String rsl = "Это ставит меня в тупик. Задайте другой вопрос.";
        if ("Привет, бот".equals(question)) {
            rsl = "Привет, умник";
        } else if ("Пока".equals(question)) {
            rsl = "До скорой встречи";
        }
        return rsl;
    }

    public static void main(String[] args) {
        String rsl = DummyBot.bot("Привет, бот");
        System.out.println(rsl);
        rsl = DummyBot.bot("Как дела ?");
        System.out.println(rsl);
    }
}
