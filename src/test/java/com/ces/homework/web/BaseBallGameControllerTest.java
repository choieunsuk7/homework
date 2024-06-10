package com.ces.homework.web;

import com.ces.homework.BaseBallGame;
import org.assertj.core.api.AssertionsForClassTypes;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(SpringExtension.class)
@WebMvcTest
public class BaseBallGameControllerTest {
    @Autowired
    private MockMvc mvc;

    @Test
    public void play() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/play")).andExpect(status().isOk());
        BaseBallGame baseBallGame = new BaseBallGame();
        AssertionsForClassTypes.assertThat(baseBallGame.getScore("123", "321")).isEqualTo("1S2B");
        AssertionsForClassTypes.assertThat(baseBallGame.getScore("123", "415")).isEqualTo("1B");
        AssertionsForClassTypes.assertThat(baseBallGame.getScore("123", "123")).isEqualTo("3S");
        AssertionsForClassTypes.assertThat(baseBallGame.getScore("123", "456")).isEqualTo("(null)");
    }

    @Test
    public void scoreResultTest_1S2B() throws Exception {
        String given = "123";
        String input = "321";
        String returnMessage = BaseBallGame.getBaseBallScore(given, input);
    }

    @Test
    public void scoreResultTest_1B() throws Exception {
        String given = "123";
        String input = "415";
        String returnMessage = BaseBallGame.getBaseBallScore(given, input);
    }

    @Test
    public void scoreResultTest_3S() throws Exception {
        String given = "123";
        String input = "123";
        String returnMessage = BaseBallGame.getBaseBallScore(given, input);
    }

    @Test
    public void scoreResultTest_null() throws Exception {
        String given = "123";
        String input = "456";
        String returnMessage = BaseBallGame.getBaseBallScore(given, input);
    }
}

