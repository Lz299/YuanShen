package com.xxxy.no2.yuanshen.model;

public class Voters {
    private int voters_id;
    private int polls_id;
    private int users_id;
    private int voters_flag;

    public Voters(int voters_id, int polls_id, int users_id, int voters_flag) {
        this.voters_id = voters_id;
        this.polls_id = polls_id;
        this.users_id = users_id;
        this.voters_flag = voters_flag;
    }

    public Voters() {
    }

    public int getVoters_id() {
        return voters_id;
    }

    public void setVoters_id(int voters_id) {
        this.voters_id = voters_id;
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

    public int getVoters_flag() {
        return voters_flag;
    }

    public void setVoters_flag(int voters_flag) {
        this.voters_flag = voters_flag;
    }

    @Override
    public String toString() {
        return "Voters{" +
                "voters_id=" + voters_id +
                ", polls_id=" + polls_id +
                ", users_id=" + users_id +
                ", voters_flag=" + voters_flag +
                '}';
    }
}
