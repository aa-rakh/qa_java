package com.example;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
    @RunWith(Parameterized.class)
    public class LionTestParametrized extends TestCase {

        @Mock
        Feline feline;

        private final String sex;
        private final boolean result;

        public LionTestParametrized(String sex, boolean result) {
            this.sex = sex;
            this.result = result;
        }

        @Before
        public void setUpMocks(){
            MockitoAnnotations.openMocks(this);
        }

        @Parameterized.Parameters
        public static Object[][] getHasMane() {
            return new Object[][]{
                    {"Самка", false},
                    {"Самец", true},
            };
        }

        @Test
        public void doesHaveManeParamTest() throws Exception {
            Lion lion = new Lion(sex, feline);
            assertEquals(result, lion.doesHaveMane());

        }
    }
