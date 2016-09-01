package ru.sbrf.course;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InOrder;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.List;

import static com.sun.javaws.JnlpxArgs.verify;

/**
 * Created by SBTJavastudent on 01.09.2016.
 */
@RunWith(MockitoJUnitRunner.class)
public class MockListTest {
    @Mock
    List<String> mockedList;

    @Test
    public void testList(){
        mockedList.add("One");

        Mockito.verify(mockedList.add("One"));
    }
}
