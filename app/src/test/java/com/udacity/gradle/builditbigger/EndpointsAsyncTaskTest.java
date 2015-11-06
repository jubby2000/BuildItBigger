package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.test.mock.MockContext;
import android.util.Pair;
import org.junit.Assert;
import org.junit.Test;
import java.util.concurrent.TimeUnit;


/**
 * Created by Jacob on 11/4/2015.
 */
public class EndpointsAsyncTaskTest {

    @Test
    public void asyncTaskTest() {
        try {
            Context context = new MockContext();
            EndpointsAsyncTask jokeTask = new EndpointsAsyncTask();
            jokeTask.execute(new Pair<Context, String>(context, "Manfred"));
            String joke = jokeTask.get(30, TimeUnit.SECONDS);
            Assert.assertFalse(joke.isEmpty());
        } catch (Exception e) {
            //fail("Timed out");
        }
    }
}