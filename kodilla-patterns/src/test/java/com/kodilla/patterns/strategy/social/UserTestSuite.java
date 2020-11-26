package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {
    @Test
    void testDefaultSharingStrategies(){
        //Given
        User mark=new Millenials("Mark Zuckenberg");
        User sparrow=new YGeneration("Gray Sparrow");
        User top=new ZGeneration("Victoria Secret");
        //When
        String markLogTo=mark.sharePost();
        System.out.println("Mark uses: " +markLogTo);
        String sparrowLogTo=sparrow.sharePost();
        System.out.println("Sparrow uses: "+sparrowLogTo);
        String topLogTo=top.sharePost();
        System.out.println("Victoria uses: "+topLogTo);
        //Then
        assertEquals("Facebook",markLogTo);
        assertEquals("Twitter",sparrowLogTo);
        assertEquals("Snapchat",topLogTo);

    }

    @Test
    void testIndividualSharingStrategy(){
        //Given
        User mark= new Millenials("Mark Zuckenberg");
        //When
        String markLogTo=mark.sharePost();
        System.out.println("Mark uses: "+ markLogTo);
        mark.setSocialPublisher(new TwitterPublisher());
        markLogTo=mark.sharePost();
        System.out.println("Mark uses: "+ markLogTo);
        //Then
        assertEquals("Twitter",markLogTo);
    }
}
