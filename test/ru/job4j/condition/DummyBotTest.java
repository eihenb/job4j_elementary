package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class DummyBotTest {

    @Test
    public void whenGreetBot() {
        assertThat(
                DummyBot.bot("Привет, бот"),
                is("Привет, умник")
        );
    }

    @Test
    public void whenByeBot() {
        assertThat(
                DummyBot.bot("Пока"),
                is("До скорой встречи")
        );
    }

    @Test
    public void whenUnknownBot() {
        assertThat(
                DummyBot.bot("Как дела?"),
                is("Это ставит меня в тупик. Задайте другой вопрос.")
        );
    }
}