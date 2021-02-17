//package com.kodilla.testing.forum.statistics;
//
//import org.junit.Assert;
//import org.junit.Test;
//
//import java.util.ArrayList;
//import java.util.List;
//
//
//
//
//class AdvStatisticTestSuite {
//
//    @Test
//    public void testcalculateAdvStatistics() {
//        //Given
//
//        Statistics statisticsMock=mock.(Statistics.class);

//        Statistics statisticsMock = mock.(Statistics.class);
//        AdvStatistics advStatistics = new AdvStatistics(statisticsMock);


//
//        Statistics statisticsMock = mock(Statistics.class);
//        List<String> usersForum = new ArrayList<String>();
//        for (int i = 0; i < 100; i++) {
//            usersForum.add("user" + i);
//        }
//
//        int posts = 0;
//        int comments = 1000;
//
//        when(statisticsMock.usersNames()).thenReturn(usersForum);
//        when(statisticsMock.postsCount()).thenReturn(posts);
//        when(statisticsMock.commentsCount()).thenReturn(comments);
//        AdvStatistics advStatistics = new AdvStatistics(statisticsMock);
//        //When
//        System.out.println("Test1 : posts = " + posts + ", comments = " + comments);
//        advStatistics.calculateAdvStatistics(statisticsMock);
//
//        //then
//        Assert.assertEquals(100, advStatistics.getNumberOfUsers());
//        Assert.assertEquals(0, advStatistics.getNumberOfPosts());
//        Assert.assertEquals(1000, advStatistics.getNumberOfComments());
//        Assert.assertEquals(0, advStatistics.getAverageNumberOfPostsPerUser(), 0.001);
//        Assert.assertEquals(10.00, advStatistics.getAverageNumberOfComentsPerUser(), 0.01);
//        Assert.assertEquals(0, advStatistics.getAverageNumberOfCommentsPerPost(), 0.001);
//        advStatistics.showStatistics();
//        System.out.println();
//
//        // Posts = 1000 , comments = 0
//        //Given
//        posts = 1000;
//        comments = 0;
//        when(statisticsMock.postsCount()).thenReturn(posts);
//        when(statisticsMock.commentsCount()).thenReturn(comments);
//        AdvStatistics advStatistics1 = new AdvStatistics(statisticsMock);
//        //When
//        System.out.println("Test2 : posts = " + posts + ", comments = " + comments);
//
//        advStatistics1.calculateAdvStatistics(statisticsMock);
//        //then
//        Assert.assertEquals(100, advStatistics1.getNumberOfUsers());
//        Assert.assertEquals(1000, advStatistics1.getNumberOfPosts());
//        Assert.assertEquals(0, advStatistics1.getNumberOfComments());
//        Assert.assertEquals(10, advStatistics1.getAverageNumberOfPostsPerUser(), 0.001);
//        Assert.assertEquals(0, advStatistics1.getAverageNumberOfComentsPerUser(), 0.01);
//        Assert.assertEquals(0, advStatistics1.getAverageNumberOfCommentsPerPost(), 0.001);
//        advStatistics1.showStatistics();
//        System.out.println();
//
//        //comments > posts
//        posts = 200;
//        comments = 500;
//        when(statisticsMock.postsCount()).thenReturn(posts);
//        when(statisticsMock.commentsCount()).thenReturn(comments);
//        AdvStatistics advStatistics2 = new AdvStatistics(statisticsMock);
//        //When
//        System.out.println("Test3 : posts = " + posts + ", comments = " + comments);
//        advStatistics2.calculateAdvStatistics(statisticsMock);
//        //then
//        Assert.assertEquals(100, advStatistics2.getNumberOfUsers());
//        Assert.assertEquals(200, advStatistics2.getNumberOfPosts());
//        Assert.assertEquals(500, advStatistics2.getNumberOfComments());
//        Assert.assertEquals(2, advStatistics2.getAverageNumberOfPostsPerUser(), 0.01);
//        Assert.assertEquals(5, advStatistics2.getAverageNumberOfComentsPerUser(), 0.01);
//        Assert.assertEquals(2.5, advStatistics2.getAverageNumberOfCommentsPerPost(), 0.01);
//        advStatistics2.showStatistics();
//        System.out.println();
//
//
//        // comments < posts
//        posts = 150;
//        comments = 43;
//        when(statisticsMock.postsCount()).thenReturn(posts);
//        when(statisticsMock.commentsCount()).thenReturn(comments);
//        AdvStatistics advStatistics3 = new AdvStatistics(statisticsMock);
//        //When
//        System.out.println("Test4 : posts = " + posts + ", comments = " + comments);
//
//        advStatistics3.calculateAdvStatistics(statisticsMock);
//        //then
//        Assert.assertEquals(100, advStatistics3.getNumberOfUsers());
//        Assert.assertEquals(150, advStatistics3.getNumberOfPosts());
//        Assert.assertEquals(43, advStatistics3.getNumberOfComments());
//        Assert.assertEquals(1.5, advStatistics3.getAverageNumberOfPostsPerUser(), 0.01);
//        Assert.assertEquals(0.43, advStatistics3.getAverageNumberOfComentsPerUser(), 0.01);
//        Assert.assertEquals(0.28666, advStatistics3.getAverageNumberOfCommentsPerPost(), 0.01);
//        advStatistics3.showStatistics();
//        System.out.println();
//
//        //users = 0
//        //Given
//        for (int i = 0; i < 100; i++) {
//            usersForum.clear();
//        }
//        when(statisticsMock.usersNames()).thenReturn(usersForum);
//        AdvStatistics advStatistics4 = new AdvStatistics(statisticsMock);
//        //When
//        System.out.println("Users = " + usersForum.size());
//
//        advStatistics4.calculateAdvStatistics(statisticsMock);
//        //then
//        Assert.assertEquals(0, advStatistics4.getNumberOfUsers());
//        Assert.assertEquals(150, advStatistics4.getNumberOfPosts());
//        Assert.assertEquals(43, advStatistics4.getNumberOfComments());
//        Assert.assertEquals(0, advStatistics4.getAverageNumberOfPostsPerUser(), 0.01);
//        Assert.assertEquals(0, advStatistics4.getAverageNumberOfComentsPerUser(), 0.01);
//        Assert.assertEquals(0.28666, advStatistics4.getAverageNumberOfCommentsPerPost(), 0.01);
//        advStatistics4.showStatistics();
//        System.out.println();
//    }
//}