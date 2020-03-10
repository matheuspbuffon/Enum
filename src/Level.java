public enum Level {
    HIGH(3),
    MEDIUM(2),
    LOW(1);

    private int oneVersusOneNum;

    private Level(int num) {
        this.oneVersusOneNum = num;
    }

    public int getOneVersusOneNum() { return this.oneVersusOneNum; }
    public void setOneVersusOneNum(int num) { this.oneVersusOneNum = num; }
}
