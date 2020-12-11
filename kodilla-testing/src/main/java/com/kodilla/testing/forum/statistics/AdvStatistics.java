package com.kodilla.testing.forum.statistics;

public class AdvStatistics {
    Statistics statistics;

    int userQuantity;
    int postsQuantity;
    int commentsQuantity;
    double avgPostPerUser;
    double avgComPerUser;
    double avgComPerPost;

    public AdvStatistics(Statistics statistics) {
        this.statistics = statistics;
    }

    public Statistics getStatistics() {
        return statistics;
    }

    public void setStatistics(Statistics statistics) {
        this.statistics = statistics;
    }

    public int getUserQuantity() {
        return userQuantity;
    }

    public void setUserQuantity(int userQuantity) {
        this.userQuantity = userQuantity;
    }

    public int getPostsQuantity() {
        return postsQuantity;
    }

    public void setPostsQuantity(int postsQuantity) {
        this.postsQuantity = postsQuantity;
    }

    public int getCommentsQuantity() {
        return commentsQuantity;
    }

    public void setCommentsQuantity(int commentsQuantity) {
        this.commentsQuantity = commentsQuantity;
    }

    public double getAvgPostPerUser() {
        return avgPostPerUser;
    }

    public void setAvgPostPerUser(double avgPostPerUser) {
        this.avgPostPerUser = avgPostPerUser;
    }

    public double getAvgComPerUser() {
        return avgComPerUser;
    }

    public void setAvgComPerUser(double avgComPerUser) {
        this.avgComPerUser = avgComPerUser;
    }

    public double getAvgComPerPost() {
        return avgComPerPost;
    }

    public void setAvgComPerPost(double avgComPerPost) {
        this.avgComPerPost = avgComPerPost;
    }

    public void calculateAdvStatistics(Statistics statistics) {

        userQuantity = statistics.usersNames().size();

        postsQuantity = statistics.postsCount();

        commentsQuantity = statistics.commentsCount();

        if (statistics.usersNames().size() == 0) {
            avgPostPerUser = 0.0;
        } else avgPostPerUser = (double) statistics.postsCount() / (double) statistics.usersNames().size();

        if (statistics.usersNames().size() == 0) {
            avgPostPerUser = 0.0;
        } else avgPostPerUser = (double) statistics.commentsCount() / (double) statistics.usersNames().size();

        if (statistics.postsCount() == 0) {
            avgComPerPost = 0.0;
        } else avgComPerPost = (double) statistics.commentsCount() / (double) statistics.postsCount();
    }

    public String showStatistics() {

        return "usersQuantity: " + userQuantity +
                "\n postsQuantity: " + postsQuantity +
                "\n commentsQuantity: " + commentsQuantity +
                "\n avPostsPerUser: " + avgPostPerUser +
                "\n avCommentsPerUser" + avgComPerUser +
                "\n avCommentsPerPost" + avgComPerPost;
    }
}
