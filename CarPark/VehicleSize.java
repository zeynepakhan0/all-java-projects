package Lab6;

public enum VehicleSize {
    SMALL,MEDIUM,LARGE;

    public int toSpace(){
        switch (this){
            case SMALL  : return 1;
            case MEDIUM : return 2;
            case LARGE  : return 3;
            default     : return 0;
        }
    }

    public int toParkingFee(){
        switch (this){
            case SMALL  : return 1;
            case MEDIUM : return 2;
            case LARGE  : return 3;
            default     : return 0;
        }
    }


}
