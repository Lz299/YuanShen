package com.xxxy.no2.yuanshen.model;

public class vote_records {
    private int vote_records_id;
    private int polls_id;
    private int users_id;

    public vote_records(int vote_records_id, int polls_id, int users_id) {
        this.vote_records_id = vote_records_id;
        this.polls_id = polls_id;
        this.users_id = users_id;
    }

    public vote_records() {
    }

    public int getVote_records_id() {
        return vote_records_id;
    }

    public void setVote_records_id(int vote_records_id) {
        this.vote_records_id = vote_records_id;
    }

    public int getPolls_id() {
        return polls_id;
    }

    public void setPolls_id(int polls_id) {
        this.polls_id = polls_id;
    }

    public int getUsers_id() {
        return users_id;
    }

    public void setUsers_id(int users_id) {
        this.users_id = users_id;
    }

    @Override
    public String toString() {
        return "vote_records{" +
                "vote_records_id=" + vote_records_id +
                ", polls_id=" + polls_id +
                ", users_id=" + users_id +
                '}';
    }
}
