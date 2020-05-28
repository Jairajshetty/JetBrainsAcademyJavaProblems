enum DangerLevel {
    HIGH(3),
    MEDIUM(2),
    LOW(1);
    int danger;
     DangerLevel(int danger){
        this.danger=danger;
    }
    public int getLevel(){
         return danger;
    }


}